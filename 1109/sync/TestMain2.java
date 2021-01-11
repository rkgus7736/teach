package sync;

public class TestMain2 {

	public static void main(String[] args) {
		VectorWorker a1 = new VectorWorker();
		VectorWorker a2 = new VectorWorker();
		VectorWorker a3 = new VectorWorker();
		VectorWorker a4 = new VectorWorker();
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

