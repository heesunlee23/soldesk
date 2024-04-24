// 24-04-24

package chapter08;

public class StaticFunctionMain {

	public static void main(String[] args) {
		
//		StaticFunction st = new StaticFunction();
//		
//		System.out.println(st.getStatic());
		
		System.out.println(StaticFunction.getStatic()); 
		// static 메서드는 클래스명으로 접근 가능

	}
}
