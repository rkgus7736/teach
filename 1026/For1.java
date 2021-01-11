
public class For1 {
	/*
	 * 	1~100까지의 숫자 중
	 * 	3 또는 5의 배수를 출력
	 *  단 공배수는 1번만 출력
	 *  3 5 6 9 10 12 15 18 20 21 ....
	 */
	public static void main(String[] args) {
		for(int i=1;i<101;i++) {
			if(i % 3 == 0 || i % 5 == 0)
				System.out.println(i);
		}

	}

}
