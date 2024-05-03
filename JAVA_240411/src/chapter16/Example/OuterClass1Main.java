package chapter16.Example;

public class OuterClass1Main {
	
	// 정적 중첩 클래스 NestedClass를 구현하고 hello() 메서드를 만드세요. 
	public static void main(String[] args) {
		OuterClass1.NestedClass c = new OuterClass1.NestedClass();
		c.hello(); // 정적 내부 클래스의 일반 메서드
	}
}
