import java.util.Scanner;

public class ArrayTest1 {
	/*
	 * 배열의 크기를 입력해서
	 * 입력한 크기만큼 배열을 생성
	 * 해당 배열에는 3의 배수만 전부 입력하여 
	 * 배열에 있는 내용을 전부 출력
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size=0;
		
		System.out.print("생성할 배열 길이 : ");
		size = sc.nextInt();
		
		int[] arr = new int[size];
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.print("숫자 입력 : ");
//			arr[i] = sc.nextInt();
//			if(arr[i] % 3 != 0) {
//				i--;
//				continue;
//			}
//			//추가적인 작업
//		}
		int index=0;
		while(index != arr.length) {
			System.out.print("숫자 입력 : ");
			arr[index] = sc.nextInt();
			if(arr[index] % 3 == 0) {
				index++;
			}
		}
		index=0;
		while(index != arr.length) {
			System.out.print(arr[index++] + " ");
		}
		
	}

}







