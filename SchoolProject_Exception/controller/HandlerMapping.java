package controller;

public class HandlerMapping {
	private static HandlerMapping instance = new HandlerMapping();

	private HandlerMapping() {
	}

	public static HandlerMapping getInstance() {
		if(instance==null)
			instance = new HandlerMapping();
		return instance;
	}
	public Controller createController(int no) {
		Controller controller = null;
		switch(no) {
		case 1:
			controller = new InsertStudentController();
			break;
		case 2:
			controller = new DeleteStudentController();
			break;
		case 3:
			controller = new UpdateStudentController();
			break;
		case 4:
			controller = new SelectStudentController();
			break;
		case 5:
			controller = new SelectAllStduetnController();
			break;
		}
		return controller;
	}
	
}




