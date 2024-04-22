package individual_practice;

interface Predator {
	String getFood();
}

class Animal {
	String name;
	
	public void setName(String name) {
		this.name = name;
	}
}

class Tiger extends Animal implements Predator {

	@Override
	public String getFood() {
		return "apple";
	}
	
}

class Lion extends Animal implements Predator {

	@Override
	public String getFood() {
		return "banana";
	}
	
}

//class Crocodile extends Animal implements Predator {
//	
//}

class ZooKeeper {
	void feed(Predator predator) {
		System.out.println("feed " + predator.getFood());
	} 
}

public class Sample {
	public static void main(String[] args) {
		ZooKeeper zooKeeper = new ZooKeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		zooKeeper.feed(tiger); // feed apple 출력 
		zooKeeper.feed(lion); // feed apple 출력
	}
}
