package chapter04.Example;

public class Example02 {

	public static void main(String[] args) {
		
		// array 배열의 값 중 가장 큰 값을 출력하시오. 
		// 힌트 반복문
		int max = 0;
		int array[] = {1, 6, 9, 2, 35, 167, 234, 4, 5, 11};
		
		for (int i = 0; i < array.length; i++) {
			if (max <= array[i]) {  // **** max < array[i] 도 무방 (선생님 답안) 
				max = array[i];
				// System.out.println(max);
			}
		}
		System.out.println("가장 큰수: " + max);

	}

}
