// 봤음
package chapter10;

public class StrawBerry extends Berry{
	private String color;
	private int price;
	
	public void set2(String a, int b) {
		color = a;
		price = b;
		super.set1("딸기", "중"); // 아버지 호출. 자식은 할아버지의 값까지 가져간다. 
	}
	
	@Override
	public void disp() {
		super.disp();
		System.out.println("색상 : " + color + " | " + "계절 : " + price);
	}
}
