package Calculator;

public class RunCalculator {

	public static void main(String[] args) {

		int resAddI = Calculator.addition(2, 2);
		System.out.println(resAddI);
		int resSubI = Calculator.subtract(2, 2);
		System.out.println(resSubI);
		int resMultI = Calculator.multiplication(2, 2);
		System.out.println(resMultI);
		int resDivI = Calculator.division(2, 2);
		System.out.println(resDivI);
		double resAddD = Calculator.addition(1.3, 2.7);
		System.out.println(resAddD);
		double resSubD = Calculator.subtract(0.3, 2.1);
		System.out.println(resSubD);
		double resMultD = Calculator.multiply(3.1, 2.2);
		System.out.println(resMultD);
		double resDivD = Calculator.division(2.2, 1.1);
		System.out.println(resDivD);

		
	}
}
