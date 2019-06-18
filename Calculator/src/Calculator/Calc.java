package Calculator;

import javax.swing.JOptionPane;

public class Calc {
	public static void main(String[] args) {

		Calc calculator1 = new Calc();

		Calc calculator2 = new Calc();

		calculator1.start();
		calculator2.start();

		calculator1.start();
		calculator2.start();

	}

	double[] results = new double[10];

	public void start() {

		int index = 0;

		double c = 1.0;

		do {

			String command = JOptionPane.showInputDialog("Select a command:");
			if (command.equals("Exit")) {
				return;
			}
			System.out.println(command);

			String number1 = JOptionPane.showInputDialog("Set the first number:");
			if (number1.equals("Exit")) {
				return;
			}
			System.out.println(number1);

			String number2 = JOptionPane.showInputDialog("Set the second number:");
			if (number2.equals("Exit")) {
				return;
			}
			System.out.println(number2);

			if (command.contentEquals("print")) {
				for (index = 0; index < 10; index++) {
					System.out.println(results[index]);
				}
				return;
			}

			double a = Double.parseDouble(number1);
			double b = Double.parseDouble(number2);

			if (command.contentEquals("+")) {
				c = Calculator.add(a, b);
			} else if (command.contentEquals("-")) {
				c = Calculator.sub(a, b);
			} else if (command.contentEquals("*")) {
				c = Calculator.mul(a, b);
			} else if (command.contentEquals("/")) {
				c = Calculator.div(a, b);
			}

			results[index] = c;
			index = index + 1;

		} while (true == true);
	}
}
