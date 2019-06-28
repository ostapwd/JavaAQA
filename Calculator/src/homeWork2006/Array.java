package homeWork2006;

public class Array {
	double[] firstArray = new double[5];
	int index = 0;

	double[] createNewAndCopy(double[] firstArray) {
		double[] createNewAndCopy = new double[(firstArray.length * 2)];
		for (int i = 0; i < firstArray.length; i++) {
			createNewAndCopy[i] = firstArray[i];
		}
		return createNewAndCopy;

	}

	public Array() {

	}

	public double get(int indexToGet) {
		return firstArray[indexToGet];

	}

	public void add(double numberToAdd) {
		for (int i = 0; i < 5; i++) {
			if (index < firstArray.length) {
				firstArray[index] = numberToAdd;
				index++;
			} else {
				firstArray = createNewAndCopy(firstArray);
				firstArray[i] = numberToAdd;
			}
		}
		index++;
	}

	public void printArray() {
		for (int i = 0; i < firstArray.length; i++) {
			System.out.println(firstArray[i]);
		}
	}

}
