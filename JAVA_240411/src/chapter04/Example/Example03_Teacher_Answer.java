package chapter04.Example;

import java.util.Scanner;

public class Example03_Teacher_Answer {

	public static void main(String[] args) {
		
		int[] score = null;
		int studentNum = 0;
		
		while(true) {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("=================================================");
			System.out.println("1.학생 수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("================================================");
			System.out.print("선택> ");
			
			int select = Integer.parseInt(scan.nextLine()); // ****
			
			if(select == 1) {
				
				System.out.println("학생 수 > ");
				studentNum = Integer.parseInt(scan.nextLine());
				score = new int[studentNum];
			} // if
			else if(select == 2) {
				
				if(score != null) { // 예외처리 ****
					for(int i = 0; i < score.length; i++) {
						System.out.print("score["+i+"] > ");
						score[i] = Integer.parseInt(scan.nextLine());
					}
				} else {
					System.out.println("학생 수를 입력하세요");
				}
			} // else if
			else if(select == 3) {
				
				if(score != null) { // ****
					for(int i = 0; i < score.length; i++) {
						System.out.println("score[" + i + "]: " + score[i]);
					} // for 
				} else {
					System.out.println("학생 수를 입력하세요");
				}
			} // else if 
			else if(select == 4) {
				if(score != null) { // ****
					int max = 0; 
					int sum = 0;
					double avg = 0.0;
					
					for(int i=0; i<score.length; i++) {
						max = max < score[i] ? score[i] : max; // ****
						sum += score[i];
					}
					
					avg = sum/(double)studentNum;
					System.out.println("최고 점수: " + max);
					System.out.println("총점: " + sum);
					System.out.println("평균: " + avg);
				} else {
					System.out.println("학생 수를 입력하세요");
				}
			}
			else if(select == 5) {
				System.out.println("프로그램 종료");
				break;
			}
			else {
				System.out.println("1부터 5 사이의 번호를 입력하세요");
			}
		}

	}

}
