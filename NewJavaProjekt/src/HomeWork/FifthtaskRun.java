package HomeWork;

public class FifthtaskRun {
	public static void main(String[] args) {
		int i = 0;
		String cities[] = new String[5];
		cities[0] = "Kiev";
		cities[1] = "Odessa";
		cities[2] = "Kharkiv";
		cities[3] = "Dnipro";
		cities[4] = "Kiev";
//			Fifthtask.search(cities, "d");		
		String filtered[] = Fifthtask.search(cities, "d" );
		for (; i < filtered.length; i++) 
			System.out.println(filtered[i]);


    	}

	}

