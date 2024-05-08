package chapter18.Example;

public class Student extends Person{
	private String grade;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showInfo() {
		System.out.println("이름: " + getName());
		System.out.println("학년: " + grade);
		System.out.println("나이: " + getAge());
		System.out.println("번호: " + getTel());
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}	
	
	
}
