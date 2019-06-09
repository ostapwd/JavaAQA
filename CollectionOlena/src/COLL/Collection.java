package COLL;

import java.util.ArrayList;
import java.util.List;

public class Collection {
	public static void main(String[] args) {

		int[] arr = new int[43];
		arr[0] = 7;
		arr[1] = 9;
		arr[2] = 7;
		arr[3] = 5;
		arr[4] = 5;
		
 		

		int sum = 0;

		sum = sum + arr[0];
		sum = sum + arr[1];
		sum = sum + arr[2];
		sum = sum + arr[3];
		sum = sum + arr[4];

		System.out.println("sum = " + sum);

		int sum1 = 0;
		for (int i = 0; i < arr.length; i++) {
			sum1 = sum1 + arr[i];
		}
		
		System.out.println("sum1 = " + sum1);

		int avarage = sum1 / 5;

		System.out.println("arr[2] = " + arr[2]);
		System.out.println("avarage = " + avarage);
		System.out.println("arr.length = " + arr.length);

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
			System.out.println(" a = " + a);
			a = a - 1;
			System.out.println("");
		}

		int counter = 0;
		for (; counter < 10; counter++) {
			System.out.println(counter);

		}
		
		System.out.println(counter);
		System.out.println("-------------------");
		
		
		int j = -2;
		
		while (true) {
			System.out.println("aaaa" + j);
			if (j > 3) {
				break;
			}
			j = j + 2;
			System.out.println("bbbb" + j);
		}
		
		System.out.println(j);
		
		System.out.println("-------------------");

		List<String> list = new ArrayList<>();

		list.add("Olena");
		list.add("Nadia");
		list.add("Olena");
		list.add("Taras");
		list.add("Ostap");
		list.add("tra tra");

		System.out.println(list.get(5));

	}

}
