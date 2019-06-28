package lesson2006;

public class DoubleArray {
	private double [] array = new double [5];
	private int index = 0;
	
	public int getLength() {
		return index;
	}
	
	public double get(int indexToGet) {
		return array[indexToGet];
	}
	
	public void add(double numberToAdd) {
		if(index >= array.length) {
			array = createAndCopyArray();
		}
		array[index] = numberToAdd;
		index++;
	} 
	private double[] createAndCopyArray() {
		System.out.println("Copied " + array.length);
		double[] newArray = new double[array.length * 2];
		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}
		return newArray;
	}

}
