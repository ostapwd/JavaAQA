package COLL;
import java.util.Random;

public class Operators {
	public static void main(String[] args) {
		
		Random random = new Random ();
		
		int arrayleng = 1000;

		int[] array = new int[arrayleng];

		for (int i = 0; i < arrayleng ; i++) {
			array[i] = random.nextInt(arrayleng);
		}

		
		for (int i = 0; i < arrayleng; i++) {
			System.out.println(array[i]);
		}
		
		int sum = 0;
		for (int i = 0; i < arrayleng; i++) {
			sum = sum + array[i];
		}
		
		System.out.println("avar = " + sum/array.length);

		
	}

}
