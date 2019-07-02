package inheritHW;

public abstract class MedicalPersonal extends Employee {
	
	public MedicalPersonal (String name, double salaryPerDay) {
		super(name, salaryPerDay);
	}
		
	public void work() {
		System.out.println("");
	};
	

}
