package chapter10.Example1;

public class Customer {
	String name;
	int money;

	public void ride(PublicTransport pt) {
		
		if(money >= pt.fare) {
			pt.take();
			money -= pt.fare;
			System.out.println(name + "님의 남은 소지금은 " + money + "원 입니다");
		} // if
		else {
			System.out.println(name + "님의 소지금이 부족합니다");
		}
	}  // ride 메서드 
	
	public void disp() {
		System.out.println(name + "님의 남은 소지금은 " + money + "원 입니다. ");
	}
}
