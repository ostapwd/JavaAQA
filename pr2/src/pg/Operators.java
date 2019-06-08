package pg;

import java.util.Random;

public class Operators {
	public static void main(String[] args) {

		Random random = new Random();

		int arrayLength = 10000;

		int[] array = new int[arrayLength];

		for (int i = 0; i < arrayLength; i++) {
			array[i] = random.nextInt(1000);
		}

		for (int i = 0; i < arrayLength; i++) {
			System.out.println(array[i]);
		}

		int index = 0;
		while (index < arrayLength) {
			System.out.println(array[index]);
			
			index = index + 1;
		}

		long sum = 0;
		for (int i = 0; i < arrayLength; i++) {
			sum += array[i];
		}

		System.out.println("Avarage = " + sum / arrayLength);

	}
}
