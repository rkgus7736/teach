package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ListTest {

	public static void main(String[] args) {
		/*
		 * List
		 * 		데이터 추가된 순서가 보장
		 * 		데이터 중복 허용
		 * ArrayList(조회)   LinkedList(추가,삭제)   Vector(조회, 동기화)
		 */
		ArrayList<String> list = new ArrayList<String>();
		//추가
		list.add("A");list.add("C");list.add("B");
		list.add("A");list.add("C");list.add("B");
		//삭제
		list.remove(0);
		list.remove("C");
		//조회
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		
		for(String str : list)
			System.out.println(str);
		
		Iterator<String> it = list.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
	}

}







