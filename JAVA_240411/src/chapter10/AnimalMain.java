// 봤음 
package chapter10;

public class AnimalMain {

	public static void main(String[] args) {
		
		Animal ani = new Animal();
		ani.makeSound();
		System.out.println("--------------");
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		cat.makeSound();
		dog.makeSound();
		System.out.println(cat.leg);
		System.out.println(dog .leg);

	}

}
