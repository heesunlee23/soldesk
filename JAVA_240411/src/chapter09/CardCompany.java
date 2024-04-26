// 24-04-24
// 봤음
// 스프링 할때 많이 함. 그 때 또 설명. 싱글톤 과제 안 만듦
package chapter09;

public class CardCompany {
	
	private static CardCompany instance = new CardCompany(); // 하나의 회사에서 서로 다른 카드 발급 중 
	
	private CardCompany() {} // private 생성자로 외부에서 객체 생성 방지 
	// 생성자가 private 으로 되어 있으면 singleton이구나라고 실무에서 판단하면 됨
	
	public static CardCompany getInstance() {
		return instance;
	} // getInstance 메서드를 통해 하나의 객체만을 생성
	
	public Card issueCard() {
		
		return new Card();
	} // 카드 객체 생성

	public static void main(String[] args) {
		
		CardCompany cardCompany = CardCompany.getInstance();
		Card card1 = cardCompany.issueCard();
		Card card2 = cardCompany.issueCard();
		
		System.out.println("카드 1의 번호 : " + card1.getCardnumber());
		System.out.println("카드 2의 번호 : " + card2.getCardnumber());

	}

}
