import javax.swing.JOptionPane;

public class ScoreIF {

	public static void main(String[] args) {
		int score = Integer.parseInt(
				JOptionPane.showInputDialog("성적을 입력하세요"));
		/*
		 * 90~100 성적 등급 : A
		 * 80~89  성적 등급 : B
		 * 70~79  성적 등급 : C
		 * 60~69  성적 등급 : D
		 * 0 ~59  성적 등급 : F
		 */
		char grade = 'F';
		if(score > 89) {
			grade = 'A';
		}else if(score > 79) {
			grade = 'B';
		}else if(score > 69) {
			grade = 'C';
		}else if(score > 59) {
			grade = 'D';
		}
		System.out.println("성적 등급 : "+grade);
	}
}





