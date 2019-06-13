package package1;

import java.util.ArrayList;
import java.util.List;

public class CollectionClass1 {

	public static void main(String[] args) {
		
		int age =7;
		String name = "Davyd";
		
		int[] arr = new int[6];  //the 1st element is "0", so to have 5ct I need to create new int[6]
		
		arr[3] = 10;      
		
		arr[1] = 10;
		
		arr[2] = 20;
		
		arr[4] = 20;
		
		arr[5] = 10;
		
		
		//System.out.println(arr[1]);
		//System.out.println(arr[2]);
		//System.out.println(arr[3]);
		//System.out.println(arr[4]);
		//System.out.println(arr[5]);
		
		int summ = 0;
		
		for (int i = 0; i < 6; i++) {    // i < arr.length
		 summ = summ + arr[i];
		}
		
		System.out.println(summ / 6);
		
		int SUM = 0;
		
		SUM = SUM + arr[0]; // or we can write: SUM = arr[0] + arr[1] + arr[2] + arr[3] + arr[4] + arr[5]
		SUM = SUM + arr[1];
		SUM = SUM + arr[2];
		SUM = SUM + arr[3];
		SUM = SUM + arr[4];
		SUM = SUM + arr[5];
		
		//int AVG = SUM / 5;
		
		int AVG = SUM / arr.length;
		System.out.println("Average is " + AVG);
		
		int a = 25;
		int b = 20;
		boolean condition = a > b;
		System.out.println(condition);
		
		if (condition) {
			System.out.println("a > b");
		} else {
			System.out.println("a < b");
		}
		
		while (a > b) {
			System.out.println("test1");
			System.out.println("test2");
			System.out.println("test3");
			int p1 = 10;
			int p2 = 20;
			System.out.println("a = " + a);
			a = a - 1;
			
		}
		
		for (int counter = 0; counter <= 10; counter = counter + 1) {   // counter++(додає +1)
			System.out.println(counter);
		}
		
		
		//if (10 > 5) {
			//System.out.println("10 > 5");
		//} else {
			//System.out.println("10 < 5");
		//}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		List<String> list = new ArrayList<>();
		list.add("Olena");
		list.add("Nadiia");
		list.add("Natalie");
		list.add("Ostap");
		list.add("Hello");
		
		
       System.out.println(list.get(0));
		
		
		
		
	}
}

