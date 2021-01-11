package student;

public class Student {
	private String sno;
	private String name;
	private Subject subject;
	
	public Student(String sno, String name, Subject subject) {
		this.sno = sno;
		this.name = name;
		this.subject = subject;
	}
	
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	public void printInfo() {
		System.out.println("학번 : "+sno+", 이름 : "+name);
		subject.printInfo();
	}
	
	
}



