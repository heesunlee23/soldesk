package chapter08;

import javax.swing.JOptionPane;

public class ThisTestMain {

	public static void main(String[] args) {
		
		// ThisTest r1 = new ThisTest(); // 생성자를 통해 값 주입
		
		int price = 3000;
		
		int rSpeed = Integer.parseInt(JOptionPane.showInputDialog("로봇 속도"));
		int rAge = Integer.parseInt(JOptionPane.showInputDialog("로봇 나이"));
		String rName = JOptionPane.showInputDialog("로봇 이름");
		String rNum = JOptionPane.showInputDialog("로봇 번호");
		
		ThisTest r1 = new ThisTest(rSpeed, rAge, rName, rNum);
		
		System.out.println("속도 : " + r1.getSpeed());
		System.out.println("나이 : " + r1.getAge());
		System.out.println("이름 : " + r1.getRobotName());
		System.out.println("번호 : " + r1.getRobotNum());
		
		System.out.println("-----------------------------");
		
		r1.move(); // 속도 + 20
		r1.rName(); // 이름 출력
		r1.rAge(); // 로봇 나이 출력 
		r1.move();
		r1.move();
		r1.move();
		r1.stop();
		r1.move();

	}

}
