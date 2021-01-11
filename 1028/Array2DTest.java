
public class Array2DTest {

	public static void main(String[] args) {
		int[][] arr = new int[3][4];
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		System.out.println(arr[2].length);
		int num = 1;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = num++;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
	}

}






