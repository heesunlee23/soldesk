// 봤음 
package chapter20;

public class AutoCloseObj implements AutoCloseable {
	// AutoCloseable: try문에서 선언된 객체들에 대해 try가 종료되는 지점에서 자원을 자동으로 해제해주는 인터페이스 
		
	// ExceptionHandling.java를 보면 파일 관련 핸들링이 불편 했음
	// 특히 자원을 닫는 코드가 번거로웠음 (중첩된 try)
	
	@Override
	public void close() throws Exception {
		System.out.println("리소스가 close() 되었습니다.");	
	}
	
}

// 추가 자료 : https://codechacha.com/ko/java-try-with-resources/