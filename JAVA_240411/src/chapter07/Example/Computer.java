package chapter07.Example;

public class Computer {
	
	public int sum1(int[] values) {
		
		int sum = 0;
		
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		} // for
		
		return sum;
	}
	
	// 번거로움 - v5 추가되면 또 수정하거나 새로운 메서드 만들어야 함 
//	public int sum2(int v, int v2, int v3, int v4) {
//		int sum = v + v2 + v3 + v4;
//		
//		return sum; 
//	} // sum2
	
	public int sum2(int ... values) { // 단, 변수가 다 타입이 같아야 함 (배열을 더 자주 쓰니는 함) 
		
		int sum = 0;
		
		for(int i=0; i < values.length; i++) {
			
			sum += values[i];
		}
		
		return sum;
	}
}
