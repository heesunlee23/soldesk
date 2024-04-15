package chapter03.IF;

import javax.swing.JOptionPane;

public class IfExample03 {
	public static void main(String[] args) {
		
		char grade;
		int jumsu;
		
		jumsu = Integer.parseInt(JOptionPane.showInputDialog("Java 점수"));
	
		if(jumsu >= 90) {
			System.out.println('A');
		}else if(jumsu >= 80) {
			System.out.println('B');
		}else if(jumsu >= 70) {
			System.out.println('C');
		}else if(jumsu >= 60) {
			System.out.println('D');
		}else {
			System.out.println('F');
		}
	}
}
