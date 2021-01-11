package exception;

public class Exception3 {
	public static void methodA() throws ArrayIndexOutOfBoundsException{
		methodB();
	}
	public static void methodB() throws ArrayIndexOutOfBoundsException {
		methodC();
	}
	public static void methodC() throws ArrayIndexOutOfBoundsException {
		throw new ArrayIndexOutOfBoundsException("methodC Exception");
	}
	public static void main(String[] args) {
		try {
			methodA();
		}catch (ArrayIndexOutOfBoundsException e) {

		}
	}

}
