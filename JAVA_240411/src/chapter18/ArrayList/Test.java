package chapter18.ArrayList;

public class Test {
	public void fatherMethod() {
		System.out.println("아버지 메서드");
	}
}

class TestChild1 extends Test{
	
	@Override
	public void fatherMethod() {
		System.out.println("재정의한 아버지 메서드1");
	}
	public void child1Method() {
		System.out.println("자식 메서드1");
	}
}

class TestChild2 extends Test{
	
	@Override
	public void fatherMethod() {
		System.out.println("재정의한 아버지 메서드2");
	}
	public void child2Method() {
		System.out.println("자식 메서드2");
	}
}
