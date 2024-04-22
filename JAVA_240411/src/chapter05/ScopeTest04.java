package chapter05;

public class ScopeTest04 {

	static int a = 5; // 전역변수
	int b = 5; // 인스턴스 변수(삭제)
	
	public static void test() {
		
		int c = 5;
		int d = 7;
		System.out.println(a);
	} // test
	
	public static void main(String[] args) {
		System.out.println("main 메서드: " + a);
		test();
	}

}
