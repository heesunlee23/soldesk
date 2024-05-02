package chapter15.Example;

import java.util.Arrays;

/*
 * 문제2

str에서 'Java'가 시작하는 위치 : 6
-----------------------------------
Hello : Hello
Java : Java
 */

public class StringTest2 {

	public static void main(String[] args) {
		
		String str = "Hello Java";
		
//		//str에서 'Java' 문자열이 어디부터 시작하는지 위치를 찾아서 출력하시오
//		System.out.println("Java starts at: " + str.indexOf("Java"));
//		
//		System.out.println("-------------------------------------");
//		//str에서 'Hello'와 'Java'를 분리하시오
//		String[] split = str.split(" ");
//		System.out.println("Hello : " + split[0]);
//		System.out.println("Java : " + split[1]);
//		// System.out.println(Arrays.toString(split));
		
		//str에서 'Java' 문자열이 어디부터 시작하는지 위치를 찾아서 출력하시오
		int index = str.indexOf("Java");
		System.out.println("str에서 'Java'가 시작하는 위치 : " + index);
		System.out.println("-------------------------------------");
			
		//str에서 'Hello'와 'Java'를 분리하시오
		String helloStr = str.substring(0, 5);
		String javaStr = str.substring(6, 10);
		System.out.println("Hello : " + helloStr);
		System.out.println("Java : " + javaStr);
		
	}
}
