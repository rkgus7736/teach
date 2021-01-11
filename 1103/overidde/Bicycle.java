package overidde;

public class Bicycle extends Vehicle {
	@Override
	public void run() {
		System.out.println("자건거를 타고 달립니다.");
	}
	
	@Override
	public void vbreak() {
		System.out.println("자건거를 멈춤니다.");
	}
}
