// 24-04-24
package chapter09;

public class CompanyMain {

	public static void main(String[] args) {
		
		Company com1 = new Company();
		Company com2 = new Company();
		
		// 일반적인 객체 생성(heap)
		System.out.println(com1);
		System.out.println(com2);
		
		System.out.println("----------------------");
		
		Company myCom1 = Company.getInstance();
		Company myCom2 = Company.getInstance();
		
		System.out.println(myCom1); // 같은 객체임 
		System.out.println(myCom2); // 같은 객체임 
		
		// 싱글톤: 어떤 클래스의 객체가 하나만 존재하도록 보장
		// (객체지향에서 약간 벗어난 거임)
		// 왜 씀? 객체를 공유해야 하는 상황이 생김
	}
}
