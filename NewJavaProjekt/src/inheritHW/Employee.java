package inheritHW;
import java.util.ArrayList;
import java.util.List;

public abstract class Employee implements Workable{
	 protected String name;
	 double salaryPerDay;
	 private double salaryToPay;
	 protected static double totalSalary;

	public Employee() {
	}

	public Employee(String name, double salaryPerDay) {
		this.name = name;
		this.salaryPerDay = salaryPerDay;
	}
	
	public double countMySalary(int workingDays) {
		salaryToPay = salaryPerDay*workingDays;
		return salaryToPay;
	};
	
	public double countMySalary(int workingDays, double bonus) {
		salaryToPay = salaryPerDay*workingDays*bonus;
		return salaryToPay;
	};
	
	public static void countAndAccumalateSalary(Employee empl) {
		totalSalary += empl.countMySalary(20);
}
	public String toString()
	{
	    return"name: " + name;    
	}
	
	
	public abstract void work();
	
	
	public double getSalaryToPay() {
		return salaryToPay;
	}

}
