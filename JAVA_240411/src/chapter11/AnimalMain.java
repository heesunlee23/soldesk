package chapter11;

public class AnimalMain {

	public static void main(String[] args) {
		
		System.out.println("----곰----");
		Bear b = new Bear();
		System.out.println("눈: " + b.getEye()); // 부모꺼 
		System.out.println("다리: " + b.getLeg()); // 부모꺼 
		System.out.println("특징: " + b.woong);
		
		System.out.println("----사자----");
		Lion l = new Lion();
		System.out.println("눈: " + l.getEye()); // 부모꺼 
		System.out.println("다리: " + l.getLeg()); // 부모꺼 
		System.out.println("특징: " + l.galgi);
		
		System.out.println("----거미----");
		Spider s = new Spider();
		System.out.println("눈: " + s.getEye()); // 부모꺼 재정의
		System.out.println("다리: " + s.getLeg()); // 부모꺼 재정의
		System.out.println("특징: " + s.web);
	}

}
