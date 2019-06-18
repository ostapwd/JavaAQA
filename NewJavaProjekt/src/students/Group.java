package students;

public class Group {
	public static void main(String[] args) {
		Student std1 = new Student();
		std1.name = "Andriy";

		Student std2 = new Student();
		std2.name = "Ola";

		System.out.println(std1.name);
		System.out.println(std2.name);

		Student[] group1 = new Student[2];
		group1[0] = std1;
		group1[1] = std2;

		for (int i = 0; i < group1.length; i++) {

			Student extractedFromArray = group1[i];
			System.out.println(extractedFromArray.toString());
		}
		
		std2.promoteToNextCourse();
		std2.promoteToNextCourse();
		std2.promoteToNextCourse();
		
		System.out.println(std2.toString());
		
		std1.promoteToNextCourse();
		System.out.println(std1.toString());
		
		
		std1.addMark(5);
		std1.addMark(1);
		std1.addMark(4);
		
		//std1.
		
		std1.addMark(3);
		
		std1.printMarks();
		
		Student std3 = new Student("Oleg", "economy", 1);
		std3.promoteToNextCourse();
		std3.promoteToNextCourse();
		
		System.out.println(std3.toString());

	}
}
