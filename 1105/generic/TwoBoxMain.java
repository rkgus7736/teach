package generic;

public class TwoBoxMain {

	public static void main(String[] args) {
		TwoGenericBox<String, Integer> box = new TwoGenericBox<String, Integer>();
		box.setData1("문자열");
		box.setData2(300);
		System.out.println(box.getData1() + " " + box.getData2());
	}
	
	
}
