package chapter08;

public class Overload {

	private String name;
	private int age;
	private float height;
	
	// 멤버변수와 매개변수 이름이 같으면 this로 구분 (아니면 상관없음)
	public Overload() {
		age = 0;
		height = 0;
		name = "익명";
	}
	
	public Overload(int age, float height) {
		this.age = age;
		this.height = height;
		name = "익명"; 
	}

	public Overload(int age, float height, String name) {
		this.age = age;
		this.height = height;
		this.name = name;
	}

	public void disp() {
		System.out.println("이름 : " + name + "\n나이 : " + age + "\n키 : " + height);
	}
}
