package chapter06;

import java.util.Scanner;

public class Example01 {
	static int[] score = null;
	static int studentNum = 0;
	static Scanner scan = new Scanner(System.in);

	private static int getSelection() {
		System.out.println("=================================================");
		System.out.println("1.학생 수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
		System.out.println("================================================");
		System.out.print("선택> ");
		
		int select = Integer.parseInt(scan.nextLine()); 
		
		return select;
	}
	
	private static void getStudentNum() {
		System.out.println("학생 수 > ");
		studentNum = Integer.parseInt(scan.nextLine());
		score = new int[studentNum];
	}
	
	private static void getScores() {
		if(score == null) {
			System.out.println("학생 수를 입력하세요");
			return;
		}

		for(int i = 0; i < score.length; i++) {
			System.out.print("score["+i+"] > ");
			score[i] = Integer.parseInt(scan.nextLine());
		}
	}
	
	private static void getScoreList() {
		if(score == null) {
			System.out.println("학생 수를 입력하세요");
			return;
		}

		for(int i = 0; i < score.length; i++) {
			System.out.println("score[" + i + "]: " + score[i]);
		} 
	}
	
	public static void runProgram() {
		while(true) {
			int select = getSelection();

			if(select == 1) {
				getStudentNum();
			}
			else if(select == 2) {
				getScores();
			} 
			else if(select == 3) {
				getScoreList();
			}  
			else if(select == 4) {
				analyze();
			}
			else if(select == 5) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("1부터 5 사이의 번호를 입력하세요");
			}
		}
	}
	
	private static void analyze() {
		if(score == null) {
			System.out.println("학생 수를 입력하세요");
			return;
		}

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

	}

	// main에 코드 많이 있는 거 안좋다. 
	public static void main(String[] args) {
		runProgram();	
	}

}
