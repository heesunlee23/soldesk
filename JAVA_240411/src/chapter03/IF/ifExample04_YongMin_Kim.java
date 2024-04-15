package chapter03.IF;

import javax.swing.JOptionPane;

public class ifExample04_YongMin_Kim {

	public static void main(String[] args) {
		//미취학 아동(7세 미만)의 전시관의 입장료는 1000원
		//초등학생(8~13세)의 전시관의 입장료는 2000원
		//중고등학생(14~19)의 전시관의 입장료는 3500원
		//성인의 전시관의 입장료는 5000원
		
		//t 만큼의 인원의 정보를 수집
		int t;
		t = Integer.parseInt(JOptionPane.showInputDialog("입장하는 인원: "));
		for(int i=0; i<t; i++) {
			int age;
			String ageCat, cost;
			age = Integer.parseInt(JOptionPane.showInputDialog("입장하는 인원의 나이: "));
			ageCat = det(age)[0];
			cost = det(age)[1];
			System.out.println(ageCat + " 입니다." + "\n" + cost + " 입니다.");
		}
	}
	
	// Determine 메소드
	private static String[] det(int age) {
		String[] saved = new String[2];
		if(age < 7) {
			saved[0] = "미취학 아동";
			saved[1] = "1000";
			return saved;
		}else if(age > 7 && age <= 13) {
			saved[0] = "초등학생";
			saved[1] = "2000";
			return saved;
		}else if(age > 13 && age <= 19) {
			saved[0] = "중고등학생";
			saved[1] = "3500";
			return saved;
		}else {
			saved[0] = "성인";
			saved[1] = "5000";
			return saved;
		}
	}
}
