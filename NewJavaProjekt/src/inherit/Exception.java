package inherit;
import javax.swing.JOptionPane;
public class Exception {
	public static void main(String[] args) {
			
			String number1 = JOptionPane.showInputDialog("Set the first number:");
			String number2 = JOptionPane.showInputDialog("Set the second number:");

			int a = Integer.parseInt(number1);
			int b = Integer.parseInt(number2);
			int [] arr = new int[3];
			try {
			int res = a/b;
			System.out.println("a/b= " + res);
			 arr[4]=7;
			 
			}catch (RuntimeException e) {
				System.out.println("Wrong number!!!" + e);
			}finally {
				System.out.println("Finally block!");
			}
			System.out.println("Done!)");
		}
	}

