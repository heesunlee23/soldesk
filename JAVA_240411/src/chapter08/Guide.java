// 24-04-24

package chapter08;

import java.util.Scanner;

public class Guide {
	
	static String point;
	Guest[] guests;
	Scanner scan = new Scanner(System.in);

	public void registerGuests() {	
		point = "Rochester, NY, USA";
		
		System.out.print("관광객 수: ");
		int guestNum = Integer.parseInt(scan.nextLine());
		guests = new Guest[guestNum];
		System.out.println("관광객 등록");
		
		for(int i = 0; i < guestNum; i++) {
			System.out.print((i + 1) +". 이름: ");
			String name = scan.nextLine();
			
			System.out.print((i + 1) +". 성별: ");
			String gender = scan.nextLine();
			
			guests[i] = new Guest(name, gender);
			System.out.println("---------------------------");
		}
	}

	public void showGuestInfo() {
		for(int i = 0; i < guests.length; i++) {
			System.out.println((i + 1) + ". 이름 : " + guests[i].getName());
			System.out.println((i + 1) + ". 성별 : " + guests[i].getGender());
			System.out.println((i + 1) + ". 장소 : " + point);
			System.out.println("---------------------------");
		}
	}

	public void changePlace() {
		System.out.print("어디로 변경하겠습니까 : ");
		point = scan.nextLine();
		System.out.println(point + "로 목적지 변경");
	}

}
