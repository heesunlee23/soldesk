// 조금 어려웠다. 
package chapter03.FOR;

public class ForTest12 {

	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) { // 행 만듦
			for(int j = 2; j <= 9; j++) { // 열 마름
				if(i < 2) {
					System.out.print("["+j+"단"+"]"+ "\t");
				} else {
					System.out.print(j + "*" + i + "=" + (i * j) + "\t");
				}
			} 
			System.out.println();
		} 
	}
}
