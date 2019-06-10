package Collection;

import java.util.ArrayList;
import java.util.List;

public class Collection {
	public static void main(String[] args) {
		
		int age = 7;
		String name = "Taras";
				
		int[] arr = new int[5];
		
		arr[0] = 9;
		arr[1] = 6;
		arr[2] = 12;
		arr[3] = 7;
		arr[4] = 10;
		
		int summ = 0;
		for(int index = 0; index < arr.length; index ++ ) {
			summ = summ + arr[index];
		}
		int average2 = summ / 5;
		
		System.out.println(average2);
		
		int sum = 0;
		sum = sum + arr[0];
		sum = sum + arr[1];
		sum = sum + arr[2];
		sum = sum + arr[3];
		sum = sum + arr[4];
		
		int average = sum / arr.length;
		
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
		
		System.out.println("Average is " + average);
		System.out.println("Array length is " +arr.length);
		
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
			System.out.println("do something 1");
			System.out.println("do something 2");
			int p1 = 10;
			int p2 = 20;
			System.out.println(" a = " + a);
			a = a - 1;
			
			System.out.println("");
		}
		
		for(int counter = 5; counter < 10; counter ++) {
			System.out.println(counter);
		}
		
		
		List<String> list = new ArrayList<>();
		
		list.add("Olena");
		list.add("Nadiia");
		list.add("Natalia");
		list.add("Yaroslava");
		list.add("dhdjdc");
		list.add("hello");
		
		System.out.println(list.get(0));
	
	}

}
