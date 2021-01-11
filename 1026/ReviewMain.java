import javax.swing.JOptionPane;

public class ReviewMain {
	/*
	 * 	변수 선언 방법
	 * 	화면 출력 부분
	 * 	연산자 
	 * 		사칙연산자  +  -  *  /   %
	 * 		복합대입연산자  += -= *= /=  %=
	 * 					result = result + 10
	 * 					result += 10
	 * 		증감연산자		++   --
	 * 		관계(비교) 연산자  >    <    >=   <=    ==     !=
	 * 		논리연산자   &&    ||    !
	 * 
	 * 	분기문
	 * 		if(조건식){
	 * 			실행문
	 * 		}else if(조건식){
	 * 			실행문
	 * 		}....
	 * 		else{
	 * 			실행문
	 * 		}
	 * 
	 * 		switch(값){  <---- true/false는 안됨
	 * 		case 값:
	 * 			실행문
	 * 			break;
	 * 			...
	 * 		default:
	 * 			실행문
	 * 		}
	 *  		
	 */
	public static void main(String[] args) {
		int n=0;
		n = Integer.parseInt(JOptionPane.showInputDialog("숫자 입력"));
		int result = n * n;
		System.out.println("입력하신 숫자의 제곱 : "+result);
		if(result >= 50) {
			System.out.println("결과가 50이상입니다.");
		}else if(result >= 20) {
			System.out.println("결과가 20이상입니다.");
		}else {
			System.out.println("결과가 20미만입니다.");
		}
		
	}

}










