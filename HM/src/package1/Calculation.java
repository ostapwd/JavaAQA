package package1;

import javax.swing.JOptionPane;



public class Calculation {
	
	public static void main(String[] args) {
		
		Calculation c1 = new Calculation();
		Calculation c2 = new Calculation();
		
		c1.start();
		c2.start();
		
		c1.start();
		c2.start();
		
		
		
	}
	
	double[] results = new double[10];
	
	public void start() {

		

		int i = 0;

		while (10 > 5) {

			String command = JOptionPane.showInputDialog("Select a command:");
			System.out.println(command);

			if (command.equals("+") || command.equals("-") || command.equals("*") || command.equals("/")
					|| command.equals("e") || command.equals("print")) {

				System.out.println("Command is validated");
				
			} 
				
			 else {
				System.out.println("WRONG COMMAND!!!");

				return; // закінчує роботу даного метода!!!!
			}

			if (command.equals("e")) {

				return;

			}
			
			if (command.equals("print")) {
				
				System.out.println(results[0]);
				System.out.println(results[1]);
				System.out.println(results[2]);
				System.out.println(results[3]);
				System.out.println(results[4]);
				System.out.println(results[5]);
				System.out.println(results[6]);
				System.out.println(results[7]);
				System.out.println(results[8]);
				System.out.println(results[9]);
				
				return;
			}

			String number1 = JOptionPane.showInputDialog("Set the 1st number:");
			// System.out.println(number1);

			if (number1.equals("e")) {

				return;

			}

			String number2 = JOptionPane.showInputDialog("Set the 2nd number:");
			// System.out.println(number2);

			if (number2.equals("e")) {

				return;

			}

			double a = Double.parseDouble(number1);
			double b = Double.parseDouble(number2);

			// System.out.println(a);
			// System.out.println(b);

			if (command.equals("+")) {

				double resultAdd = Calculator.add(a, b);
				results[i] = resultAdd;
				System.out.println("Result = " + resultAdd);

			}

			else if (command.equals("-")) {

				double resultSub = Calculator.sub(a, b);
				results[i] = resultSub;
				System.out.println("Result = " + resultSub);

			}

			else if (command.equals("*")) {

				double resultMul = Calculator.mul(a, b);
				results[i] = resultMul;
				System.out.println("Result = " + resultMul);
			}

			else if (command.equals("/")) {

				double resultDiv = Calculator.div(a, b);
				results[i] = resultDiv;
				System.out.println("Result = " + resultDiv);
			}

			else {
				System.out.println("WRONG COMMAND");

			}

			i = i + 1;

		}

	}/// HOMEWORK: create command Print to print all elements of array in the
		/// console!!!!!!!!!!
}
