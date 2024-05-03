package chapter16.Example;

public class Park {

	private Car[] cars;
	private int carCount;

	public Park(int count) {
		cars = new Car[count];
		carCount = 0;
	}

	public void addCar(String model, String owner) {
		cars[carCount] = new Car(model, owner);
		carCount++;

	}// 차량 추가

	public void showCarList() {
		for (int i = 0; i < cars.length; i++) {
			System.out.println("모델 명 : " + cars[i].model + "\t 차주 : " + cars[i].owner);
		}
	}// 주차된 차를 보여주는 메서드

	private class Car {

		private String model;
		private String owner;

		public Car(String model, String owner) {
			this.model = model;
			this.owner = owner;
		}
	}
}
