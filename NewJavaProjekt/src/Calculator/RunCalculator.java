package Calculator;
import javax.swing.JOptionPane;
public class RunCalculator {

	public static void main(String[] args) {

//		int resAddI = Calculator.addition(2, 2);
//		System.out.println(resAddI);
//		int resSubI = Calculator.subtract(2, 2);
//		System.out.println(resSubI);
//		int resMultI = Calculator.multiplication(2, 2);
//		System.out.println(resMultI);
//		int resDivI = Calculator.division(2, 2);
//		System.out.println(resDivI);
//		double resAddD = Calculator.addition(1.3, 2.7);
//		System.out.println(resAddD);
//		double resSubD = Calculator.subtract(0.3, 2.1);
//		System.out.println(resSubD);
//		double resMultD = Calculator.multiply(3.1, 2.2);
//		System.out.println(resMultD);
//		double resDivD = Calculator.division(2.2, 1.1);
//		System.out.println(resDivD);

		String command = JOptionPane.showInputDialog("Select a command:");
		//System.out.println(command);
		
		String number1 = JOptionPane.showInputDialog("Set the first number:");
		//System.out.println(number1);
		
		String number2 = JOptionPane.showInputDialog("Set the second number:");
		//System.out.println(number2);
		 
		double a = Double.parseDouble(number1);
		double b = Double.parseDouble(number2);
		
		//System.out.println(a);
		//System.out.println(b);
		
		if(command.equals("+")){
			double result = Calculator.addition(a, b);
		System.out.println(result);
		}
		if(command.equals("-")) {
			double result = Calculator.subtract(a, b);
			System.out.println(result);
		}
		
		
		// загнати у вайл поки юзер не введе While
		
	}
}
