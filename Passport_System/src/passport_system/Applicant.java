package passport_system;

import java.awt.Image;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Applicant {

	private String FirstName;
	private String LastName;
	private String UserName;
	private String Password;
	private String NICNo;
	private String DOB;
	private String Gender;
	private String Religion;
	private Image image;
	private String Address;
	private int MobileNo;
	private String City;
	private String District;
	
	//Ststus
	private String Status;
	
	//Reshedule
	private String Date;
	private String Time;
	private String Message;

	Passport_Connection ob;
	Connection conn ;


	
	public Applicant(String FirstName, String lastname, String username, String password, String nicNo,
			String dob, String gender, String religion, String address, int mob, String city, String district) {
		// TODO Auto-generated constructor stub
		
		this.FirstName = FirstName;
		this.LastName = lastname;
		this.UserName = username;
		this.Password = password;
		this.NICNo = nicNo;
		this.DOB = dob;
		this.Gender = gender;
		this.Religion = religion;
		this.Address = address;
		this.MobileNo = mob;
		this.City = city;
		this.District = district;

		
	ob= new Passport_Connection() ;
	conn =   ob.Passport_Conncetion();
	
	}
	
	
	
	
	public Applicant(String username) {
		// TODO Auto-generated constructor stub
		
		this.UserName = username;
		
		ob= new Passport_Connection() ;
		conn=ob.Passport_Conncetion();
	}



	public Applicant(String username, String password) {
		// TODO Auto-generated constructor stub
		this.UserName = username;
		this.Password = password;
		
		ob= new Passport_Connection() ;
		conn=ob.Passport_Conncetion();
	}








	public void register(String firstname,String lastname,String username,String Password,String nicNo,String dob,String gender,String religion,String address,int Mob,String city,String district) {
		try {
			String sql = "Insert into Applicant(FirstName,LastName,UserName,Password,NICNo,DOB,Gender,Religion,Address,MobileNo,City,Distric) values (?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement statement = conn.prepareStatement(sql);
			
			statement.setString(1,FirstName);
			statement.setString(2,LastName);
			statement.setString(3,UserName);
			statement.setString(4,Password);
			statement.setString(5,NICNo);
			statement.setString(6,DOB);
			statement.setString(7, Gender);
			statement.setString(8,Religion);
			
			statement.setString(9, Address);
			statement.setInt(10,MobileNo);
			statement.setString(11,City);
			statement.setString(12,District);
			
			statement.executeUpdate();
			System.out.println();
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
			System.out.println(e);
		}
		
	
	}
	public void login(String username,String Password) {
		try {
		String sql = "SELECT * FROM Applicant WHERE UserName = ? and Password = ?";
		PreparedStatement statement = conn.prepareStatement(sql);
		// Set value for parameter
		statement.setString(1,UserName );
		statement.setString(2,Password);
		// Execute the query
		ResultSet resultSet = statement.executeQuery();
		// Process the results
		while (resultSet.next()) {
		 // Retrieve data from each row
		 String Uname = resultSet.getString("UserName");
		 String pswd  = resultSet.getString("Password");
		 
			}
		
		
		}catch(SQLException e) {
			System.out.println(e.getMessage());
			System.out.println(e);
		
		}
	}
		

	public void Delete(String username) { 
		try {
			 
			
			String sql = "DELETE FROM Applicant WHERE UserName = ?";
			PreparedStatement statement = conn.prepareStatement(sql);
			// Set condition for parameter
			statement.setString(1,UserName ); // Assuming ID column is the primary key
			// Execute the statement
			int rowsDeleted = statement.executeUpdate();
			
			if (rowsDeleted > 0) {
			 System.out.println("Data deleted successfully!");
			}
			else {
			 System.out.println("Data deletion Failed!");
			}
		}catch(SQLException e) {
			System.out.println(e.getMessage());
			System.out.println(e);
		}
	}
	
	
	
	public String View_Status(String userName, String nicNo) {
	    try {
	        String sql = "SELECT Status_Ap FROM status WHERE UserName = ? and NICNo = ?";
	        PreparedStatement statement = conn.prepareStatement(sql);
	        
	        statement.setString(1, userName); 
	        statement.setString(2, nicNo);    
	        
	        ResultSet resultSet = statement.executeQuery();

	        
	        if (resultSet.next()) {
	            
	            String status = resultSet.getString("Status_Ap");
	            return status; 
	        } else {
	          
	            System.out.println("No results found");
	            return "No status found"; 
	        }


	    } catch (SQLException e) {
	        e.printStackTrace();
	        System.out.println(e.getMessage());
	        return "Error fetching status"; 
	    }
	}
	
	 
	
	public String[] view_Appointment(String NicNo) {
	    try {
	        String sql = "SELECT Date, Time, Message FROM Appointment_Schedule WHERE NICno = ?";
	        PreparedStatement statement = conn.prepareStatement(sql);
	        statement.setString(1, NicNo);

	        ResultSet resultSet = statement.executeQuery();

	        
	        if (resultSet.next()) {
	           
	            String Date = resultSet.getString("Date");
	            String Time = resultSet.getString("Time");
	            String Message = resultSet.getString("Message");

	          
	            return new String[]{Date, Time, Message};
	        } else {
	          
	            System.out.println("No results found");
	           
	            return new String[]{"No date found", "No time found", "No message found"};
	        }

	    } catch (SQLException e) {
	        e.printStackTrace();
	        System.out.println(e.getMessage());
	        // Return an error message
	        return new String[]{"Error fetching date", "Error fetching time", "Error fetching message"};
	    }
	}


	// ReShedule
	public Applicant(String nICNo, String date, String time, String message) {
		this.NICNo = nICNo;
		this.Date = date;
		this.Time = time;
		this.Message =message;
		
		
		ob= new Passport_Connection() ;
		conn=ob.Passport_Conncetion();
	}


	public void ReShedule(String nICNo, String date, String time, String message) {
		try {
	        String sql = "UPDATE Appointment_Schedule SET Date = ? AND Time  = ? AND Message = ? WHERE NICno = ? ";
	        PreparedStatement statement = conn.prepareStatement(sql);

	     
	        statement.setString(1, date); 
	        statement.setString(1, time);  
	        statement.setString(1, message);  
	        
	        statement.setString(2,nICNo);  

	     
	        int rowsUpdated = statement.executeUpdate();

	        if (rowsUpdated > 0) {
	            System.out.println("Status updated successfully!");
	        } else {
	            System.out.println("No records found for the given criteria. Status update failed!");
	        }
	    } catch (SQLException e) {
	        System.out.println(e.getMessage());
	        System.out.println(e);
	    }
		
	}

	

}

	



	
	

