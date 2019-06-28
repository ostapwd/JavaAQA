package inherit;

public class GoldFish extends Fish{
	public GoldFish(String name, String color, int age) {
		super(name, color, age);
	}
	@Override
	public void move() {
		System.out.println("I am a gold fish and I can swim too");
	}
	public void magic() {
		System.out.println("I am a gold fish and I can do magic!");
	}

}
