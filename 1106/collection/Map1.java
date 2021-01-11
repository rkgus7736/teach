package collection;

import java.util.HashMap;
import java.util.Scanner;

public class Map1 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		Scanner sc = new Scanner(System.in);
		
		map.put("apple","사과");
		map.put("paper","종이");
		map.put("flower","꽃");
		
		String voca;
		System.out.print("알고 싶은 단어를 입력하세요 : ");
		voca = sc.nextLine();
		System.out.println(map.get(voca));
	}

}







