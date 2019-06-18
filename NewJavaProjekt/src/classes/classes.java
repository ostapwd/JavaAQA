package classes;

public class classes {

	public String name;
	public String facult;
	public int age;
	public int curs;
	public int marks[] = new int[5];
	private int index = 0;

	public classes() {
		
	}
	
public classes(String nameToSet) {
		name = nameToSet;
	}

	public void addMark(int mark) {
		marks[index] = mark;
		index++;
	}

	public void printmarks() {
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
	}

	public String printAllInfo() {
		String LineToPrint = "Name: " + name + " Age: " + age + " Facult: " + facult + " Curs: " + curs;
		return LineToPrint;
	}

	public void increaseCourse() {
		curs++;
	}

}
