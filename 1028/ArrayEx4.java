import java.util.Scanner;

public class ArrayEx4 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		int index=0;
		Scanner sc = new Scanner(System.in);
		//                 5
		while(index != arr.length) {
			System.out.print("숫자 입력 : ");
			arr[index++] = sc.nextInt();			
		}
		//짝수의 개수 출력
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] % 2 == 0)
				count++;
		}
		index = 0;
		while(index != arr.length) {
			if(arr[index++] % 2 == 0)
				count++;
		}
		System.out.println("입력하신 숫자들 중 짝수의 개수 : "+count);
	}

}





