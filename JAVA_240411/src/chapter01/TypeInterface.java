package chapter01;

public class TypeInterface {

	public static void main(String[] args) {
		
		var i = 10; 
		var j = 10.0;
		var str = "Test"; 
		// 타입 알아서 알아들음.
		// 자바에서는 var 잘 안씀
		// 꺼내서 보기 전까지 뭘 넣었는지 판단 어려움 
		// 안쓴다고 봐도 무방 
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);

	}

}
