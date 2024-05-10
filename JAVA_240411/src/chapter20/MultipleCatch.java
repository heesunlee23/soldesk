// 봤음
package chapter20;

public class MultipleCatch {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		try {
			int result = arr[1]/arr[0]; // 1/0
			for(int i=0; i<=5; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
			
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("배열의 크기를 초과했습니다.");
		}
		
//		try {
//			int result = arr[1]/arr[0];
//			for(int i=0; i<=5; i++) {
//				arr[i] = i;
//				System.out.println(arr[i]);
//			}
//			
//		} catch (ArithmeticException | IndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());
//		} 
		
	}
}

//이렇게 세분화 해서 쓰는 거나 Exception으로 쓰는 게 흔함. |로 연결하는 건 드뭄 

//F11 하면 DEBUG
//CTRL + F11
