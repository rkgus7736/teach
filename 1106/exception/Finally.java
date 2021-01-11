package exception;

public class Finally {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		try {
			System.out.println(1);
			int c = b / a;
			System.out.println(2);
		}catch (ArithmeticException e) {
			System.out.println(3);
		}finally {
			System.out.println(4);
		}
		System.out.println(6);
	}

}


