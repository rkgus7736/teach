
public class ShortCircuit {
	public static void main(String[] args) {
		int n1 = 10, n2 = 20;
		
		boolean result = n1 > 10 && ++n2 < 30;
		System.out.println(n2);
		result = n1 >= 10 || ++n2 < 30;
		System.out.println(n2);

	}
}
