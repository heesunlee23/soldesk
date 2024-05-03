package chapter16;

public class Anonymous1 {
	private int outInstanceVal = 1;
	
	public void outMethod(int paramVal) {
		int localVal = 2;
		
		Printer printer = new Printer() {
			
			int value = 4;
			
			@Override
			public void print() {
				System.out.println("외부클래스의 멤버변수 :" + outInstanceVal);
				System.out.println("외부클래스의 지역변수 :" + localVal);
				System.out.println("외부클래스의 매개변수 :" + paramVal);
				System.out.println("익명클래스의 멤버변수 :" + value);
			}
		};
		printer.print();
	}
}
// 익명클래스는 선언과 생성을 동시에 구현한 클래스
// 생성자 불가
// 반드시 상위클래스나 인터페이스가 필요
// 장점: 클래스를 별도로 정의하지 않고도 인터페이스나 추상클래스를 바로 구현이 가능해 코드가 간결
// 익명클래스를 왜 써야 하는가? -> 다음 코드로
