package chapter17.Example;

public class GenericTest<T extends Human> {
	
	private T human;
	
	// Student 클래스 에서 act()를 override했음
	// 아래 setHuman 할때 자식(Student 넣었음)
	// setHuman에서는 upcasting 된 거임 
	public void act() {
		human.act();
	}

	public Human getHuman() {
		return human;
	}

	public void setHuman(T human) {
		this.human = human;
	}
}
