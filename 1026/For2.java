import javax.swing.JOptionPane;

public class For2 {
	/*
	 * 숫자 하나를 입력 받은 뒤
	 * 해당 숫자의 구구단을 출력
	 * 5를 입력
	 * 5 * 1 = 5
	 * 5 * 2 = 10
	 * 5 * 3 = 15
	 * ...
	 * 5 * 9 = 45
	 */
	public static void main(String[] args) {
		int dan = Integer.parseInt(JOptionPane.showInputDialog("단 입력"));
		
		for(int i=1;i<10;i++) {
					//          dan * i = dan * i      
			System.out.println(dan + " * " + i + " = " + dan*i);
		}
	}

}


