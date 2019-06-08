package AddNewClass;

public class Calc {
	public static void main(String[] args) {
		
		  System.out.println("23.2 + 10 = " + plus(23.2, 10));
		  
		  //argsdouble min = minus(2, 10); 
		  System.out.println("2 - 10 = " +minus(2, 10));
		  
		  double mult = mult(2, 10);
		  System.out.println("2 * 10 = " + mult);
		  
		  double div = div(123.56, 10.00); 
		  System.out.println("123.56 / 10.00 = " + div);
		  
		  double sum1 = plus(5); 
		  System.out.println("5 + = " + sum1);
		  
		  double mult1 = mult(2); 
		  System.out.println("2 * = " + mult1);
		 
		  int div1 = div(123, 10); 
		  System.out.println("123.56 / 10.00 = " + div1);
		
	}
	
	public static double plus(double a1, double a2) {
		double result = a1  + a2;
		return result;		
	}
	
	public static double plus(double a1) {
		double result = a1  + a1;
		return result;		
	}
	
	public static double minus(double a1, double a2) {
		double result = a1  - a2;
		return result;		
	}
	
	public static double mult(double a1, double a2) {
		double result = a1  * a2;
		return result;		
	}
	
	public static double mult(double a1) {
		double result = a1  * a1;
		return result;		
	}
	
	public static double div(double a1, double a2) {
		double result = a1  / a2;
		return result;		
	}

	public static int div(int a1, int a2) {
		int result = a1  / a2;
		return result;		
	}
	
}
