package exception;

public class Exception2 {
	public static void main(String[] args) {
		try {
			System.out.println(1);
			throw new Exception("예외처리");
//			System.out.println(2);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(3);
	}
}
