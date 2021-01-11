
public class StudentMain {

	public static void main(String[] args) {
		Student student = new Student("2014505","홍길동","게임학과",78);
//		Student std = new Student();//기본생성자는 생성자를 직접만들면 자동 추가 안됨
		student.printStudentInfo();
	}

}
