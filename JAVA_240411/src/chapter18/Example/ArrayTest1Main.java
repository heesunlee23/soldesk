package chapter18.Example;

// 삭제 해도 될 듯

public class ArrayTest1Main {

	public static void main(String[] args) {
		
		ArrayListTest1 aTest = new ArrayListTest1();
		System.out.println("----업캐스팅----");
		aTest.addAnimal();
		System.out.println("----다운캐스팅----");
		aTest.testCasting();

	}

}