// 봤음 
package chapter18.ArrayList;

import java.util.ArrayList; // 쓰는 방법 반드시 숙지 
import java.util.Scanner;

public class ArrayListTest2 {

	public static void main(String[] args) {
		
		ArrayList<User> arr = new ArrayList<User>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("아이디 생성 : ");
			String id = sc.nextLine();
			System.out.println("패스워드 생성 : ");
			int pw = Integer.parseInt(sc.nextLine());
			
			User user = new User(); 
			user.setId(id);
			user.setPwd(pw);
			
			arr.add(user); // 하나의 User 객체 저장 
			
			// 모든 User 정보 출력 
			for(User u : arr) {
				System.out.println(u.getId());
				System.out.println(u.getPwd());
				System.out.println("======================");
			}
			
		} // while

	} // main

}
