import java.util.Arrays;

public class ForEach {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		String[] str = {"Hello","World","JAVA","TEST"};
		
		for(int i=0;i<arr.length;i++)
			arr[i]++;
		
		System.out.println(Arrays.toString(arr));
		
		for(int num : arr) {//For-Each
			num++;
		}
		System.out.println(Arrays.toString(arr));
	}
}







