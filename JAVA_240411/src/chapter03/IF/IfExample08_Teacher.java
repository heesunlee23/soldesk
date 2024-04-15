package chapter03.IF;

import javax.swing.JOptionPane;

public class IfExample08_Teacher {

	public static void main(String[] args) {
		
		int num1, num2;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("값1"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("값2"));

		if (num1 > num2) {
			System.out.println("num1이 큽니다");
		} else if (num1 < num2) {
			System.out.println("num2가 큽니다");
		} else {
			System.out.println("두 수는 같습니다");
		}
	}

}
