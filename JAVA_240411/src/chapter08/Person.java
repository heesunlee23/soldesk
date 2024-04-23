package chapter08;

public class Person {

	String name;
	float height;
	float weight;
	
	// 생성자
	public Person() {} // 기본 생성자
	
	public Person(String name) {
		this.name = name;
	} // 오버로딩 생성자
	
	public Person(String name, float height, float weight) {
		
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

}
