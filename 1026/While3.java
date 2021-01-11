import javax.swing.JOptionPane;

public class While3 {
//	숫자 하나 입력 후
//	입력한 숫자만큼 Hello World 출력
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("숫자 입력"));
		
		while(num > 0) {
			System.out.println("Hello World");
			num--;
		}

	}

}




