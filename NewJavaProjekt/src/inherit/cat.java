package inherit;

public class cat extends Animal{
	
	public cat (String name, String color,int age ) {
		super(name, color, age);
	}
	@Override
	public void move() {
		System.out.println("I am a cat and i can jump.");
	}

}
