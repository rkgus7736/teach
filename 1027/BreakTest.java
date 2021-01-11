import javax.swing.JOptionPane;

public class BreakTest {
	/*
	 *  	무한 루프
	 *  		숫자를 입력 받은 뒤
	 *  		입력 받은 숫자가 -1일때까지 입력을 받고
	 *  
	 *		입력 받은 숫자들 중 제일 큰값을 출력
	 * 
	 */
	public static void main(String[] args) {
		int max=-1;
		while(true) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("숫자 입력"));
			if(num == -1)
				break;
			if(num > max)
				max = num;				
		}
		System.out.println(max);
	}

}






