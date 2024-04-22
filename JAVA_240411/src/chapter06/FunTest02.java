// 다시 안봐도 됨 
package chapter06;

public class FunTest02 {

	public static int test(int a, int b) {
		
		int total = a * b;
		System.out.println(total);
		
		return total;
	}
	
	public static void main(String[] args) {
		
		int a = 3;
		int b = 5;
		
		// test(a, b);
		System.out.println(test(a, b));
	}

}
