import javax.swing.JOptionPane;

public class While4 {
	/*
	 * 숫자 5개를 입력받아서 입력한 숫자의 평균을 출력
	 */
	public static void main(String[] args) {
		int i=0;
		int sum = 0;
		while(i<5) {
			int n = Integer.parseInt(JOptionPane.showInputDialog("숫자 입력"));
			sum += n;
			i++;
		}
		System.out.println(sum/5.0);
	}

}




