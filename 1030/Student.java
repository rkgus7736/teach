
public class Student {
	private String sno;
	private String name;
	private String major;
	private int score;
	public Student(String sno, String name, String major, int score) {
		super();
		this.sno = sno;
		this.name = name;
		this.major = major;
		this.score = score;
	}

	public void printStudentInfo() {
		System.out.println("학번 : "+sno);
		System.out.println("이름 : "+name);
		System.out.println("학과 : "+major);
		System.out.println("점수 : "+score);
	}
}





