package passport_system;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Police_Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField pid;
	private JPasswordField ppass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Police_Login frame = new Police_Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public boolean checkLogin(String PID, String password) {
		 
	    String query = "SELECT * FROM police WHERE PID = ? AND Password = ?";
	    
	    try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Passport_Automation_System","root","1234");
	         PreparedStatement statement = connection.prepareStatement(query)) {

	        statement.setString(1, PID);
	        statement.setString(2, password);

	        try (ResultSet resultSet = statement.executeQuery()) {
	            return resultSet.next(); 
	        }

	    } catch (SQLException e) {
	        e.printStackTrace();
	        return false;
	    }
	}

	/**
	 * Create the frame.
	 */
	public Police_Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\OOP Final Assingment\\Pic\\flight (1).png"));
		setTitle("LogIn");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 656, 507);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setOpaque(true);
		layeredPane.setBackground(new Color(192, 192, 192));
		layeredPane.setBounds(0, 0, 642, 470);
		contentPane.add(layeredPane);
		layeredPane.setLayout(null);
		
		JLabel PlogIn = new JLabel("");
		Image img = new ImageIcon (this.getClass().getResource("/lo.png")).getImage();
		PlogIn.setIcon(new ImageIcon(img));

		PlogIn.setBounds(48, 113, 225, 253);
		layeredPane.add(PlogIn);
		
		JButton btnLogin_1 = new JButton("LogIn");
		btnLogin_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String PID = pid.getText();
		        String password = new String(ppass.getPassword());

		        if (PID.isEmpty() || password.isEmpty()) {
		            // Display an error message if either username or password is empty
		            JOptionPane.showMessageDialog(null, "Both Username and Password are required", "Login Error", JOptionPane.ERROR_MESSAGE);
		        } else {
		            
		            if (checkLogin(PID, password)) {
		                // Login Successful
		                JOptionPane.showMessageDialog(null, "Login Successful!!");
		                Police_Verification Ah = new Police_Verification ();
		                Ah.setVisible(true);
		                dispose();
		            } else {
		                // Invalid login, Error Message
		                JOptionPane.showMessageDialog(null, "Invalid UserName or Password", "Login Error", JOptionPane.ERROR_MESSAGE);
		            }
		        }
		    
			}
			
		});
		btnLogin_1.setForeground(Color.WHITE);
		btnLogin_1.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 25));
		btnLogin_1.setBackground(Color.BLACK);
		btnLogin_1.setBounds(470, 407, 143, 41);
		layeredPane.add(btnLogin_1);
		
		JLabel lblPid = new JLabel("PId                 :");
		lblPid.setForeground(Color.BLACK);
		lblPid.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblPid.setBounds(309, 148, 119, 25);
		layeredPane.add(lblPid);
		
		pid = new JTextField();
		pid.setColumns(10);
		pid.setBounds(321, 183, 285, 41);
		layeredPane.add(pid);
		
		JLabel lblPassword_1 = new JLabel("Password      :");
		lblPassword_1.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblPassword_1.setBounds(311, 250, 130, 25);
		layeredPane.add(lblPassword_1);
		
		ppass = new JPasswordField();
		ppass.setBounds(317, 285, 299, 41);
		layeredPane.add(ppass);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pid.setText(null);
				ppass.setText(null);
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 25));
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setBounds(264, 407, 148, 41);
		layeredPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Back");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Police_Welcome ob = new Police_Welcome();
				ob.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 25));
		btnNewButton_1_1.setBackground(Color.BLACK);
		btnNewButton_1_1.setBounds(38, 407, 148, 41);
		layeredPane.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("LogIn Your Account");
		lblNewLabel_2.setBackground(new Color(0, 0, 0));
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("UD Digi Kyokasho NK-R", Font.BOLD, 27));
		lblNewLabel_2.setBounds(180, 41, 338, 37);
		layeredPane.add(lblNewLabel_2);
	}

}
