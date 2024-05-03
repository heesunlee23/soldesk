package chapter16.Example;

public class OuterClass2 {
	// 지역클래스 LocalClass를 구현하고 hello() 메서드를 호출하세요
	class NestedClass {
		public void hello() {
			System.out.println("Hello World | 내부클래스");
		}
	}
}
