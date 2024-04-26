package chapter10.Example1;

public class Subway extends PublicTransport {
	
	public Subway() {
		super(1500); // 버스는 2000원으로 등록
	}

	@Override
	public void take() {
		super.take();
		System.out.println("지하철을 이용합니다");
	}

	@Override
	public void disp() {
		System.out.println("지하철의 ");
		super.disp();
	}
	
}
