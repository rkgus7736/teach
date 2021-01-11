package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class BoxMain {
	public static final int FRIST_BOX = 1;
	public static final int SECOND_BOX = 10;
	public static final int THIRD_BOX = 30;
	public static final int NONE_BOX = 3999;
	
	public static void main(String[] args) {
		HashSet<Box> set = new HashSet<Box>(); 
		int max = FRIST_BOX + SECOND_BOX + THIRD_BOX + NONE_BOX;
		Random r = new Random();
		int arr[] = {FRIST_BOX, SECOND_BOX, THIRD_BOX, NONE_BOX};
		while(set.size() != max) {
			int no = r.nextInt(arr.length);
			if(arr[no] == 0) continue;
			switch(no) {
				case 0:
					set.add(new Box("1등 당첨", r.nextInt()));
					arr[no]--;
					break;
				case 1:
					set.add(new Box("2등 당첨", r.nextInt()));
					arr[no]--;
					break;
				case 2:
					set.add(new Box("3등 당첨", r.nextInt()));
					arr[no]--;
					break;
				default:
					set.add(new Box("낙첨", r.nextInt()));
					arr[no]--;
					break;
			}
					
		}
		ArrayList<Box> list = new ArrayList<Box>(set);
		System.out.println(list.size());
		ArrayList<Box> bbob = new ArrayList<Box>();
		while(bbob.size() != 10) {
			int i = r.nextInt(list.size());
			bbob.add(list.get(i));
			list.remove(i);
		}
		for(Box box : bbob){
			System.out.println(box.toString());
		}
	}

}






