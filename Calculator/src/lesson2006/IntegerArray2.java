package lesson2006;

public class IntegerArray2 {
	private int [] array = new int [5];
	private int index = 0;
	
	public int getLength() {
		return index;
	}
	
	public int get(int indexToGet) {
		return array[indexToGet];
	}
	
	public void add(int numberToAdd) {
		if(index >= array.length) {
			array = createAndCopyArray();
		}
		array[index] = numberToAdd;
		index++;
	} 
	private int [] createAndCopyArray() {
		System.out.println("Copied " + array.length);
		int[] newArray = new int[array.length * 2];
		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}
		return newArray;
	}

}
