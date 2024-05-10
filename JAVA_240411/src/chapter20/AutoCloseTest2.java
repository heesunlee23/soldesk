// 봤음 
package chapter20;

public class AutoCloseTest2 {
	
	public static void main(String[] args) {
		
		try(AutoCloseObj obj1 = new AutoCloseObj()) { // 객체 생성을 여기서 해도 됨 
			throw new Exception(); // 예외발생
		} catch (Exception e) {
			System.out.println("예외 부분입니다.");
		}
	}

}
