
public class Operator3 {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 10;
		
		n1++;
		System.out.println(n1);
		++n1;
		System.out.println(n1);
		
		n2--;
		System.out.println(n2);
		--n2;
		System.out.println(n2);
		System.out.println("------------------------");
		int n3 = 10;
		System.out.println(n3);
		System.out.println(n3++);
		System.out.println(n3);
		
		int n4 = 10;
		System.out.println(n4);
		System.out.println(++n4);
		System.out.println(n4);
		System.out.println("------------------------");
		
		int n5 = 10;
		int result = n5++ * 2 + n5;
		System.out.println(result);
		
	}

}




