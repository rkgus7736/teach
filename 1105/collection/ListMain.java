package collection;

import java.util.ArrayList;
import java.util.Iterator;


public class ListMain {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		
		list.add(new Person("홍길동", 20));
		list.add(new Person("김철수", 30));
		list.add(new Person("이기영", 44));
		list.add(new Person("황후식", 56));
		
		//객체비교 삭제시 equals를 자동으로 호출
		list.remove(new Person("이기영",44));
		//현재 저장된 값의 개수
		System.out.println(list.size());
		//해당값이 있는지?
		System.out.println(list.contains(new Person("황후식",56)));
		//리스트가 비어 있느냐?
		System.out.println(list.isEmpty());
		//황후식이라는 사람이 있는 인덱스값
		System.out.println(list.indexOf(new Person("황후식",56)));
		//결과가 -1 해당 검색 결과가 없음
		System.out.println(list.indexOf(new Person("황후식1",56)));
		//리스트에 있는 내용을 전부 비움
//		list.clear();
		System.out.println(list.isEmpty());
		
		//전체조회 - 1, for
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).toString());
		}
		System.out.println("------------------");
		//전체조회 - 2, for-each
		for(Person p : list) {
			System.out.println(p.toString());
		}
		System.out.println("------------------");
		//전체조회 - 3, Iterator
		Iterator<Person> it = list.iterator();
		while(it.hasNext()) {//다음 데이터가 있냐?
			System.out.println(it.next());//다음위치 이동한 다음에 그 값을 리턴
		}
		System.out.println("------------------");
			
		
	}

}















