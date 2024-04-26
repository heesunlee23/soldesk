package chapter11;

public class OverridingTest1 {
	
	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10001, "이순신");
		customerLee.setBonusPoint(1000);
		System.out.println(customerLee.showCustomer());
		
		VIPCustomer customerKim = new VIPCustomer(1002, "김유신", 1004);
		customerKim.setBonusPoint(1000);
		System.out.println(customerKim.showCustomer());
	}
}
