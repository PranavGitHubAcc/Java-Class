
public class Exception_ {
	public static void main(String[] args) {
		
		int arrayA[] = new int[2];
		arrayA[0] = 1;
		arrayA[1] = 2;
		
		try { // Try has to come with a catch or finally. It is not sufficient on its own
			// System.out.println(arrayA[3]);
			// Once an error has occurred, it stops running the try block
			// It does not go back and continue executing the rest of the block 
			int i = 50;
			int c = i/0;
		//} catch (Exception e) {
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out of Bounds ");	
			e.printStackTrace(); // gives the location where the error has occurred
		}catch (ArithmeticException e) { // You can have multiple catch blocks.
			System.err.println(e); // Error output in red?
			System.out.println("Divide by 0");
		}catch(Exception e) {
			System.out.println("Exeption Occured");
		}finally {
			System.out.println("Print regardless of exception or not");
			// In terms of errors *not exceptions, it will not execute as the program breaks.
		}
		
		System.out.println(arrayA[1]); // Only put that line in the try catch block which you know might cause an error.
		System.out.println(arrayA[0]);
		
	}
}
