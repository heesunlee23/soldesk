package chapter16.Example;

public class OuterClass2Main {

	//내부클래스 NestedClass를 구현하고 hello() 메서드를 만드세요
	public static void main(String[] args) {
		OuterClass2 outer = new OuterClass2();
		OuterClass2.NestedClass inner = outer.new NestedClass();
		inner.hello();
	}
}
