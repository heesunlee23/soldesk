package chapter08;

public class Korean {

	// 멤버변수
	String nation = "대한민국"; // 보통 이렇게 잘 안쓴다. 디폴트로 값을 넣을 꺼면 아예 값을 못바꾸게 하든지 한다. 
	String name; 
	String ssn;
	
	public Korean(String n, String s) {
		name = n;
		ssn = s;
	}
}
