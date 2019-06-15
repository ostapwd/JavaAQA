package HomeWork;

import java.util.Random;

public class Fifthtask {

	public static String[] search(String[] arrayToSearch, String Criteria) {
		String[] filtered = new String[arrayToSearch.length];
		int i = 0;
	     for(;i<arrayToSearch.length;i++) {
	    	 if(arrayToSearch[i].contains(Criteria)) {
	    		 filtered[i] = arrayToSearch[i];
	    	 }else {
	    		 filtered[i]="";
	    	 }
	     }

		return filtered;

	}
}
