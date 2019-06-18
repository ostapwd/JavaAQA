package Calculator;

public class homeWork4 {
	public static void main(String[] args) {
		int[] array = new int[10];

		array[0] = 8;
		array[1] = 2;
		array[2] = 7;
		array[3] = 5;
		array[4] = 4;
		array[5] = 1;
		array[6] = 9;
		array[7] = 3;
		array[8] = 6;
		array[9] = 10;

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
//			System.out.println(array[i]);
		}
		
		while (index < array.length) {
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] < array[i + 1]) {
					ib = array[i + 1];
					array[i + 1] = array[i];
					array[i] = ib;
				}
			}
			index++;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			
//		for (int j = 0; j < array.length - 1; j++)
//		{
//		    for (int k = j + 1; k < array.length; k++)
//		    {
//		        if (array[j] < array[k])
//		        {
//		            int ib2 = array[k];
//		            array[k] = array[j];
//		            array[j] = ib2;
//		        }
//		    }
//		}
		
//		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
		}

	}

}
