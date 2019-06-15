package p1;

public class testcl {

	public static void main(String[] args) {

		int[] arr = new int[5];

		arr[0] = 8;
		arr[1] = 2;
		arr[2] = 7;
		arr[3] = 5;
		arr[4] = 4;

		int t = 0;

		int k = 0;

		while (k < 4) {

			for (int i = 0; i < 4; i++) {

				if (arr[i] < arr[i + 1]) {

					t = arr[i];

					arr[i] = arr[i + 1];

					arr[i + 1] = t;

				}

			}

			k++;

		}

		for (int i = 0; i < 5; i++) {

			System.out.println(arr[i]);
		}

	}

}
