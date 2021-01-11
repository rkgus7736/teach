
public class Light implements OnOff{
	private boolean power;
	@Override
	public void powerOnOff() {
		if(power)
			powerOff();
		else
			powerOn();
	}
	@Override
	public void powerOn() {
		power = true;
		System.out.println("Light On");
	}
	@Override
	public void powerOff() {
		power = false;
		System.out.println("Light Off");
	}
}



