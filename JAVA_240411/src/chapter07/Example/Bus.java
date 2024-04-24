package chapter07.Example;

public class Bus {
	
	// 멤버변수
	private int busNumber;
	private int passengerCount;
	private int money;

	public Bus(int busNumber) { 
		this.busNumber = busNumber;
	}

	public void showInfo() {
		System.out.println("버스 " + busNumber + "번의 승객은 " + passengerCount + "명이고,"
				+ " 수입은 " + money + "원 입니다");
		
	}
	
	public void take(int money) { // getter setter로 가져올 수는 있는 데 이렇게 할 것
		this.money += money;
		passengerCount++;
	}
	
	// 디폴트 생성자 생략 

}
