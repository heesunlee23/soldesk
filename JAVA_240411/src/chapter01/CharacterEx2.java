package chapter01;

public class CharacterEx2 {

	public static void main(String[] args) {
		
		char ch1 = '한';
		
		char ch2 = '\uD55C'; 
		// 유니코드로 써라. 16진수임
		// 외울 필요 없고 인터넷에 변환기 있음
		// 이걸로 계산을 하는 경우 있어서 뺴지 못함 
		
		System.out.println(ch1);
		System.out.println(ch2);

	}

}
