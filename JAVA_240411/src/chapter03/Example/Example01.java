// 다시 안봐도 됨 
package chapter03.Example;

import java.util.Scanner;

public class Example01 {
	
	public static void main(String[] args) {
		// 1~100까지의 수 중 3의 배수의 합만 출력
		System.out.println("1부터 N까지 3의 배수의 합을 구합니다: ");
		System.out.print("정수 N을 입력하세요: ");
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		getSum(n);
	}

	private static void getSum(int n) {
		int sum = 0; 
		
		for (int i = 1; i <= n; i++) {
			if(i % 3 == 0) {
				sum += i;
			}
		}
		
		System.out.println("1부터 " + n + "까지 3의 배수의 합은: " + sum);
	}

}
