package desafios;

import javax.swing.JOptionPane;

public class gui {
	public static void main(String[] args) {
		String firstNumber = JOptionPane.showInputDialog("Enter First Number  : ");
		String SecondtNumber = JOptionPane.showInputDialog("Enter Second Number  : ");
		
		
		int number1 = Integer.parseInt(firstNumber);
		int number2 = Integer.parseInt(SecondtNumber);
		
		int sum = number1 + number2;
		
		
		JOptionPane.showMessageDialog(null, "The sum is " + sum + "sum of two integer ", null, JOptionPane.PLAIN_MESSAGE, null);
	}

}
