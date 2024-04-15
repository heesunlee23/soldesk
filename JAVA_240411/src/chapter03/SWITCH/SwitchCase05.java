package chapter03.SWITCH;

public class SwitchCase05 {

	public static void main(String[] args) {
		
		// 1~6 사이의 값이 나오면 점수 획득 / 7~10 -> 잘못된 숫자 입니다. 
		System.out.print("주사위 눈의 수 : ");
		int num = (int)(Math.random()*10)+1; 
		//Math: 수학 계산에 사용할 수 있는 메서드를 제공하는 클래스
		//random(): 0.0~1.0 미만 사이의 난수를 제공
		//*6으로 0.0~6.0미만 사이의 난수를 제공
		//+1로 1~6 사이의 난수를 제공
		
		scoreDeterminer(num);
	}

	private static void scoreDeterminer(int num) {
		switch (num) {
		case 1: case 2: case 3: case 4: case 5: case 6:
			System.out.println(num+"점 획득!");
			break;
		default:
			System.out.println("잘못된 숫자 입니다.");
			break;
		}
	}
}
