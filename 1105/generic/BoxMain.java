package generic;

public class BoxMain {

	public static void main(String[] args) {
		Box<Boolean> box = new Box<Boolean>();
		box.setData(true);
		System.out.println(box.getData());
		
		Box<Double> doubleBox = new Box<Double>();
		doubleBox.setData(3.1455);
		System.out.println(doubleBox.getData()+10021);
	}

}






