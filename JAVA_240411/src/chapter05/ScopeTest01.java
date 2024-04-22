package chapter05;

public class ScopeTest01 {

	public static void main(String[] args) {
		
		int a = 10;
		
		if(true) {
			
			int b = 20; // b변수 생존 시작
			// 못 적었음 ㅠㅠ
		}
		
		
	}

}
