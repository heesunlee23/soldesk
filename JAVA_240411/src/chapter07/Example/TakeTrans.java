package chapter07.Example;

public class TakeTrans {

	public static void main(String[] args) {
		
		// 학생 2명 생성
		Student studentJames = new Student("James", 12000);
		Student studentTom = new Student("Tom", 10000);
		
		// Bus 2대 생성
		Bus bus100 = new Bus(100);
		Bus bus987 = new Bus(987);
		
		// 지하철 2대 생성
		Subway subwayGreen = new Subway("2호선");
		Subway subwayOrange = new Subway("3호선");
		
		// 제임스 학생의 잔액
		studentJames.showInfo(); // 제임스 학생의 잔액
		studentJames.takeBus(bus100); // 버스 100번의 승객 수 증가, 수익 증가(1000원)
		studentJames.takeBus(bus100); // 버스 100번의 승객 수 증가, 수익 증가(1000원)
		studentJames.showInfo(); // 제임스 학생의 잔액
		bus100.showInfo(); // 버스 100번의 승객 수, 수익 확인
		System.out.println("-------------------------------");
		
		studentTom.showInfo(); // 톰 학생의 잔액
		studentTom.takeBus(bus987); // 버스 987의 승객 수 증가, 수익 증가(1000원)
		studentTom.takeSubway(subwayGreen); // 지하철 2호선의 승객 수 증가, 수익 증가 (1500원)
		studentTom.showInfo(); // 톰 학생의 잔액
		bus987.showInfo();
		subwayGreen.showInfo();
	}
}
