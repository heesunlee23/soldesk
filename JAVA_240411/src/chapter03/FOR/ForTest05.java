// 다시 안봐도 됨
package chapter03.FOR;

import java.util.Scanner;

public class ForTest05 {

	public static void main(String[] args) {
		// 문제 1: 정수를 입력받아(Scanner) 입력받은 정수로부터 100까지의 합을 출력
		Scanner scan = new Scanner(System.in);
		System.out.print("[문제 1] 숫자를 입력하세요: ");
		int startingNumber = scan.nextInt();
		
		int result = 0;
		
		for (int i = startingNumber; i <= 100; i++) {
			result += i;
		}
		
		System.out.println(startingNumber+"부터 100까지의 합은: " + result);
		System.out.println("========================================================");
		
		// 문제 2: 1부터 10까지 정수를 반복 입력받아 그 중 짝수의 개수가 몇 개인지 출력 - 1부터 10까지 입력 받아서 짝수 몇 개인지
		
		int num = 0;
		int evenNumberCounter = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.print((i + 1)+"번째 숫자를 입력하세요: ");
			num = scan.nextInt();
			if(num % 2 == 0) {
				evenNumberCounter++;
			}
		}
	
		System.out.println("짝수의 개수는 "+evenNumberCounter+" 개 입니다.");
		
		scan.close();
	}

}
