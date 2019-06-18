
public class Car {
	
	private String color;
	private double engine;
	int weight;
	int speed;
	
	public void setEngine(double engineToSet) {
		engine = engineToSet;
	}
	
	public void printMyWeight() {
		System.out.println(weight);
	}
	
	public void setSpeed(int speedToSet) {
		speed = speedToSet;
	}
	
	public void printMySpeed() {
		System.out.println(speed);
	}
	
	public void increaseSpeed(int speedToIncreaseOn) {
		speed = speed + speedToIncreaseOn;
	}
	
}
