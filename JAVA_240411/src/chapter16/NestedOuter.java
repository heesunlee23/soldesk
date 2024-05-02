package chapter16;

public class NestedOuter { // 정적 중첩 클래스 

	private static int outValueStatic = 3;
	private int outValue = 2;
	
	static class Nested{ // 정적중첩클래스
		
		private int nesteInstanceValue = 1;
		
		public void print() {
			System.out.println(nesteInstanceValue); // 정적 중첩클래스의 멤버변수
			// System.out.println(outValue); // 외부 클래스의 인스턴스 멤버변수 접근 불가
			// System.out.println(NestedOuter.outValueStatic); // 가능 
			System.out.println(outValueStatic); // NestedOuter 안 붙혀도 됨. static이어서 가능
		}
	}
}
