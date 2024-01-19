package test_class;

public class SimpleConstructor {
	int a;
	
	public SimpleConstructor() {
		System.out.println("Defualt constructor called");
		a = 10;
	}
	public SimpleConstructor(int a) {
		System.out.println("Parameterized constructor called");
		this.a = a;
	}
	

	public static void main(String[] args) {
		SimpleConstructor simpleconstructor = new SimpleConstructor();
		System.out.println(simpleconstructor.a);
		SimpleConstructor simpleconstructor1 = new SimpleConstructor(100);
		System.out.println(simpleconstructor1.a);
	}
}
