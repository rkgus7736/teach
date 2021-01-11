
public class CardMain {

	public static void main(String[] args) {
		CardFactory factory = CardFactory.getInstance();
		Card card1 = factory.createCard("홍철", 5440);
		Card card2 = factory.createCard("철수", 3440);
		Card card3 = factory.createCard("영수", 2240);
		Card card4 = factory.createCard("수영", 1140);
		card1.cardInfo();
		card2.cardInfo();
		card3.cardInfo();
		card4.cardInfo();
	}

}
