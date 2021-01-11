package sync;

import java.util.Random;
import java.util.Vector;

public class VectorWorker extends Thread {
	public static Vector<Integer> list = new Vector<Integer>();
	public static Random r = new Random();
	public static long startTime;
	public static long endTime;
	@Override
	public void run() {
		
		while(list.size()<100000) {
			list.add(r.nextInt());
		}
		
	}
		
}
