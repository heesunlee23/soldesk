package chapter08;

public class PersonMain {

	public static void main(String[] args) {
		
		Person personKim = new Person();
		System.out.println(personKim.name);
		System.out.println(personKim.height);
		System.out.println(personKim.weight);
		
		System.out.println("======================");
		
		Person personlee = new Person("이순신");
		System.out.println(personlee.name);
		System.out.println(personlee.height);
		System.out.println(personlee.weight);
		
		Person personHong = new Person("홍길동", 170, 70);
		System.out.println(personHong.name);
		System.out.println(personHong.height);
		System.out.println(personHong.weight);
	}

}
