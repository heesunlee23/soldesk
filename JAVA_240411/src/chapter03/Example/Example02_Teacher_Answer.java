package chapter03.Example;

import java.util.Scanner;

public class Example02_Teacher_Answer {

	public static void main(String[] args) {
		
		boolean run = true;
		int balance = 0;
		
		Scanner scan = new Scanner(System.in);
		
		while(run) { // ****
			System.out.println("------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("------------------------------");
			System.out.print("메뉴를 선택하세요 > ");
			
			int menuNum = Integer.parseInt(scan.nextLine()); // ****
			int money=0;
			
			switch (menuNum) {
			case 1:
				System.out.print("예금액> ");
				money = Integer.parseInt(scan.nextLine());
				
				if(money <= 0) {
					System.out.println("잘못된 금액을 입력하셨습니다.");
				} else {
					balance += money;
				}
				balance += money;
				System.out.println("현재금액: " + balance);
				break;
			case 2: 
				System.out.print("출금액> ");
				money = Integer.parseInt(scan.nextLine());
				if(balance < money) {
					System.out.println("잔액이 부족합니다.");
				} else {
					balance -= money;
				}
				System.out.println("현재금액: "+ balance);
				break;
			case 3:
				System.out.print("잔고> ");
				System.out.println(balance);
				break;
			default: // **** 4에는 해당되는 케이스가 없으니까 4를 누르면 여기로 오는 거임 
				run = false;
				break;
			}
		}

	}

}
