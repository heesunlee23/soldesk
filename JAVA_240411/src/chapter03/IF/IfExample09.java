package chapter03.IF;

import javax.swing.JOptionPane;

public class IfExample09 {

	public static void main(String[] args) {
		
		String ID = "soldesk";
		int PW = 221227;
		
		String id = JOptionPane.showInputDialog("아이디"); // ****
		int pass = Integer.parseInt(JOptionPane.showInputDialog("비밀번호")); // ****
		
		//  ID == id --> 이렇게 비교 불가 
		if(ID.equals(id)) { // *******String 은 이렇게 비교해야 함 
			if(PW == pass) {
				System.out.println(ID+"님 환영합니다");
			}else {
				System.out.println("비밀번호가 일치하지 않습니다."); // 아이디 일치 but 비밀번호 일치 안함 
			}
		} else {
			System.out.println("아이디가 일치하지 않습니다.");
		}
		

	}

}

