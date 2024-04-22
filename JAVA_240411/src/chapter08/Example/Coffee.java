package chapter08.Example;

public class Coffee {
	
	private String name;
	private int money;
	
	public Coffee(String name, int money) {
		this.name = name;
		this.money = money;
	} // 생성자
	
	public void disp() {
		System.out.println(name + " | " + money + "원");
	} // disp 메서드 

	public String getName() {
		return name;
	}

	public int getMoney() {
		return money;
	}
}
