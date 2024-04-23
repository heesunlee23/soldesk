package chapter07; // 0422 - chapter 07이 가장 중요

public class AccessTest {

	// 필드 
	private int aa;
	private int bb;
	public int cc;
	// heap 공간에 객체 생김
	// 접근지정자: public(공용: 제한없음) / protected(패키지 내 공유)/클래스 내 공유 
	// 접근 가능한 범위가 좁아짐 
	
	// 값의 수정 방지, 메서드를 통해 접근하도록, 함부로 접근 방지 하도록 private 붙음 (encapsulation)

	//---------------------
	// 디폴트 생성자 (생략)
	//---------------------
	
	// 메서드
	public void disp() {
		System.out.println("aa값: " + aa + "|bb값 :" + bb + "|cc값 : " + cc);
	}
	
	public static void main(String[] args) {
		
		AccessTest obj = new AccessTest();
		obj.disp();
		obj.aa = 10;
		obj.bb = 20;
		obj.cc = 30;
		obj.disp();

	}

	// source -> generate setters and setters
	public int getAa() {
		return aa;
	}

	public void setAa(int aa) {
		this.aa = aa;
	}

	public int getBb() {
		return bb;
	}

	public void setBb(int bb) {
		this.bb = bb;
	}
}
