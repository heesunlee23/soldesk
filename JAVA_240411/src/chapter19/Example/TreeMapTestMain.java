package chapter19.Example;

public class TreeMapTestMain {
	
	public static void main(String[] args) {
		TreeMapTest tree = new TreeMapTest();
		
		Student s1 = new Student(1000, "김자바");
		Student s2 = new Student(1001, "이파이썬");
		Student s3 = new Student(1002, "이희선");
		Student s4 = new Student(1003, "정스프링");
		Student s5 = new Student(1004, "여의동");
		
		tree.addStudent(s5, 65);
		tree.addStudent(s3, 75);
		tree.addStudent(s2, 85);
		tree.addStudent(s1, 95);
		tree.addStudent(s4, 85);
		
		// 객체 넣는 순서가 뒤죽박죽이었음
		// id를 기준으로 정렬 해서 출력 했음 
		tree.showInfo();
		
		System.out.println("----------------------------");
		
		tree.removeStudent(1003);
		tree.removeStudent(1050);
		tree.showInfo();
		
	}

}
