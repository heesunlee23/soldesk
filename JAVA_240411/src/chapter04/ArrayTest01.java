package chapter04;

public class ArrayTest01 {
	
	public static void main(String[] args) {
		
		// 어떤 것이든 무방 
		int number1[] = new int[10]; // int 타입의 number1 배열 방 10개
		int[] number2 = new int[10]; // int 타입의 number2 배열 방 10개
		
		// 먼저 선언만 
		int number3[];
		number3 = new int[10];
		
		number1[0] = 3;
		System.out.println(number1[0]);
		
		// 보통 한꺼번에 값 넣음 
		
		int number4[] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(number4[1]);
		
		// 값 넣는 또다른 방법 
		for (int i = 0; i < 5; i++) {
			number3[i] = i+1;
		}
		
		// 값 가져오기 
		for (int i = 0; i < 5; i++) {
			System.out.println("number3 배열[" + i + "]:" + number3[i] + " ");
		}
		
		// ****코드의 길이가 길어지면 배열의 길이가 몇 인지 추적 어려울 수도 있다. => number3.length
		System.out.println("배열의 길이" + number3.length);
		
		for (int i = 0; i < number3.length; i++) {
			System.out.println("number3 배열[" + i + "]:" + number3[i] + " ");
		}
		
		
		
		
	}

}
