package chapter01;

public class DoubleEx02 {

	public static void main(String[] args) {
		int aVal = 10;
		float bVal = 10.5f;
		
		System.out.println("aVal + bVal:" + (aVal + bVal));
		// int가 float 으로 형변환 됨 (정수랑 실수가 같이 있을 때는 실수로 변환)
		// 정수(int)와 실수(float) 연산 시 더 정밀한 수로 자동 형변환 (묵시적 형변환)
	}

}
