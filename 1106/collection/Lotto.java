package collection;

import java.util.Arrays;
import java.util.Random;
import java.util.TreeSet;

public class Lotto {
	public static boolean checkNumber(int num, int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == num)
				return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int[] lotto1 = new int[6];
		TreeSet<Integer> lotto2 = new TreeSet<Integer>();
		Random r = new Random();
		
		for(int i=0;i<lotto1.length;i++) {
			int num = r.nextInt(45)+1;
			if(checkNumber(num, lotto1))
				i--;
			else
				lotto1[i]=num;
		}
		System.out.println(Arrays.toString(lotto1));
		System.out.println("------------------");
		while(lotto2.size() < 6)
			lotto2.add(r.nextInt(45)+1);
		System.out.println(lotto2);
		
		
	}

}









