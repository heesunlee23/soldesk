// 관계 연산자 (중요)

package chapter02;

public class Rela_Test {

	public static void main(String[] args) {
		
		char a, b;
		a = 'A'; // 65
		b = 'B'; // 66
		
		boolean A1 = a > b; // false
		System.out.println(A1);
		
		// a가 크다고 명시 
		System.out.println("a > b : " + (a > b));
		// b가 크다고 명시
		System.out.println("a < b : " + (a<b));
		// a와 b가 같다고 명시
		System.out.println("a == b : " + (a==b));
		// a와 b가 같이 않은 경우
		System.out.println("a != b : " + (a!=b));
		
		int num1 = 5;
		int num2 = 3;
		
		System.out.println("num1 > num2 : " + (num1 > num2));
		System.out.println("num1 < num2 : " + (num1 < num2));
		System.out.println("num1 >= num2 : " + (num1 >= num2));
		System.out.println("num1 <= num2 : " + (num1 <= num2));
		System.out.println("num1 == num2 : " + (num1 == num2));
		System.out.println("num1 != num2 : " + (num1 != num2));
	}

}
