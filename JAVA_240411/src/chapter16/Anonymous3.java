package chapter16;

public class Anonymous3 {
	
	public static void hello(Process process) {
		System.out.println("프로그램 시작");
		process.run();
		System.out.println("프로그램 종료");
	}
	
	static class length implements Process {
		String str = "Hello World";
		@Override
		public void run() {
			System.out.println("\"Hello World\"의 문자열 길이 : " +  str.length());
		}
	}
	
	static class sum implements Process {
		@Override
		public void run() {
			int sum = 0; 
			for(int i = 1; i <= 3; i++) {
				sum += i;
			}
			System.out.println("1부터 3까지 합 :" + sum);
		}
	}
	
	public static void main(String[] args) {
		hello(new sum());
		System.out.println("-----------------------------------");
		hello(new sum());
	}
}
