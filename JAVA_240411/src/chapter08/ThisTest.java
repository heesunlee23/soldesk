package chapter08;

public class ThisTest {
	
	private int speed;
	private int age;
	private String robotName;
	private String robotNum;
	
//	public ThisTest() {
//		speed = 55;
//		age = 25;
//		robotName = "휴머노이드";
//		robotNum = "1";
//	}
	
	public ThisTest(int speed, int age, String name, String num) {
		
		this.speed = speed;
		this.age = age;
		this.robotName = name;
		this.robotNum = num;
	}

	public int getSpeed() {
		return speed;
	}

	public int getAge() {
		return age;
	}

	public String getRobotName() {
		return robotName;
	}

	public String getRobotNum() {
		return robotNum;
	}

	public void move() {
		speed += 20;
		System.out.println("RobotSpeed : " + speed);
	}

	public void rName() {
		System.out.println("RobotName: " + robotName);
		System.out.println(robotName);
		
	}

	public void rAge() {
		System.out.println("RobotAge: " + age);
		System.out.println(age);
	}
	
	public void stop() {
		speed = 0;
		System.out.println("RobotSpeed : " + speed);
	}
}
