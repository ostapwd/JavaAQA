package students;

public class Student {
	
	public String name;
	public String faculty;
	public int age = 0;
	public int course;
	
	public Student() {
	}
	
	public Student(String nameToSet, int courseToSet) {
		name = nameToSet;
		course = courseToSet;	
	}
	
	public Student(String nameToSet, String facultyToSet, int courseToSet) {
		name = nameToSet;
		faculty = facultyToSet;
		course = courseToSet;	
	}
	
	public Student(String nameToSet, String facultyToSet, int courseToSet, int ageToSet) {
		name = nameToSet;
		faculty = facultyToSet;
		course = courseToSet;	
		age = ageToSet;
	}
	
	
	public int[] marks = new int[5];
	private int index = 0;

	public void addMark(int mark) {
		marks[index] = mark;
		index++;
	}

	public void printMarks() {
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
	}

	public void promoteToNextCourse() {
		course = course + 1;
	}

	public String toString() {
		String lineToPrint = "name: " + name + " age: " + age + " faculty: " + faculty + " course: " + course;
		return lineToPrint;
	}
}
