package chapter16.Example;

public class OuterClass3 {

	public void myMethod() {
		class LocalClass {
			public void hello() {
				System.out.println("Hello World | 지역클래스");
			}
		}
		LocalClass local = new LocalClass();
		local.hello();
	}

}
