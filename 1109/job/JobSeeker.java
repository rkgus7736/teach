package job;

public class JobSeeker extends Thread{

	public JobSeeker(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				System.out.println(getName() + "가 직업정보 수신을 대기중입니다.");
				String msg = JobInfo.getInstance().getJobInfo();
				if(msg == null) {
//					System.out.println("이미 다른 누군가가 수신해 갔습니다.");
				}else {
					System.out.println(msg + "는 " + getName() +"님이 수신했습니다.");
					System.out.println(getName() + "구직자 지원 종료");
					return;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}






