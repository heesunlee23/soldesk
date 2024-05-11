package chapter19.Example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapTest3 {
	
	Scanner scan = new Scanner(System.in);
	private Map<Product, Integer> prodcutMap;
	Product product;
	
	public HashMapTest3() {
		prodcutMap = new HashMap<Product, Integer>();
	}
	public void run() {
		
		while(true) {
			System.out.println("------------------------------------------------------");
			System.out.println("1. 상품등록 | 2. 상품삭제 | 3. 상품목록 | 4. 상품검색 | 5. 종료");
			System.out.println("------------------------------------------------------");
			System.out.print("선택 >> ");
			int select = Integer.parseInt(scan.nextLine());
			
			if(select==1) {
				System.out.print("상품 이름 : ");
				String name = scan.nextLine();
				System.out.print("상품 가격 : ");
				int price = Integer.parseInt(scan.nextLine());
				System.out.print("상품 수량 : ");
				int quantity = Integer.parseInt(scan.nextLine());
				
				product = new Product(name, price);
				
				addProduct(product, quantity);
			}else if(select==2) {
				if(mapNullCheck()) {continue;}
				
				System.out.print("삭제할 상품 이름 : ");
				String name = scan.nextLine();
				product = searchProduct(name);
				
				if(productNullCheck()) {continue;}
				
				prodcutMap.remove(product);
			}else if(select==3) {
				if(mapNullCheck()) {continue;}
				listProduct(select);
			}else if(select==4) {
				if(mapNullCheck()) {continue;}
				System.out.print("검색할 상품 이름 : ");
				String name = scan.nextLine();
				product = searchProduct(name);
				
				if(productNullCheck()) {continue;}
				listProduct(select);
				
			}else if(select==5) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("유효한 번호가 아닙니다.");
			}
			
			
		}//while
	}//run()
	public void addProduct(Product product, int quantity) {
		
		if(prodcutMap.containsKey(product)) {
			System.out.print("중복된 상품이 있습니다. 가격을 변경하시겠습니까?(Y/N) : ");
			String change = scan.nextLine().toUpperCase();
			if(change.equals("Y")) {
				prodcutMap.remove(product);
				prodcutMap.put(product, quantity);
			}else if(change.equals("N")) {
				System.out.println("등록을 취소하셨습니다.");
			}else {
				System.out.println("유효한 명령어가 아닙니다.");
			}
		}else {
			prodcutMap.put(product, quantity);
		}
		
	}//addProduct()
	
	public boolean mapNullCheck() {
		if(prodcutMap.size() == 0) {
			System.out.println("등록된 상품이 하나도 없습니다.");
			return true;
		}else {
			return false;
		}
	}//mapNullCheck()
	public Product searchProduct(String name) {
		for(Product p : prodcutMap.keySet()) {
			if(p.getName().equals(name)) {
			return p;
			}//if
		}//for
		return null;
	}//searchProduct()
	
	public boolean productNullCheck() {
		if(product==null) {
			System.out.println("해당하는 상품이 없습니다.");
			return true;
		}else {
			return false;
		}
	}//productNullCheck()
	
	public void listProduct(int select) {
		Set<Product> keySet = prodcutMap.keySet();
		Iterator<Product> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
			Product key = keyIterator.next();
			Integer value = prodcutMap.get(key);
			if(select==4) {
				if(key.getName().equals(product.getName())) {
					System.out.println(key + "\t수량: " +value);
					break;
				}
			}
			
			System.out.println(key + "수량: " +value);
		}//while
		
	}
	
}
