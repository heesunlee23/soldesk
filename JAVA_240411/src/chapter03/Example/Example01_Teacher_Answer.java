// 다시 안봐도 됨 
package chapter03.Example;

public class Example01_Teacher_Answer {
	
	public static void main(String[] args) {
		// 1~100까지의 수 중 3의 배수의 합
		int sum = 0;
		
		for(int i = 1; i < 100; i++) {
			
			if(i%3 == 0) {
				sum += i;
			} // if 문 
		} // for 문 
	}
}
