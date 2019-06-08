package pg;

import javax.swing.JOptionPane;

public class Calc {
	public static void main(String[] args) {
		String command = JOptionPane.showInputDialog("Select a command:");
		System.out.println(command);

		String number1 = JOptionPane.showInputDialog("Set the first number:");
		System.out.println(number1);

		String number2 = JOptionPane.showInputDialog("Set the second number:");
		System.out.println(number2);

		double a = Double.parseDouble(number1);
		double b = Double.parseDouble(number2);

		System.out.println(a);
		System.out.println(b);

		if (command.equals("+")) {
			double result = Calculator.addition(a, b);
			System.out.println("Result = " + result);
		} else if (command.equals("-")) {
			double result = Calculator.subtract(a, b);
			System.out.println("Result = " + result);
		} else {
			System.out.println("ENTRED WRONMG ACTION!!!");
		}

	}
}
