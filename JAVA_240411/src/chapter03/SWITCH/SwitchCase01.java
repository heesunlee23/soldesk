package chapter03.SWITCH;

public class SwitchCase01 {

	public static void main(String[] args) {
		
		int ranking = 2;
		char medalColor;
		
		// swi + ctrl +space -> 자동완성 
		
		switch (ranking) {
		case 1:
			medalColor='금';
			break; // **** 나갈 타이밍. 없으면 그냥 패스함 
		case 2:
			medalColor='은';
			break;
		case 3:
			medalColor='은';
			break;
		default:
			medalColor='노';
			break;
		}
		System.out.println(ranking+ "등 메달은 " + medalColor+"메달입니다");

	}

}