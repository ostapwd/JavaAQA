package inheritHW;

import java.util.ArrayList;
import java.util.List;

public class Administrator extends AdminPersonal {

	public Administrator (String name, double salaryPerDay) {
		super(name, salaryPerDay);
	}
		
	public void work() {
		System.out.println("I am an administrator and I do administrative work.");
	};
	
	
}
