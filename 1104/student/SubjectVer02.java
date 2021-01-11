package student;

public class SubjectVer02 extends Subject{
	private char grade;

	public SubjectVer02(String subjectName, int score) {
		super(subjectName, score);
		if(score >= 90)
			grade = 'A';
		else if(score >= 80)
			grade = 'B';
		else if(score >= 70)
			grade = 'C';
		else if(score >= 60)
			grade = 'D';
		else
			grade = 'F';
	}
	
	@Override
	public void printInfo() {
		System.out.println("과목명 : " + subjectName + 
				", 점수 : " + score+", 성적 등급 : "+grade);
	}
	
	
}








