
public class Boiler implements OnOff{
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
		System.out.println("Boiler On");
	}
	@Override
	public void powerOff() {
		power = false;
		System.out.println("Boiler Off");
	}
}




