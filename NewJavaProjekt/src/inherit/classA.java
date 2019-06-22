package inherit;

public class classA {
	public static void main(String[] args) {
		cat c1 = new cat("Murka", "black", 2);
		cat c2 = new cat("Murka2", "white", 8);
		
		c1.printMyName();
		c1.move();
		c2.printMyName();
		c2.move();
		
		
		dog d1 = new dog("Sharik", "black", 2);
		dog d2= new dog ("Sharik2", "white", 8);
		
		d1.printMyName();
		d1.move();
		d2.printMyName();
		d2.move();
		
		fish f1 = new fish("Neo", "red", 2);
		fish f2= new fish ("Neo2", "blue", 8);
		
		f1.printMyName();
		f1.move();
		f2.printMyName();
		f2.move();
		
		Animal d3= new dog ("Sharik3", "white", 8);
		
		Animal gf3= new goldFish ("ariel", "white", 8);
		fish gf4= new goldFish ("ariel4", "white", 8);
		goldFish gf5= new goldFish ("ariel5", "white", 8);
		
		gf3.printMyName();
		gf4.printMyName();
		
		gf4.move();
		gf4.dive();
		
		gf5.printMyName();
		gf5.move();
		gf5.dive();
		gf5.magic();
		System.out.println("");
		Animal[] allAnimals = new Animal[10];
		
		allAnimals[0] = c1;
		allAnimals[1] = c2;
		allAnimals[2] = d2;
		allAnimals[3] = d2;
		allAnimals[4] = d3;
		allAnimals[5] = gf3;
		allAnimals[6] = gf4;
		allAnimals[7] = gf5;
		allAnimals[8] = f1;
		allAnimals[9] = f2;
		
		for (int i = 0; i < allAnimals.length; i++) {
			allAnimals[i].move();
		}
		
		
		
		
	}

}
