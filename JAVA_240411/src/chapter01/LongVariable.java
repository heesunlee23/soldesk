package chapter01;

public class LongVariable {

	public static void main(String[] args) {
		
		// int num1 = 12345678900; // 표현 불가 
		long num2 = 12345678900L;
		// L이 없을 때: long으로 선언해도 int type으로 인식해버림
		// 왜? long을 쓸일이 없어서
		// L 붙여라
		
		long num3 = 1000; // L 안 붙이면 그냥 int로 처리해 버림 
		// 1000은 int 로 충분히 표현 가능한 숫자임
		// L을 선언하지 않았기 떄문에 int로 인식
		
		int level;
		
		level = 1000; // 나중에 초기화 하는 게 많다. 초기화 안하면 메모리에 찌꺼지 남을 수 있어서 자바는 아예 초기화 강제함
		
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num2 + num3); // 더 큰 long으로 형변환 됨
		// 묵시적 형변환(long)
		
		System.out.println(level); // 초기화 반드시 해야 함 
		
		
	}

}
