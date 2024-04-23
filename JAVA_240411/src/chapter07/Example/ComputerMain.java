package chapter07.Example;

public class ComputerMain {
	
	public static void main(String[] args) {
		
		Computer myCom = new Computer();
		
		int values1[] = {1, 2, 3};
		int result = myCom.sum1(values1);
		System.out.println("result : " + result);
		
		int values2[] = {1, 2, 3, 4, 5}; 
		result = myCom.sum1(values2);
		System.out.println("result : " + result);
		
		// 배열을 안쓴다고 가정하면? 
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		result = myCom.sum2(a, b, c, d); // 단, 변수가 다 타입이 같아야 함 
		System.out.println("result : " + result);
	}
}
