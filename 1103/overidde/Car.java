package overidde;

public class Car extends Vehicle {
	@Override
	public void run() {
		System.out.println("자동차를 타고 달립니다.");
	}
	@Override
	public void vbreak() {
		System.out.println("자동차를 멈춤니다.");
	}
}
