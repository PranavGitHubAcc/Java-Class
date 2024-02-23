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
//			ResultSet resultSet = statement.executeQuery("select * from login");
//			System.out.println("Username\tPassword");
//			while(resultSet.next()) {
//				System.out.println(resultSet.getString(1)+ "\t\t"+ resultSet.getString(2));
//			}
//			Scanner scanner = new Scanner(System.in);
//			System.out.print("Enter username: ");
//			String userName = scanner.next();
//			System.out.print("Enter password: ");
//			String password = scanner.next();
//			int flag = 1;
			
//			while(resultSet.next()) {
//				if(userName.equals(resultSet.getString(1))  && password.equals(resultSet.getString(2))) {
//					System.out.println("Login successful");
//					flag = 0;
//					break;
//				}
//			}
//			if(flag == 1) {
//				System.out.println("Invalid login creds");
//			}
//			System.out.println();
//			statement.executeUpdate("insert into login values('"+userName+"','"+password+"')");
//			System.out.println("row added successfully");
			
			//ResultSet resultSet = statement.executeQuery("'insert into login values("+userName+","+password+")'")
			// Above is invalid as you use execute query and result set when you get a response
			
			
			// Update an account
			
//			Scanner scanner = new Scanner(System.in);
//			System.out.print("Enter username which you want to update: ");
//			String Uname = scanner.next();
//			System.out.print("Enter new password: ");
//			String newPass = scanner.next();
//			String updateQuery = "update login set password='"+newPass+"' where username='"+Uname+"'";
//			statement.executeUpdate(updateQuery);
//			System.out.println("Password updated.");
			
			// Delete an account
			
//			Scanner scanner = new Scanner(System.in);
//			System.out.print("Enter username which you want to delete: ");
//			String Uname = scanner.next();
//			String deleteQuery = "delete from login where username='"+Uname+"'";
//			statement.executeUpdate(deleteQuery);
//			System.out.println(Uname+" deleted.");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error");
		}
	}
}
