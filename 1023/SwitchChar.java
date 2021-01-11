
public class SwitchChar {

	public static void main(String[] args) {
		char ch = 'G';
		
		switch(ch) {
		case 'G':
			System.out.println("금메달");
			break;
		case 'S':
			System.out.println("은메달");
			break;
		case 'B':
			System.out.println("동메달");
			break;
		default:
			System.out.println("참가상");
		}
	}

}
