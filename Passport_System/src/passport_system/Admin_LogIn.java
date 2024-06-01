package passport_system;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.Image;

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

public class Admin_LogIn extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField A1;
	private JPasswordField A2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_LogIn frame = new Admin_LogIn();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public boolean checkLogin(String UserName, String password) {
		 
	    String query = "SELECT * FROM admin WHERE Admin_username = ? AND password = ?";
	    
	    try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Passport_Automation_System","root","1234");
	         PreparedStatement statement = connection.prepareStatement(query)) {

	        statement.setString(1, UserName);
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
	public Admin_LogIn() {
		setTitle("LogIn");
		setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\OOP Final Assingment\\Pic\\flight (1).png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 689, 554);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setOpaque(true);
		layeredPane.setBackground(new Color(192, 192, 192));
		layeredPane.setBounds(0, 0, 675, 517);
		contentPane.add(layeredPane);
		
		JLabel Log = new JLabel("");
		Image img = new ImageIcon (this.getClass().getResource("/Log_3.png")).getImage();
		Log.setIcon(new ImageIcon(img));
		Log.setBounds(-24, 87, 379, 332);
		layeredPane.add(Log);
		
		JButton btnNewButton_1_1 = new JButton("Back");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin_Welcome MI = new Admin_Welcome();
				MI.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 25));
		btnNewButton_1_1.setBackground(Color.BLACK);
		btnNewButton_1_1.setBounds(55, 432, 122, 41);
		layeredPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A1.setText(null);
				A2.setText(null);
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 25));
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setBounds(270, 432, 136, 41);
		layeredPane.add(btnNewButton_1);
		
		JButton btnLogin = new JButton("LogIn");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String UserName = A1.getText();
		        String password = new String(A2.getPassword());

		        if (UserName.isEmpty() || password.isEmpty()) {
		            // Display an error message if either username or password is empty
		            JOptionPane.showMessageDialog(null, "Both Username and Password are required", "Login Error", JOptionPane.ERROR_MESSAGE);
		        } else {
		           
		            if (checkLogin(UserName, password)) {
		                // Login Successful
		                JOptionPane.showMessageDialog(null, "Login Successful!!");
		                Admin_Home Ah = new Admin_Home();
		                Ah.setVisible(true);
		                dispose();
		            } else {
		                // Invalid login, Error Message
		                JOptionPane.showMessageDialog(null, "Invalid UserName or Password", "Login Error", JOptionPane.ERROR_MESSAGE);
		            }
		        }
		    
			}
		});
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 25));
		btnLogin.setBackground(Color.BLACK);
		btnLogin.setBounds(497, 432, 136, 41);
		layeredPane.add(btnLogin);
		
		JLabel lblNewLabel = new JLabel("User Name :");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblNewLabel.setBounds(383, 157, 136, 25);
		layeredPane.add(lblNewLabel);
		
		A1 = new JTextField();
		A1.setColumns(10);
		A1.setBounds(383, 188, 270, 41);
		layeredPane.add(A1);
		
		JLabel lblPassword = new JLabel("Password  :");
		lblPassword.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblPassword.setBounds(383, 270, 101, 25);
		layeredPane.add(lblPassword);
		
		A2 = new JPasswordField();
		A2.setBounds(389, 318, 264, 41);
		layeredPane.add(A2);
		
		JLabel lblNewLabel_2 = new JLabel("LogIn Your Account");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("UD Digi Kyokasho NK-R", Font.BOLD, 27));
		lblNewLabel_2.setBounds(151, 38, 304, 37);
		layeredPane.add(lblNewLabel_2);
	}

}
