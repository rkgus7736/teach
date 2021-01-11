import java.io.IOException;
import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) throws IOException {
		String str;
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		num = sc.nextInt();
		System.out.println(num);
		System.out.print("숫자 입력 : ");
		num = sc.nextInt();
		System.out.println(num);
		System.out.print("숫자 입력 : ");
		num = sc.nextInt();
		System.out.println(num);
		sc.nextLine();//숫자 입력후 줄바꿈 문자 처리
		
		System.out.print("문자열 입력 : ");
		str = sc.nextLine(); //문자열 입력 한줄씩 읽어옴
		System.out.println("입력한 문자열 : "+str);
	}
}






