package inherit;

public class Dog extends Animal {

	public Dog(String name, String color, int age) {
		super(name, color, age);
	}
	@Override
	public void move() {
		System.out.println("I am a dog and I can run");
	}

	public void bite() {
		System.out.println("I am a dog and I can bite you!");
	}

}
