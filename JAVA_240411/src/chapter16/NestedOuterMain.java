package chapter16;

public class NestedOuterMain {

	public static void main(String[] args) {
		
		// NestedOuter outer = new NestedOuter(); ==> 불필요 
		// 원래 이렇게 
		// NestedOuter.Nested nestd = newNestedOuter.Nest
		// 빨간 줄 나와서 고친거
		NestedOuter.Nested nestd = new NestedOuter.Nested();
		
		nestd.print();
		System.out.println("정적중첩클래스 : " + nestd); // 내부 클래스는 $로 구분
		System.out.println("========================");
		// Nested nested1 = new Nested(); // 외부클래스와 상관없이 객체 생성 가능

	}

}
