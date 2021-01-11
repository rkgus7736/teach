
public class Student {
	//학번
	String sno;
	//이름
	String name;
	//전공
	String major;
	//평점
	double score;
	
	//초기화
	public void init(String s,String n, String m, double sc) {
		sno = s;
		name = n;
		major = m;
		score = sc;
	}
	//학생 정보 출력
	public void printStudentInfo() {
		System.out.println("학번 : "+sno);
		System.out.println("이름 : "+name);
		System.out.println("전공 : "+major);
		System.out.println("평점 : "+getGrade()+"("+score+")");
	}
	public String getGrade() {
		if(score == 4.5)
			return "A+";
		else if(score >= 4.0)
			return "A";
		else if(score >= 3.5)
			return "B+";
		else if(score >= 3.0)
			return "B";
		else if(score >= 2.5)
			return "C+";
		else if(score >= 2.0)
			return "C";
		else if(score >= 1.0)
			return "D";
		else
			return "F";
	}
}





