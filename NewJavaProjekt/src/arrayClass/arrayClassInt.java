package arrayClass;

import java.lang.reflect.Array;

public class arrayClassInt {
	private int index = 0;
	private int addcounter = 0;
	private int[] myArray = new int[5];
//	double[] newArray = new double[myArray.length * 2];

	public void add(int numberToAdd) {
		if (index >= myArray.length) {
			myArray = createAndCopy();
			myArray[index] = numberToAdd;
		}
		myArray[index] = numberToAdd;
		index++;
	}

	private int[] createAndCopy() {
		System.out.println("Copied" + myArray.length);
		int[] newArray = new int[myArray.length * 2];
		for (int i = 0; i < myArray.length; i++) {
			newArray[i] = myArray[i];
		}
		return newArray;
	}

	public int getIndex() {
		return index;
	}

    public int get(int index) {
    	return myArray[index];
    }
    public int getLength() {
		return index;
	}
    
  
    
    
    
    
    
}
