package chapter16;

public class InnerOuterMain {

	public static void main(String[] args) {
		
		InnerOuter outer = new InnerOuter(); // 외부 클래스가 객체로 생성되어야만 내부클래스도 객체로 생성 가능 
		InnerOuter.Inner inner = outer.new Inner(); // 이렇게 쓰는 경우 거의 없다. 
		
		//내부 클래스 객체 먼저 생성 (7줄) -> 외부 클래스 객체 생성 (8줄)
		
		// 내부클래스는 외부클래스의 소속
		// 내부클래스는 외부클래스.new 내부클래스()로 생성
		// 외부클래스를 먼저 생성해야 내부클래스 생성 가능
		inner.print();
		
		System.out.println(inner);

	}

}
