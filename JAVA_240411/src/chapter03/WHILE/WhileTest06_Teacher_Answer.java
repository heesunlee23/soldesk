package chapter03.WHILE;

import javax.swing.JOptionPane;

public class WhileTest06_Teacher_Answer {

	public static void main(String[] args) {
		
		int num1, num2;
		
		do {
			num1 = Integer.parseInt(JOptionPane.showInputDialog("OTP DB"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("OTP USER"));
			
			if(num1 == num2) {
				System.out.println("인증성공!");
				break;
			} // if문
			
			System.out.println("다시 입력하세요!");
		} while(num1 != num2);

	}

}
