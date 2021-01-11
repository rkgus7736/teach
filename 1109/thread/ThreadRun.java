package thread;

public class ThreadRun extends Thread {

	public ThreadRun(String name) {
		super(name);
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(500);
//				System.out.println(getName() + " run");
			}
			System.out.println(getName() + " exit");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}



