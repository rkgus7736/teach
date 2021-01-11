
public class SwitchTest {

	public static void main(String[] args) {
		int n = 3;
		switch(n) {
		case 1:
			System.out.println("1층 약국");
		case 2:
			System.out.println("2층 정형외과");
		case 3:
			System.out.println("3층 내과");
		case 4:
			System.out.println("4층 안과");
		default:
			System.out.println("영안실");
		}
	}

}
