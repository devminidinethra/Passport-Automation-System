package passport_system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Administrator {

	private String Admin_UserName;
	private String Password;

	// Forward_Information Variables
	private String UserName;
	private String NICNo;
	private String City;

	// Send Message
	private int MobileNo;
	private String Message;

	// Status
	private String Status;

	// Appointment Schedule
	private String message;
	private String Date;
	private String time;

	// Admin Reg
	private String Email;
	private String FullName;

	Passport_Connection ob;
	Connection conn;

// Log In constructor
	public Administrator(String username, String password) {
		// TODO Auto-generated constructor stub

		this.Admin_UserName = username;
		this.Password = password;

		ob = new Passport_Connection();
		conn = ob.Passport_Conncetion();
	}

	public void LogIn(String username, String password) {
		try {
			String sql = "SELECT * FROM Admin WHERE Admin_username = ? and password = ?";
			PreparedStatement statement = conn.prepareStatement(sql);

			statement.setString(1, Admin_UserName);
			statement.setString(2, Password);

			ResultSet resultSet = statement.executeQuery();

			while (resultSet.next()) {

				String Uname = resultSet.getString("Admin_UserName");
				String pswd = resultSet.getString("Password");

			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println(e);

		}
	}

//Forward_Information constructor 

	public Administrator(String username, String nicNo, String city) {
		// TODO Auto-generated constructor stub

		this.UserName = username;
		this.NICNo = nicNo;
		this.City = city;

		ob = new Passport_Connection();
		conn = ob.Passport_Conncetion();
	}

	public void Forward_Details(String username, String nicNo, String city) {

		try {
			String sql = "Insert into ForwordVerifycation(Username,NICNo,City) values (?,?,?)";
			PreparedStatement statement = conn.prepareStatement(sql);

			statement.setString(1, UserName);
			statement.setString(2, NICNo);
			statement.setString(3, City);

			statement.executeUpdate();
			System.out.println();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println(e);
		}

	}

//Snd Message constructor 

	public Administrator(String userName, int Mob, String nicno, String message) {
		// TODO Auto-generated constructor stub

		this.UserName = userName;
		this.MobileNo = Mob;
		this.NICNo = nicno;
		this.Message = message;

		ob = new Passport_Connection();
		conn = ob.Passport_Conncetion();
	}

	public void generateMassage(String userName, int Mob, String nicno, String message) {

		try {
			String sql = "Insert into Message(UserName,MobileNo,NICNo,Message) values (?,?,?,?)";
			PreparedStatement statement = conn.prepareStatement(sql);

			statement.setString(1, UserName);
			statement.setInt(2, MobileNo);
			statement.setString(3, NICNo);
			statement.setString(4, Message);

			statement.executeUpdate();
			System.out.println();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println(e);
		}

	}

	public void Insert_Status(String username, String nicNo, String status) {
		try {
			String sql = "INSERT INTO Status(UserName, NICNo, Status_AP) VALUES (?, ?, ?)";
			PreparedStatement statement = conn.prepareStatement(sql);

			statement.setString(1, username);
			statement.setString(2, nicNo);
			statement.setString(3, status);

			statement.executeUpdate();
			System.out.println("Status inserted successfully!");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println(e);
		}
	}

	public void Update_Status(String username, String nicNo, String status) {
		try {
			String sql = "UPDATE Status SET Status_AP = ? WHERE UserName = ? AND NICNo = ?";
			PreparedStatement statement = conn.prepareStatement(sql);

			statement.setString(1, status);
			statement.setString(2, username);
			statement.setString(3, nicNo);

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

	public void Delete_Status(String username, String nicNo) {
		try {
			String sql = "DELETE FROM Status WHERE UserName = ? AND NICNo = ?";
			PreparedStatement statement = conn.prepareStatement(sql);

			statement.setString(1, username);
			statement.setString(2, nicNo);

			int rowsDeleted = statement.executeUpdate();
			if (rowsDeleted > 0) {
				System.out.println("Data deleted successfully!");
			} else {
				System.out.println("Data deletion Failed!");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println(e);
		}

	}

//Schedule Appointment
	public Administrator(String NicNo, String date, String time, String message) {
		this.NICNo = NicNo;
		this.Date = date;
		this.time = time;
		this.message = message;

		ob = new Passport_Connection();
		conn = ob.Passport_Conncetion();
	}

	public Administrator(String nicNo) {

	}

	public void Shedule_Appoinment(String NicNo, String date, String time, String message) {

		try {

			String sql = "INSERT INTO Appointment_Schedule (NICno, Date, Time, Message) VALUES (?, ?, ?, ?)";
			PreparedStatement statement = conn.prepareStatement(sql);

			statement.setString(1, NicNo);
			statement.setString(2, date);
			statement.setString(3, time);
			statement.setString(4, message);

			int rowsAffected = statement.executeUpdate();

			if (rowsAffected > 0) {
				System.out.println("Appointment scheduled successfully!");
			} else {
				System.out.println("Failed to schedule appointment!");
			}
		} catch (SQLException e) {
			System.out.println("Error scheduling appointment: " + e.getMessage());
			e.printStackTrace();

		}

	}

	public void register(String fullname, String username, String email, String password) {
		try {
			String sql = "Insert into Admin(FullName,Admin_username,Email,password) values (?,?,?,?)";
			PreparedStatement statement = conn.prepareStatement(sql);

			statement.setString(1, fullname);
			statement.setString(2, username);
			statement.setString(3, email);
			statement.setString(4, password);

			statement.executeUpdate();
			System.out.println();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println(e);
		}

	}
}
