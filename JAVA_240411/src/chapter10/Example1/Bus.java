package chapter10.Example1;

public class Bus extends PublicTransport{

	public Bus() {
		super(2000); // 버스는 2000원으로 등록
	}

	@Override
	public void take() {
		super.take();
		System.out.println("버스를 이용합니다");
	}

	@Override
	public void disp() {
		System.out.println("버스의 ");
		super.disp();
	}
	
	

}
