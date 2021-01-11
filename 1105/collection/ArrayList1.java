package collection;

import java.util.ArrayList;

public class ArrayList1 {
	/*
	 * 리스트 특징
	 * 		데이터가 추가된 순서대로 저장
	 * 		중복된 데이터도 추가 됨
	 */
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>(10);
		list1.add("A");
		list1.add("C");
		list1.add("E");
		list1.add("D");
		list1.add("A");
		list1.add("E");
		
		System.out.println(list1);
		System.out.println(list1.toString());
		
		list1.add(2, "F");//2번 인덱스에 F를 저장
		System.out.println(list1);
		
		//2번 인덱스 삭제
		list1.remove(2); 
		System.out.println(list1);
		list1.remove("E");//객체 비교를 이용해서 삭제가 가능
		System.out.println(list1);
		
		System.out.println(list1.get(4));
	}

}





