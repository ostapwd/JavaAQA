package inheritHW;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class RunEmployee {

	public static void main(String[] args) {
		List<Employee> medicalSuff = new ArrayList<Employee>();
		Administrator Administrator1 = new Administrator("Ivan", 5);
		Accountant Accountant1 = new Accountant("Oleg", 4);
		Director Director1 = new Director("Oliia", 9);
		Neurosurgeon Neurosurgeon1 = new Neurosurgeon("Pavlo", 6);
		CardiacSurgeon CardiacSurgeon1 = new CardiacSurgeon("Denys", 7);
		Therapist Therapist1 = new Therapist("Nadiia", 8);
		Nurse Nurse1 = new Nurse("Mariya", 3);

		
		medicalSuff.add(Administrator1);
		medicalSuff.add(Accountant1);
		medicalSuff.add(Director1);
		medicalSuff.add(Neurosurgeon1);
		medicalSuff.add(CardiacSurgeon1);
		medicalSuff.add(Therapist1);
		medicalSuff.add(Nurse1);
		for (int i = 0; i < medicalSuff.size(); i++) {
			System.out.println(medicalSuff.get(i).toString());
		}

		for (int i = 0; i < medicalSuff.size(); i++) {
			Employee.countAndAccumalateSalary(medicalSuff.get(i));
		}
		System.out.println("Total salary: "+Employee.totalSalary);
		 for (int i = 0; i < medicalSuff.size(); i++) {
			System.out.println(medicalSuff.get(i).toString() + " Salary to pay: " + medicalSuff.get(i).getSalaryToPay());
		}
		 Map<Integer, String> map = new HashMap<>();
		map.put(123, "Nadiya");
		map.put(1234, "Oliia");
		map.put(12345, "Ivan");
		
		System.out.println(map.get(123));
		map.put(123, "Pavlo");
		System.out.println(map.get(123));
		

	}
}
