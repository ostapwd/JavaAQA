package arrayClass;

import java.lang.reflect.Array;

public class arrayClassString {
	private int index = 0;
	private String[] myArray = new String[5];
//	double[] newArray = new double[myArray.length * 2];

	public void add(String nameToAdd) {
		if (index >= myArray.length) {
			myArray = createAndCopy();

		}
		myArray[index] = nameToAdd;
		index++;
	}

	private String[] createAndCopy() {
		System.out.println("Copied" + myArray.length);
		String[] newArray = new String[myArray.length * 2];
		for (int i = 0; i < myArray.length; i++) {
			newArray[i] = myArray[i];
		}
		return newArray;
	}

	public int getIndex() {
		return index;
	}

    public String get(int index) {
    	return myArray[index];
    }
    public int getLength() {
		return index;
	}
    
  
    
    
    
    
    
}
