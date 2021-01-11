package string;

public class StringTest {

	public static void main(String[] args) {
		String str = "Hello World";
		System.out.println(System.identityHashCode(str));
		str = str.replace("Hello", "JAVA");
		System.out.println(System.identityHashCode(str));
		System.out.println(str);
		System.out.println("--------------------------");
		StringBuffer buffer = new StringBuffer("Hello World");
		System.out.println(buffer);
		System.out.println(System.identityHashCode(buffer));
		buffer.replace(0, "Hello".length(), "JAVA");
		System.out.println(System.identityHashCode(buffer));
		System.out.println(buffer);
		
	}

}





