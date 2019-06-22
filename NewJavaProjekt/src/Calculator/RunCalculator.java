package Calculator;

import arrayClass.arrayClass;
import javax.swing.JOptionPane;

public class RunCalculator {

	public static void main(String[] args) {
		RunCalculator calculator1 = new RunCalculator();
		RunCalculator calculator2 = new RunCalculator();
		calculator1.start();
	}

	arrayClass arrayresult = new arrayClass();

	public void start() {
		int i = 0;
		boolean command3res;
		do {
			if (i >= 1) {
				String command4 = JOptionPane.showInputDialog("Do you want to print your results? Y/N");
				if (command4.equals("Y")) {
					for (i = 0; i < arrayresult.getLength(); i++) {
						System.out.println(arrayresult.get(i));
					}
					break;
				}
			}
			String command = JOptionPane.showInputDialog("Select a command:");

			if (!command.equals("/") && !command.equals("*") && !command.equals("-") && !command.equals("+")) {
				String command2 = JOptionPane.showInputDialog(
						"\"Error!!! Incorrect value is typed!!!\nCommand should contain +, -, *, /.\n ");
				break;
			}
			String number1 = JOptionPane.showInputDialog("Set the first number:");
			String number2 = JOptionPane.showInputDialog("Set the second number:");

			double a = Double.parseDouble(number1);
			double b = Double.parseDouble(number2);
			double result;
			if (command.equals("+")) {
				result = Calculator.addition(a, b);
			} else if (command.equals("-")) {
				result = Calculator.subtract(a, b);
			} else if (command.equals("*")) {
				result = Calculator.multiply(a, b);
			} else {
				result = Calculator.division(a, b);
			}
			arrayresult.add(result);
			i++;
			String command3 = JOptionPane.showInputDialog("Want to continue working with calculator? (Y/N)");
			command3res = command3.equals("Y");
		} while (command3res);

//		System.out.println(arrayresult.getIndex());
	}
}
