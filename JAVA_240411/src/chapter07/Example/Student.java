package chapter07.Example;

public class Student {
	
	private String studentName; // 선생님이 언급 안했는데 내가 private으로 바꿈 
	private int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}

	public void showInfo() {
		System.out.println(studentName + "님의 잔액은: " + money + "원 입니다.");
	}

	public void takeBus(Bus bus) {
		// 요금 낸만큼 money 감소 
		this.money -= 1000; // this 추가 
		bus.take(1000); // private 설정 후 이렇게 
		// bus.passengerCount++; // private으로 설정 안해서 접근 가능
		// bus.money += 1000;
	}

	public void takeSubway(Subway subway) {
		// 요금 낸만큼 money 감소 
		this.money -= 1500;
		subway.take(1000); // private 설정 후 이렇게 
		
		// subway.passengerCount++;
		// subway.money += 1500;
	}
	
	// 디폴트 생성자 생략
}
