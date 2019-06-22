package arrayClass;

import classes.Student;

public class countAvarageMark {
	static double AvarageMark;

	public static double countAvarageMark(Student student) {
		double s = 0;
		for (int i = 0; i < student.getLength(); i++) {
			s += student.get(i);
		}
		s=s/ student.getLength();
		return s;
	};
}
