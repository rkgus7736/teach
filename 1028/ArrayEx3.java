import java.util.Scanner;

public class ArrayEx3 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int index = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		arr[index++] = sc.nextInt(); //정수 입력 방법
		System.out.print("숫자 입력 : ");
		arr[index++] = sc.nextInt(); //정수 입력 방법
		System.out.print("숫자 입력 : ");
		arr[index++] = sc.nextInt(); //정수 입력 방법
		
		for(int i=0;i<index;i++)
			System.out.print(arr[i] + " ");
	}

}





