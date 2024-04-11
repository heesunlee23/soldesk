package chapter01;

public class ImplicitConversion {

	public static void main(String[] args) {
		// 오늘 형변환이 중요 
		
		// 묵시적 형변환 (type1): 작은 메모리에서 큰 메모리로 변환
		byte bNum = 10;
		int iNum = bNum; // 참조변수 iNum에 bNum의 주소가 저장됨
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		System.out.println("==============");
		
		
		// 묵시적 형변환 (type2): 더 정밀한 수로 변환 
		int iNum2 = 20;
		float fNum = iNum2;
		
		System.out.println(iNum2);
		System.out.println(fNum);
	}
}
