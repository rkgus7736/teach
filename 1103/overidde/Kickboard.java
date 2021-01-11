package overidde;

public class Kickboard extends Vehicle {
	@Override
	public void run() {
		System.out.println("킥보드를 타고 달립니다.");
	}
	@Override
	public void vbreak() {
		System.out.println("킥보드를 멈춤니다.");
	}
}
