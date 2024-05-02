// 24-04-24
// 봤음
// 왜 오버라이딩 (ch.display()가 필요한지 예제로 보여주겠음) 24-04-24

package chapter11;

public class Animal {

	int leg = 4;
	
	void makeSound() {
		System.out.println("동물이 소리를 냅니다");
	}

	public int getEye() {
		return 2;
	}

	public int getLeg() {
		return 4;
	}
}
