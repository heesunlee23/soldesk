package chapter15.Example;

import java.util.Scanner;

public class StringTest7 {

	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
//		String str;
//		String arr[];
//		String conncted = null;
//		
//		System.out.print("문장을 입력하세요 : ");
//		str = scan.nextLine(); // '/' 기준으로 분리
//		if(str.contains("/")) { // *** 중요 
//			arr = str.split("/");
//			for(String s : arr) {
//				System.out.println(s);
//			}
//			conncted = String.join(", ",arr); // *** 중요 
//			System.out.println("입력된 문자열 : " + conncted);
//			System.out.print("검색할 단어를 입력하세요 : ");
//		}else {
//			System.out.println(str);
//			System.out.println("입력된 문자열 : " + str);
//			System.out.println("프로그램을 종료합니다");
//		}
//	
//		String search = scan.nextLine();
//		if(conncted.contains(search)) { 
//			System.out.println("'" + search + "'는(은) 입력된 문자열에 포함되어 있습니다");
//		}else { 
//			System.out.println("'" + search + "'는(은) 입력된 문자열에 포함되어 있지 않습니다");
//			
//		}
		
		////////////////////////////////////선생님 답////////////////////////
		Scanner scan = new Scanner(System.in);
		System.out.println("문장을 입력하세요 : ");
		String str = (scan.nextLine()).trim(); // 문자열 입력
		String[] splitStr = str.split("/"); // 문자열 분리
		for(String s : splitStr) {
			System.out.println(s);
		} // for 
		
		String joinStr = String.join(", ", splitStr);
		System.out.println("입력된 문자열 : " + joinStr);
		
		System.out.println("==========================================");
		System.out.println("검색할 단어를 입력하세요: ");
		String searchStr = (scan.nextLine()).trim();
		
		String lowerJoinStr = joinStr.toLowerCase();
		String lowerSearchStr = searchStr.toLowerCase();
		
		boolean isPresent = lowerJoinStr.contains(lowerSearchStr);
		
		if(isPresent) {
			System.out.println("'" + searchStr + "'는(은) 입력된 문자역 내에 포함되어 있습니다.");
		} else {
			System.out.println("'" + searchStr + "'는(은) 입력된 문자역 내에 포함되어 있지 않습니다.");
		}
	}

}
