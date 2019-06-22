package inherit;

public class dog extends Animal{
	
	
	public dog (String name, String color,int age ) {
		super(name, color, age);
	}
	
	@Override
	public void move() {
		System.out.println("I am a dog and i can run.");
	}
	
	public void bite() {
		System.out.println("I am dog and I can bite you!");
	}

	

}
