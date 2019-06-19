package Students;

public class Group {
	public static void main(String[] args) {
		Students student1 = new Students();
		student1.firstName = "Andriy";
		student1.lastName = "Snow";

		Students student2 = new Students();
		student2.firstName = "Olya";
		student2.lastName = "Dou";

		Students student3 = new Students();
		student3.firstName = "Yaroslava";
		student3.lastName = "Pasteruk";

		System.out.println(student1.firstName);
		System.out.println(student2.firstName);
		System.out.println(student3.firstName);

		Students[] group1 = new Students[3];
		group1[0] = student1;
		group1[1] = student2;
		group1[2] = student3;
		for (int i = 0; i < group1.length; i++) {
			
			Students extractedFromArray = group1[i];
			
			System.out.println(extractedFromArray.toString());

		}
		student2.upgradeCourse();
		student2.upgradeCourse();
		student2.upgradeCourse();
		
		System.out.println(student2.toString());
		
		student1.upgradeCourse();
		System.out.println(student1.toString());
		
		student1.setMark(5);
		student1.setMark(1);
		student1.setMark(4);
		student1.setMark(3);
		
		
		student1.printMarks();
		
		Students student4 = new Students("User", "Super", "Economy", 2);
		System.out.println(student4.toString());
	}

}
