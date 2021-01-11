import javax.swing.JOptionPane;

public class IfQUest01 {

	public static void main(String[] args) {
		int n = Integer.parseInt(
				JOptionPane.showInputDialog("숫자 입력"));
		
		if(n % 2 == 0) {
			System.out.println("이 숫자는 짝수 입니다.");
		}
		if(n % 2 == 1) {
			System.out.println("이 숫자는 홀수 입니다.");
		}
	}

}

