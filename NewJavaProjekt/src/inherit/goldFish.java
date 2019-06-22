package inherit;

public class goldFish extends fish {
	
	public goldFish (String name, String color,int age ) {
		super(name, color, age);
	}
	
	@Override
	public void move() {
		System.out.println("I am a goldFish and i can swim too.");
	}
	
	public void dive() {
		System.out.println("I am a goldFish and I can dive!");
	}
	
	public void magic() {
		System.out.println("I am a goldFish and I can do magic!");
	}

}
