package chapter08;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class KoreanMain {

	public static void main(String[] args) {
		
		Korean k1 = new Korean("박자바", "010-111-2222");
		System.out.println("국가: " + k1.nation);
		System.out.println("이름: " + k1.name);
		System.out.println("전화번호: " + k1.ssn);
		
		System.out.println("--------------------------------");
		
		Korean k2 = new Korean("박자바", "011-333-4444");
		System.out.println("국가: " + k2.nation);
		System.out.println("이름: " + k2.name);
		System.out.println("전화번호: " + k2.ssn);

	}

}
