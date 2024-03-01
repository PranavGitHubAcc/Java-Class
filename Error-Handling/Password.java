import java.util.Scanner;

class PasswordVal extends Exception{
	public PasswordVal(String message) {
		super(message);
	}
}

public class Password {
	
	static void checkPassword(String password) throws PasswordVal {
		if(password.length() < 7) {
			throw new PasswordVal("Password is too small.");
		}else if (!(password.contains("!") || password.contains("$") || password.contains("#"))) {
			throw new PasswordVal("The password must contain $, ! or #");
		}else {
			System.out.println("Good password");
		}
	}
	
	static void checkPasswordHandler(String userPasswordString) throws PasswordVal{
		checkPassword(userPasswordString);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String userPasswordString = scanner.next();
		System.out.println(userPasswordString);
		try {
			checkPasswordHandler(userPasswordString);
		} catch (PasswordVal e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scanner.close();
	}
}
