package sync;

public class Bank {
	private int money;
	
	public synchronized void inputMoney(int money) {
		this.money += money;
		System.out.println("입금 결과 : "+this.money);
	}
	
	
}
