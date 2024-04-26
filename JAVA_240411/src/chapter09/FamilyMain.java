// 24-04-24
// 봤음
package chapter09;

public class FamilyMain {
	public static void main(String[] args) {
		Family myFamily1 = Family.getInstance();
		Family myFamily2 = Family.getInstance();
		
		System.out.println(myFamily1); // 주소값 동일함 
		System.out.println(myFamily2);
		System.out.println(myFamily1 == myFamily2);
	}
}
