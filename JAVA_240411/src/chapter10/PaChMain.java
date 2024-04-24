// 봤음
package chapter10;

public class PaChMain {

	public static void main(String[] args) {
		
		Pa pa = new Pa(); // 부모클래스의 객체
		pa.display(); //  부모 클래스의 메서드
		// pa.show(); // ***부모클래스는 자식이 가진 메서드 사용불가
		
		System.out.println("--------------");
		
		Ch ch = new Ch(); // 자식 클래스 객체 
		ch.display(); // 부모클래스의 메서드
		ch.show(); // 자식클래스의 메서드 
		
		// 왜 오버라이딩 (ch.display()가 필요한지 예제로 보여주겠음)
	}
}
