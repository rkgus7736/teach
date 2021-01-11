package inter;

public class Animal implements RunInterface{

	@Override
	public void run() {
		System.out.println("동물이 달립니다.");
	}

}
