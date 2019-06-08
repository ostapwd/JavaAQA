package pg;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Collections {
	public static void main(String[] args) {

		int age = 7;
		String name = "Taras";

		int[] arr = new int[5];

		arr[0] = 12;
		arr[1] = 35;
		arr[2] = 78;
		arr[3] = 99;
		arr[4] = 50;

		int sum = 0;
		sum = 10;
		sum = 0;

		sum = sum + arr[0];
		sum = sum + arr[1];
		sum = sum + arr[2];
		sum = sum + arr[3];
		sum = sum + arr[4];

		int avarage = sum / 5;
		System.out.println("Array length is " + arr.length);
		System.out.println("Avarage is " + avarage);
		System.out.println("");

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

		int summ = 0;
		for (int i = 0; i < arr.length; i++) {
			summ = summ + arr[i];
		}
		
		
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);

		System.out.println("");

		List<String> list = new ArrayList<>();
		list.add("Olena");
		list.add("Nadiia");
		list.add("Natalia");
		list.add("Yaroslava");
		list.add("tralalala");
		list.add("hello");

		System.out.println(list.get(0));

		double a1 = Double.parseDouble(JOptionPane.showInputDialog("Enter a number:"));

	}
}
