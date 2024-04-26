package chapter11;

public class Human {
	
	public void action() {
		System.out.println("사람이 행동합니다");
	}
}

class Student extends Human{
	
	@Override
	public void action() {
		System.out.println("학생이 공부합니다");
	}
}

class Professor extends Human {
	
	@Override
	public void action() {
		System.out.println("교수가 강의합니다");
	}
}

class Salesman extends Human {
	@Override
	public void action() {
		System.out.println("직원이 일합니다");
	}
}