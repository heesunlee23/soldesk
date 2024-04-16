package chapter03.WHILE;

import java.util.Scanner;

public class WhileTest04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num, cnt = 0, sum = 0;
		
		while (true) {
			System.out.print("숫자를 입력하세요 : ");
			num = scan.nextInt();
			if (num == 0) {
				break;
			}
			cnt++;
			sum += num;
		}
		
		getResult(cnt, sum);
	}

	private static void getResult(int cnt, int sum) {
		System.out.println("입력된 자료의 갯수: "+ cnt);
		System.out.println("입력된 숫자의 합: " + sum);
		System.out.println("입력된 자료의 평균: " + (double)(sum/cnt));
	}

}
