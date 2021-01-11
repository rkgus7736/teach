
public class TV {
	private boolean power;
	private int channel; // 1~500
	private int volume;	 // 0~40
	private boolean mute;

	public TV() {
		channel = 23;
		volume = 15;
	}
	//전원OnOff true -> Tv On,  false -> Tv Off
	public void powerOnOff() {
		power = !power;
		if(power)
			System.out.println("TV On");
		else
			System.out.println("TV Off");
	}
	
	//음소거OnOff
	public void muteOnOff() {
		mute = !mute;
		if(mute)
			System.out.println("음소거 활성화");
		else
			System.out.println("음소거 비활성화");
	}
	//채널Up
	public void channelUp() {
		if(channel < 500)
			channel++;
		else
			channel = 1;			
		System.out.println("현재 채널 : "+channel);
	}
	//채널Down
	//음량Up
	//음량Down
	
}



