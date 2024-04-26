package chapter11;

public class HumanMain {

	public static void main(String[] args) {
		
		Human human = null;
		int i = 2;
		
		if(i == 1) {
			human = new Student();
		} else if(i==2) {
			human = new Professor();
		} else {
			human = new Salesman();
		}
		human.action(); // 해당하는 자식의 메서드가 실행 됨 

	}

}
