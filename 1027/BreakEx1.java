
public class BreakEx1 {

	public static void main(String[] args) {
		int i=1, sum=0;
		while(true) {
			sum += i;
			i++;
			if(sum >= 10000)
				break;
		}
		System.out.println(sum);
	}

}
