package sync;

public class Person extends Thread{
	private Bank bank;

	public Person(Bank bank) {
		this.bank = bank;
	}
	
	@Override
	public void run() {
		bank.inputMoney(1000);
	}
}
