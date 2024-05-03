package chapter16.Example;

import java.util.Scanner;

public class AnonymousTest2 {

	public static void main(String[] args) {
		boolean isRunning = true;
		Scanner scan = new Scanner(System.in);
		
		while(isRunning) {
			System.out.println("=========================");
			System.out.println("1. 등록 | 2. 출력 | 3. 종료");
			System.out.println("=========================");
			
			System.out.print("번호를 선택하세요 >> ");
			int selected = Integer.parseInt(scan.nextLine());
			
			if(selected == 1) {
				
			} else if (selected == 2) {
				
			} else if (selected == 3) {
				isRunning = false;
			}
			
		}
		
		System.out.println("종료합니다");
		

	}

}
// 가능하면 인터페이스 써서 