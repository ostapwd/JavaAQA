package arrayClass;

import java.lang.reflect.Array;

public class arrayClass {
	private int index = 0;
	private int addcounter = 0;
	private double[] myArray = new double[5];
//	double[] newArray = new double[myArray.length * 2];

	public void add(double numberToAdd) {
		if (index >= myArray.length) {
			myArray = createAndCopy();
		}
		myArray[index] = numberToAdd;
		index++;
	}

	private double[] createAndCopy() {
		System.out.println("Copied" + myArray.length);
		double[] newArray = new double[myArray.length * 2];
		for (int i = 0; i < myArray.length; i++) {
			newArray[i] = myArray[i];
		}
		return newArray;
	}

	public double getIndex() {
		return index;
	}

    public double get(int index) {
    	return myArray[index];
    }
    public int getLength() {
		return index;
	}
    
    
  
    
    
    
    
    
}
