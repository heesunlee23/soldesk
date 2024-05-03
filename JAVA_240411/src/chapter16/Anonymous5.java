package chapter16;

public class Anonymous5 {

	public static void hello(Process process) {
		System.out.println("프로그램 시작");
		process.run();
		System.out.println("프로그램 종료");
	}

	public static void main(String[] args) {

		Process length = new Process() {
			@Override
			public void run() {
				String str = "Hello World";
				System.out.println("\"Hello World\"의 문자열 길이 : " + str.length());
			}
		};
		hello(length);
		System.out.println("-------------------------------------");

		hello(new Process() {
			@Override
			public void run() {
				int sum = 0;
				for (int i = 1; i <= 3; i++) {
					sum += i;
				}
				System.out.println("1부터 3까지 합 :" + sum);
			}
		});
	}
}