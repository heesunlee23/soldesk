package chapter11;

public class SupersonicAirplaneMain extends Airplane {
	
	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		
		sa.takeoff();
		
		sa.fly();
		
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		
		sa.fly(); 
		
		sa.land();
	}
}
