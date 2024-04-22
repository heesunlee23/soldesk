// 주의 깊게 봐야 함
package chapter06;

public class FunTest03 {
	
	//값을 바꾸는 함수 
	public static void swap(int x, int y) {
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("swap 함수 결과값 a = " + x + " b = " + y);
	}
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("swap 함수 호출 전 a = " + a + " b = " + b);
		swap(a, b);
		System.out.println("swap 함수 호출 후 a = " + a + " b = " + b);
	}

}
