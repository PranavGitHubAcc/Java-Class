
public class MethodOverloading {
	int add(int a, int b) {
		return a+b;
	}
	float add(float a, float b) {
		return a+b;
	}
	String add(String a, String b) {
		return a+b;
	}
	String add(int a, String b) {
		return a+b;
	}
	String add(String b, int a) { // changing the sequence of the parameters
		return a+b;
	}
	String add(String a, String b, String c) { // number of parameters are different
		return a+b+c;
	}
	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		System.out.println(m.add(1.2f, 2.9f));
		System.out.println(m.add(1, 2));
		System.out.println(m.add(10, "hello"));
		System.out.println(m.add("Hello", 10));
		System.out.println(m.add("RAVI", "Can't"));
		System.out.println(m.add("RAVI", "Can't", "do"));
	}
}
