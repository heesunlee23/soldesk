package chapter11;

public class DriverMain {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		driver.driver(new Vehicle()); // 생성자보냈음
		///////////////////////////
		
		driver.driver(new Bus()); // 업캐스팅. 주소 값 할당해 주는 거 
		
		Taxi taxi = new Taxi();
		driver.driver(taxi);

		

	}

}
