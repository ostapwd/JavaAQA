package inherit;

public class Fish extends Animal {

	public Fish(String name, String color, int age) {
		super(name, color, age);
	}
	@Override
	public void move() {
		System.out.println("I am a fish and I can swim");
	}
	public void dive() {
		System.out.println("I am a fish and I can dive!");
	}

}
