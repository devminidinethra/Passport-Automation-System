package passport_system;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Admin_Reg extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Re3;
	private JPasswordField Re4;
	private JTextField Re2;
	private JTextField Re1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_Reg frame = new Admin_Reg();
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
	public Admin_Reg() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\OOP Final Assingment\\Pic\\flight (1).png"));
		setFont(new Font("Calibri", Font.BOLD, 30));
		setTitle("Registration");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 748, 638);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 744, 591);
		contentPane.add(layeredPane);
		layeredPane.setLayout(null);
		
		JLabel Reg = new JLabel("");
		Image img = new ImageIcon (this.getClass().getResource("/r.jpg")).getImage();
		Reg.setIcon(new ImageIcon(img));
		Reg.setBounds(20, 117, 357, 360);
		layeredPane.add(Reg);
		
		JLabel lblNewLabel = new JLabel("User Name :");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblNewLabel.setBounds(395, 214, 136, 25);
		layeredPane.add(lblNewLabel);
		
		Re3 = new JTextField();
		Re3.setColumns(10);
		Re3.setBounds(407, 348, 316, 41);
		layeredPane.add(Re3);
		
		JLabel lblPassword = new JLabel("Password  :");
		lblPassword.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblPassword.setBounds(395, 418, 101, 25);
		layeredPane.add(lblPassword);
		
		Re4 = new JPasswordField();
		Re4.setBounds(408, 462, 315, 41);
		layeredPane.add(Re4);
		
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
		btnNewButton_1_1.setBounds(63, 538, 122, 41);
		layeredPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Re1.setText(null);
				Re2.setText(null);
				Re3.setText(null);
				Re4.setText(null);
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 25));
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setBounds(296, 538, 136, 41);
		layeredPane.add(btnNewButton_1);
		
		JButton btnRegistra = new JButton("Sign Up");
		btnRegistra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Re1.getText().equals("")||Re2.getText().equals("") || Re3.getText().equals("")||Re4.getText().equals("")) {
					
					JOptionPane.showMessageDialog(null, "Please fill Complete Information");
				}else {
				
				String Fullname = Re1.getText();
				String Username = Re2.getText();
				String Email = Re3.getText();
				String Password = Re4.getText();
				;
				
				
				
				JOptionPane.showMessageDialog(null, "Registration Successful!");
				
				Administrator ar = new Administrator(Fullname,Username,Email,Password);
				ar.register (Fullname,Username,Email,Password);
				
				Admin_LogIn MI = new Admin_LogIn();
				MI.setVisible(true);
				dispose();
				}
			}
		});
		btnRegistra.setForeground(Color.WHITE);
		btnRegistra.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 25));
		btnRegistra.setBackground(Color.BLACK);
		btnRegistra.setBounds(525, 538, 136, 41);
		layeredPane.add(btnRegistra);
		
		JLabel lblEmail = new JLabel("Email         :");
		lblEmail.setForeground(Color.BLACK);
		lblEmail.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblEmail.setBounds(395, 313, 136, 25);
		layeredPane.add(lblEmail);
		
		Re2 = new JTextField();
		Re2.setColumns(10);
		Re2.setBounds(407, 249, 316, 41);
		layeredPane.add(Re2);
		
		JLabel lblNewLabel_2 = new JLabel("Register your Account");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("UD Digi Kyokasho NK-R", Font.BOLD, 27));
		lblNewLabel_2.setBounds(173, 33, 338, 37);
		layeredPane.add(lblNewLabel_2);
		
		JLabel lblFullName = new JLabel("Full Name :");
		lblFullName.setForeground(Color.BLACK);
		lblFullName.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblFullName.setBounds(395, 116, 136, 25);
		layeredPane.add(lblFullName);
		
		Re1 = new JTextField();
		Re1.setColumns(10);
		Re1.setBounds(399, 151, 316, 41);
		layeredPane.add(Re1);
		
		
	}
}
