import java.util.Arrays;


public class ArrayCopy {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6};
		int b[] = new int[10];
//		a = new int[10];//새로 생성 기존 배열의 내용은 사라짐
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		int copy[] = Arrays.copyOf(a, 4);
		System.out.println(Arrays.toString(copy));
		System.arraycopy(a, 0, b, 0, a.length);
		System.out.println(Arrays.toString(b));
		
		
	}

}







