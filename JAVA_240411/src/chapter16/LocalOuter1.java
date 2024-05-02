package chapter16;

public class LocalOuter1 {
	
	private int outInstanceVal = 1; // 외부클래스의 멤버변수
	
	public void outMethod(int paramVal) { // 외부클래스의 메서드(매개변수) // 이게 실행 되는 순간에 LocalClass 생김 -> 메모리 낭비 줄일 수 있다. 
		
		int localVal = 2; // 외부클래스 메서드의 지역변수
		
		class LocalClass implements Printer { // 지역클래스는 지역변수처럼 접근지정자 불가
			// 지역클래스도 클래스이기 때문에 implements 가능 => 이거 가능함을 보일려고 한 거임 
			
			int localClassInstanceVal = 4; // 지역클래스의 멤버변수

			@Override
			public void print() { // 인터페이스 메서드 재정의(지역클래스도 클래스이기 때문에 implements 가능)
				System.out.println("외부클래스의 멤버변수 : " + outInstanceVal);
				System.out.println("외부클래스 메서드의 지역변수 : " + localVal);
				System.out.println("외부클래스 메서드의 매개변수 : " + paramVal);
				System.out.println("지역클래스의 멤버변수 : " + localClassInstanceVal);
			}
		} // 지역클래스
		LocalClass lo = new LocalClass(); // 지역변수처럼 메서드 내에서만 생성 가능 
		lo.print();
	}

}
