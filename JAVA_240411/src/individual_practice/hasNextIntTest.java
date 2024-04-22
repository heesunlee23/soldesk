package individual_practice;

import java.util.Scanner;

public class hasNextIntTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		while (!scan.hasNextInt()) { //값이 숫자인지 판별
            scan.next();  //값이 숫자가 아니면 버린다.
            System.err.print("에러! 숫자가 아닙니다. \n재 선택 : ");
		 }
		scan.nextInt(); //위에서 값이 숫자일 경우 이쪽으로 값을 넣어준다.
	}
}
