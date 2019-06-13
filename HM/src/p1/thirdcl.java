package p1;

import java.util.Random;

public class thirdcl {

	public static void main(String[] args) {

		Random random = new Random();

		int arrayLength = 10;

		double[] firstArray = new double[arrayLength];
		double[] secondArray = new double[arrayLength];
		double[] thirdArray = new double[arrayLength];

		for (int i = 0; i < arrayLength; i++) {

			firstArray[i] = random.nextInt(10);
		}

		for (int h = 0; h < arrayLength; h++) {

			System.out.println(firstArray[h]);

		}

		System.out.println("------------------------------------");

		for (int i = 0; i < arrayLength; i++) {

			secondArray[i] = firstArray[i];

		}

		for (int i = 0; i < arrayLength; i++) {

			System.out.println(secondArray[i]);

		}
		
		System.out.println("------------------------------------");

		for (int i = 0; i < arrayLength; i++) {

			thirdArray[i] = secondArray[(arrayLength - 1) - i];

		}
		
		for (int i = 0; i < arrayLength; i++) {

			System.out.println(thirdArray[i]);
		
		}

	}

}
