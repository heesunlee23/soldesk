package chapter07;

import javax.swing.JOptionPane;

public class SungJuk {

	// 필드 또는 멤버변수
	private String std_num;
	private String std_name;
	private int java, oracle, spring;
	
	// 디폴드 생성자(생략가능): 객체를 생성 시 호출 
	public SungJuk() {
		
	}
	
	// 메서드 
	public void sum() {
		int total = java + oracle + spring;
		System.out.println("총합계: " + total);
	}
	
	public void avg() {
		int avg = (java + oracle + spring) / 3;
		System.out.println(avg);
	}
	
	public static void main(String[] args) {
		SungJuk rec = new SungJuk(); // rec은 참조변수
		rec.std_num = JOptionPane.showInputDialog("학번");
		rec.std_name = JOptionPane.showInputDialog("이른");
		
		rec.java = Integer.parseInt(JOptionPane.showInputDialog("자바점수"));
		rec.oracle = Integer.parseInt(JOptionPane.showInputDialog("오라클 점수"));
		rec.spring = Integer.parseInt(JOptionPane.showInputDialog("스프링 점수"));
		
		System.out.println("학번 : " + rec.std_num + " | " +"이름 : " + rec.std_name + "님의 성적입니다.");
		rec.sum();
		rec.avg();
	}

}
