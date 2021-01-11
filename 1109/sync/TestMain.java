package sync;

public class TestMain {

	public static void main(String[] args) {
		ArrayListWorker a1 = new ArrayListWorker();
		ArrayListWorker a2 = new ArrayListWorker();
		ArrayListWorker a3 = new ArrayListWorker();
		ArrayListWorker a4 = new ArrayListWorker();
		
		a1.start();
		a2.start();
		a3.start();
		a4.start();
		
		long startTime = System.nanoTime();
		
		while(Thread.activeCount()!=1);
		long endTime = System.nanoTime();
		
		long time = endTime - startTime;
		System.out.println(time);
		
		
	}

}

