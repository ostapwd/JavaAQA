package Students;

public class Student {
	
	public String firstName;
	public String lastName;
	public int age;
	public String faculty;
	public int course;
	public int[] marksArray = new int [5];
	private int index = 0;
	
	public Student() {
		
	}
	
	public Student(String firstNameToSet, String lastNameToSet, String facultyToSet, int courseToSet) {
		firstName = firstNameToSet;
		lastName = lastNameToSet;
		faculty = facultyToSet;
		course = courseToSet;
	}
	
	public void setMark(int mark) {
		marksArray[index] = mark;
		index++;
	}
	
	
	public void printMarks() {
		for (int i = 0; i < marksArray.length; i++) {
			System.out.println(marksArray[i]);
		}
	}
	
	

	public String toString() {
		String studentsData = "First Name: " + firstName + " " + "Last Name: " + lastName + " " + "Age: " + age + " " + "Faculty: "
				+ faculty + " " + "Course: " + course;
		return studentsData;
	}
	public void upgradeCourse() {
		 course = course + 1;
	}
	
}
