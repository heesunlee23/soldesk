// 24-04-24

package chapter08.teachersolution;

import java.util.Scanner;

public class Guide {
	static String point;
	Guest[] guest;
	Scanner scan = new Scanner(System.in);
	int count;
	
	public Guide(int n) {
		point = "호주";
		count = n;
		guest = new Guest[count]; // 관광객 수만큼 메모리 확보 
		for(int i = 0; i < guest.length; i++) {
			guest[i] = new Guest();
		}
	}

	public void register() {
		
		for(int i=0; i < count; i++) {
			
			System.out.println((i + 1) + ". 이름 : ");
			String name = scan.nextLine();
			guest[i].setName(name);
			
			System.out.println((i + 1) + ". 성별 : ");
			String gender = scan.nextLine();
			guest[i].setGender(gender);
			
		} // for
		
	}
	
	public void disp() {
		
		while(true) {
			System.out.println("1. 관광객 정보");
			System.out.println("2. 목적지 변경");
			System.out.println("3. 종료");
			
			int select = Integer.parseInt(scan.nextLine());
			
			if(select == 1) {
				for(int i = 0; i < count; i++) {
					System.out.println((i+1) + ".이름 : " + guest[i].getName());
					System.out.println((i+1) + ".성별 : " + guest[i].getGender());
					System.out.println((i+1) + ".장소 : " + point);
				} // for 
			} // if
			else if(select == 2) {
				
				System.out.println("어디로 변경하겠습니다? ");
				Guide.point = scan.nextLine(); // point 로 해도 okay
				System.out.println(Guide.point + "로 목적지 변경");
			} else if(select == 3) {
				System.out.println("종료");
				break;
			}
		}
	}
	
}
