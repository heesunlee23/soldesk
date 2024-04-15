package chapter02;

public class Incre_Test02 {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("-------------");
		x++; // x=11
		++x; // x=12
		System.out.println("x = " + x);
		
		System.out.println("-------------");
		y--; // 9
		--y; // 8
		System.out.println("y = " + y);
		
		System.out.println("------------");
		z = x++; // **** x 를 z에 대입하고 하나 늘어남
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		System.out.println("------------");
		
		z = ++x;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		System.out.println("------------");
		z = ++x + y++;
		
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		// z = 23, x = 15, y = 9
	}

}
