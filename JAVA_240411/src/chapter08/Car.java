package chapter08;

public class Car {
	
	private String color;
	private int cc;
	
	public Car() {} // 기본생성자
	
	public Car(String color, int cc) {
		
		this.color = color;
		this.cc = cc;
	} // 오버로딩 생성자

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}
	
	
}
