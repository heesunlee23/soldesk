// 봤음 
package chapter20;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionHandling {

	public static void main(String[] args) {
		
//		FileInputStream fis = null; //		
//		try {
//			fis = new FileInputStream("ab.txt"); // 에러가 발생한 순간 catch로 이동 -> 다음 줄 fis.close() 못함 
//			fis.close();
//		} catch (IOException e) { // fileNotFoundException의 부모 클래스 
//			System.out.println(e.getMessage());
//		} finally {
//			fis.close(); // fis에 빨간줄 - 값을 넣었는지 안넣었는지 인식을 못함 
//		}
		
		// 이렇게 고쳐야 함 
		FileInputStream fis = null; 
		// 초기화 하는 거랑 안하는 거랑 무슨차이? 	
		// null 안하면 선언만 한거고 공간 자체가 만들어지지 않음 
		try {
			fis = new FileInputStream("ab.txt");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				fis.close();
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			}
			System.out.println("finally");
		}
		// 문제점: 복잡하다. 
		// 해결: 파일 리소스 컨트롤 할 수 있는 코드를 자바가 제공 -> AutoCloseObj.java를 볼 것 
	}

}
