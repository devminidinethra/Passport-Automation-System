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
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class Applicant_LogIn extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField UN;
	private JPasswordField Psd;
	protected Component frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Applicant_LogIn frame = new Applicant_LogIn();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public boolean checkLogin(String UserName, String password) {
		 
	    String query = "SELECT * FROM Applicant WHERE UserName = ? and Password = ?";
	    
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
	public Applicant_LogIn() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\OOP Final Assingment\\Pic\\flight (1).png"));
		setFont(new Font("Calibri", Font.BOLD, 40));
		setTitle("LogIn");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1072, 597);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		Image img = new ImageIcon (this.getClass().getResource("/LogIn_1.png")).getImage();
		contentPane.setLayout(null);
	
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(-12, 0, 613, 570);
		contentPane.add(layeredPane);
		layeredPane.setLayout(null);
		
		JLabel LogIn = new JLabel("\r\n");
		LogIn.setOpaque(true);
		LogIn.setBackground(new Color(0, 128, 255));
		LogIn.setBounds(-13, -3, 659, 581);
		layeredPane.add(LogIn);
		LogIn.setIcon(new ImageIcon(img));
		
		JLabel lblNewLabel = new JLabel("User Name :");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblNewLabel.setBounds(638, 158, 114, 25);
		contentPane.add(lblNewLabel);
		
		UN = new JTextField();
		UN.setBounds(638, 212, 400, 41);
		contentPane.add(UN);
		UN.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password  :");
		lblPassword.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblPassword.setBounds(638, 280, 114, 25);
		contentPane.add(lblPassword);
		
		Psd = new JPasswordField();
		Psd.setBounds(638, 326, 400, 41);
		contentPane.add(Psd);
		
		JButton btnNewButton = new JButton("Clear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UN.setText(null);
				Psd.setText(null);
			}
		});
		btnNewButton.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 25));
		btnNewButton.setBounds(788, 453, 97, 41);
		contentPane.add(btnNewButton);
		
		JButton btnLogin = new JButton("LogIn");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			        String UserName = UN.getText();
			        String password = new String(Psd.getPassword());

			        if (UserName.isEmpty() || password.isEmpty()) {
			            // Display an error message if either sername or password is empty
			            JOptionPane.showMessageDialog(null, "Both Username and Password are required", "Login Error", JOptionPane.ERROR_MESSAGE);
			        } else {
			           
			            if (checkLogin(UserName, password)) {
			                // Login Successful
			                JOptionPane.showMessageDialog(null, "Login Successful!!");
			                Applicant_Home MI = new Applicant_Home();
		     				MI.setVisible(true);
		     				dispose();
			            } else {
			                // Invalid login, Error Message
			                JOptionPane.showMessageDialog(null, "Invalid UserName or Password", "Login Error", JOptionPane.ERROR_MESSAGE);
			            }
			        }
			    }
		});
		btnLogin.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 25));
		btnLogin.setBounds(936, 453, 102, 41);
		contentPane.add(btnLogin);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Applicant_Welcome ob = new Applicant_Welcome();
				ob.setVisible(true);
				dispose();

				
			}
		});
		btnBack.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 25));
		btnBack.setBounds(638, 453, 85, 41);
		contentPane.add(btnBack);
		
		JLabel lblWelcomeBack = new JLabel("Hello,Welcome Back");
		lblWelcomeBack.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lblWelcomeBack.setBounds(693, 76, 260, 49);
		contentPane.add(lblWelcomeBack);
		
		JLabel lblLogin = new JLabel("LogIn");
		lblLogin.setBackground(new Color(192, 192, 192));
		lblLogin.setOpaque(true);
		lblLogin.setForeground(new Color(0, 0, 128));
		lblLogin.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 30));
		lblLogin.setBounds(766, 17, 85, 49);
		contentPane.add(lblLogin);
		
	}

	protected boolean isValidLogin(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}
}
