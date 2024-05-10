// 봤음 
package chapter20;

public class ArithmeticExceptionTest {

	public static void main(String[] args) {
		
		try {
			Calculator cal = new Calculator();
			int num = cal.divide(6, 0);
			System.out.println(num);
		} catch (ArithmeticException e) { // ArithmeticException : 수학적 예외를 처리 
			System.out.println(e.getMessage());
		}
	}

}
