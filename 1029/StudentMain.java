
public class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.init("114432", "홍길동", "경영학과", 3.6);
		s1.printStudentInfo();
		Student s2 = new Student();
		s2.init("234432", "김철수", "게임학과", 4.5);
		s2.printStudentInfo();
	}

}
