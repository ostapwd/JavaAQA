package Functions;

public class Functions {
	public static int total = 123;

	public static void printName() {
		System.out.println("Nadiia");
		System.out.println(total);
		total = total + 10;
	}

	public static void printAge() {
		System.out.println(21);
	}

	public static void printID() {
		System.out.println(4);
	}

	public static void Loop() {
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
	}

	public static void printmyname(String name) {
		System.out.println("Hello world, " + name);
	}

	public static void printmyage(String name) {
		System.out.println("My age - ");
		System.out.println("My name - " + name);
	}
	public static void printmyage(int age, String name) {
		System.out.println("My age - " + age);
		System.out.println("My name - " + name);
	}
	public static int add(int a, int b) {
		int result = a+b;
		return result;
		
	}
	public static void main(String[] args) {
		int res = add(1,2);
		System.out.println(res);
	}

}
