package chapter07;

public class AccessTest2 {

	public static void main(String[] args) {
		AccessTest at = new AccessTest();
		
		at.cc = 33;
		
		// not visible
		// at.aa = 11;
		// at.bb = 22;
		
		// at.aa = 11; aa가 private으로 선언되어 있으므로 직접 접근 불가. setter/getter로 접근 해야 함
		at.setAa(11);
		at.setAa(22);
		at.disp();
		
	}
	
	

}
