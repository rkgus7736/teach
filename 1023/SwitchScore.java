import javax.swing.JOptionPane;

public class SwitchScore {

	public static void main(String[] args) {
		int score = Integer.parseInt(
				JOptionPane.showInputDialog("점수 입력"));
		/*
		 * 95~100 A+
		 * 90~ 94 A
		 * 85~ 89 B+
		 * 80~ 84 B
		 * 75~ 79 C+
		 * 70~ 74 C
		 * 60~ 69 D
		 * 0 ~ 59 F
		 */
		String grade = "F";
		switch(score / 5) {
		case 20:
		case 19:
			grade = "A+";
			break;
		case 18:
			grade = "A";
			break;
		case 17:
			grade = "B+";
			break;
		case 16:
			grade = "B";
			break;
		case 15:
			grade = "C+";
			break;
		case 14:
			grade = "C";
			break;
		case 13:
		case 12:
			grade = "D";
			break;
		}
		System.out.println("성적 등급 : "+grade);
		
	}

}










