package sync;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListWorker extends Thread {
	public static ArrayList<Integer> list = new ArrayList<Integer>();
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
