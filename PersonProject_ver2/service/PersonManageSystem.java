package service;
import java.util.Arrays;
import java.util.Scanner;

import vo.Person;

//Person 정보를 관리하는 시스템
public class PersonManageSystem {
	
	// Person 배열 선언
	private Person[] arr;
	// 배열 인덱스 - index
	private int index;

	private static PersonManageSystem instance = new PersonManageSystem();
	// 생성자
	private PersonManageSystem() {
		// 배열 생성
		arr = new Person[7];
		// 배열에 객체 생성
		arr[index++] = new Person("홍길동", 30);
		arr[index++] = new Person("김철수", 23);
		arr[index++] = new Person("박현우", 19);
	}
	public static PersonManageSystem getInstance() {
		if(instance == null)
			instance = new PersonManageSystem();
		return instance;
	}
	

	// Person 정보 등록
	public void insertPerson(Person p) {
		if (index == arr.length) {// 배열에 빈공간이 없다.
			// 배열의 크기 늘림
			arr = Arrays.copyOf(arr, arr.length + 5);
		}
		// 배열에 추가
		arr[index++] = p;
	}

	// Person 정보 삭제
	public void deletePerson(String name) {
		
		for(int i=0;i<index;i++) {
//			if(name.equals(arr[i].getName()){ name == arr[i].getName()
			if(arr[i].getName().equals(name)) {//arr[i].getName() == name
				//삭제
				for(;i<index-1;i++)
					arr[i] = arr[i+1];
				System.out.println(name + " 삭제 완료");
				index--;
				return;
			}
		}
		System.out.println(name + "에 해당하는 데이터가 없습니다.");
	}
	
	// Person 정보 전체 조회
	public void selectAllPerson() {
		// 전체 Person의 printInfo 실행
		for (int i = 0; i < index; i++)
			arr[i].printInfo();
	}

	// Person 정보 조회
	// 특정 Person 정보를 조회
	// Person 이름을 이용해서 검색
	// 입력한 이름을 가진 Person을 검색
	public Person selectPerson(String name) {
		// 반복문 처음부터 index 전까지
		for (int i = 0; i < index; i++) {
			// 배열에 있는 내용을 비교 equals
			if (name.equals(arr[i].getName())) {
				return arr[i];
			}
		}
		return null;

	}
}

