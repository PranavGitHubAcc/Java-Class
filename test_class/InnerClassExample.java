
public class InnerClassExample {
	private int outerVariable = 10;
	
	public int getOuterVariable() {
		return outerVariable;
	}
	
	class Inner1{ // Inner class (not static)
		
		public void display() {
			System.out.println("Inner class method. Outer variable: "+ outerVariable);
		}
	}
	
	public static void main(String[] args) {
		InnerClassExample i = new InnerClassExample();
		System.out.println("Value of outerclass variable is: "+ i.getOuterVariable());
		InnerClassExample.Inner1 i1 = i.new Inner1();
		
		i1.display();
	}
}


class Inner3{} // Not an inner class

