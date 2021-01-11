
public class PrintTest {
	// \n --> 줄바꿈
	
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			//공백 출력
			for(int j=4-i;j>0;j--) {
				System.out.print(" ");
			}
			//* 출력
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}


