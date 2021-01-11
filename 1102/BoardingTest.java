
public class BoardingTest {

	public static void main(String[] args) {
		Student student = new Student(50000);
		Bus bus1 = new Bus();
		Bus bus2 = new Bus();
		Bus bus3 = new Bus();
		
		Metro metro1 = new  Metro();
		Metro metro2 = new  Metro();
		Metro metro3 = new  Metro();

		student.boardingBus(bus1);
		student.boardingBus(bus1);
		student.boardingBus(bus2);
		student.boardingMetro(metro1);
		student.boardingMetro(metro2);
		student.boardingMetro(metro2);
		student.boardingMetro(metro3);
		student.boardingMetro(metro1);
		
		bus1.printBusInfo();
		System.out.println("-------------");
		bus2.printBusInfo();
		System.out.println("-------------");
		bus3.printBusInfo();
		System.out.println("-------------");
		
		metro1.printMetroInfo();
		System.out.println("-------------");
		metro2.printMetroInfo();
		System.out.println("-------------");
		metro3.printMetroInfo();
	}

}




