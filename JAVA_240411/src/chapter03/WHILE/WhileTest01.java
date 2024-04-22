package chapter03.WHILE;

public class WhileTest01 {

	public static void main(String[] args) {
		
		while(true) {
			int num = (int)(Math.random()*6) + 1; // **
			// https://kadosholy.tistory.com/84
			// Math.random(): 0.0<=x<1.0
			// Math.random()*6: 0.0<=x<6.xxxx
			// (int)(Math.random()*6): 0<=x<6
			// (int)(Math.random()*6) + 1: 1<=x<=6
			
			System.out.println("주사위의 눈: " + num);
			
			if(num==6) {
				break;
			}
		} // while
	}

}
