import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.CallableStatement;


public class CallableDemo {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch (ClassNotFoundException e) {
			System.out.println("Class not loaded in memory");
			
		}
		
		try {
			new Password();
			String url = "jdbc:mysql://localhost:3306/world";
			Connection connection = DriverManager.getConnection
					(url, "root", Password.getPass());
			System.out.println("Connection Established");
			String querString = "{call proc_}";
			CallableStatement callableStatement = connection.prepareCall(querString);
			ResultSet resultSet = callableStatement.executeQuery();
			while(resultSet.next()) {
				String city = resultSet.getString(2);
				if (city.equals("Delhi")) {
					System.out.println(resultSet.getInt(5));
				}
				
			}
			  
			connection.close();  
			
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}
