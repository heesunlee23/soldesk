// 내 정답
package chapter03.IF;

import javax.swing.JOptionPane;

public class IfExample08 {

	public static void main(String[] args) {
		
		try {
			int[] numbers = new int[2];
			
			numbers[0] = Integer.parseInt(JOptionPane.showInputDialog("첫 번째 숫자(num1)를 입력하세요"));
			numbers[1] = Integer.parseInt(JOptionPane.showInputDialog("두 번째 숫자(num2)를 입력하세요"));
			
			compareTwoNumbers(numbers);
		} catch (Exception e) {
			System.out.println("예외 발생!");
		}
		
	}
	
	public static void compareTwoNumbers(int[] numbers) {
		
		if (numbers[0] > numbers[1]) {
			System.out.println("num1이 큽니다");
		} else if (numbers[0] < numbers[1]) {
			System.out.println("num2가 큽니다");
		} else {
			System.out.println("두 수는 같습니다");
		}
	}

}
