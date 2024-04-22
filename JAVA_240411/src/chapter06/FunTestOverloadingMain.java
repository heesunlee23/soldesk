package chapter06;

public class FunTestOverloadingMain {

	public static void main(String[] args) {
		
		FunTestOverloading obj = new FunTestOverloading();
		
		obj.getResult(5);
		obj.getResult("가나다");
		obj.getResult(5, "안녕하세요");
	}

}
