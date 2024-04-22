package chapter08;

public class CarMain {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		System.out.println("제조회사 : " + myCar.company); // 이렇게 직접가져오는 건 지양해야 하기는 함 
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색깔 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("속도 : "+ myCar.speed);
		
		// 물론 값 변경도 가능
		myCar.speed = 60;
		System.out.println("변경된 현재속도 : " + myCar.speed);
	}

}
