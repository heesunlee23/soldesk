// 24-04-24

package chapter08;

public class StudentMain {

	public static void main(String[] args) {
	
		Student studentLee = new Student("임승연");
		studentLee.disp();
		
		Student studentKim = new Student("김하경");
		studentKim.disp();
		
		Student studentYim = new Student("이예찬");
		studentYim.disp();
	}
	// static은 어디서 값 바꾸든지 상관 없다. 

}
