package chapter07;

public class MyDateMain {

	public static void main(String[] args) {
		
		MyDate date = new MyDate();
		
		date.setYear(2024);
		date.setMonth(4);
		date.setDay(22);
		
		// private이라도 get으로 가져올 수 있다.
		System.out.println(date.getYear() + "년 " + date.getMonth() + "월" + date.getDay() + "일 ");
	}

}
