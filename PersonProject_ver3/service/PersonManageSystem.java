package service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import vo.Person;

//Person 정보를 관리하는 시스템
public class PersonManageSystem {

	// Person ArrayList 선언
	private ArrayList<Person> list;

	private static PersonManageSystem instance = new PersonManageSystem();

	// 생성자
	private PersonManageSystem() {
		// 리스트 생성 - 요소가 30개 저장되겠끔 할당
		list = new ArrayList<Person>(30);
		// 리스트에 객체 추가
		list.add(new Person("홍길동", 30));
		list.add(new Person("김철수", 23));
		list.add(new Person("박현우", 19));
	}

	public static PersonManageSystem getInstance() {
		if (instance == null)
			instance = new PersonManageSystem();
		return instance;
	}

	// Person 정보 등록
	public void insertPerson(Person p) {
		// 리스트에 추가
		list.add(p);
	}

	// Person 정보 삭제
	public void deletePerson(String name) {
		// 리스트 처음부터 끝까지 접근
//		for(int i=0;i<list.size();i++) {
//			if(list.get(i).equals(name)) 
//				list.remove(i);
//		}
		list.remove(new Person(name,0));
	}

	// Person 정보 전체 조회
	public void selectAllPerson() {
		// 전체 Person의 printInfo 실행
		Iterator<Person> it = list.iterator();
		while (it.hasNext())
			it.next().printInfo();
	}

	// Person 정보 조회
	// 특정 Person 정보를 조회
	// Person 이름을 이용해서 검색
	// 입력한 이름을 가진 Person을 검색
	public Person selectPerson(Person p) {
		/*
		//반복문 버전
		for (Person p : list) {
			if (p.equals(name))
				return p;
		}
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(name))
				return list.get(i);
		}
		return 0;
		*/
//		return list.indexOf(name) != -1 ? list.get(list.indexOf(name)) : null ;
		//삼항연산자 이용 부분
		return list.contains(p) ? list.get(list.indexOf(p)) : null;
	}
}
