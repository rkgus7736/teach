package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class ListSpeedTest {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>(100);
		LinkedList<String> list2 = new LinkedList<String>();
		Vector<String> list3 = new Vector<String>(100);
		
		long start, end;
		start = System.nanoTime();
		for(int i=0;i<100000;i++) {
			list1.add(0,String.valueOf(i));
		}
		end = System.nanoTime();
		System.out.println("ArrayList가 데이터 추가하는데 걸린 시간 : " + (end-start));
		
		start = System.nanoTime();
		for(int i=0;i<100000;i++) {
			list2.add(0,String.valueOf(i));
		}
		end = System.nanoTime();
		System.out.println("LinkedList가 데이터 추가하는데 걸린 시간 : " + (end-start));
		
		start = System.nanoTime();
		for(int i=0;i<100000;i++) {
			list3.add(0,String.valueOf(i));
		}
		end = System.nanoTime();
		System.out.println("Vector데이터 추가하는데 걸린 시간 : " + (end-start));
		
		start = System.nanoTime();
		for(int i=0;i<100000;i++) {
			list1.get(i);
		}
		end = System.nanoTime();
		System.out.println("ArrayList전체 조회 시간 : " + (end-start));
		start = System.nanoTime();
		for(int i=0;i<100000;i++) {
			list2.get(i);
		}
		end = System.nanoTime();
		System.out.println("LinkedList전체 조회 시간 : " + (end-start));
		start = System.nanoTime();
		for(int i=0;i<100000;i++) {
			list3.get(i);
		}
		end = System.nanoTime();
		System.out.println("Vector조회 시간 : " + (end-start));
		
		
		
		
	}

}











