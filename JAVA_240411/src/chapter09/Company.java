// 24-04-24
package chapter09;

public class Company {
	
	// 객체를 단 하나만 생성하는 클래스
	private static Company instance = new Company();
	
	public Company() {}
	
	// 싱글톤 객체 생성 메서드
	public static Company getInstance() {
		
		if(instance == null) {
			instance = new Company();
		} // 예외처리
		return instance;
	}
	
	public static void setInstance(Company instance) {
	}
	
}
