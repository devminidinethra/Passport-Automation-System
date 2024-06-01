package passport_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class connection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn ;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Passport_Automation_System","root","1234");
			System.out.println("Connection Success");
		}catch (SQLException e) {
			System.out.println("Connection Failed");
		}
		
	}

}
