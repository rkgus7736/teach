package bit;

public class BitOperator {

	public static void main(String[] args) {
		int n1 = 15;
		int n2 = 20;							// 8421
		// 15 - 0000 0000 0000 0000 0000 0000 0000 1111 
		// 20 - 0000 0000 0000 0000 0000 0000 0001 0100
		//bit - and
		//and - 0000 0000 0000 0000 0000 0000 0000 0100 - 4
		System.out.println(n1 & n2);
		//bit - or
		// or - 0000 0000 0000 0000 0000 0000 0001 1111 - 31
		System.out.println(n1 | n2);
		//bit - xor
		//xor - 0000 0000 0000 0000 0000 0000 0001 1011 - 27
		System.out.println(n1 ^ n2);
		//bit - not
		//not - 1111 1111 1111 1111 1111 1111 1111 0000
		System.out.println(~n1);
		
	}

}




