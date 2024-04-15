package chapter03.IF;

import java.util.Scanner;

public class IfExample10_Teacher {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String ID = scan.nextLine();
		
		System.out.print("비밀번호: ");
		int PW = Integer.parseInt(scan.nextLine()); // ****
		
		// 방법 1 
//		if(ID.equals("soldesk")) {
//			if(PW == 12345) {
//				System.out.println("로그인 성공");	
//			} else {
//				System.out.println("아이디가 일치하지 않습니다.");
//			}
//		}  else {
//			System.out.println("로그인 실패");
//		}
		
		// 방법2
		if(ID.equals("soldesk") && PW==12345) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}

	}

}
