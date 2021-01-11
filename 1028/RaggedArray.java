
public class RaggedArray {

	public static void main(String[] args) {
		int[][] arr = new int[3][];
		arr[0] = new int[10];
		arr[1] = new int[5];
		arr[2] = new int[7];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].length);
		}
	}

}
