
public class Seller {
	//보유하고 있는 제품수
	private int product;
	//보유 중인 금액
	private int money;
	//제품 단가
	private final int PRODUCT_PRICE;

	public Seller(int product, int money, int pRODUCT_PRICE) {
		this.product = product;
		this.money = money;
		PRODUCT_PRICE = pRODUCT_PRICE;
	}

	public int sell(int money) {
		this.money += money;
		product -= money / PRODUCT_PRICE;
		return money / PRODUCT_PRICE;
	}
	
	public void sellInfo() {
		System.out.println("제품 재고 : "+product);
		System.out.println("잔고 : "+money);
	}
}








