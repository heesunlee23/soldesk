package chapter02;

public class Incre_Test01 {

	public static void main(String[] args) {
		
		int a, b, c;
		
		a = 10;
		b = 20;
		c = 3; 
		
		System.out.println("++a: " + (++a)); // 11
		// a = a + 1 => a += 1
		System.out.println("a++: " + (a++)); // 11
		// a = a + 1 => a += 1
		System.out.println("a: " + a); // 12
		
		System.out.println("=============");
		// a = 12, b = 20
		
		System.out.println("++a + b++ : "+(++a + b++)); // a = 12 => 13,  b = 20
		
		System.out.println("b : "+ b);
		
		System.out.println("=============");
		
		System.out.println("++a: "+ (++a)); // 14
		System.out.println("b++: "+ (b++)); // 21
		System.out.println("b : "+ b); // 22
		System.out.println("++a + b++ : "+(++a + b++));
		
		
	}

}