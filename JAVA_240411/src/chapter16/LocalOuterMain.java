package chapter16;

public class LocalOuterMain {

	public static void main(String[] args) {
		
		LocalOuter1 lo = new LocalOuter1(); // 원래 LocalOuter2 였는데 고쳤음
		lo.outMethod(3); // 외부클래스 메서드를 수행 시, 그 메서드에 소속된 지역클래스 객체 생성

	}

}
