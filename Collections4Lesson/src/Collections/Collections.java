package Collections;

import java.util.ArrayList;
import java.util.List;

public class Collections {

	public static void main(String[] args) {

		int[] num = new int[5];
		num[0] = 7;
		num[1] = 100;
		num[2] = 87;
		num[3] = 8;
		num[4] = 4;
        int summ = 0;
		for (int index = 0; index < num.length; index ++) {
			summ = summ + num[index];
		}
		int averange = summ/num.length;
		System.out.println(averange);
		
//		int summ = 0;
//		summ = summ + num[0];
//		summ = summ + num[1];
//		summ = summ + num[2];
//		summ = summ + num[3];
//		summ = summ + num[4];

//		int avarage = summ / num.length;
//		System.out.println(avarage);
//		System.out.println("Num lenght is " + num.length);
//
//		int a = 25;
//		int b = 20;
//		boolean condition = a > b;
//		System.out.println(condition);
//		if (condition) {
//			System.out.println("a>b");
//		} else {
//			System.out.println("a<b");
//		}
//
//		while (a > b) {
//          System.out.println("qertqetrqee");
//          int c = 3;
//          int d = 6;
//          System.out.println("a = " + a);
//          a = a-1;
//		}
//		
//		for(int counter = 0; counter <10; counter ++ ) {
//			System.out.println("Counter = " + counter);
//		}
		
		

//        List<String> list = new ArrayList<>();
//        list.add("Qwerty0");
//        list.add("Qwerty1");
//        list.add("Qwerty2");
//        list.add("Qwerty3");
//        System.out.println(list.get(0));

	}
}
