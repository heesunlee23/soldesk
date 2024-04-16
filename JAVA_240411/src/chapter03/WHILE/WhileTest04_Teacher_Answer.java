package chapter03.WHILE;

import java.util.Scanner;

public class WhileTest04_Teacher_Answer {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num, cnt = 0, sum = 0;
		
		while(true) {
			System.out.print("숫자를 입력하세요: ");
			num = Integer.parseInt(scan.nextLine());
			
			if(num == 0) {
				break;
			} // if문
			cnt++;
			sum += num;
		} //while문
		
		System.out.println("입력된 자료의 갯수: "+ cnt);
		System.out.println("입력된 숫자의 합: " + sum);
		System.out.println("입력된 자료의 평균: " + sum/(double)cnt);
	}

}
