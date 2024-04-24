// 24-04-24
// 봤음
// 왜 오버라이딩 (ch.display()가 필요한지 예제로 보여주겠음) 24-04-24

package chapter10;

public class Animal {

	int leg = 4;
	
	void makeSound() {
		System.out.println("동물이 소리를 냅니다");
	}
}

class Dog extends Animal { // 별개의 클래스 라고 생각 할 것
	
	@Override
	void makeSound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal { // 별개의 클래스 라고 생각 할 것
	
	@Override
	void makeSound() {
		System.out.println("야옹");
	}
}
