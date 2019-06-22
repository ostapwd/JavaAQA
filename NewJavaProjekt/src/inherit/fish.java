package inherit;

public class fish extends Animal {
	
	
	public fish (String name, String color,int age ) {
		super(name, color, age);
	}
	
	@Override
	public void move() {
		System.out.println("I am a fish and i can swim.");
	}
	
	public void dive() {
		System.out.println("I am a fish and I can dive!");
	}

}
