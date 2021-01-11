package collection;

public class Box {
	private String lucky;
	private int hashcode;

	public Box(String lucky, int hashcode) {
		this.lucky = lucky;
		this.hashcode = hashcode;
	}

	@Override
	public String toString() {
		return lucky;
	}
	
	
	
	
}
