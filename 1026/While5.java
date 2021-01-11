import javax.swing.JOptionPane;

public class While5 {
	/*
	 * 숫자를 0을 입력할때까지 숫자를 입력받고
	 * 입력한 숫자들의 총합을 출력 
	 */
	public static void main(String[] args) {
		int num=1;
		int sum=0;
		
		while(num != 0) {
			num = Integer.parseInt(JOptionPane.showInputDialog("숫자 입력"));
			sum += num;			
		}
		System.out.println("입력하신 숫자들의 총합 : "+sum);
	}

}


