package chapter02;

public class Bit_Test01 {
	public static void main(String[] args) {
		// Bit 연산 
		// 빅데이터, 암호화 할 때 씀 
		// -> 계산속도가 빠르고 예측하기 어려운 숫자가 나와서 
		int num1 = 5; // 0101
		int num2 = 10; // 1010
		
		int result = num1 | num2;
		System.out.println(result);
		
		//비트연산자(AND)
		result = num1 & num2;
		System.out.println(result);
		
		// 비트연산자 (XOR) - 서로 다르면 1, 같으면 0 반납
		result = num1 ^ num2;
		System.out.println(result);
	}
}
