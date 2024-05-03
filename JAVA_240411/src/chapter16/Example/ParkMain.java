package chapter16.Example;

public class ParkMain {

	public static void main(String[] args) {
		Park park = new Park(8);
		
		park.addCar("모닝", "김씨");
		park.addCar("쏘나타", "오씨");
		park.addCar("투싼", "박씨");
		park.addCar("K7", "정씨");
		park.addCar("마티즈", "최씨");
		
		park.showCarList(); // 하면 

	}

}
// car를 내부 클래스로 했으나 지역이나 정적으로 해도됨 
