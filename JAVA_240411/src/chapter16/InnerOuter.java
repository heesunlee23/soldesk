package chapter16;

public class InnerOuter {
	
	private static int outClassValue = 3;
	private int outInstanceValue = 2;
	
	class Inner{
		private int innerInstanceValue = 1;
		
		public void print() {
			System.out.println(innerInstanceValue); // 내부클래스의 멤버변수
			System.out.println(outInstanceValue); // 외부클래스의 멤버변수
			System.out.println(outClassValue); // 외부 클래스의 정적 멤버변수
		}
	}
}
