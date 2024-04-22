package chapter04.Example;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		// 학생수를 입력받아, 점수를 입력하고 점수리스트를 출력, 총점과 평균을 분석하시오
		
		int[] score = null;
		boolean run = true;
		int sum = 0;
		Scanner scan = new Scanner(System.in);;

		while(run) {
			System.out.println("==================  Welcome  ===================");
			System.out.println("1.학생 수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("================================================");
			System.out.print("메뉴를 선택하세요: ");
			
			int choice = scan.nextInt();
		
			switch (choice) {
			case 1:
				System.out.print("학생 수를 입력하세요: ");
				int studentNum = scan.nextInt();
				score = new int[studentNum];
				System.out.println("학생 수는 " + score.length + "명 입니다");
				break;
			case 2:
				for(int i = 0; i < score.length; i++) {
					System.out.print("학생 " + (i + 1) +"의 점수를 입력하세요: ");
					score[i] = scan.nextInt();
					sum += score[i]; 
				}
				break;
			case 3:
				for(int i = 0; i < score.length; i++) {
					System.out.println("학생 " + (i + 1) +"의 점수는 "+ score[i] + "점 입니다");
				}
				break;
			case 4:
				System.out.println("총점은: " + sum + "점 입니다.");
				double result1 = Math.round(sum / (double) score.length * 100) / 100.0;
				System.out.println("평균은: " + result1 + " 입니다.");
				break;
			case 5: 
				run = false;
				System.out.println("종료합니다");
				break;
			default:
				System.out.println("초기화면으로");
				break;
			}
			System.out.println();
		}
		scan.close();
	}
}
