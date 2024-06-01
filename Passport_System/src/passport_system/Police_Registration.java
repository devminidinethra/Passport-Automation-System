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
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Police_Registration extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel Background;
	private JTextField p1;
	private JTextField p2;
	private JTextField p3;
	private JPasswordField p4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Police_Registration frame = new Police_Registration();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Police_Registration() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\OOP Final Assingment\\Pic\\flight (1).png"));
		setFont(new Font("Calibri", Font.BOLD, 40));
		setTitle("Registration");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 808, 613);
		Background = new JPanel();
		Background.setBackground(new Color(128, 128, 128));
		Background.setForeground(new Color(128, 128, 128));
		Background.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(Background);
		Background.setLayout(null);
		
		JLabel lblPid = new JLabel("PId                 :");
		lblPid.setForeground(Color.BLACK);
		lblPid.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblPid.setBounds(443, 113, 119, 25);
		Background.add(lblPid);
		
		p1 = new JTextField();
		p1.setColumns(10);
		p1.setBounds(455, 148, 311, 32);
		Background.add(p1);
		
		JLabel lblName = new JLabel("Name            :");
		lblName.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblName.setBounds(443, 190, 114, 25);
		Background.add(lblName);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p1.setText(null);
				p2.setText(null);
				p3.setText(null);
				p4.setText(null);
			}
		});
		btnNewButton_1.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 25));
		btnNewButton_1.setBounds(365, 513, 148, 41);
		Background.add(btnNewButton_1);
		
		JButton btnLogin = new JButton("Sign Up");
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBackground(new Color(0, 0, 0));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Pid= p1.getText();
				String name = p2.getText();
				String department = p3.getText();
				String password = p4.getText();		
				
				if (Pid.isEmpty() || name.isEmpty() || department.isEmpty()|| password.isEmpty()) {
		            JOptionPane.showMessageDialog(null, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
		        } else {
		        	Police ar = new Police(Pid, name, department,password);
		            ar.Singup(Pid, name, department,password);

		            // Display success message
		            JOptionPane.showMessageDialog(null, "Registration successful", "Success", JOptionPane.INFORMATION_MESSAGE);

		            
		            Police_Login ob = new Police_Login();
		            ob.setVisible(true);
		            dispose();
		        }
			}
		});
		btnLogin.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 25));
		btnLogin.setBounds(609, 513, 143, 41);
		Background.add(btnLogin);
		
		p2 = new JTextField();
		p2.setColumns(10);
		p2.setBounds(455, 222, 311, 32);
		Background.add(p2);
		
		JLabel lblDepartmant = new JLabel("Departmant :");
		lblDepartmant.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblDepartmant.setBounds(448, 277, 114, 25);
		Background.add(lblDepartmant);
		
		p3 = new JTextField();
		p3.setColumns(10);
		p3.setBounds(455, 312, 311, 32);
		Background.add(p3);
		
		JButton btnNewButton_1_1 = new JButton("Back");
		btnNewButton_1_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Police_Welcome ob = new Police_Welcome();
				ob.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 25));
		btnNewButton_1_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1_1.setBounds(82, 513, 148, 41);
		Background.add(btnNewButton_1_1);
		
		JLabel lblPassword = new JLabel("Password  :");
		lblPassword.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblPassword.setBounds(443, 363, 101, 25);
		Background.add(lblPassword);
		
		p4 = new JPasswordField();
		p4.setBounds(451, 398, 315, 41);
		Background.add(p4);
		
		JLabel Pl = new JLabel("");
		Image img = new ImageIcon (this.getClass().getResource("/po.jpg")).getImage();
		Pl.setIcon(new ImageIcon(img));

		Pl.setBounds(10, 58, 423, 428);
		Background.add(Pl);
		
		JLabel lblNewLabel_2 = new JLabel("Register your Account");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("UD Digi Kyokasho NK-R", Font.BOLD, 27));
		lblNewLabel_2.setBounds(224, 11, 338, 37);
		Background.add(lblNewLabel_2);
	}
}
