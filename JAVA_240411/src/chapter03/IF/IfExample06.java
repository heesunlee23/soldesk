package chapter03.IF;

public class IfExample06 {

	public static void main(String[] args) {
		
		int num = (int)(Math.random()*6)+1; // ****
		//Math: 수학 계산에 사용할 수 있는 메서드를 제공하는 클래스
		//random(): 0.0~1.0 미만 사이의 난수를 제공
		//*6으로 0.0~6.0미만 사이의 난수를 제공
		//+1로 1~6 사이의 난수를 제공
		
		System.out.println(num);
		
		if(num == 1) {
			
			System.out.println("1점");
			
		}else if(num == 2) {
			
			System.out.println("2점");
			
		}else if(num == 3) {
			
			System.out.println("3점");
			
		}else if(num == 4) {
			
			System.out.println("4점");
			
		}else if(num == 5) {
			
			System.out.println("5점");
			
		}else {
			
			System.out.println("6점");
			
		}
	}

}
