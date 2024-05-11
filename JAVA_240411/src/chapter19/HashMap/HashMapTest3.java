// 봤음 
package chapter19.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import java.util.Scanner;
import java.util.Set;

public class HashMapTest3 {

	Scanner scan = new Scanner(System.in);
	private Map<Product, Integer> productMap;
	Product product;
	
	public HashMapTest3() {
		productMap = new HashMap<Product, Integer>();
	}

	public void run() {
		// 서로 이름이 같으면 같은 객체로 인식 되도록
		// map은 중복된 거 저장되지 않음
		// 3번 상품이랑 가격은 Product - toString() 으로 되어 있음 
		while(true) {
			System.out.println("------------------------------------------------------");
			System.out.println("1. 상품등록 | 2. 상품삭제 | 3. 상품목록 | 4. 상품검색 | 5. 종료");
			System.out.println("------------------------------------------------------");
			System.out.print("선택 >> ");
			int select = Integer.parseInt(scan.nextLine());
			
			if(select==1) {
				System.out.print("상품 이름: ");
				String name = scan.nextLine();
				System.out.print("상품 가격: ");
				int price = Integer.parseInt(scan.nextLine());
				System.out.print("상품 수량: ");
				int quantity = Integer.parseInt(scan.nextLine());
				
				product = new Product(name, price);
				
				addProduct(product, quantity);
			} else if(select==2) {
				if(mapNullCheck()) {continue;}
				
				System.out.print("삭제할 상품 이름 : ");
				String name = scan.nextLine();
				product = searchProduct(name); // 삭제를 검색 + 삭제로 분리했음 
				// 내 삭제 코드 : 복잡
				// 선생님 코드 : 더 간단해 졌음
				
				if(productNullCheck()) {continue;}
				
				productMap.remove(product);
				
			} else if(select == 3) {
				if(mapNullCheck()) {continue;}
				listProduct(select);
			} else if(select==4) {
				if(mapNullCheck()) {continue;}
				System.out.print("검색할 상품 이름 : ");
				String name = scan.nextLine();
				product = searchProduct(name);
				
				if(productNullCheck()) {continue;}
				listProduct(select); // 4번일 때만 다르게 동작하도록 
			} else if(select == 5) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("유효한 번호가 아닙니다.");
			}
		}
	} 
	
	private void addProduct(Product product, int quantity) {			
		if(productMap.containsKey(product)) {
			System.out.println("중복된 상품이 있습니다. 가격을 변경하시겠습니까?(Y/N) : ");
			String change = scan.nextLine().toUpperCase(); // 무조건 대문자로 바꿈 
			if(change.equals("Y")) {
				productMap.remove(product); // 추가: 기존 객체 삭제 
				productMap.put(product, quantity); // 이것만 하면 엄밀히 말하면 덮혀 쓰이는 게 아니라 value인 quantitiy 만 바뀌는 거임 => 윗 줄 추가 
			} else if(change.equals("N")) {
				System.out.println("등록을 취소하셨습니다.");
			} else {
				System.out.println("유효한 명령어가 아닙니다.");
			}
		} else { // 중복되지 않으면 그냥 더해준다. 
			productMap.put(product, quantity);
		}
	}
	
	private boolean mapNullCheck() {
		if(productMap.size() == 0) {
			System.out.println("등록된 상품이 하나도 없습니다.");
			return true;
		} else {
			return false;
		}
	}
	
	public Product searchProduct(String name) {
		for(Product p : productMap.keySet()) {
			if(p.getName().equals(name)) {
				return p;
			} // if
		} // for
		return null;
 	}
	
	private boolean productNullCheck() {
		if(product==null) {
			System.out.println("해당하는 상품이 없습니다.");
			return true;
		} else {
			return false;
		}
	}
	
	private void listProduct(int select) {
		Set<Product> keySet = productMap.keySet();
		Iterator<Product> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
			Product key = keyIterator.next();
			Integer value = productMap.get(key);
			if(select==4) {
				if(key.getName().equals(product.getName())) {
					System.out.println(key + "수량: " + value);
					break;
				}
			}
			
			System.out.println(key + "수량 : " + value); // Product에서 수량 처리 해 놨음 ****** 확인해 봐야 함 
		}
	}
	
}
