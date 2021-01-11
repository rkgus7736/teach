package sync;


public class BankMain {

	public static void main(String[] args) {
		Bank bank = new Bank();
		Person p1 = new Person(bank);
		Person p2 = new Person(bank);
		Person p3 = new Person(bank);
		p1.start();
		p2.start();
		p3.start();
		
	}

}
