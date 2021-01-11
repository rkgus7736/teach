package thread;

public class ThreadWorker extends Thread{
	
	public ThreadWorker(String name) {
		super(name);
	}

	@Override
	public void run() {
		//자동으로 동시에 일이 진행되는 부분
		for(int i=0;i<10000000;i++);
		System.out.println(getName() + " exit");	
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
