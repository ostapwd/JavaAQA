package classes;
import arrayClass.arrayClassInt;
import arrayClass.arrayClass;

public class Student {

	public String name;
	public String facult;
	public int age;
	public int curs;
	private int index = 0;
	arrayClassInt marks = new arrayClassInt();

	public Student() {
		
	}
	

    public Student(String nameToSet, int curs) {
		name = nameToSet;
		this.curs = curs;
	}


	public void addMark(int mark) {
		marks.add(mark);
		index++;
	}

	public void printmarks() {
		for (int i = 0; i < marks.getLength(); i++) {
			System.out.println(marks.getIndex());
		}
	}

	public String printAllInfo() {
		String LineToPrint = "Name: " + name + " Age: " + age + " Facult: " + facult + " Curs: " + curs;
		return LineToPrint;
	}

	public void increaseCourse() {
		curs++;
	}
	
	public int getLength() {
		return index;
	}
	
	public double get(int index) {
    	return marks.get(index);
    }
	
//	public double getIndex() {
//		return index;
//	}
	
//	public int[] getMarkArray(){
//		return marks;
//		}

}
