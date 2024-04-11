package chapter02;

public class ArithTest {

	public static void main(String[] args) {
		
		// 총점과 평균을 출력 
		int mathScore = 96;
		int engScore = 87; 
		
		// 총점 
		System.out.println("총점: " + (mathScore + engScore));
		
		// 평균 
		System.out.println("평균: " + (mathScore + engScore) / 2);
		
		System.out.println("===============================================");
		
		int total = mathScore + engScore; 
		double average = total / 2; // ****정수 / 정수 -> double 로 형변환 91.0
		double average1 = total / 2.0; // ****이것도 무방. 값 손실 전혀 없음  91.5
		System.out.println("총점: " + total);
		System.out.println("평균: " + average1);
		
		System.out.println(total / 2.0);

	}

}
