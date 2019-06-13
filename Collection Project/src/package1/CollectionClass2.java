package package1;

import java.util.Random;

public class CollectionClass2 {
	
	public static void main(String[] args) {
		
		Random random = new Random(); 
		
		int arrayLength = 1000000;
		
		
	
		
		int [] ARRAY = new int[arrayLength];
		
		for (int i = 0; i < arrayLength; i++) {
			ARRAY[i] = random.nextInt(1000);
			
			}
		
		//for (int i = 0; i < 100; i++) {
			//System.out.println(ARRAY[i]);
			
			//}
		
		// int index = 0;
		// while (index < arrayLength) {
		//System.out.println(array[index]);
		
		//index = index + 1;
	//}

		
		int SUM = 0;
		
		for (int i = 0; i < arrayLength; i++) {
			SUM = SUM + ARRAY[i];     // SUM += ARRAY[i]
			
		}
		
		System.out.println(SUM / ARRAY.length);
	}

}
