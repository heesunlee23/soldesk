// 다시 볼 필요 없음

package chapter06;

import javax.swing.JOptionPane;

// 함수: 특별한 목적의 작업을 반복적으로 수행하기 위해 독립적으로 설계된 코드의 집합 
public class FunTest01 { // 함수, 메서드 
	
	public static void sum(int num1, int num2) { // (int num1, int num2) 매개변수라고 함 
		
		int total = num1 + num2;
		System.out.println(total);
		
	} //sum

	public static int sum1(int num1, int num2) {
		
		int total = num1 + num2;
		
		return total;
	}
	
	public static void main(String[] args) {
		
		// 입력받은 값을 더 해주는 코드 
		int a, b;
		a = Integer.parseInt(JOptionPane.showInputDialog("값1"));
		b = Integer.parseInt(JOptionPane.showInputDialog("값1"));
	
		sum(a, b);

		int c=1;
		int d=2;
		sum(c, d);
		
		sum(3, 4);
		
		int e = 5;
		int f = 6;
		int g = sum1(e, f); // int g = 11
		System.out.println(g);
		
		
	}

}
