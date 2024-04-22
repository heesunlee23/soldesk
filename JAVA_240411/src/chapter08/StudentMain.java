package chapter08;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
//		
//		Student student1 = new Student();
//		
//		System.out.println("이름1을 입력하세요: ");
//		String name = scan.nextLine();
//		student1.setStudentName(name);
//		
//		System.out.println("주소1을 입력하세요: ");
//		String address = scan.nextLine();
//		student1.setAddress(address);
//
//		Student student2 = new Student();
//		
//		System.out.println("이름2를 입력하세요: ");
//		name = scan.nextLine();
//		student2.setStudentName(name);
//		
//		System.out.println("주소2를 입력하세요: ");
//		address = scan.nextLine();
//		student2.setAddress(address);
//		
//		student1.showStudentInfo();
//		System.out.println("---------------------");
//		student2.showStudentInfo();
//		
//		scan.close();
		
		// 선생님 값
		Student student1 = new Student();
		student1.setStudentName("김치");
		student1.setAddress("서울시 종로구");
		student1.showStudentInfo();
		
		Student student2 = new Student();
		student2.setStudentName("박수");
		student2.setAddress("경기도 고양시");
		student2.showStudentInfo();
		
		Student student3 = new Student("이유", "서울시");
		student3.showStudentInfo();
	}
}
