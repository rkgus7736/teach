package collection;

import java.util.HashSet;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		HashSet<Integer> hset = new HashSet<Integer>();
		TreeSet<Integer> tset = new TreeSet<Integer>();
		
		hset.add(10);hset.add(7);hset.add(9);hset.add(10);hset.add(13);
		hset.add(21);hset.add(37);hset.add(19);hset.add(41);hset.add(54);
		tset.add(10);tset.add(7);tset.add(9);tset.add(10);tset.add(13);
		tset.add(21);tset.add(37);tset.add(19);tset.add(41);tset.add(54);
		
		System.out.println(hset);
		System.out.println(tset);
	}

}








