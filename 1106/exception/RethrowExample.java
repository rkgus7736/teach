package exception;

public class RethrowExample {

	public static void main(String[] args) {
		try {
			System.out.println("외부 try...");
			try {
				System.out.println("내부 try....");
				throw new Exception();
			} catch (Exception e) {
				System.out.println("외부 던지기");
				throw e;
			}finally {
				System.out.println("내부 finally");
			}
		} catch (Exception e) {
			System.out.println("외부 catch");
		}finally {
			System.out.println("외부 finally");
		}
		System.out.println("종료");
	}

}
