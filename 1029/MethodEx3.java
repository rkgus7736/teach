
public class MethodEx3 {
	//숫자 두개를 받아서, 나눈 몫, 나머지를 출력
	public static void calcDiv(int n1, int n2) {
		if(n2 == 0) 
			return;//메서드 강제로 종료
		System.out.println("몫 : "+ n1 / n2);
		System.out.println("나머지 : "+ n1 % n2);
	}
	public static void main(String[] args) {
		calcDiv(10, 5);
		calcDiv(5, 0);
		calcDiv(3, 5);

	}

}
