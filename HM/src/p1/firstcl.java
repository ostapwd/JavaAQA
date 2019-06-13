package p1;

import java.util.Random;

public class firstcl {

	public static void main(String[] args) {

		Random random = new Random();

		int index = 0;

		int arrayLength = 20;

		int[] arr = new int[arrayLength];

		for (int i = 0; i < arrayLength; i++) {

			arr[i] = random.nextInt(100);
		}

		for (int i = 0; i < arrayLength; i = i + 3) {

			System.out.println(arr[i]);
		}

		System.out.println("-------------------------------------------");

		while (index < 19) {

			System.out.println(arr[index]);
			
			index = index + 3;

		}
		
		int max = 0;
		int min = 100;
		
		for (int i = 0; i < arrayLength; i++) {
			
			if (arr[i] > max) {
				
				max = arr[i];
				
			}
			
		}
		
		System.out.println("MAX RESULT is - " + max);
		
		for (int i = 0; i < arrayLength; i++) {
			
			if (arr[i] < min) {
				
				min = arr[i];
			}
		}
		
		System.out.println("MIN RESULT is - " + min);
		

	}

}
