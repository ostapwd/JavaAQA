package inheritHW;

public class CardiacSurgeon extends Surgeon {
	
	public CardiacSurgeon (String name, double salaryPerDay) {
		super(name, salaryPerDay);
	}
    
	public void work() {
		System.out.println("I am cardiac surgeon and I'm doing heart surgery");
	};
}
