package chapter03.WHILE;

import javax.swing.JOptionPane;

public class WhileTest06 {

	public static void main(String[] args) {
		
		int num1, num2;
		
		// OTP DB라고 dialog 나옴 
		// 같은 값을 넣으면 인증성공이 콘솔창에 나오고 dialog 닫힘
		// 다르면 다시 입력 받음 
		
		while(true) {
			num1 = Integer.parseInt(JOptionPane.showInputDialog("OTP DB"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("OTP DB"));
			
			if(num1 == num2) {
				System.out.println("인증성공!");
			} else {
				System.out.println("다시 입력하세요!");
			}
		}
	}
}
