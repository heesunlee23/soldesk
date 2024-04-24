// 24-04-24
package chapter08;

import java.util.Scanner;

public class Tour {

	public static void main(String[] args) {		
		Guide guide = new Guide(); 
		guide.registerGuests();
		
		boolean isRunning = true;
		Scanner scan = new Scanner(System.in);
		
		while(isRunning) {
			   System.out.println("1. 관광객 정보");
			   System.out.println("2. 목적지 변경");
			   System.out.println("3. 종료");
			   
			   System.out.print("선택 >> ");
			   int menu_choice = scan.nextInt();
			  
			   if(menu_choice == 1) {
				   guide.showGuestInfo();
			   } else if(menu_choice == 2) {
				   guide.changePlace();
			   } else {
				   System.out.println("종료합니다.");
				   isRunning = false;
			   }
		}
	}
}
