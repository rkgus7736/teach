package service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import vo.Student;

public class StudentService {
	//Student 리스트 선언
	private ArrayList<Student> list;
	private static StudentService instance = new StudentService();
	//생성자
	private StudentService() {
		super();
		list = new ArrayList<Student>();
		list.add(new Student("1001", "홍길동","컴퓨터공학과", 4.1));
		list.add(new Student("1002", "이길동","경제학과", 3.1));
		list.add(new Student("1003", "박길동","전자공학과", 4.2));
		list.add(new Student("1004", "김길동","기계공학과", 1.3));
	}
	public static StudentService getInstance() {
		if(instance == null)
			instance = new StudentService();
		return instance;
	}
	
	//학생정보 추가
	public void insertStudent(Student std) {
		list.add(std);
	}
	//학생정보 삭제
	public void deleteStudent(Student vo) {
		if(list.remove(vo))
			System.out.println("데이터 삭제 성공");
		else
			System.out.println("데이터 삭제 실패");
	
	}//deleteStudent

	//학생정보 조회
	public Student selectStudent(Student vo) {
		return list.contains(vo) ? list.get(list.indexOf(vo)): null;
	}
	//학생정보 전체 조회
	public void selectAllStudent() {
		Iterator<Student> it = list.iterator();
		while(it.hasNext()) {
			Student temp = it.next();
			temp.printStudentInfo();
			System.out.println("석차 : "+getRank(temp.getScore()));
		}
	}
	
	//해당 학생 석차 구하는 부분
	public int getRank(double score) {
		int rank = 1;
		
		for(int i=0;i<list.size() ;i++) {
			if(score < list.get(i).getScore())
				rank++;
		}
				
		return rank;
	}
	
}//end of class







