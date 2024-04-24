// 24-04-24

package chapter08;

class Person2{
	
	String name;
	int age;
	
	public Person2() {
		this("김씨", 55); // 이렇게 안씀. 이렇게 쓸 수 있다 보여주기용 
	} // 생성자
	
	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	} // 오버로딩 생성자
} // 중첩클래스

public class CallAnotherConst {
	public static void main(String[] args) {
		
		Person2 p1 = new Person2();
		System.out.println("p1의 주소 : " + p1); 
		// p1는 참조변수고 스택에 있음. p1은 힙공간에 저장된 변수의 주소를 담고 있다. 
		System.out.println("p1의 name : " + p1.name);
		p1.name = "이씨";
		System.out.println("p1의 변경된 name : " + p1.name);
		
		Person2 p2 = new Person2();
		System.out.println("p2의 주소 : " + p2);
		System.out.println("p2의 name : " + p2.name);
		
		Person2 p3 = p1;
		System.out.println("p3의 주소: " + p3); // p1과 같은 공간 공유 
		System.out.println("p3의 name : " + p3.name);
		
	} // main
}// class
