package chapter15.Example;

/* 
 * 문제4

         Hello Java      
Hello Oracle
 */
public class StringTest4 {

	public static void main(String[] args) {
		
		//str의 앞뒤 공백을 제거하고, Java를 Oracle로 바꾼 후 str의 모든 문자를 대문자로 만드세요
		
		String str = "                 Hello Java                 ";
//		System.out.println("원본 문자열 : " + str);
//		
//		String trimmed = str.trim();
//		System.out.println("공백 제거 후 문자열 : " + trimmed);
//		
//		trimmed = trimmed.replace("Java", "Oracle");
//		System.out.println("Java를 Oracle로 바꾼 후 문자열 : " + trimmed);
//		
//		System.out.println("대문자로 바꾼 후 문자열 : " + trimmed.toUpperCase());
		
		System.out.println(str);
		str = (str.trim()).replace("java", "Oracle").toUpperCase();
		System.out.println(str);

	}

}
