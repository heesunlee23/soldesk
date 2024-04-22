package chapter04;

import javax.swing.JOptionPane;

public class ArrayTest07 {

	public static void main(String[] args) {
		
		int[][] javaScore = new int[2][3];
		
		// 숫자 6개 입력 받기 
		for(int i = 0; i < javaScore.length; i++) {
			for(int j = 0; j < javaScore[i].length; j++) {
				int jumsu = Integer.parseInt(JOptionPane.showInputDialog("점수"));
				javaScore[i][j] = jumsu;
				System.out.println("JavaScore[" + i + "][" + j + "]: 3" + javaScore[i][j]);
			} // 내부 for문
		} // 외부 for문 
		
		System.out.println();

	} 

}
