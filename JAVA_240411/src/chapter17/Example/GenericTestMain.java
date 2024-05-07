package chapter17.Example;

public class GenericTestMain {

	public static void main(String[] args) {
		
		GenericTest<Human> student = new GenericTest<Human>();
		student.setHuman(new Student("김씨", "20", "1학년"));
		student.act();
		System.out.println(student.getHuman());
		
		System.out.println("-------------------------");
		
		GenericTest<Human> professor = new GenericTest<Human>();
		professor.setHuman(new Professor("이씨", "45", "컴퓨터공학과"));
		professor.act();
		System.out.println(professor.getHuman());
	}
}
