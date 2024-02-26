import java.util.Scanner;

public class Division {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of the first number ");
		int a = scanner.nextInt();
		System.out.println("Enter the value of the second number ");
		int b = scanner.nextInt();
		try {
			System.out.println("a/b is: "+ a/b);
		}catch (ArithmeticException e) {
			System.err.println("Cannot divide by 0.");
			System.out.println(e);
		}
		scanner.close();
	}
	
}
