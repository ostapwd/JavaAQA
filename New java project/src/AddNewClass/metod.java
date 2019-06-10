package AddNewClass;

import javax.swing.JOptionPane;

public class metod {
	public static void main(String[] args) {
		String command = JOptionPane.showInputDialog("Input action please:");

		while (!command.equals("exit")) {
			String number1 = JOptionPane.showInputDialog("Input number1 please");
			String number2 = JOptionPane.showInputDialog("Input number2 please");

			double a = Double.parseDouble(number1);
			double b = Double.parseDouble(number2);

			double result = 0;
			
			if (command.equals("+")) {
				result = Calc.plus(a, b);
			} else if (command.equals("-")) {
				result = Calc.minus(a, b);
			} else if (command.equals("*")) {
				result = Calc.mult(a, b);
			} else if (command.equals("/")){
				result = Calc.div(a, b);
			} else {
				System.out.println("unknown action ");
			}
			
			System.out.println("result " + result);
			
			command = JOptionPane.showInputDialog("Input action please:");
		}

	}

}

public class metod1 {
	public static void main1(String[] args) {

		String command = JOptionPane.showInputDialog("Action:");
		System.out.println(command);

		String number1 = JOptionPane.showInputDialog("number1");
		System.out.println(number1);

		String number2 = JOptionPane.showInputDialog("number2");
		System.out.println(number2);

		double a = Double.parseDouble(number1);
		double b = Double.parseDouble(number2);

		System.out.println(a);
		System.out.println(b);

		if (command.equals("+")) {
			double result = Calc.plus(a, b);
			System.out.println("result" + result);

		}
	}

}
