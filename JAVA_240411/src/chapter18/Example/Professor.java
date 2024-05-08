package chapter18.Example;

public class Professor extends Person {
	
	private String subject;
	
	@Override
	public void showInfo() {
		System.out.println("이름: " + getName());
		System.out.println("학년: " + subject);
		System.out.println("나이: " + getAge());
		System.out.println("번호: " + getTel());
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
}
