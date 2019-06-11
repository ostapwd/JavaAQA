package Calculator;

import javax.swing.JOptionPane;

public class RunCalculator {

	public static void main(String[] args) {
		boolean command3res;
		do {
			String command = JOptionPane.showInputDialog("Select a command:");

			if (!command.equals("/") && !command.equals("*") && !command.equals("-") && !command.equals("+")) {
				String command2 = JOptionPane.showInputDialog(
						"\"Error!!! Incorrect value is typed!!!\nCommand should contain +, -, *, /.\"");
				break;
			}
			String number1 = JOptionPane.showInputDialog("Set the first number:");

			String number2 = JOptionPane.showInputDialog("Set the second number:");

			double a = Double.parseDouble(number1);
			double b = Double.parseDouble(number2);

			if (command.equals("+")) {
				double result = Calculator.addition(a, b);
				System.out.println(result);
			} else if (command.equals("-")) {
				double result = Calculator.subtract(a, b);
				System.out.println(result);
			} else if (command.equals("*")) {
				double result = Calculator.multiply(a, b);
				System.out.println(result);
			} else if (command.equals("/")) {
				double result = Calculator.division(a, b);
				System.out.println(result);
			}
           String command3 = JOptionPane.showInputDialog("Want to continue working with the calculator? (Y/N)");
            command3res = command3.equals("Y");
		} while (command3res);
	}
}
