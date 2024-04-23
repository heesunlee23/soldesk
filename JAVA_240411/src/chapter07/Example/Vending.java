package chapter07.Example;

public class Vending {
	
	// 멤버변수
	private Can[] can = new Can[5];
	private int money; // 초기값 0임
	
	// 생성자 생략
	
	// 메서드
	public void init() {
		
		can[0] = new Can("환타", 1000);
		can[1] = new Can("사이다", 1200);
		can[2] = new Can("오렌지쥬스", 1100);
		can[3] = new Can("바나나우유", 1400);
		can[4] = new Can("콜라", 1000);
		
	} // init 메서드
	
	public void showCans(int m) { // 사용 가능한 음료만 보여주기 
		this.money = m;
		
		for(int i = 0; i < can.length; i++) {
			if(can[i].getPrice() <= m) {
				System.out.println(can[i].getCanName() + "-" + can[i].getPrice() + "원");
			}
		}
	} // showCans 메서드
	
	public void outCan(String name) { // 선택한 음료수 제공과 잔액 출력
//		System.out.println(name + "을(를) 선택하셨습니다.");
//		
//		for(int i = 0; i < can.length; i++) {
//			if(name.equals(can[i].getCanName())) {
//				this.money -= can[i].getPrice();
//				System.out.println("잔액 :" + this.money + "원");
//				break;
//			}
//		}
		
		// 선생님 답
		for(int i = 0; i < can.length; i++) {
			if(can[i].getCanName().equals(name)) {
				System.out.println(can[i].getCanName() + "을 선택하셨습니다.");
				System.out.println("잔액 : " + (money-can[i].getPrice())+"원");
			}
		}
	} // outCan 메서드
} // class
