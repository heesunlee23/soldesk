package chapter07.Example;

import java.util.Random;

public class Start {
	
	private int pcnum = new Random().nextInt(50) + 1; // 1~50까지의 정수 중 랜덤한 숫자 하나 추출
	private int count;
	private String result = "FAIL"; // 답 맞추면 여기 바뀜
	
	public String check(int myNumber) {
		count++;
		if(myNumber < pcnum) {
			System.out.println("UP!!");
		} else if(myNumber > pcnum) {
			System.out.println("DOWN!!");
		} else {
			System.out.println(count + "회 만에 정답");
			result = "SUCCESS";
		}
		return result;
	}
	
	
}
