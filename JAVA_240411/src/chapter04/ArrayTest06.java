// 다시 안봐도 됨
package chapter04;

public class ArrayTest06 {

	public static void main(String[] args) {
		
		int scores[] = {98, 90, 87};
		
		int sum = getTotalScore(scores);
		System.out.println("총점은: " + sum);
		
		int average = getAverageScore(sum, scores.length);
		System.out.println("평균은: " + average);

	}

	// 평균
	private static int getAverageScore(int sum, int length) {
		return sum / length;
	}

	// 총점
	private static int getTotalScore(int[] scores) {
		
		int sum = 0;
		
		for(int score : scores) {
			sum += score;
		}
		
		return sum;
	}

}
