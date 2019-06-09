package AddNewClass;
import javax.swing.JOptionPane;

public class metod {
	public static void main(String[] args) {
		String command = JOptionPane.showInputDialog("Action:");
		System.out.println(command);
		
		String number1  = JOptionPane.showInputDialog("number1");
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
