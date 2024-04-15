package chapter03.IF;

import javax.swing.JOptionPane;

public class IfExample05 {

	public static void main(String[] args) {
		//미취학 아동(7세 미만)의 전시관의 입장료는 1000원
		//초등학생(8~13세)의 전시관의 입장료는 2000원
		//중고등학생(14~19)의 전시관의 입장료는 3500원
		//성인의 전시관의 입장료는 5000원
		
		int age;
		int charge;
		age = Integer.parseInt(JOptionPane.showInputDialog("나이를 입력하세요"));
		
		if(age>0 && age<8) {
			charge = 1000;
			System.out.println("미취학 아동입니다");
		}else if(age>=8 && age<14) {
			charge = 2000;
			System.out.println("초등학생입니다");
		}else if(age>=14 && age<20) {
			charge = 3500;
			System.out.println("중고등학생입니다");
		}else {
			charge = 5000;
			System.out.println("성인입니다");
		}
		
		System.out.println("입장료는 " + charge +"원입니다");

	}

}
