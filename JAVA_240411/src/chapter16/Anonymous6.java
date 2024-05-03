package chapter16;

public class Anonymous6 {
	
	public void test() {
		
//		Process p = new Process() {
//			@Override
//			public void run() {
//				System.out.println("금요일");
//			}
//		};
		
		// p.run();
		
		new Process() {
			@Override
			public void run() {
				System.out.println("금요일");
			}
		}.run();
	}
	
	public static void main(String[] args) {
		
		Anonymous6 a = new Anonymous6();
		a.test();
		
	}
}
