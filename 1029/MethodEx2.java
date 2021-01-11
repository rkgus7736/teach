
public class MethodEx2 {
	
	/*
	 * 매개변수로 숫자 하나를 받아서 해당 숫자가 짝수면 true 아니면 false 리턴
	 */
	public static boolean isEven(int num) {
		boolean result;
		if(num % 2 ==0)
			result = true;
		else
			result = false;
		return result;		
	}
	/*
	 * 1~100까지의 숫자 중 소수만 출력하는 코드
	 * 소수를 체크하는 부분을 메서드로 작성 
	 */
	public static boolean isPrimeNumber(int num) {
		if(num < 2) return false;
		for(int i=2;i<num;i++) {
			if(num % i == 0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			if(isPrimeNumber(i)) 
				System.out.println(i);
		}
	}
	
}




