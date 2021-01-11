package other_class;

public class AbstractMain {

	public static void main(String[] args) {
		int num=100;
		AbstractClass abClass = new AbstractClass() {
			
			@Override
			public void test() {
				System.out.println("test");
				System.out.println(num);//이렇게까지는 쓰지 않음
			}
		};
		abClass.test();
	}

}




