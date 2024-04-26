package chapter10.Example1;

public class PublicTransport {
	
	int fare; // 요금
	int count; // 승객 수 
	int money; // 수익
	
	public PublicTransport(int fare) {
		this.fare = fare;
	}
	
	public void take() { // 요금 징수 같은 것
		count++;
		money += fare;
	}
	
	public void disp() {
		System.out.println("이용고객 수 : " + count + " | 수익 : " + money);
	}
}
