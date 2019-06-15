package p1;

import java.util.Random;

public class sortingAsc {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int arrayLength = 1000;

		int[] arr = new int[arrayLength];

		for (int i = 0; i < arrayLength; i++) {
			
			arr[i] = random.nextInt(10);
			
		}
		
		
		int t = 0;

		int k = 0;

		while (k < arrayLength) {

			for (int i = 0; i < arrayLength - 1; i++) {

				if (arr[i] > arr[i + 1]) {

					t = arr[i];

					arr[i] = arr[i + 1];

					arr[i + 1] = t;

				}

			}

			k++;

		}

		for (int i = 0; i < arrayLength; i++) {

			System.out.println(arr[i]);
		}

	}

}
