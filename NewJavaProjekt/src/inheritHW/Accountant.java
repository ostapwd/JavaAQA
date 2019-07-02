package inheritHW;

public class Accountant extends AdminPersonal {
	
	public Accountant (String name, double salaryPerDay) {
		super(name, salaryPerDay);
	}
	
	public void work() {
		System.out.println("I am an accountant and I count salaries");
	};


}
