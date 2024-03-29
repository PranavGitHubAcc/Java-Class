import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.CallableStatement;
import java.sql.ResultSetMetaData;


public class CallableMetaData {
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
			ResultSetMetaData resultSetMetaData =resultSet.getMetaData();
			System.out.println("Name of table: "+ resultSetMetaData.getTableName(1));
			System.out.println("Number of columns returned are: "+ resultSetMetaData.getColumnCount());
			System.out.println("Column 1 "+ resultSetMetaData.getColumnName(1));
			System.out.println("Column 2 "+ resultSetMetaData.getColumnName(2));
			System.out.println("Column 3 "+ resultSetMetaData.getColumnName(3));
			System.out.println("Column 4 "+ resultSetMetaData.getColumnName(4));
			System.out.println("Column 5 "+ resultSetMetaData.getColumnName(5));
			System.out.println("Column 1 type "+ resultSetMetaData.getColumnTypeName(1));	
			System.out.println("Column 2 type "+ resultSetMetaData.getColumnTypeName(2));
			System.out.println("Column 3 type "+ resultSetMetaData.getColumnTypeName(3));
			System.out.println("Column 4 type "+ resultSetMetaData.getColumnTypeName(4));
			System.out.println("Column 5 type "+ resultSetMetaData.getColumnTypeName(5));
			

//			while(resultSet.next()) {
////				String city = resultSet.getString(2);
////				if (city.equals("Delhi")) {
////					System.out.println(resultSet.getInt(5));
////				}
//				
//			}
			  
			connection.close();  
			
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}
