package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class SetTest {
	/*
	 * Set
	 * 		데이터가 중복 X
	 * 		데이터가 자동 정렬
	 * 
	 * HashSet, TreeSet --> 저장하는 형태
	 */
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		//데이터 추가
		set.add("Hello");
		set.add("JAVA");
		set.add("C");
		set.add("C++");
		set.add("Hello");
		set.add("JAVA");
		set.add("ABC");
		System.out.println(set.toString());		
		//삭제
		set.remove("C");
		System.out.println(set.toString());
		//저장되어 있는 데이터 개수
		System.out.println(set.size());
		//해당 데이터가 Set에 저장되어 있는지 확인
		System.out.println(set.contains("JAVA"));
		//전부 삭제
//		set.clear();
		//set에 내용이 비어있느냐?
		System.out.println(set.isEmpty());
		//set에 등록된 내용을 배열로 변환해서 리턴
		Object[] arr = set.toArray();
		System.out.println(Arrays.toString(arr));
		
		Iterator<String> it = set.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	
		
	}

}





