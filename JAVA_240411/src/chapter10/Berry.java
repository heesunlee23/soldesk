// 봤음
package chapter10;

public class Berry extends Fruit {
	
	private String name;
	private String size;
	
	public void set1(String a, String b) {
		name = a;
		size = b;
		super.set("딸기류", "여름과일");
	} 
	
	@Override
	public void disp() {
		super.disp();
		System.out.println("이름 : " + name + " | " + "계절 : " + size);
	}
}
