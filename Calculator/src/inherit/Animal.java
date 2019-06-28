package inherit;

public abstract class Animal {
	protected String name;
	public String color;
	public int age;

	public Animal() {

	}

	public Animal(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public void printMyName() {
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _");
		System.out.println("My name is " + this.name);
	}

	public abstract void move();

}
