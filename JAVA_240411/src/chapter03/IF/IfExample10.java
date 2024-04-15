// 내 정답

package chapter03.IF;

import java.util.Scanner;

public class IfExample10 {

	private static final String Int = null;

	public static void main(String[] args) {
		
		try {
			String ID = "soldesk";
			int PW = 12345;
			
			login(ID, PW);
		}
		catch (Exception e) {
			System.out.println("예외발생");
			e.printStackTrace();
		}
		
	}
	
	private static void login(String ID, int PW) {
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.print("아이디를 입력하세요: ");
		String myID = scan.nextLine();
		
		System.out.print("패스워드를 입력하세요: ");
		int myPassword = scan.nextInt();
		
		if(ID.equals(myID)) {
			if (PW == myPassword) {
				System.out.println(ID+"님 환영합니다");
			} else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		} else {
			System.out.println("아이디가 일치하지 않습니다.");
		}
		
		scan.close();
	}

}
