
public class LoopInLoop {
	//구구단 2단부터 9단 출력
	public static void main(String[] args) {
		for(int dan=2;dan<10;dan++) {
			System.out.println(dan+"단");
			//1~9까지 곱한 결과
			for(int is=1;is<10;is++) {
				System.out.println(dan + " * " + is + " = " + dan * is);
			}
		}
		int dan=1;
		int is = 1;
		while(dan < 9) {
			dan++;
			System.out.println(dan+"단");
			is = 1;//초기화
			while(is < 10) {
				//1~9까지 곱한 결과
				System.out.println(dan + " * " + is + " = " + dan * is);
				is++;
			}
		}
	}

}






