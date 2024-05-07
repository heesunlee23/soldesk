package chapter17.Example;

public class Professor extends Human{
	
	private String subject;
	
	public Professor(String name, String age, String subject) {
		super(name, age);
		this.subject = subject;
	}

	@Override
	public void act() {
		System.out.println(subject + " 교수 " + name + "가(이) 강의를 합니다.");
		
	}
}
