
public class OpClass {
	public static void main(String[] args) {
		Car audi1 = new Car();
		//audi1.color = "green";
		//audi1.engine = 2.2;
		audi1.setEngine(2.2);
		
		audi1.weight = 1500;
		audi1.speed = 500;
		
		Car bmw1 = new Car();
		//bmw1.color = "red";
		//bmw1.engine = 2.0;
		bmw1.weight = 1400;		
		
		Dog d1 = new Dog();
		d1.name = "Sharik";

		//System.out.println(audi1.color);
		//System.out.println(bmw1.color);
		audi1.printMyWeight();
		bmw1.printMyWeight();
		
		audi1.setSpeed(120);
		audi1.printMySpeed();
		
		bmw1.setSpeed(25);
		bmw1.printMySpeed();
		bmw1.increaseSpeed(25);
		bmw1.printMySpeed();
	}
}
