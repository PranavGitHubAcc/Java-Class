
public class InnerClassExample {
	private int outerVariable = 10;
	private static int staticVar = 5;
	
	public int getOuterVariable() {
		return outerVariable;
	}
	
	
	// Inner class (not static)
	class Inner1{ 
		
		void display() {
			// can access outer class variables
			System.out.println("Inner class method. Outer variable: "+ outerVariable);
		}
	}
	
	// Static inner class
	static class Inner2{
		void display() {
			// Cannot use outer class variables
			System.out.println("Static class method: "+ staticVar);
		}
	}
	
	void useStaticNestedClass() {
		Inner2 i = new Inner2();
		i.display();
	}
	
	
	// Local inner class
	// Defined within a block of code (method)
	// Cannot have access specifiers (public, private, etc.)
	// Cannot be static
	// variables - 
	
	void outerClassMethod() {
		final int outerFinalVariable = 10;
		
		class LocalInner {
			void display() {
				System.out.println("Local inner class method called. Outer var: "+ outerVariable);
				System.out.println("Final varaible of the enclosing method: "+ outerFinalVariable);
			}
		}
		
		LocalInner l = new LocalInner();
		l.display();
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		InnerClassExample i = new InnerClassExample();
		System.out.println("Value of outerclass variable is: "+ i.getOuterVariable());
		
		
		//non static
		InnerClassExample.Inner1 i1 = i.new Inner1();
		i1.display();
		
		
		
		//static 
		i.useStaticNestedClass(); // using method function to which uses static
		InnerClassExample.Inner2 i2 = new InnerClassExample.Inner2();
		i2.display();
		
		
		// Local class
		i.outerClassMethod();
		
		// Anonymous Inner class uses interface.
		
		
	}
}


class Inner3{} // Not an inner class

