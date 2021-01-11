package yeild;

public class YeildTest {

	public static void main(String[] args) throws InterruptedException {
		ThreadWorker t1 = new ThreadWorker();
		ThreadWorker t2 = new ThreadWorker();
		t1.start();
		t2.start();
		t1.join(5000); //해당 시간 동안만 기다림
		t2.join(); //t2가 끝날때 까지 대기
		System.out.println("main - exit");
	}

}
