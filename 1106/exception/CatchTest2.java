package exception;

public class CatchTest2 {

	public static void main(String[] args) {
		int arr[] = new int[3];
		try {
			System.out.println(1);
			int r = arr[3] / 4;
			System.out.println(2);
		}catch (ArithmeticException | IndexOutOfBoundsException e) {
			System.out.println(3);
		}catch(Exception e) {
			System.out.println(4);
		}finally {
			System.out.println(5);
		}
		System.out.println(6);
	}

}



