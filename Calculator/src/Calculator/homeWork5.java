package Calculator;

public class homeWork5 {
	public static void main(String[] args) {
		String[] students = new String[5];
		String Criteria = "Ya";
		int i = 0;
		students[0] = "Borys";
		students[1] = "Nadiya";
		students[2] = "Natalya";
		students[3] = "Olena";
		students[4] = "Yaroslava";

		String[] resultArray = search(students, Criteria);
		System.out.println(resultArray[i]);
	}
	

	public static String[] search(String[] arrayToSearchIn, String searchCriteria) {

		String[] filteredArray = new String[arrayToSearchIn.length];
		int i = 0;
		for (i = 0; i < arrayToSearchIn.length; i++) {
			if (arrayToSearchIn[i].contains(searchCriteria)) {
				filteredArray[i] = arrayToSearchIn[i];

			} else {

				filteredArray[i] = "";

			}
			System.out.println(filteredArray[i]);
		}
		return filteredArray;
		
	}
	

}
