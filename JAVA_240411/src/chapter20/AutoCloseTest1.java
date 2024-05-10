// 봤음 
package chapter20;

public class AutoCloseTest1 {
	
	public static void main(String[] args) {
		
		AutoCloseObj obj1 = new AutoCloseObj();
		
		try(obj1) {
			throw new Exception(); // 예외발생
		} catch (Exception e) {
			System.out.println("예외 부분입니다.");
		}
	}

}
