
public class MessagePassing {

	public static void main(String[] args) {
		Buyer buyer = new Buyer(7000);
		Seller seller = new Seller(6, 0, 3000);
		
		buyer.buy(seller, 6000);//buyer와 seller가 데이터를 주고받는 부분
		buyer.buyerInfo();
		seller.sellInfo();
		
	}

}
