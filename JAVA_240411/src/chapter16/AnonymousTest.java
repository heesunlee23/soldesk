package chapter16;

public class AnonymousTest {
	
	// Hello 익명 클래스 생성하고 hello()를 호출하세요
	public static void main(String[] args) {
		new Hello() {
			
			@Override
			public void hello() {
				System.out.println("Hello World | 익명클래스");
			}
		}.hello();		
	}
}
