
public class MethodEx1 {
	/*
	 * 	반지름 하나를 매개변수로 받아서 원넓이를 리턴해주는 메서드
	 */
	public static double calcCircleArea(int r) {
		return r*r*3.14;//return 78.5;
	}
	/*
	 * 정수하나를 매개변수로 받아서 해당 정수의 팩토리얼 값을 리턴해주는 메서드
	 */
	public static int factorial(int n) {
		int result = 1;
		for(int i=1;i<=n;i++)
			result *= i;
		return result;
	}
	/*
	 *  점수 하나를 매개변수로 받아서 해당 점수의 성적등급을 리턴
	 *  90~100 A
	 *  80~89  B
	 *  70~79  C
	 *  60~69  D
	 *  0 ~59  F
	 */
	public static char getGrade(int score) {
		char grade = 'F';
		
		if(score >= 90)
			grade = 'A';
		else if(score >= 80)
			grade = 'B';
		else if(score >= 70)
			grade = 'C';
		else if(score >= 60)
			grade = 'D';
		
		return grade;
	}
	public static void main(String[] args) {
		System.out.println("반지름 5의 원넓이 : "+calcCircleArea(5));
		System.out.println("반지름 6의 원넓이 : "+calcCircleArea(6));
		System.out.println("반지름 7의 원넓이 : "+calcCircleArea(7));
		System.out.println("5! = "+factorial(5));
		System.out.println("성적 등급 : "+ getGrade(79));
	}

}



