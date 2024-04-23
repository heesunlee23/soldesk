package chapter07.Example;

public class Subway {
	
	private String lineNumber;
	private int passengerCount;
	private int money;

	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}

	public void showInfo() {
		System.out.println("지하철 " + lineNumber + "번의 승객은 " + passengerCount + "명이고,"
				+ " 수입은 " + money + "원 입니다");
		
	}

	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	// 디폴트 생성자 생략
}
