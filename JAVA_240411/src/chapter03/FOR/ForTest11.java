package chapter03.FOR;

public class ForTest11 {

	public static void main(String[] args) {
		
		int i, j;
		
		for(i = 0; i < 5; i++) {
			
			for(j = 0; j < 5; j++) {
				System.out.print(j+" ");
			} // 내부 for 문
			
			System.out.println();
			
		} // 외부 for문 

	}

}
