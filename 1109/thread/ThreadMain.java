package thread;

public class ThreadMain {

	public static void main(String[] args) {
		ThreadWorker t1 = new ThreadWorker("K-Thread");
		ThreadWorker t2 = new ThreadWorker("G-Thread");
		ThreadWorker t3 = new ThreadWorker("P-Thread");
		ThreadWorker t4 = new ThreadWorker("R-Thread");
		t1.start();t2.start();t3.start();t4.start();
		System.out.println("Main exit");
	}

}








