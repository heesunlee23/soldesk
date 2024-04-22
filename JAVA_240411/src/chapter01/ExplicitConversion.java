package chapter01;

public class ExplicitConversion {

	public static void main(String[] args) {
		
		// 명시적 형변환
		int iNum = 1000;
		// byte bNum = iNum; // -127~128 까지 표현 가능. 1000은 못들어감 
		
		byte bNum = (byte)iNum; // 안 맞는데 억지로 넣으려고 해서 이상한값 나옴
		
		System.out.println(iNum);
		System.out.println(bNum);
		
		System.out.println("==================");
		
		double dNum1 = 1.2;
		float fNum1 = 0.9f;
		
		// int iNum2 = dNum1 + fNum1; // 안들어감 우변이 좌변보다 더 정밀해서
		
		// int iNum2 = (int)dNum1 + fNum1; 
		// dNum1만 형변환 되었음
		// 우변 : 정수 + 실수 = 실수 
		// 좌변 : int 
		// 좌변에 못들어감 
		
		int iNum2 = (int)dNum1 + (int)fNum1;
		// dNum1: 1
		// fNum1: 0, 합해서 1
		
		int iNum3 = (int)(dNum1 + fNum1);
		// dNum1 + fNum1: 표현을 더 많이 할 수 있는 double로 묵시적 형변환
		// (int) 2.1 => .1 날아감 
		
		System.out.println("iNum2: " + iNum2);
		System.out.println("iNum3: " + iNum3);
	}
	

}