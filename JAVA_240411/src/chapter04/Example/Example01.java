package chapter04.Example;

public class Example01 {

	public static void main(String[] args) {
		
		// for문을 이용하여 다음 배열의 정수를 행 단위로 합계를 구하시오
		
		int[][] array = {{95, 86}, {83, 92, 96}, {78, 83, 93, 87, 88}};
		
		/*
		System.out.println(array[0].length);
		System.out.println(array[1].length);
		System.out.println(array[2].length);
		*/
		
		int sum = 0;
		int row_index = 1; 
		
		for(int[] row : array) {
			for(int element : row) {
				sum += element;
			}
			System.out.println(row_index + "행 학생의 합계: "+ sum);
			System.out.println(row_index + "행 학생의 평균: " + (double)sum / row.length);
			row_index++;
			sum = 0; 
		}
		
		// 1행 학생의 합계: 
	}

}
