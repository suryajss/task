package task8.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Dbconnect {
	
	    public static Connection getConnection() {
	        Connection connection = null;
	        try {
	            // JDBC URL, username, and password
	            String url = "jdbc:mysql://localhost:3306/staff";
	            String username = "root";
	            String password = "root";

	            // Register JDBC driver
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            // Establish connection
	            connection = DriverManager.getConnection(url, username, password);
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	        return connection;
	    
	}


