package date;

public class Date1 {

	public static void main(String[] args) {
		long start = System.nanoTime();
		System.out.println("시작 시간 : "+start);
		int a = 0;
		for(int i=1;i<10000000;i++) {
			a++;
		}
		long end = System.nanoTime();
		System.out.println("종료 시간 : "+end);
		System.out.println(end - start);
	}

}
