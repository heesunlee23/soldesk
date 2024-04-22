package chapter02;

public class AssignTest04 {

	public static void main(String[] args) {
		
		System.out.println("==전위연산==");
		int gameScore = 150;
		int lastScore = ++gameScore;
		System.out.println(gameScore);
		System.out.println(lastScore);
		
		System.out.println("============");
		lastScore = --gameScore;
		// *** 중요: 먼저 1 뺀 걸 gameScore에 저장 한다 
		System.out.println(gameScore);
		System.out.println(lastScore);

		// 후위연산 
		System.out.println("==후위연산==");
		int lastScore3 = gameScore++; 
		// **** 대입 후 더하기 
		// **** lastScore3에 대입하고 더해짐!!!!!!!!!
		System.out.println("lastScore3 : " + lastScore3); // 150
		System.out.println("gameScore : " + gameScore); // 151
		
		System.out.println("==========");
		int lastScore4 = gameScore--;
		System.out.println("lastScore4 : " + lastScore4); // 151
		System.out.println("gameScore : " + gameScore); // 150
	}

}