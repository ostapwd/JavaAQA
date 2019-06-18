package classesAndObjects;

public class classesAndObjects {
	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person();
		person1.setName("Nadiia");
		person2.setAge(22);
		person2.setName("Oliia");
		person2.setAge(21);
//		person1.setNameAndAge("Nadiia", 22);
//        person1.speak();
//        int year1 = person1.calculateYearsToRetirement();
//        System.out.println("Number of years before retirement: " + year1);
//		person2.setNameAndAge("Oliia", 23);
//		person2.speak();
//		int year2 = person2.calculateYearsToRetirement();
//		System.out.println("Number of years before retirement: " + year2);

	}
}

class Person {

	private String name;
	private int age;

	public void setName(String username) {
		if (username.isEmpty()) {
			System.out.println("Error! Field name must be filled!");
		} else {
			name = username;
		}
	}

	public String getName() {
		return name;
	}

	public void setAge(int userage) {
		if(userage<0) {	
			System.out.println("Error! Age cannot be less than 0");	
		}else {
		age = userage;
	}}

	public int getAge() {
		return age;
	}
    //прості методи
	int calculateYearsToRetirement() {
		int years = 65 - age;
		return years;
	}

	void setNameAndAge(String username, int userage) {
		name = username;
		age = userage;
	}

	void speak() {
		System.out.println("Hi, my name is " + name + ". I am " + age + " years old.");
	}

	void sayHello() {
		System.out.println("Hello!");
	}
}
