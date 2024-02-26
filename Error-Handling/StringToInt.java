import java.util.Scanner;

public class StringToInt {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer");
		String string = scanner.next();
		try {
			int i = Integer.parseInt(string);
			System.out.println(i);
		} catch (NumberFormatException e) {
			System.err.println("Input is not an integer");
		}
		
		scanner.close();
	}
}
