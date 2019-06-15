package HomeWork;

import javax.swing.JOptionPane;

import java.util.Arrays;
import java.util.Random;

public class saturdaytasks {
	public static void main(String[] args) {

		// FIRST TASK
//	Random Random1 = new Random();
//	int Array1[] = new int[20];
//	int i = 0;
//	for(;i<Array1.length;i++)
//	{
//		Array1[i] = Random1.nextInt(20);
//	}
//	// print each 3 number via for
//	for(i=0;i<Array1.length;i+=3)
//	{
//		System.out.println(Array1[i]);
//	}
//	// print each 3 number via while
//	i=0;
//	while(i<Array1.length)
//	{
//		System.out.println(Array1[i]);
//		i += 3;
//	};
//	// print max and min values
//	int max = Array1[0];
//	int min = Array1[0];
//	for(i=0;i<Array1.length;i++)
//	{
//		if (Array1[i] >= max) {
//			max = Array1[i];
//		}
//		if (Array1[i] <= min) {
//			min = Array1[i];
//		}
//	};System.out.println("Max value is -> "+max+". Min value is -> "+min);
		// SECOND TASK
//		Random Random2 = new Random();
//		String number1 = JOptionPane.showInputDialog("Set the integer:");
//		int number = Integer.parseInt(number1);
//		int Array2[] = new int[number];
//		int i;
//			for ( i = 0; i < Array2.length; i++) {
//			Array2[i] = Random2.nextInt(10);
//			//PRINT ALL NUMBER WHICH ARE>=7
//			if (Array2[i] >= 7) {
//				System.out.println(Array2[i]);
//				i++;
//			}
//		}
//			
//		for (i = 0; i < Array2.length; i++) {
//			if (Array2[i] <= 3) {
//				Array2[i] += 2;
//			}
//			System.out.println(Array2[i]);
//		}
		// THIRTH TASK
//        Random Random2 = new Random();
//        int i;
//		double Array1[] = new double[5];
//		for(i=0;i<Array1.length;i++) {
//			Array1[i] = Random2.nextInt(10);
//			System.out.println("Array1->"+Array1[i]);
//		};
//		double Array2[] = new double[5];
//		for(i=0;i<Array2.length;i++) {
//			Array2[i]=Array1[i];	
//			System.out.println("Array2->"+Array2[i]);
//		};
//		double Array3[] = new double[5];
//		for(i=Array3.length-1;i<Array3.length;i){
//			Array3[i]=Array2[i];
//			System.out.println("Array3->"+Array3[i]);
//		}
		// FOURTH TASK
		Random Random4 = new Random();
		int Array4[] = new int[10];
		int i=0;
		for(;i<Array4.length;i++) {
			Array4[i] = Random4.nextInt(10);	
		}
//		Arrays.sort(Array4);
//		System.out.println(Arrays.toString(Array4));
//		for (i = Array4.length - 1; i >= 0; i--){
//		    System.out.print(Array4[i] + " ");
//	    }

		int b;
		int index=0;
		while(index<Array4.length-1) {
			for (i = 0; i < Array4.length - 1; i++) {
				if (Array4[i] < Array4[i + 1]) {
					b = Array4[i + 1];
					Array4[i + 1] = Array4[i];
					Array4[i] = b;
				}
			}
			index++;
		}
	

		for (i = 0; i < Array4.length; i++) {
			System.out.println(Array4[i]);
		}

		// FIFTH TASK

	}
}
