package inherit;

public class MainClass {
	public static void main(String[] args) {
		Cat c1 = new Cat("Murka", "white", 2);

//		c1.printMyName();
//		c1.move();

		Cat c2 = new Cat("Murchyk", "black", 8);

//		c2.printMyName();
//		c2.move();

		Dog d1 = new Dog("Sharik", "grey", 2);

//		d1.printMyName();
//		d1.move();

		Dog d2 = new Dog("Barbos", "black", 10);

//		d2.printMyName();
//		d2.move();
//		
		Fish f1 = new Fish("Nemo", "red", 1);

//		f1.printMyName();
//		f1.move();

		Fish f2 = new Fish("Flaunder", "blue", 2);

//		f2.printMyName();
//		f2.move();

		Animal gf1 = new GoldFish("Flaunder5", "yellow", 1);
		Fish gf2 = new GoldFish("Flaunder2", "golden", 1);
		GoldFish gf3 = new GoldFish("Flaunder3", "pink", 3);

		gf1.printMyName();

		gf2.printMyName();
		gf2.move();
		gf2.dive();

		gf3.printMyName();
		gf3.move();
		gf3.dive();
		gf3.magic();
		System.out.println("    ");
		
		Animal[] allAnimals = new Animal[9];
		allAnimals[0] = c1;
		allAnimals[1] = c2;
		allAnimals[2] = d1;
		allAnimals[3] = d2;
		allAnimals[4] = f1;
		allAnimals[5] = f2;
		allAnimals[6] = gf1;
		allAnimals[7] = gf2;
		allAnimals[8] = gf3;
		
		for (int i = 0; i < allAnimals.length; i++) {
			allAnimals[i].move();
		}
	}

}
