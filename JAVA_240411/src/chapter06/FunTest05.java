package chapter06;

public class FunTest05 {
	public String channel; // 인스턴스 변수, 멤버변수
	public int chalnnelInt; // 인스턴스 변수, 멤버변수
	public int volume; // 인스턴스 변수, 멤버변수
	
	public void channelUp(int volume) {
		System.out.println("소리를 " + volume + "만큼 올립니다");
	}
	
	public void channelDown(int volume) {
		System.out.println("소리를 " + volume + "만큼 올립니다");
	}
	
	// 오버로딩(다형성 만족)
	public void channelChange(String channel) {
		
		System.out.println("TV채널을 " + channel + "로 바꿉니다");
	}
	
	// 오버로딩(다형성 만족) - 
	public void channelChange(int channel) { 
		
		System.out.println("TV채널을 " + channel + "로 바꿉니다");
	}
	
	public static void main(String[] args) {
		
		FunTest05 tv = new FunTest05();
		tv.channelUp(4);
		tv.channelDown(5);
		
		
		tv.channelChange("EBS");
		tv.channelChange(13);
	}

}
