// 선생님 답안

package chapter03.IF;

import javax.swing.JOptionPane;

public class IfExample04_3 {

	public static void main(String[] args) {
		int age;
		int charge;
		age = Integer.parseInt(JOptionPane.showInputDialog("나이를 입력하세요"));
		
		if(age <= 7) {
			charge = 1000;
			System.out.println("미취학 아동입니다");
		}else if(age <= 13) {
			charge = 2000;
			System.out.println("초등학생입니다");
		}else if(age <= 19) {
			charge = 3500;
			System.out.println("중고등학생입니다");
		} else {
			charge = 5000;
			System.out.println("성인입니다");
		}
		
		System.out.println("입장료는 " + charge + "원 입니다");
		

	}

}
