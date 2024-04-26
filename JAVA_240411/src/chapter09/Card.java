// 24-04-24
// 봤음
package chapter09;

public class Card {
	
	private static int cardCounter = 1000;
	private int cardnumber;
	
	public Card() {
		cardnumber = cardCounter++; // 카드 고유번호 발급
	}
	
	public int getCardnumber() {
		return cardnumber;
	}
}
