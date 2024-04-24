// 24-04-24

package chapter08;

public class Student {
	
	public static int serialNum = 9999;
	
	int studentID;
	String name;
	
	public Student(String name) {
		serialNum++;
		this.studentID = serialNum;
		this.name = name;
	}
	
	public void disp() {
		System.out.println("이름 : " + name + " | 아이디 : " + studentID);
	}
}
