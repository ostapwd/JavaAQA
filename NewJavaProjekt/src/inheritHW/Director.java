package inheritHW;

public class Director extends AdminPersonal{
	
	public Director (String name, double salaryPerDay) {
		super(name, salaryPerDay);
	}
	
	
	public void work() {
		System.out.println("I am a director and I manage the company.");
	};

}
