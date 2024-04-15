package chapter02;

public class Bit_Test02 {

	public static void main(String[] args) {
		
		// shift 연산 - 이해 안되면 skip 해도 됨 
		int num = 0B000000101;
		System.out.println(num);
		
		System.out.println(num << 2); // 왼쪽으로 2칸 + 0으로 채우기 
		System.out.println(num >> 2); // 오른쪽으로 2칸 + 0으로 채우기
	
		int a, b, c;
		a = 5;
		b = 2;
		c = a >> b; // 오른쪽으로 두 칸 오른쪽으로 이동 
		System.out.println(c);
		
		c = a << b;
		System.out.println(c);
	}
}
