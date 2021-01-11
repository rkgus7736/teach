package other_class;
/*
 *  	InnerClass
 *  		클래스 안에 또 다른 클래스를 정의
 */
public class OutterClass {
	private int num;
	private InnerClass inClass;
	public OutterClass(int num) {
		this.num = num;
		inClass = new InnerClass();
	}
	
	public void runInnerClass() {
		inClass.printNum();
	}
	//static을 쓰면 Outter클래스의 non static에 접근할수 없다.
	public class InnerClass{
		
		public InnerClass() {
			System.out.println("InnerClass Constructor");
		}

		public void printNum() {
			System.out.println(num);
		}
	}
}







