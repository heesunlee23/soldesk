// 봤음 - 또 볼 필요 없음
package chapter19.Example;

import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		
		Stack<Coin> coinBox = new Stack<Coin>();
		
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(10));
	
//		for(Coin coin : coinBox) {
//			System.out.println("코인박스에서 꺼낸 동전 : " + coin.getValue());
//		}
		
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("코인박스에서 꺼낸 동전 : " + coin.getValue());
		}
		
	}

}
