package chapter03.SWITCH;

import java.util.Scanner;

public class SwitchCase04 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("등급을 입력하세요 (A, B, C). 종료를 원하시면 1을 누르세요: ");
		char grade = scan.nextLine().charAt(0); // *** 문자열에서 첫 번쨰만 가져옴
		
		switch (grade) {
		case 'A': case 'a':
			System.out.println("우수회원 입니다.");
			break;
		case 'B': case 'b':
			System.out.println("일반회원 입니다.");
			break;
		case 'C': case 'c':
			System.out.println("비회원 입니다.");
			break;
		default:
			System.out.println("다시 입력해주세요(A, B, C)");
			break;
		}
		
	}
}
