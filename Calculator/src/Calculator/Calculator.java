package Calculator;

public class Calculator {
	public static void main(String[] args) {
		int res = add(40, 10);
		System.out.println("result received from add() function call + " + res);
		
		int res2 = sub(100, 10);
		System.out.println("result received from sub() function call + " + res2);
		
		int res3 = mul(5, 8);
		System.out.println("result received from mul() function call + " + res3);
		
		int res4 = div(500, 8);
		System.out.println("result received from div() function call + " + res4);
		
		double res5 = add(40.3, 10.6);
		System.out.println("result received from add() function call + " + res5);
		
		double res6 = sub(40.3, 10.6);
		System.out.println("result received from add() function call + " + res6);
		
		double res7 = mul(5.2, 8.8);
		System.out.println("result received from mul() function call + " + res7);
		
		double res8 = div(10.8, 8.8);
		System.out.println("result received from mul() function call + " + res8);
	}	
		
	public static int add(int p1, int p2) {
		int result = p1 + p2;
		System.out.println("parameter1 + parameter2 = " + result);
		return result;
	}
	public static int sub(int p3, int p4) {
		int result = p3 - p4;
		System.out.println("parameter3 - parameter4 = " + result);
		return result;
	}
	public static int mul(int p5, int p6) {
		int result = p5 * p6;
		System.out.println("parameter5 * parameter6 = " + result);
		return result;
	}
	public static int div(int p7, int p8) {
		int result = p7 / p8;
		System.out.println("parameter7 / parameter8 = " + result);
		return result;
	}
	public static double add(double p1, double p2) {
		double result = p1 + p2;
		System.out.println("parameter1 + parameter2 = " + result);
		return result;
	}
	public static double sub(double p3, double p4) {
		double result = p3 - p4;
		System.out.println("parameter3 - parameter4 = " + result);
		return result;
	}
	public static double mul(double p5, double p6) {
		double result = p5 * p6;
		System.out.println("parameter5 * parameter6 = " + result);
		return result;
	}
	public static double div(double p7, double p8) {
		double result = p7 / p8;
		System.out.println("parameter7 / parameter8 = " + result);
		return result;
	}
}


