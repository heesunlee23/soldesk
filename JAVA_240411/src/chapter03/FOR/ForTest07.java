// 다시 안봐도 됨
package chapter03.FOR;

import java.util.Scanner;

public class ForTest07 {

	public static void main(String[] args) {
		
		// 10개의 정수를 입력받아 3의 배수와 5의 배수를 각각 몇 개씩 받았는지 출력하시오
		Scanner scan = new Scanner(System.in);
		int cnt3 = 0;
		int cnt5 = 0;
		int input = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.print((i + 1) + "번째 숫자를 입력하세요: ");
			input = scan.nextInt();
			
			if(input % 3 == 0) {
				cnt3++;
			} 
			
			if (input % 5 == 0) {
				cnt5++;
			}
		}
		
		System.out.println("3의 배수: " + cnt3 + " 개");
		System.out.println("5의 배수: " + cnt5 + " 개");
		
		scan.close();
	}
}
