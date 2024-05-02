package chapter15.Example;

/*
 * 문제1

      개 : 1
      고양이 : 3
      햄스터 : 3
      너구리 : 3
      고라니 : 3
      문자열 들의 길이 합 : 13
 */

public class StringTest1 {

	public static void main(String[] args) {
		//length()메서드를 이용해 arr 배열에 들어간 모든 문자열 길이의 합을 구하시오
		String[] arr = {"개", "고양이", "햄스터", "너구리", "고라니"};
//		
//		int sumOfStringLength = 0; 
//		
//		for(int i = 0; i < arr.length; i++) {
//			int strLen = arr[i].length();
//			System.out.println(arr[i] + " : " + strLen);
//			sumOfStringLength += strLen;
//		}
//
//		System.out.println("문자열 길이 합: " + sumOfStringLength);
		
		int sum = 0;
		for(String s : arr) {
			System.out.println(s + " : " + s.length());
			sum += s.length();
		} // for
		System.out.println("문자열 들의 길이 합 : " + sum);
	}

}
