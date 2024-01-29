// Java program to convert primitive into objects
public class Wrapper {
	public static void main(String[] args) {
		int a = 20;
		
		System.out.println("a is: "+ a );// sysout uses autoboxing
		System.out.println("a is: "+ String.valueOf(a)); // boxing
		
		Integer i = Integer.valueOf(a); // converting int to Integer (not used)
		Integer j = a; // auto boxing, compiler directly writes Integer.valueOf(a);
		
		
		int x = j.intValue(); // unboxing
		float f1 = j.floatValue();
		
		
		float f2 = j; // auto unboxing
		double f3 = j;
		long f4 = j;
		
		System.out.println(f2 +" "+ f3 +" "+ f4);
		System.out.println(a + " "+ i+ " "+ j); 
		System.out.println(x+" "+f1);
	}
}
