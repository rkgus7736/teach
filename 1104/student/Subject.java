package student;

public class Subject {
	// 과목명
	protected String subjectName;
	// 점수
	protected int score;

	// 생성자
	public Subject(String subjectName, int score) {
		this.subjectName = subjectName;
		this.score = score;
	}

	// 과목정보
	public void printInfo() {
		System.out.println("과목명 : " + subjectName + ", 점수 : " + score);
	}

}



