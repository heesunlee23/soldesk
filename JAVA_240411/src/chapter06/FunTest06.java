// 0419 - 어제꺼 복습 - 다시 안봐도 됨
package chapter06;

public class FunTest06 {

	public String channel; // 멤버변수(필드)
	public int channelInt; // 
	public int volume;
	
	public int channelUp(int volume) {
		System.out.println("소리를 높이겠습니다. ");
		return volume + 2;
	}
	
	public void channelDown(int volume) {
		System.out.println("소리를 " + volume + "만큼 내립니다.");
	}
	
	public static void main(String[] args) {
		
		FunTest06 tv = new FunTest06(); // 힙 공간이 만들어짐 
		tv.channel = "EBS";
		System.out.println(tv.channel);

		int volume = tv.channelUp(2);
		System.out.println("소리를 " + volume + "만큼 올립니다.");
	} // main
 
} // class 
