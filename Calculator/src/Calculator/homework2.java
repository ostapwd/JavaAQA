package Calculator;

import javax.swing.JOptionPane;

import java.util.Random;

public class homework2 {
	public static void main(String[] args) {

		String capacity = JOptionPane.showInputDialog("Set array capacity:");

		int a = Integer.parseInt(capacity);

		Random r = new Random();

		if (a > 0) {
			int[] array2 = new int[a];

			for (int i = 0; i < array2.length; i++) {
				array2[i] = r.nextInt(10);
//			System.out.println(array2[i]);
				if (array2[i] >= 7) {
//			System.out.println(array2[i]);
					int iN = 3;
					for (int i1 = 0; i1 < array2.length; i1++) {
						if (array2[i1] < iN) {
							array2[i1] = array2[i1] + 2;

						}
						System.out.println(array2[i1]);
					}
				}

			}
		}
	}
}
