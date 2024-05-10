// 봤음 
package chapter20;

import java.io.IOException;

public class FileExceptionTest1 {

	// try-catch로 처리하는 것보다 throws쓰는게 보편적임
	// 이 모든 종류의 에러를 개발자가 다 잡을 수 없다. 
	// 기본적인 예외처리만 할 것 나머지는 사용자(main)한테 다 떠 넘기고 에러 터지면 책임소재 가려서 처리 하면 됨 
	public static void main(String[] args) throws IOException {
		FileRead fr = new FileRead();
		try {
			fr.read();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
