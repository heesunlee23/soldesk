package chapter11;

public class Computer extends Calculator {

	@Override
	double areaCircle(double r) {
		System.out.println("컴퓨터 메서드 areaCircle() 실행");
		return r;
	}
}
