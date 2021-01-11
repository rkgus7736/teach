package generic;

public class ObjectMain {
	/*
	 * Object Type으로 보관을 못하는 이유는
	 * 꺼낼때 타입을 다시 형변환
	 */
	public static void main(String[] args) {
		ObjectBox box = new ObjectBox();
		box.setData(30);
		
		System.out.println(box.getData().getClass());
//		System.out.println(box.getData() + 100);
	}

}
