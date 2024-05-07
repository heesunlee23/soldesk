package chapter17.Example;

public abstract class Human {
		
	String name;
	String age;
	
	public Human(String name, String age) {
		this.name = name;
		this.age = age;
	}
	
	public abstract void act();
	
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + "]";
	}
}
