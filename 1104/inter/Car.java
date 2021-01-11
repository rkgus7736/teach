package inter;

public class Car implements RunInterface{

	@Override
	public void run() {
		System.out.println("차가 달립니다.");
	}

}
