package chapter06;

import java.util.Scanner;

public class Example03 {
	
	public static void main(String[] args) {
		
		Example03 bread = new Example03();
		bread.order();

	}

	private void order() {
		
		boolean isRunning = true;
		
		while(isRunning) {
					
			System.out.println("----------------------------------------");
			System.out.println("1. 빵 갯수 선택 | 2. 빵의 갯수와 종류 | 3. 종료 ");
			System.out.println("----------------------------------------");
			
			Scanner scan = new Scanner(System.in);
			int choice = scan.nextInt();
			
			if(choice == 1) {
				
				System.out.print("주문할 빵의 개수: ");
				
				while (!scan.hasNextInt()) { //값이 숫자인지 판별
		            scan.next();  //값이 숫자가 아니면 버린다.
		            System.err.print("에러! 숫자가 아닙니다. \n재 선택 : ");
				 }
				int breadNum = scan.nextInt(); //위에서 값이 숫자일 경우 이쪽으로 값을 넣어준다.
				
				if(breadNum < 0) {
					System.err.println("빵의 개수는 0개 이상만 가능합니다. 다시 입력해 주세요.");
					continue;
				} else if(breadNum == 0) {
					System.err.println("주문한 빵의 개수가 0 입니다. 1개 이상 입력해주세요");
					
				}
				
				for(int i = 0; i < breadNum; i++) {
					System.out.println((i + 1) + "번 째 빵을 만들었습니다");
				}
				
			} else if(choice == 2){
				
				System.out.print("주문할 빵의 개수: ");
				
				while (!scan.hasNextInt()) { //값이 숫자인지 판별
		            scan.next();  //값이 숫자가 아니면 버린다.
		            System.err.print("에러! 숫자가 아닙니다. \n다시 입력하세요 : ");
				 }
				
				int breadNum = scan.nextInt(); //위에서 값이 숫자일 경우 이쪽으로 값을 넣어준다.
				if(breadNum < 0) {
					System.err.println("빵의 개수는 0개 이상만 가능합니다. 다시 입력해 주세요.");
					continue;
				} else if(breadNum == 0) {
					System.err.println("주문한 빵의 개수가 0 입니다. 1개 이상 입력해주세요");
					continue;
				} 
				
				System.out.print("주문할 빵의 종류: ");

				while (!scan.hasNextLine()) { //값이 문자열인지 판별
		            scan.next();  //값이 문자열이 아니면 버린다.
		            System.err.print("에러! 숫자가 아닙니다. \n다시 입력하세요 : ");
				 }
				
				scan.nextLine();
				
				String breadType = scan.nextLine(); //위에서 값이 문자열일 경우 이쪽으로 값을 넣어준다.
				if(breadType.isEmpty()) {
					System.out.println("빵의 이름을 입력해 주세요.");
					continue;
				}
				
				for(int i = 0; i < breadNum; i++) {
					System.out.println((i + 1) + "번 째 " + breadType + "을 만들었습니다");
				}
				
			}
			else if(choice == 3) {
				
				System.out.println("종료합니다");
				isRunning = false;
				
			} else {
				
				System.err.println("입력을 다시 확인해 주세요");
				
			}
		}
		
	}

}
