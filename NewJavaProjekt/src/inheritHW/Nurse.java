package inheritHW;

public class Nurse  extends MedicalPersonal{
	
	public Nurse (String name, double salaryPerDay) {
		super(name, salaryPerDay);
	}
	public void work() {
		System.out.println("I am an Nurse and I do something.");
	};
	
}
