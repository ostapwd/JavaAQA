package Calculator;

public class homeWork {
	public static void main(String[] args) {

		int[] array = new int[20];

		array[0] = 9;
		array[1] = 6;
		array[2] = 12;
		array[3] = 7;
		array[4] = 10;
		array[5] = 15;
		array[6] = 61;
		array[7] = 1;
		array[8] = 74;
		array[9] = 14;
		array[10] = 19;
		array[11] = 66;
		array[12] = 16;
		array[13] = 17;
		array[14] = 10;
		array[15] = 95;
		array[16] = 63;
		array[17] = 88;
		array[18] = 45;
		array[19] = 33;

		for (int i = 2; i < array.length; i += 3) {
			System.out.println("Every third item are next: " + array[i]);
		}
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
//			max = Math.max(max, array[i]);
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("Max value in array is : " + max);

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
//			min = Math.min(min, array[i]);
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("Min value in array is : " + min);

	}

}
