package chapter07.Example;

import java.util.Scanner;

public class StartMain {

	public static void main(String[] args) {
		
		int select;
		String check;
		
		Start st = new Start();
		
		while(true) {
			System.out.println("숫자를 입력하세요 : ");
			Scanner scan = new Scanner(System.in);
			select = Integer.parseInt(scan.nextLine());
			check = st.check(select);
			
			if(check.equals("SUCCESS")) { // equals(): 문자열 일치 여부 메서드 
				break;
				
			}
		}

	}

}
