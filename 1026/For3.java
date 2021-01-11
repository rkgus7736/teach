import javax.swing.JOptionPane;

public class For3 {
	/*
	 * 숫자 입력 후
	 * 입력한 숫자의 약수들을 출력
	 * 10 입력
	 * 1
	 * 2
	 * 5
	 * 10
	 */
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("숫자 입력"));
		System.out.println(num + "의 약수 목록");
		for(int i=1;i<=num;i++) {
			if(num % i == 0)
				System.out.println(i);
		}
	}

}
