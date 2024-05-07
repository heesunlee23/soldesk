package chapter17.Example;

public class Student extends Human {
	
	private String grade;
	
	public Student(String name, String age, String grade) {
		super(name, age);
		this.grade = grade;
	}
	
	@Override
	public void act() {
		System.out.println(grade + " 학생 " + name + "가(이) 강의를 합니다.");
	}

}
