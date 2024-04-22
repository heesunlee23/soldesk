package chapter03.Example;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		// 제어문 반복문 활용
		// 1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료
		Scanner scan = new Scanner(System.in);
		int balance = 0; 
		int menu_choice = 0;
		
		while(menu_choice != 4) {
			System.out.println("------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("------------------------------");
			System.out.print("메뉴를 선택하세요> ");
			menu_choice = scan.nextInt();
					
			switch (menu_choice) {
			case 1:
				System.out.print("예금할 금액을 입력하세요 (숫자만): ");
				int deposit = scan.nextInt();
				balance += deposit;
				System.out.println("입금 완료 되었습니다. 잔액은 "+ balance + "원 입니다.");
				break;
			case 2:
				System.out.print("출금할 금액을 입력하세요 (숫자만): ");
				int withdrawal = scan.nextInt();
				
				if (balance < withdrawal) {
					System.out.println("출금할 금액이 잔액보다 커 출금할 수 없습니다.");
					System.out.println("잔액은 "+ balance + "원 입니다.");
					System.out.println("메뉴선택으로 돌아갑니다.");
				} else {
					balance -= withdrawal;
					System.out.println("출금 완료 되었습니다. 잔액은 "+ balance + "원 입니다.");
				}
				
				break;
			case 3:
				System.out.println("잔액은 "+ balance + "원 입니다.");
				break;
			case 4:
				System.out.println("종료합니다.");
				break;	
			default:
				System.out.println("다시 메뉴를 입력해주세요");
				break;
			}
		}
		
		scan.close();

	}
}


