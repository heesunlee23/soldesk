package chapter03.IF;

import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class IfExample01 {

	public static void main(String[] args) {
		int dat;
		
		dat = Integer.parseInt(JOptionPane.showInputDialog("값을 입력하세요"));
		// Integer.parseInt: String -> int
		// JOptionPane: 알림창을 제공하는 클래스
		// showInputDialog(): 창에 값을 입력 시 String 형태로 값을 저장 
		
		// 10의 배수를 판단하세요 
		if(dat % 10 == 0) {
			System.out.println(dat + "(은)는 10의 배수입니다.");
		} else {
			System.out.println(dat + "(은)는 10의 배수가 아닙니다");
		}
	}

}
