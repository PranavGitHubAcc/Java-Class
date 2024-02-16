import java.sql.DriverManager;
import java.security.InvalidAlgorithmParameterException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.AbandonedConnectionCleanupThread;


public class LoginDemo {
	
	
	public static void main(String[] args) {
		try {
			new Password();
			Class.forName("com.mysql.cj.jdbc.Driver"); // class named Class, forName is a static method
			String url = "jdbc:mysql://localhost:3306/javaDemo";
			Connection connection = DriverManager.getConnection(url, "root", Password.getPass());
			System.out.println("Connection Established");
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from login");
//			System.out.println("Username\tPassword");
//			while(resultSet.next()) {
//				System.out.println(resultSet.getString(1)+ "\t\t"+ resultSet.getString(2));
//			}
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter username: ");
			String userName = scanner.next();
			System.out.print("Enter password: ");
			String password = scanner.next();
			int flag = 1;
			while(resultSet.next()) {
				if(userName.equals(resultSet.getString(1))  && password.equals(resultSet.getString(2))) {
					System.out.println("Login successful");
					flag = 0;
				}
			}
			if(flag == 1) {
				System.out.println("Invalid login creds");
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error");
		}
	}
}
