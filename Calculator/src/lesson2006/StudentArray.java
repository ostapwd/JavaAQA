package lesson2006;

import Students.Student;

public class StudentArray {
	private Student [] array = new Student [5];
	private int index = 0;
	
	public int getLength() {
		return index;
	}
	
	public Student get(int indexToGet) {
		return array[indexToGet];
	}
	
	public void add(Student numberToAdd) {
		if(index >= array.length) {
			array = createAndCopyArray();
		}
		array[index] = numberToAdd;
		index++;
	} 
	private Student[] createAndCopyArray() {
		System.out.println("Copied " + array.length);
		Student[] newArray = new Student[array.length * 2];
		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}
		return newArray;
	}

}
