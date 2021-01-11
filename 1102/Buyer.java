
public class Buyer {
	private int money;
	private int product;
	
	public Buyer(int money) {
		this.money = money;
	}
	
	public void buy(Seller seller, int money) {
		int ea = seller.sell(money);
		product += ea;
		this.money -= money;
	}
	
	public void buyerInfo() {
		System.out.println("현재 보유중인 제품수 : "+product);
		System.out.println("현재 남은 잔액 : "+money);
		
	}
}



