
public class Variable3 {

	public static void main(String[] args) {
		char ch = 'A';
		int n = ch;
		System.out.println(ch);
		System.out.println(n);
		ch = 'Z';
		n = ch;
		System.out.println(ch);
		System.out.println(n);
		ch = ' ';
		n = ch;
		System.out.println(ch);
		System.out.println(n);
		ch = '가';
		ch = '\uAC00';
		n = ch;
		System.out.println(ch);
		System.out.println(n);
	}

}
