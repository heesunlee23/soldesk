// 24-04-24

package chapter08;

public class StaticFunction {

	String str1 = "일반 회원변수";
	static String str2 = "static 회원변수"; // 정적 변수
	// static : 객체 호출 안해도 되고 
	// static 이라는 메모리 공간에 static 붙은 거 다 들어간다. 
	// 일반 변수는 heap 공간에 저장됨
	
	// static은 메모리 공간 많이 사용해서 지양 
	// static으로 만든 건 모든 변수가 공유가능. 객체지향에서는 지양
	
	public static String getStatic() {
		return str2;
	} // 정적 메소드
}
