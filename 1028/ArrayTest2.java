import java.util.Scanner;

public class ArrayTest2 {
	/*
	 * 정수형 배열 10개짜리 선언 후
	 * 정수를 전부 입력
	 * 1 2 3 4 5 6 7 8 9 10
	 * 
	 * 홀수: 1 3 5 7 9
	 * 짝수: 2 4 6 8 10
	 */
	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(i+"번째 숫자 입력 : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("홀수 출력 : ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i] % 2 == 1)
				System.out.print(arr[i] + " ");
		}
		System.out.print("짝수 출력 : ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i] % 2 == 0)
				System.out.print(arr[i] + " ");
		}
			
		
	}

}






