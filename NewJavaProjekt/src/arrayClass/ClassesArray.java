package arrayClass;
import classes.Student;
import java.lang.reflect.Array;

public class ClassesArray {
	private int index = 0;
	private int addcounter = 0;
	private Student[] myArray = new Student[5];
//	double[] newArray = new double[myArray.length * 2];
	public int a = myArray.length;

	public void add(Student numberToAdd) {
		if (index >= myArray.length) {
			myArray = createAndCopy();

		}
		myArray[index] = numberToAdd;
		index++;
	}

	private Student[] createAndCopy() {
		System.out.println("Copied" + myArray.length);
		Student[] newArray = new Student[myArray.length * 2];
		for (int i = 0; i < myArray.length; i++) {
			newArray[i] = myArray[i];
		}
		return newArray;
	}

	public double getIndex() {
		return index;
	}

    public Student get(int index) {
    	return myArray[index];
    }
    
    public int getLength() {
		return index;
	}
    
    
}
