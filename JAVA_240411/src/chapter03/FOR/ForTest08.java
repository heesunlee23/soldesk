package chapter03.FOR;

import java.util.Scanner;

public class ForTest08 {
	public static void main(String[] args) {
		// 학생의 인원 수와 점수를 입력받고, 학생들 점수의 총점과 평균을 구하시오 
		Scanner scan = new Scanner(System.in);
		
		int i, sum=0, cnt=0, score;
		double avg=0;
		
		System.out.print("몇 명의 학생 점수를 입력받으시겠습니까? : ");
		int stu = Integer.parseInt(scan.nextLine());
		
		for (i=1; i<=stu; i++) {
			System.out.print(i+"번째 학생의 점수를 입력하세요 : ");
			score = Integer.parseInt(scan.nextLine());
			sum += score;
			cnt++;
		} // for 문 
		avg = (double)sum/cnt; // ****
		System.out.println("총점: " + sum + ", 평균: " + avg);
	}
}
