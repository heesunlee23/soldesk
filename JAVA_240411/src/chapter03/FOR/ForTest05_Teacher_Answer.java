// 다시 안봐도 됨
package chapter03.FOR;

import java.util.Scanner;

public class ForTest05_Teacher_Answer {

	public static void main(String[] args) {
		// 문제 1: 정수를 입력받아(Scanner) 입력받은 정수로부터 100까지의 합을 출력
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int a = Integer.parseInt(scan.nextLine());
		int sum = 0;
		int i = 0;
		
		for(i = a; i <= 100; i++) {
			sum += i;
		}
		System.out.println(a+"에서 100까지의 합 : "+sum);
		System.out.println("--------------------------------");
		
		int b, j, cnt = 0;
		
		for(j = 1; j <= 10; j++) {
			System.out.print(j + "번째 정수를 입력하세요: ");
			b = Integer.parseInt(scan.nextLine());
			if(b%2 == 0) {
				cnt++;
			}//if문
		}//for문
		System.out.println("입력받은 짝수의 개수: " + cnt);
	}

}
