package exception;

public class AgeException extends Exception {

	public AgeException() {
	}
	//Exception Message 부모 생성자로 전달
	public AgeException(String message) {
		super(message);
	}
	
}
