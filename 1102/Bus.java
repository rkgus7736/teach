
public class Bus {
	private int money;
	private int passengerCount;
	
	public void boarding(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void printBusInfo() {
		System.out.println("운행 수입 : "+money);
		System.out.println("이용객 숫자 : "+passengerCount);
	}
}





