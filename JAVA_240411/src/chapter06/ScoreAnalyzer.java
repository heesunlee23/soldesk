package chapter06;

import java.util.Scanner;

public class ScoreAnalyzer { // Example01.java의 변형판 - 시키지는 않았는데 내가 해 본 것
	private Scanner scan = new Scanner(System.in);
	private int select = 0;
	private int studentNum = 0;
	private int[] score = null;

	private int getSelection() {
		System.out.println("=================================================");
		System.out.println("1.학생 수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
		System.out.println("================================================");
		System.out.print("선택> ");
		
		scan = new Scanner(System.in);
		select = Integer.parseInt(scan.nextLine()); 
		
		return select;
	}
	
	private void getStudentNum() {
		System.out.println("학생 수 > ");
		studentNum = Integer.parseInt(scan.nextLine());
		score = new int[studentNum];
	}
	
	private void getScores() {
		if(score == null) {
			System.out.println("학생 수를 입력하세요");
			return;
		}

		for(int i = 0; i < score.length; i++) {
			System.out.print("score["+i+"] > ");
			score[i] = Integer.parseInt(scan.nextLine());
		}
	}
	
	private void getScoreList() {
		if(score == null) {
			System.out.println("학생 수를 입력하세요");
			return;
		}

		for(int i = 0; i < score.length; i++) {
			System.out.println("score[" + i + "]: " + score[i]);
		} 
	}
	
	private void analyze() {
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
		
		avg = Math.round(sum / (double) studentNum * 100) / 100.0;
		System.out.println("최고 점수: " + max);
		System.out.println("총점: " + sum);
		System.out.println("평균: " + avg);
	}
	
	private void runProgram() {
		while(true) {
			select = getSelection();

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
		
	public static void main(String[] args) {
		ScoreAnalyzer analyzer = new ScoreAnalyzer();	
		analyzer.runProgram();
	}
}
