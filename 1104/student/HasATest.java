package student;

public class HasATest {

	public static void main(String[] args) {
		Subject s1 = new Subject("국어", 78);
		Subject s2 = new Subject("수학", 88);
		Subject s3 = new Subject("영어", 62);
		Subject s4 = new Subject("과학", 91);
		
		Student student = new Student("09114211", "홍길동", s1);
		student.printInfo();
		student.setSubject(s2);
		student.printInfo();
		student.setSubject(new Subject("프랑스어",77));
		student.printInfo();
		SubjectVer02 s5 = new SubjectVer02("경제", 87);
		student.setSubject(s5);
		student.printInfo();
	}

}







