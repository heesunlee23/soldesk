package chapter11;

public class SupersonicAirplane extends Airplane {

	public final static int NORMAL = 1; // 상수 : 변하지 않는 값. 값 변경 불가
	public final static int SUPERSONIC = 2;
	public int flyMode = NORMAL;
	
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행입니다.");
		} else {
			super.fly();
		}
		
		// NORMAL = 3; 안됨 (final 이어서)
	}
}

