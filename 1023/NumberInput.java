import javax.swing.JOptionPane;
public class NumberInput {
	public static void main(String[] args) {
		int num;
		num = Integer.parseInt(
				JOptionPane.showInputDialog("숫자 입력"));
		System.out.println(num);
		
		String name;
		name = JOptionPane.showInputDialog("이름 입력");
		System.out.println(name);
	}

}




