
public class Card {
	private int cardNo;
	private String clientName;
	private int moneyLimit;
	
	public Card(int cardNo, String clientName, int moneyLimit) {
		this.cardNo = cardNo;
		this.clientName = clientName;
		this.moneyLimit = moneyLimit;
	}
	
	public void cardInfo() {
		System.out.println("카드 번호 : "+cardNo);
		System.out.println("고객명 : " + clientName);
		System.out.println("이용한도 : "+moneyLimit);
	}	
}
