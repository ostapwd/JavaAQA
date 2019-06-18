package Calculator;

public class sorting {
	public static void main(String[] args) {
		int[] array = new int[5];

		array[0] = 8;
		array[1] = 2;
		array[2] = 7;
		array[3] = 5;
		array[4] = 4;

		int ib;
		int index = 0;

		while (index < array.length) {
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					ib = array[i + 1];
					array[i + 1] = array[i];
					array[i] = ib;
				}
			}
			index++;
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
