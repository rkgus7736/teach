
public class LinLEx {
	/*
	 * 두 숫자의 합이 12가 되는 경우를 출력
	 * 0 12
	 * 1 11
	 * 2 10
	 * 
	 */
	public static void main(String[] args) {
		for(int i=0;i<13;i++) {
			for(int j=0;j<13;j++) {
				if(i+j == 12) {
					System.out.println(i + ","+j);
					break;
				}
			}
		}
	}

}





