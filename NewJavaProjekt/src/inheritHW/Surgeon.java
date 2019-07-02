package inheritHW;

public abstract class Surgeon extends MedicalPersonal{
	
	public Surgeon (String name, double salaryPerDay) {
		super(name, salaryPerDay);
	}
		
	public void work() {
		System.out.println("");
	};
	

}
