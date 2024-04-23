package chapter07;

public class StudentInfoMain {

	public static void main(String[] args) {
		
		StudentInfo studentKim = new StudentInfo();
		
		studentKim.setStudentId(1000);
		studentKim.setStudentName("홍길동");
		studentKim.setAddress("서울시 종로구");
		studentKim.setGrade(3);
		
		System.out.println(studentKim.getStudentId() + " | " + studentKim.getStudentName());
		
		System.out.println("----------------------------");
		
		StudentInfo studentLee = new StudentInfo();
		
		studentKim.setStudentId(1001);
		studentKim.setStudentName("이순신");
		studentKim.setAddress("서울시 성북구");
		studentKim.setGrade(2);
		
		System.out.println(studentLee.getStudentId() + " | " + studentLee.getStudentName());
		studentKim.disp();
	}

}
