package package1;

public class Calculator {
	
	public static void main(String[] args) {
		
	int add = add(10, 20);
	System.out.println(add);
	
	int sub = sub(50, 10);
	System.out.println(sub);
	
	int mul = mul(2, 2);
	System.out.println(mul);
	
	int div = div(100, 20);
	System.out.println(div);
	
	double addd = add(1.5, 1.5);
	System.out.println(addd);

	double subd = sub(5.8, 3.7);
	System.out.println(subd);
	
	double muld = mul(3.4, 4.7);
	System.out.println(muld);
	
	double divd = div(9.99, 6.6);
	System.out.println(divd);
	
	//sub(20, 10);
	//mul(2, 2);
	//div(100, 2);
	//add(1, 1);
	//sub(20,80);
	//mul(1000,11);
	//div(10000, 222);
	
	//add(1.5, 1.5);
	//sub(10.5, 2.5);
	//mul(2.1, 70.28);
	//div(555.55, 700.2);
	
	
	//int res = add(10, 40);
	//System.out.println("result received from add() function call = " + res);
	//double res2 = add(1.5, 6.90);
		
		}
	
	public static int add(int p1, int p2) {
		int result = p1 + p2;
		System.out.println(p1 + " + " + p2 + " = " + result);
		
		return result;
	}
	
	public static int sub(int p1, int p2) {
		int result = p1 - p2;
		
		System.out.println(p1 + " - " + p2 + " = " + result);
		
		return result;
	}
	
	public static int mul(int p1, int p2) {
		int result = p1 * p2;
		
		System.out.println(p1 + " * " + p2 + " = " + result);
		
		return result;
	}
	
	public static int div(int p1, int p2) {
		int result = p1/p2;
		
		System.out.println(p1 + " / " + p2 + " = " + result);
		
		return result;
	}
	
	public static double add(double p1, double p2) {
		double result = p1 + p2;
		
		System.out.println(p1 + " + " + p2 + " = " + result);
		
		return result;
	}
	
	public static double sub(double p1, double p2) {
		double result = p1 - p2;
		
		System.out.println(p1 + " - " + p2 + " = " + result);
		
		return result;
	}
	
	public static double mul(double p1, double p2) {
		double result = p1 * p2;
		
		System.out.println(p1 + " * " + p2 + " = " + result);
		
		return result;
	}
	
	public static double div(double p1, double p2) {
		double result = p1 / p2;
		
		System.out.println(p1 + " / " + p2 + " = " + result);
		
		return result;
	}

}
