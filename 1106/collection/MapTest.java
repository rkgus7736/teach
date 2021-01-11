package collection;

import java.util.HashMap;
import java.util.Iterator;

public class MapTest {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		//데이터 추가
		map.put("A",100);
		map.put("B",340);
		map.put("C",660);
		map.put("D",330);
		map.put("A",230);
		//데이터 조회
		System.out.println(map.get("A"));
		System.out.println(map.get("B"));
		System.out.println(map.get("C"));
		System.out.println(map.get("D"));
		//맵에있는 모든 데이터 조회
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + " "+map.get(key));
		}
		//데이터 개수
		System.out.println(map.size());
		//데이터가 있는지 확인
		System.out.println(map.containsKey("B"));//해당 키값이 있는지 확인
		System.out.println(map.containsValue(340));//해당 값이 있는지 확인
		map.remove("A");//키값으로 삭제
		map.clear();//비우기
		map.isEmpty();//맵에 내용이 없는지 확인
		
	}

}










