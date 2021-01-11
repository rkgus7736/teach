package yeild;

public class ThreadWorker extends Thread {
	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(getName() + " "+i);
				Thread.sleep(300);
				this.yield();				
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(getName()+" exit");
	}
}


