// 봤음 
package chapter20;

public class ArrayExceptionTest {
	
	public static void main(String[] args) {
		
		// 예외처리: 오류처리에 가까움 
		// 개발보다 더 힘든게 오류 잡는거 
		// 예상가능한 오류와 예상 불가능한 오류가 있음 
		// 처리할 수 없는 오류는 어떻게 해야 하는 가 알려줄 거임
		
		// before 
		int[] arr = new int[5]; // 칸은 다섯 개 인데 
		
		for(int i = 0; i <= 5; i++) { // 6번 돌리고 있음
			arr[i] = i;
			System.out.println(arr[i] + " ");
		}
		
		// ArrayIndexOutOfBoundsException: 정해진 배열의 크기보다 크거나 '음수 index'에 대한 요청
		// 배열의 크기는 5개인데 6번 돌림
		
		try { // 예외가 발생할 수 있는 코드 
			for(int i = 0; i <= 5; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) { 
			// 예외 발생 시 실행하는 코드, 매개변수로 예외에 대한 정보를 담고 있는 객체를 전달
			System.out.println(e.getMessage());
			System.out.println("배열의 크기를 초과했습니다.");
		} finally { // 예외가 발생하든 하지 않든 무조건 실행하는 코드. 
			// 자원관리 할 때 많이 씀. 외부 데이터 끌 고 올 때 buffer를 쓰는데
			// buffer열어두면 자원많이 낭비됨. finally 써서 무조건 닫게 하면 됨 
			System.out.println("Finally");
		}
		
	}

}
