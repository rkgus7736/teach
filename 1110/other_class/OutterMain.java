package other_class;

public class OutterMain {

	public static void main(String[] args) {
		OutterClass outterClass = new OutterClass(10);
		OutterClass.InnerClass innerClass = outterClass.new InnerClass();
		innerClass.printNum();
		outterClass.runInnerClass();
	}

}
