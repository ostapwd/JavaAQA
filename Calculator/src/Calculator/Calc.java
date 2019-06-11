package Calculator;

import javax.swing.JOptionPane;

public class Calc {
	public static void main(String[] args) {
		 
		double c = 1.0;
		
		do {
		
		String command = JOptionPane.showInputDialog("Select a command:");
		while(command.contentEquals("Exit")) {
			System.exit(1);
		}
		System.out.println(command);	
		
		String number1 = JOptionPane.showInputDialog("Set the first number:");
		while(number1.contentEquals("Exit")) {
			System.exit(1);
		}
		System.out.println(number1);
		
		String number2 = JOptionPane.showInputDialog("Set the second number:");
		while(number2.contentEquals("Exit")) {
			System.exit(1);
		}
		System.out.println(number2);

		double a = Double.parseDouble(number1);
		double b = Double.parseDouble(number2);
		
		
			if(command.contentEquals("+")) {
			double result = Calculator.add(a, b);
			}
			else if(command.contentEquals("-")) {
			double result = Calculator.sub(a, b);
			}
			else if(command.contentEquals("*")) {
			double result = Calculator.mul(a, b);
			}
			else if(command.contentEquals("/")) {
			double result = Calculator.div(a, b);
			}
		} 
		while (c > Double.MIN_VALUE);
		
	}
	
}

