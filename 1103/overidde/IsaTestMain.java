package overidde;

public class IsaTestMain {
	public static void run(Vehicle vehicle) {
		vehicle.run();		
	}
	public static void main(String[] args) {
		Bicycle bicycle = new Bicycle();
		Vehicle vehicle = bicycle;
		vehicle = new Car();
		vehicle = new Kickboard();
		run(new Bicycle());
		run(new Kickboard());
		run(new Car());
	}

}
