// 24-04-24
// 봤음
package chapter10;

public class Ch extends Pa {

	@Override // 오버라이딩(재정의) (source -> implements)
	void display() {
		System.out.println("자식 클래스에서 재정의된 메서드");
	}

	public void show() {
		System.out.println("자식 클래스의 메서드");
	}
}
