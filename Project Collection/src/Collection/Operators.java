package Collection;

import java.util.Random;

public class Operators {
	public static void main(String[] args) {
		
		Random r = new Random();
		
		
		int[] array = new int[5000];
		
		for (int i = 0; i < array.length; i ++) {
			array[i] = r.nextInt(100);
			
		}
		for (int i = 0; i < array.length; i ++) {
//			System.out.println(array[i]);
		}
		
		int summ = 0;
		for(int index = 0; index < array.length; index ++ ) {
			summ += array[index];
		}
		int average2 = summ / array.length;
		
		System.out.println(average2);
		
		int index = 0;
		while (index < array.length) {
			System.out.println(array[index]);
			index = index + 1;
		}
	}

}
