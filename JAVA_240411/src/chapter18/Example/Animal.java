package chapter18.Example;

public class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}
class Human extends Animal{
	@Override
	public void move() {
		System.out.println("사람은 두 발로 걷습니다.");
	}
	public void readBook() {
		System.out.println("사람은 책을 읽습니다.");
	}
}
class Tiger extends Animal{
	@Override
	public void move() {
		System.out.println("호랑이는 네 발로 걷습니다.");
	}
	public void hunting() {
		System.out.println("호랑이는 사냥을 합니다.");
	}
}
class Eagle extends Animal{
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다");
	}
	public void flying() {
		System.out.println("독수리는 날개를 펴고 날아 다닙니다.");
	}
}
