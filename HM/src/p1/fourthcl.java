package p1;

import java.util.Random;

import java.util.*;

public class fourthcl {

	public static void main(String[] args) {

		Random random = new Random();

		int arrLength = 10;

		Integer[] arr = new Integer[arrLength];

		for (int i = 0; i < arrLength; i++) {

			arr[i] = random.nextInt(10);
		}

		for (int i = 0; i < arrLength; i++) {

			System.out.println(arr[i]);
		}

		System.out.println("----------------------------------------");

		Arrays.sort(arr);

		for (int i = 0; i < arrLength; i++) {

			System.out.println(arr[i]);

		}

		System.out.println("----------------------------------------");

		Arrays.sort(arr, Collections.reverseOrder());

		for (int i = 0; i < arrLength; i++) {

			System.out.println(arr[i]);


		
		
			
			
		}

	}

}
