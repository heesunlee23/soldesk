// 
package chapter06;

public class FunTest09 {
	// 재귀함수: 자기자신을 호출. 실무에서 안씀 
	// 왜함? 메서드를 이해하기 좋음 + 코테에서는 자주 나옴 
	
	public static int recur(int a) {
		int result;
		System.out.print(a + " ");
		
		if(a == 1) {
			return 1;
		} else {
			result = a * recur(a - 1);
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		int x = 3;
		int res = recur(x);
		System.out.println("메서드 호출");
		System.out.println("1~"+ x + "까지의 수를 곱한 값: "+res);
	} // main

}
