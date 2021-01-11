package generic;

public class ExtendsBoxMain {

	public static void main(String[] args) {
		ExtendsBox<Animal> box1 = new ExtendsBox<Animal>();
		box1.setData(new Animal());
		box1.printInfo();
		
		ExtendsBox<Person> box2 = new ExtendsBox<Person>();
		box2.setData(new Person());
		box2.printInfo();
	}

}





