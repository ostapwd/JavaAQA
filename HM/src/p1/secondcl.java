package p1;

import javax.swing.JOptionPane;
import java.util.Random;

public class secondcl {

	public static void main(String[] args) {

		String command = JOptionPane.showInputDialog("Enter the Number");

		int number = Integer.parseInt(command);

		int[] arr = new int[number];

		Random random = new Random();

		int index = 0;

		while (index < number) {

			arr[index] = random.nextInt(10);

			index = index + 1;
		}

		for (int i = 0; i < number; i++) {

			System.out.println(arr[i]);

		}

		System.out.println("------------------------------------");

		int n = 7;

		for (int i = 0; i < number; i++) {

			if (arr[i] >= n) {

				System.out.println(arr[i]);

			}

		}

		System.out.println("----------------------------------");

		int a = 3;

		for (int i = 0; i < number; i++) {

			if (arr[i] < 3) {

				arr[i] = arr[i] + 2;

			}
		}

		for (int i = 0; i < number; i++) {

			System.out.println(arr[i]);

		}

	}

}
