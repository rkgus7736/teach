package thread;

public class RunnableMain {

	public static void main(String[] args) {
		RunnableWorker r1 = new RunnableWorker();
		Thread t1 = new Thread(r1, "r1");
		RunnableWorker r2 = new RunnableWorker();
		Thread t2 = new Thread(r2, "r2");
		RunnableWorker r3 = new RunnableWorker();
		Thread t3 = new Thread(r3, "r3");
		t1.start();
		t2.start();
		t3.start();
		System.out.println("main exit");
	}

}


