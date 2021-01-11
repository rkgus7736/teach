package exception;

public class ExceptionTest1 {

	public static void main(String[] args) {
		try {
			System.out.println(1);
			int r = 5 / 0;
			System.out.println(2);
		}catch(Exception e) {
			System.out.println(3);
			System.out.println(e.getMessage());
		}
		System.out.println(4);
	}

}
