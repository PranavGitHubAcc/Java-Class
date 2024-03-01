import java.util.Scanner;

public class InvalidAgeExceptionHandler{
	
	static void checkAge(int a) throws InvalidAgeException {
		if(a<18) {
			throw new InvalidAgeException("Too young");
		}else {
			System.out.println("Welcome");
		}
	}
	
	static void checkAgeHandler(int a) throws InvalidAgeException{
		checkAge(a);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an age: ");
		int a = scanner.nextInt();
		
		
		try {
			checkAgeHandler(a);
		} catch (InvalidAgeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}

class InvalidAgeException extends Exception{

	public InvalidAgeException(String message) {
		super(message);
		
	}
}
