package chapter16;

public class Car {
	
	private String model;
	private int chargeLevel;
	private Engine engine; // 내부에서만 씀 
	
	public Car(String model, int chargeLevel) {
		this.model = model;
		this.chargeLevel = chargeLevel;
		this.engine = new Engine(this);
	}

	public int getChargeLevel() {
		return chargeLevel;
	} // 내부에서만 씀

	public String getModel() {
		return model;
	} // 내부에서만 씀 - 이 경우 중첩 클래스 쓰면 코드 깔끔해 질 수 있다. 
	
	public void start() {
		engine.start();
		System.out.println("준비완료");
	}

	
}
