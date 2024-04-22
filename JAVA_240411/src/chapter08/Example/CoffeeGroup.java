package chapter08.Example;

import java.util.Scanner;

public class CoffeeGroup {
	
	private Coffee[] coffee = new Coffee[5];
	Scanner scan = new Scanner(System.in);
	
	public CoffeeGroup() {}; // 생성자
	
	public void init() {
		
		for(int i = 0; i < coffee.length; i++) {
			System.out.println("이름: ");
			String name = scan.nextLine();
			
			System.out.println("가격: ");
			int price = scan.nextInt();
			
			scan.nextLine();
			
			coffee[i] = new Coffee(name, price);
		}
	}
	
	public void showList() {
		
		for(int i = 0; i < coffee.length; i++) {
			System.out.println("---------------------");
			coffee[i].disp();
			
			// System.out.println(coffee[i].getName() + " | " + coffee[i].getMoney());
		}
		
	}

	public static void main(String[] args) {
		// Coffee[] coffee = new Coffee[5];
		// Scanner scan = new Scanner(System.in);
	}
}
