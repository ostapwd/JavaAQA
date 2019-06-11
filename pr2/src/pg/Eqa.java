package pg;

public class Eqa {
	public static void main(String[] args) {

		int a = 30;
		int b = 30;

		boolean compare = true;

		System.out.println(compare);

		compare = a == b;
		System.out.println("a == b ? -> " + compare);

		compare = a != b;
		System.out.println("a != b ? -> " + compare);

		compare = a > b;
		System.out.println("a > b ? -> " + compare);

		compare = a >= b;
		System.out.println("a >= b ? -> " + compare);

		compare = a < b;
		System.out.println("a < b ? -> " + compare);

		compare = a <= b;
		System.out.println("a <= b ? -> " + compare);

		String str1 = new String("hello");
		String str2 = new String("hello1");

		compare = str1 == str2;
		System.out.println("str1 == str2 ? -> " + compare);

		compare = str1.equals(str2);
		System.out.println("str1.equals(str2) ? -> " + compare);

		compare = !str1.equals(str2);
		System.out.println("!str1.equals(str2) ? -> " + compare);

		compare = str1.equals("+");
		System.out.println("str1.equals(+) ? -> " + compare);

		compare = str1.contains("llo");
		System.out.println("str1.contains(contains) ? -> " + compare);

		boolean condition1 = true;
		boolean condition2 = true;

		compare = condition1 == condition2;
		System.out.println("condition1 == condition2 ? -> " + compare);

		compare = condition1 != condition2;
		System.out.println("condition1 != condition2 ? -> " + compare);

		compare = 10 > 9 == 7 > 5;
		System.out.println("10 > 9 == 7 > 5 ? -> " + compare);

		compare = is5Equals10() == isTrue(10, 50);
		System.out.println("is5Equals10() == isTrue(10, 50) ? -> " + compare);
		
		
		compare = is5Equals10() == isTrue(10, 50);
		
		
		boolean isDressBlack = true;		
		boolean isDressLong = false;
		//boolean isDressExpensive = true;
		
		compare = isDressBlack && isDressLong;
		System.out.println("isDressBlack && isDressLong ? -> " + compare);
		
		compare = isDressBlack || isDressLong;
		System.out.println("isDressBlack && isDressLong ? -> " + compare);
		
	}

	static boolean is5Equals10() {
		return 5 == 10;
	}

	static boolean isTrue(int a, int b) {
		return a > b;
	}
}
