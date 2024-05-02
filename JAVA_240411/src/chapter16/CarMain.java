package chapter16;

public class CarMain {

	public static void main(String[] args) {
		
		Car myCar = new Car("제네시스", 100);
		myCar.start();
		System.out.println("========================");
		CarInner myCar2 = new CarInner("쏘나타", 98);
		myCar2.start();
		
	}

}
// 구조를 볼 줄은 알아야 한다. 