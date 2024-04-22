// 다시 안봐도 됨 
package chapter06;

public class FunTest04 {

	public static void disp(String A[]) {
		for(int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		} // for
	}
	
	public static void main(String[] args) {
	
		String str[] = {"자바", "오라클", "JSP", "스프링", "파이썬"};
		disp(str);
//		for(int i = 0; i < str.length; i++) {
//			System.out.println(str[i]);
//		} // for 
		
		System.out.println("-------------------------------------------");
		String str1[] = {"김씨", "이씨"};
		disp(str1);
		
//		for(int i = 0; i < str1.length; i++) {
//			System.out.println(str1[i]);
//		} // for 
	}

}
