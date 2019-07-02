package inheritHW;

public class Neurosurgeon extends Surgeon {
	
	public Neurosurgeon (String name, double salaryPerDay) {
		super(name, salaryPerDay);
	}
	
	
	public void work() {
		System.out.println("I am neurosurgeon and I'm doing the surgery");
	};

}
