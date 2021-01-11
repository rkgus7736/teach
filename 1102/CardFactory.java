
public class CardFactory {
	private static CardFactory instance = new CardFactory();
	private int cardNo;
	private CardFactory() {
		cardNo = 2000;
	}
	
	public static CardFactory getInstance() {
		if(instance == null)
			instance = new CardFactory();
		return instance;
	}
	
	public Card createCard(String client, int limit) {
		return new Card(cardNo++, client, limit);
	}
	
}







