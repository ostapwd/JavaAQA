package lesson2006;

import Students.Student;
import lesson2006.StudentArray;;

public class ArrayTest {
	public static void main(String[] args) {
		
		DoubleArray array1 = new DoubleArray();
		array1.add(1.1);
		array1.add(1.2);
		array1.add(1.3);
		array1.add(1.3);
		array1.add(1.3);
		array1.add(1.3);
		array1.add(1.3);
		
		DoubleArray array2 = new DoubleArray();
		array2.add(2.1);
		array2.add(2.2);
		array2.add(2.3);
		
		System.out.println(array1.get(1));
		System.out.println(array2.get(1));
		
		System.out.println(array1.getLength());
		for (int i = 0; i < array1.getLength(); i++) {
			System.out.println(array1.get(i));
		
		Student student1 = new Student("Anna", "Dou", "economy", 1);
		Student student2 = new Student("Taras", "Dou2", "economy", 2);
		Student student3 = new Student("Olya", "Dou3", "economy",  3);
			
		StudentArray array3 = new StudentArray();
		
		array3.add(student1);
		array3.add(student2);
		array3.add(student3);
		array3.add(new Student("Vova", "Dou4", "economy", 5));
		
		for (int j = 0; j < array3.getLength(); j++) {
			System.out.println(array3.get(j).toString());
		}
			
		}
		
	}

}
