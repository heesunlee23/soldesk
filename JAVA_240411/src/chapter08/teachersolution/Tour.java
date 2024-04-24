// 24-04-24

package chapter08.teachersolution;

import java.util.Scanner;

public class Tour {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("관광객 수 :");
		int n = Integer.parseInt(scan.nextLine());
		
		Guide guide = new Guide(n);
		
		guide.register();
		guide.disp();
		
	}
}
