package chapter01;

public class IntegerVariable {

	public static void main(String[] args) {
		
		short sVal = 10;
		byte bVal = 20;
		
		int result = sVal + bVal; // [step 1] byte가 short로 바뀜
		// [step2] int 로 바뀌어서 저장됨(묵시적 형변환)
		
		// result = sVal + (short)bVal; // 굳이 명시적 형변환 한 거
		
		System.out.println("두 수의 합 : "+result);
		System.out.println("두 수의 합 : "+ (sVal + bVal)); 
		// 문자열로 처리해 버렸음, 단순 연결 만 한 거임 -> () 추가 

	}

}