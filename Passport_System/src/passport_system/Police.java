package passport_system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Police {
	
	private String PId;
	private String Name;
	private String Department;
	private String Password;
	
	//Police Verification
	private String UserName;
	private String NIC;
	private String Character;
	private String Passport;
	
	Passport_Connection ob;
	Connection conn ;
	
	
	// LogIn constructor




	public void Singup(String pid, String name, String department, String password) {
	    try {
	        String sql = "INSERT INTO Police(PID, Name, Department, Password) VALUES (?, ?, ?, ?)";
	        PreparedStatement statement = conn.prepareStatement(sql);

	        statement.setString(1, pid);
	        statement.setString(2, name);
	        statement.setString(3, department);
	        statement.setString(4, password);

	        statement.executeUpdate();
	        System.out.println("Data inserted successfully");

	    } catch (SQLException e) {
	        System.out.println(e.getMessage());
	        e.printStackTrace();
	    }
	}

	
	//Constractor for Police_verification
	public Police(String Username, String nicNo, String character, String passport) {

	this.UserName = Username;
	this.NIC = nicNo;
	this.Character = character;
	this.Passport = passport;
	
	ob= new Passport_Connection() ;
	conn=ob.Passport_Conncetion();
	
}



	public void ProvideReport(String Username, String nicNo, String character, String passport) {
		try {
			
		String sql = "Insert into Police_Verification(Username,NICNo,character_verify,Passport) values (?,?,?,?)";
		
		PreparedStatement statement = conn.prepareStatement(sql);
		
		statement.setString(1,UserName);
		statement.setString(2,NIC);
		statement.setString(3,Character);
		statement.setString(4,Passport);
	
		statement.executeUpdate();
		System.out.println();
		
			}catch(SQLException e) {
		System.out.println(e.getMessage());
		System.out.println(e);
		}
	

	}
	
	public void LogIn(String PID, String password) {
		try {
			String sql ="SELECT * FROM police WHERE PID = ? AND Password = ?";
			PreparedStatement statement = conn.prepareStatement(sql);
			
			statement.setString(1,PID );
			statement.setString(2,Password);
			
			ResultSet resultSet = statement.executeQuery();
			
			while (resultSet.next()) {
			
			 String policeId = resultSet.getString("PID");
			 String pswd  = resultSet.getString("Password");
			 
				}
			
			
			}catch(SQLException e) {
				System.out.println(e.getMessage());
				System.out.println(e);
			
			}
		}

}
	

