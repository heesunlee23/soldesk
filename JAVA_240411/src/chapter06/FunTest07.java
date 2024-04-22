// 다시 안봐도 됨
package chapter06;

import java.util.Scanner;

public class FunTest07 {

	// 내 답
//	public static void EduStep(int step) {
//		if(step > 4 || step < 0) {
//			System.out.print("해당하는 스터디 단계가 없습니다.");
//			return;
//		}
//		
//		System.out.print("스터디 단계는 " + step + " 단계 입니다.");
//	}
	
	public void EduStep(int edu) {
		
		if(edu == 1) {
			System.out.println("현재 스터디 단계는 Step1 입니다.");
			return;
		} else if(edu == 2) {
			System.out.print("현재 스터디 단계는 Step2 입니다.");
		} else if(edu == 3) {
			System.out.print("현재 스터디 단계는 Step3 입니다.");
		} else {
			System.out.println("해당하는 스터디 단계가 없습니다.");
		}
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("스터디 단계를 입력하세요 (정수): ");
		int number = Integer.parseInt(scan.nextLine());
				
		// EduStep(number);
		
		FunTest07 education = new FunTest07();
		education.EduStep(number);

		scan.close(); 
	}

}
