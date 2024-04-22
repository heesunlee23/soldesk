package chapter06;

public class FunTestOverloading {

	// 오버로딩 : 메소드 명을 통일성 있게 사용해야 하는 경우, 
	// 메서드의 매개변수 종료나 개수를 다르게 하여 구현 
	
	public void getResult(int n) {
		System.out.println(n + "은(는) int입니다");
	}
	
	public void getResult(char n) {
		System.out.println(n + "은(는) char입니다");
	}
	
	public void getResult(String n) {
		System.out.println(n + "은(는) String 입니다");
	}
	
	public void getResult(int n1, String n2) {
		System.out.println(n1 + "은(는) int 이고, " + n2 + "은(는) String 입니다. ");
	}
	
//	public static void main(String[] args) {
//		
//		int a = 5;
//		char b = 'A';
//		String c = "가나다";
//		
//		FunTestOverloading obj = new FunTestOverloading();
//		
//		obj.getResult(a);
//		obj.getResult(c);
//		obj.getResult(a, c);
//		
//		
//	}

}
