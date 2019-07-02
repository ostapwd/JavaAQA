package inheritHW;

public class Therapist extends MedicalPersonal {
	
	public Therapist (String name, double salaryPerDay) {
		super(name, salaryPerDay);
	}
	public void work() {
		System.out.println("I am an Therapist and I do nothing.");
	};
}
