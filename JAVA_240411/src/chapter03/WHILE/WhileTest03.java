package chapter03.WHILE;

import java.util.Scanner;

public class WhileTest03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("Java 교과목 점수를 입력하세요 : ");
			int scr = Integer.parseInt(scan.nextLine());
			
			// 입력받은 점수가 0 미만이거나 100초과하면 while 문 중지
			if(scr < 0 || scr > 100) {
				break;
			} // if문
			
			else if(scr >= 60) {
				System.out.println("합격하셨습니다.");
			} // else if문
			else {
				System.out.println("불합격하셨습니다.");
			}
		}
		System.out.println("프로그램 종료");
	}
}
