import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest3 {
	/*
	 * 정수형 배열 6개짜리 선언 후
	 * 데이터 6개를 입력 후
	 * 데이터를 오름차순으로 정렬하세요 
	 * 
	 * 버블 정렬
	 * 선택 정렬
	 * 삽입 정렬
	 */
	public static void main(String[] args) {
		int[] arr1 = new int[] {9,4,7,10,2,1,6,8,0};
		//버블 정렬
		//pass -> 개수 - 1
		System.out.println(Arrays.toString(arr1) );
		for(int pass = 1;pass < arr1.length; pass++ ) {
			//정렬
			for(int i=0;i < arr1.length - pass;i++ ) {
				if(arr1[i] >= arr1[i+1]) {
					//교환
					int temp = arr1[i];
					arr1[i] = arr1[i+1];
					arr1[i+1] = temp;
				}
			}
			//--------
			System.out.println(pass +"pass : "+ Arrays.toString(arr1) );
		}
		System.out.println("--------------------");
		//선택정렬
		int[] arr2 = {34,6,7,2,1,54,-1};
		for(int pass=0;pass < arr2.length-1;pass++) {
			System.out.print(pass+1 + "psss ");
			for(int i = pass+1;i<arr2.length;i++) {
				if(arr2[pass] > arr2[i]) {
					int temp = arr2[pass];
					arr2[pass] = arr2[i];
					arr2[i] = temp;
				}
			}
			System.out.println(Arrays.toString(arr2));
		}
		System.out.println("--------------------");
		int[] arr3 = new int[6];
		Scanner sc = new Scanner(System.in);
		for(int pass=0;pass < arr3.length;pass++) {
			//숫자를 입력
			System.out.print("숫자 입력 : ");
			arr3[pass] = sc.nextInt();
			//정렬을 수행 - 반복문
			for(int i = pass; i > 0 && arr3[i] < arr3[i-1] ; i--) {
				int temp = arr3[i];
				arr3[i] = arr3[i-1];
				arr3[i-1] = temp;
			}
			
			System.out.println(Arrays.toString(arr3));
		}
		
	}

}







