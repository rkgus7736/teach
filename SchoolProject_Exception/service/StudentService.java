package service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import exception.StudentException;
import vo.Student;

public class StudentService {
	// Student 리스트 선언
	private ArrayList<Student> list;
	private static StudentService instance = new StudentService();

	// 생성자
	private StudentService() {
		super();
		list = new ArrayList<Student>();
		list.add(new Student("1001", "홍길동", "컴퓨터공학과", 4.1));
		list.add(new Student("1002", "이길동", "경제학과", 3.1));
		list.add(new Student("1003", "박길동", "전자공학과", 4.2));
		list.add(new Student("1004", "김길동", "기계공학과", 1.3));
	}

	public static StudentService getInstance() {
		if (instance == null)
			instance = new StudentService();
		return instance;
	}

	// 학생정보 추가
	public void insertStudent(Student std) throws StudentException {
		// 1. 중복된 학번이 있으면 Exception
		if (list.contains(std))
			throw new StudentException("학번이 중복되었습니다.");
		// 2. 중복된 학번이 없으면 list에 std를 추가
		list.add(std);
	}

	// 학생정보 삭제
	public void deleteStudent(Student vo) throws StudentException {
		if (list.remove(vo))
			System.out.println("데이터 삭제 성공");
		else
			throw new StudentException("데이터 삭제 실패");

	}// deleteStudent

	// 학생정보 조회
	public Student selectStudent(Student vo) {
		return list.contains(vo) ? list.get(list.indexOf(vo)) : null;
	}

	// 학생정보 전체 조회
	public void selectAllStudent() {
		// list에 데이터가 하나도 없을떄 Exception
		try {
			if (list.isEmpty())
				throw new StudentException("리스트가 비어있습니다.");
			Iterator<Student> it = list.iterator();
			while (it.hasNext()) {
				Student temp = it.next();
				temp.printStudentInfo();
				System.out.println("석차 : " + getRank(temp.getScore()));
			}
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		}
	}

	// 해당 학생 석차 구하는 부분
	public int getRank(double score) throws StudentException {
		if(score > 4.5 || score < 0.0) 
			throw new StudentException("점수가 잘못되었습니다");
		int rank = 1;

		for (int i = 0; i < list.size(); i++) {
			if (score < list.get(i).getScore())
				rank++;
		}

		return rank;
	}

}// end of class
