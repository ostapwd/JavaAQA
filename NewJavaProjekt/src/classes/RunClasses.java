package classes;

public class RunClasses {
	public static void main(String[] args) {
		classes s1 = new classes();
		classes s2 = new classes();
		classes s3 = new classes();
		classes s4 = new classes("Oleg");
		s1.age = 22;
		s1.curs = 2;
		s1.facult = "math";
		s1.name = "Ivan";
		s2.name = "Pavlo";
		s3.name = "Sergiy";
		System.out.println(s1.name + ", " + s2.name + ", " + s3.name + ".");

		classes[] group1 = new classes[3];
		group1[0] = s1;
		group1[1] = s2;
		group1[2] = s3;
		int i;
		for (i = 0; i < group1.length; i++) {
			System.out.println(group1[i].printAllInfo());
		}
        s1.increaseCourse();
        System.out.println(s1.curs);
        s2.increaseCourse();
        s2.increaseCourse();
        System.out.println(s2.printAllInfo());
        s1.addMark(5);
        s1.addMark(1);
        s1.addMark(3);
        s1.printmarks();
        System.out.println(s4.printAllInfo());
       
         // клас повинен бути масивом, даблів, без фіксованого розміру, зробити метод який додає дані до масиву,також є метод який має 
       //дати мені один елемент зз масиву(ГЕТ), коли перевищується розмір масиву додати новий+100% розміру попереднього
	}

}
