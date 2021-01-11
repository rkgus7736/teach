package overloading;

public class OverloadingTest {
	public static int plus(int n1, int n2) {
		System.out.println("plus(int n1, int n2)");
		return n1 + n2;
	}
	public static double plus(double d1, double d2) {
		System.out.println("plus(double d1, double d2)");
		return d1 + d2;
	}
	public static int plus(int n1, int n2, int n3) {
		System.out.println("plus(int n1,int n2,int n3)");
		return n1 + n2 + n3;
	}
	public static void main(String[] args) {
		System.out.println(plus(3.1415, 4.43256));
		System.out.println(plus(10, 20));
		System.out.println(plus(10, 20, 30));
	}

}




