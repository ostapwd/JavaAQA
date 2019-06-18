package Calculator;

import javax.swing.JOptionPane;

public class RunCalculator {

public static void main(String[] args) {
	RunCalculator calculator1 = new RunCalculator();
	RunCalculator calculator2 = new RunCalculator();
	calculator1.start();
//	calculator2.start();
//	calculator1.start();
//	calculator2.start();
}
    double[] arrayresult = new double[10];
	public void start() {
		int i = 0;
		boolean command3res;
		do {
			if (i >= 1) {
				String command4 = JOptionPane.showInputDialog(null, "Do you want to print your results? Y/N",
						"My title", 1);
				if (command4.equals("Y")) {
					for (i = 0; i < arrayresult.length; i++) {
						System.out.println(arrayresult[i]);
					}
				}
			}
			String command = JOptionPane.showInputDialog(null, "Select a command:", "My title", 0);

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
				System.out.println(result);
			} else if (command.equals("-")) {
				result = Calculator.subtract(a, b);
				System.out.println(result);
			} else if (command.equals("*")) {
				result = Calculator.multiply(a, b);
				System.out.println(result);
			} else {
				result = Calculator.division(a, b);
				System.out.println(result);
			}
			System.out.println(i);
			arrayresult[i] = result;
			i++;
			String command3 = JOptionPane.showInputDialog("Want to continue working with calculator? (Y/N)");
			command3res = command3.equals("Y");
		} while (command3res);

		System.out.println(arrayresult[i]);
	}
}

