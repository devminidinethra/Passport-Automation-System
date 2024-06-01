                                                                                                           package passport_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Passport_Connection {

	private String username;
	private String password;
	private String hostName;
	private String dbName;
	
	public Passport_Connection() {
	
		this.username = "root";
		this.password = "1234";
		this.hostName = "localhost";
		this.dbName = "Passport_Automation_System";
	}
	
	public Connection Passport_Conncetion() {
		Connection conn = null;
	try {
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Passport_Automation_System","root","1234");
		System.out.println("Connection Success");
		return conn;
		}
	catch (SQLException e) {
		System.out.println("Connection Failed");
		return conn;
	
		}
	
	}

	
}


