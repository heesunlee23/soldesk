package chapter04;

public class ArrayTest06_Teacher_Answer {
	public static void main(String[] args) {
		
		int score[] = {98, 90, 87};
		int sum = 0; 
		
		for(int i = 0; i < score.length; i++) {
			System.out.println("score[" + i + "]" + score[i]);
			sum += score[i];
		} // for 문
		
		System.out.println("총점 : " + sum);
		double avg = sum / (double)(score.length); // ****
		System.out.println("평균: " + avg);
		
		System.out.println("평균(반올림): " + Math.round(avg)); // ****
		
	}
}
