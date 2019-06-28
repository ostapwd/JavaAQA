package inherit;

public class Cat extends Animal {

	public Cat(String name, String color, int age) {
		super(name, color, age);
	}
	@Override
	public void move() {
		System.out.println("I am a cat and I can jump");
	}
}
