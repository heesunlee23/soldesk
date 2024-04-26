// 24-04-24
// 봤음
package chapter10;

public class FruitMain {

	public static void main(String[] args) { 
		// private 으로 선언되어 있으면 상속받아도 수정 못함 -> 메서드나 생성자 이용해야 함
		
		StrawBerry obj = new StrawBerry();
		obj.set2("빨강", 7000);
		obj.disp();
	}
}
