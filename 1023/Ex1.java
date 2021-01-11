import javax.swing.JOptionPane;

public class Ex1 {

	public static void main(String[] args) {
		int n1, n2;
		n1 = Integer.parseInt(JOptionPane.showInputDialog("숫자 입력"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("숫자 입력"));
		System.out.println(n1 + n2);
		System.out.println(n1 - n2);
		System.out.println(n1 * n2);
		System.out.println(n1 / n2);
		System.out.println(n1 % n2);
	}

}



