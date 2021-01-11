
public class Car {
	private int gear;
	private int speed;
	private int fuel;
	private char[] gearList;
	private boolean wiper;
	
	public Car() {
		gear = 1; // P 기어로 초기화
		speed = 0;
		fuel = 50;		
		gearList = new char[] {'R','P','N','1','2','3','4','5','6'};
	}
	public void changeGear(int g) {
		//기어 변경
		gear = g;
		//변경된 기어를 출력
		System.out.println("변경된 기어 : "+gearList[gear]);
	}
	public void accelator() {
		if(fuel <= 0) {
			System.out.println("연료가 없습니다.");
			speed = 0;
			return;
		}
		fuel -= 2;
		speed += 3;
		System.out.println("현재 속도 : "+speed);
	}
	public void carBreak() {
		if(fuel <= 0) {
			System.out.println("연료가 없습니다.");
			return;
		}
		fuel -= 1;
		speed -=5;
		System.out.println("현재 속도 : "+speed);
	}
	public void inputFuel() {
		fuel = 50;
		System.out.println("연료 충전 완료");
	}
	public void wiperOnOff() {
		wiper = !wiper;
		if(wiper)
			System.out.println("와이퍼 On");
		else
			System.out.println("와이퍼 Off");			
	}
	
}








