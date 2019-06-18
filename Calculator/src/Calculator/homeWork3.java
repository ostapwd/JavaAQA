package Calculator;

public class homeWork3 {
	public static void main(String[] args) {

		double[] arrayMain = new double[5];
		arrayMain[0] = 4.5;
		arrayMain[1] = 7.3;
		arrayMain[2] = 0.9;
		arrayMain[3] = 6.1;
		arrayMain[4] = 8.8;
		
		for (int i = 0; i < arrayMain.length; i ++) {
			System.out.println("Main array is next: " + arrayMain[i]);
		}

		double[] array3 = new double[5];
		arrayMain[0] = array3[0];
		arrayMain[1] = array3[1];
		arrayMain[2] = array3[2];
		arrayMain[3] = array3[3];
		arrayMain[4] = array3[4];
		
		for (int i = 0; i < array3.length; i ++) {
			System.out.println("Second array is next: " + array3[i]);
		}
		
//		System.arraycopy(arrayMain, 5, array3, 0, 5);
//		for (int i = 0; i < array3.length; i++) {
//			System.out.print(array3[i] + " ");
//		}

		double[] reverseArray = new double[5];
		reverseArray[0] = array3[4];
		reverseArray[1] = array3[3];
		reverseArray[2] = array3[2];
		reverseArray[3] = array3[1];
		reverseArray[4] = array3[0];
		
		for (int i = 0; i < reverseArray.length; i ++) {
			System.out.println("Reverse array is next: " + reverseArray[i]);
		}
		
	}
	
}
