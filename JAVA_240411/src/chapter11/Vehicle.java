package chapter11;

public class Vehicle {
	
	// static 인데 private? -> private 이니까 메서드로 가져와야 함 
	private static final int price = 1000;
	
	public int vehiclePrice() {
		
		return this.price;
	}
	public void run() {
		System.out.println("차량이 달립니다.");
	}
	
	
}
