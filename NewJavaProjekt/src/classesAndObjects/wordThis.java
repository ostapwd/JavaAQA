package classesAndObjects;

public class wordThis {
	public static void main(String[] args) {
		Human h1 = new Human("Bob",22);
		Human h2 = new Human("Luk",29);
		Human h3 = new Human("Laura",42);
		Human.printworkers();
		
		
		
		
		
//       Human.description = "Short description.";
//       Human.getDescription();
//       double pow = Math.pow(2, 4);
//       System.out.println(pow);
		
//	    Human1.setName("Nadiia");
//	    Human1.setAge(22);
//	    Human2.setName("Oliia");
//	    Human2.setAge(21);
//	    
//		System.out.println("Hi, my name is " + Human1.getName() + ". I am " + Human1.getAge() + " years old.");
//		System.out.println("Hi, my name is " + Human2.getName() + ". I am " + Human2.getAge() + " years old.");

	}
}

class Human {
	private String name;
	private int age;
	public static String description;
	private static int workersCount;
	
	public Human() {
		System.out.println("Empty method.");
	}
	public Human (String name, int age) {
		this.name = name;
		this.age = age;
		workersCount ++;
		System.out.println(name + ","+ age);
	}
    
	public Human (String name) {
		this.name = name;
		System.out.println(name);
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
	public static void getDescription() {
		System.out.println(description);
	}
	public static void printworkers() {
		System.out.println(workersCount);
}
}
