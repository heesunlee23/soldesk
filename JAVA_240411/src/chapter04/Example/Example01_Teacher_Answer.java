package chapter04.Example;

public class Example01_Teacher_Answer {

	public static void main(String[] args) {
		
		// for문을 이용하여 다음 배열의 정수를 행 단위로 합계를 구하시오
		
		int[][] array = {{95, 86}, {83, 92, 96}, {78, 83, 93, 87, 88}};
		int sum = 0;
		double avg = 0.0;
		
		 for(int i = 0; i<array.length; i++) {
			 for(int j = 0; j<array[i].length; j++) { 
				 sum += array[i][j];
				 avg = sum/(double)array[i].length;
			 } // 내부 for문
			 
			 System.out.println("각 행의 합 : " + sum);
			 System.out.println("각 행의 합 : " + avg);
			 System.out.println("===================");
			 sum = 0;
			 avg = 0.0;
		 }

	}

}
