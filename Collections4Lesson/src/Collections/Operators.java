package Collections;
import java.util.Random;
public class Operators {
      public static void main(String[] args) {
    	
    	  Random r = new Random();
    	  
		int [] array = new int[1000000];
		for (int index = 0; index < array.length; index ++) {
			array[index] = r.nextInt(80);
		}
		int summ = 0;
		for (int i = 0; i < array.length; i++) {
			summ += array[i];
			//System.out.println(array[i]);
		}
		int averange = summ/array.length;
		System.out.println(averange);
		
	}
}
 // 