package chapter07.Example;

import java.util.Scanner;

public class CanMain {

	public static void main(String[] args) {
		
		String select = "";
		int money = 0;
		Scanner scan = new Scanner(System.in);
		
		Vending ven = new Vending();
		ven.init();
		
		System.out.print("돈을 투입하세요: ");
		money = Integer.parseInt(scan.nextLine());
		ven.showCans(money);
		
		System.out.print("------------------------------------");
		System.out.print("\n음료를 선택하세요: ");
		select = scan.nextLine();
		ven.outCan(select);

	}

}
