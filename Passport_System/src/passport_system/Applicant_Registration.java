package passport_system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Applicant_Registration extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField R1;
	private JTextField R2;
	private JTextField R3;
	private JTextField R6;
	private JTextField R7;
	private JTextField R8;
	private JPasswordField R4;
	private JTextField R5;
	private JTextField R10;
	private JTextField R11;
	private JTextField R12;
	private JTextField R13;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Applicant_Registration frame = new Applicant_Registration();
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
	public Applicant_Registration() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\OOP Final Assingment\\Pic\\flight (1).png"));
		setBackground(new Color(192, 192, 192));
		setFont(new Font("Calibri", Font.BOLD, 40));
		setTitle("Registration");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 999, 745);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 64, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JInternalFrame PersanalDetails = new JInternalFrame("Persanal Details");
		PersanalDetails.setFrameIcon(null);
		PersanalDetails.getContentPane().setBackground(new Color(128, 128, 128));
		PersanalDetails.setBounds(10, 10, 958, 466);
		contentPane.add(PersanalDetails);
		PersanalDetails.getContentPane().setLayout(null);
		
		JLabel lblFirstName = new JLabel("First Name        :");
		lblFirstName.setForeground(Color.BLACK);
		lblFirstName.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblFirstName.setBounds(10, 27, 139, 25);
		PersanalDetails.getContentPane().add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name         :");
		lblLastName.setForeground(Color.BLACK);
		lblLastName.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblLastName.setBounds(10, 83, 139, 25);
		PersanalDetails.getContentPane().add(lblLastName);
		
		JLabel lblUserName = new JLabel("User Name        :");
		lblUserName.setForeground(Color.BLACK);
		lblUserName.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblUserName.setBounds(10, 138, 139, 25);
		PersanalDetails.getContentPane().add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password          :");
		lblPassword.setForeground(Color.BLACK);
		lblPassword.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblPassword.setBounds(10, 191, 139, 25);
		PersanalDetails.getContentPane().add(lblPassword);
		
		JLabel lblDob = new JLabel("DOB                  :");
		lblDob.setForeground(Color.BLACK);
		lblDob.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblDob.setBounds(10, 294, 139, 25);
		PersanalDetails.getContentPane().add(lblDob);
		
		JLabel lblGender = new JLabel("Gender             :");
		lblGender.setForeground(Color.BLACK);
		lblGender.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblGender.setBounds(10, 340, 139, 25);
		PersanalDetails.getContentPane().add(lblGender);
		
		JLabel lblReligion = new JLabel("Religion            :");
		lblReligion.setForeground(Color.BLACK);
		lblReligion.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblReligion.setBounds(10, 390, 139, 25);
		PersanalDetails.getContentPane().add(lblReligion);
		
		R1 = new JTextField();
		R1.setColumns(10);
		R1.setBounds(159, 23, 410, 31);
		PersanalDetails.getContentPane().add(R1);
		
		R2 = new JTextField();
		R2.setColumns(10);
		R2.setBounds(159, 77, 410, 31);
		PersanalDetails.getContentPane().add(R2);
		
		R3 = new JTextField();
		R3.setColumns(10);
		R3.setBounds(159, 132, 410, 31);
		PersanalDetails.getContentPane().add(R3);
		
		R6 = new JTextField();
		R6.setColumns(10);
		R6.setBounds(159, 290, 410, 31);
		PersanalDetails.getContentPane().add(R6);
		
		R7 = new JTextField();
		R7.setColumns(10);
		R7.setBounds(159, 336, 410, 31);
		PersanalDetails.getContentPane().add(R7);
		
		R8 = new JTextField();
		R8.setColumns(10);
		R8.setBounds(159, 386, 410, 31);
		PersanalDetails.getContentPane().add(R8);
		
		R4 = new JPasswordField();
		R4.setBounds(159, 187, 410, 31);
		PersanalDetails.getContentPane().add(R4);
		
		JLabel lblNicNo = new JLabel("NIC No              :");
		lblNicNo.setForeground(Color.BLACK);
		lblNicNo.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblNicNo.setBounds(10, 244, 139, 25);
		PersanalDetails.getContentPane().add(lblNicNo);
		
		R5 = new JTextField();
		R5.setColumns(10);
		R5.setBounds(159, 238, 410, 31);
		PersanalDetails.getContentPane().add(R5);
		
		JButton btnFileUpload = new JButton("File Upload");
		btnFileUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser fileChooser = new JFileChooser();
		        int result = fileChooser.showOpenDialog(null);
		        if (result == JFileChooser.APPROVE_OPTION) {
		            try {
		                File selectedFile = fileChooser.getSelectedFile();
		                String fileName = selectedFile.getName();
		                String fileType = getFileType(selectedFile);

		                FileInputStream fis = new FileInputStream(selectedFile);

		                // Prepare database connection
		                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Passport_Automation_System","root","1234");

		                // Prepare SQL statement
		                String sql = "INSERT INTO File_Upload (file_Name, file_type, file_content ) VALUES (?, ?, ?)";
		                try (PreparedStatement statement = connection.prepareStatement(sql)) {
		                    statement.setString(1, fileName);
		                    statement.setString(2, fileType);
		                    statement.setBinaryStream(3, fis, (int) selectedFile.length());

		                    int rowsAffected = statement.executeUpdate();
		                    if (rowsAffected > 0) {
		                        JOptionPane.showMessageDialog(null, "File uploaded successfully!");
		                    } else {
		                        JOptionPane.showMessageDialog(null, "Failed to upload file.");
		                    }
		                } finally {
		                    connection.close();
		                    fis.close();
		                }
		            } catch (Exception ex) {
		                ex.printStackTrace();
		            }
		        }
		    }

		    private String getFileType(File file) {
		        String fileName = file.getName();
		        int lastDotIndex = fileName.lastIndexOf(".");
		        if (lastDotIndex != -1) {
		            return fileName.substring(lastDotIndex + 1);
		        }
		        return "";
		    }
		});
		btnFileUpload.setForeground(Color.WHITE);
		btnFileUpload.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 18));
		btnFileUpload.setBackground(Color.BLACK);
		btnFileUpload.setBounds(768, 130, 148, 41);
		PersanalDetails.getContentPane().add(btnFileUpload);
		
		JButton btnImageUpload = new JButton("Image Upload");
		btnImageUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 JFileChooser fileChooser = new JFileChooser();
			        int result = fileChooser.showOpenDialog(null);

			        if (result == JFileChooser.APPROVE_OPTION) {
			            try {
			                File selectedFile = fileChooser.getSelectedFile();
			                String fileName = selectedFile.getName();
			                String fileType = getFileType(selectedFile);

			                FileInputStream fis = new FileInputStream(selectedFile);

			                // Prepare database connection
			                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Passport_Automation_System","root","1234");

			                // Prepare SQL statement
			                String sql = "INSERT INTO File_Upload (file_Name, file_type, file_content ) VALUES (?, ?, ?)";;
			                try (PreparedStatement statement = connection.prepareStatement(sql)) {
			                    statement.setString(1, fileName);
			                    statement.setString(2, fileType);
			                    statement.setBinaryStream(3, fis, (int) selectedFile.length());

			                    // Execute SQL statement
			                    int rowsAffected = statement.executeUpdate();
			                    if (rowsAffected > 0) {
			                        JOptionPane.showMessageDialog(null, "Image uploaded successfully!");
			                    } else {
			                        JOptionPane.showMessageDialog(null, "Failed to upload image.");
			                    }
			                } finally {
			                    connection.close();
			                    fis.close();
			                }
			            } catch (Exception ex) {
			                ex.printStackTrace();
			            }
			        }
			    }

			    private String getFileType(File file) {
			        String fileName = file.getName();
			        int lastDotIndex = fileName.lastIndexOf(".");
			        if (lastDotIndex != -1) {
			            return fileName.substring(lastDotIndex + 1);
			        }
			        return "";
			    		}
		
		});
		btnImageUpload.setForeground(Color.WHITE);
		btnImageUpload.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 18));
		btnImageUpload.setBackground(Color.BLACK);
		btnImageUpload.setBounds(768, 348, 148, 41);
		PersanalDetails.getContentPane().add(btnImageUpload);
		
		JLabel File = new JLabel("");
		File.setOpaque(true);
		File.setBackground(new Color(192, 192, 192));
		Image img = new ImageIcon (this.getClass().getResource("/file_1.png")).getImage();
		File.setIcon(new ImageIcon(img));

		File.setBounds(599, 43, 148, 173);
		PersanalDetails.getContentPane().add(File);
		
		JLabel Image = new JLabel("");
		Image.setOpaque(true);
		Image.setBackground(new Color(192, 192, 192));
		Image img1 = new ImageIcon (this.getClass().getResource("/image.png")).getImage();
		Image.setIcon(new ImageIcon(img1));
		Image.setBounds(594, 266, 139, 149);
		PersanalDetails.getContentPane().add(Image);
		
		JLabel lblNewLabel_2 = new JLabel("Click Here to Upload Image →");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(742, 284, 200, 41);
		PersanalDetails.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Click Here to Upload File →");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(753, 64, 200, 41);
		PersanalDetails.getContentPane().add(lblNewLabel_2_1);
		
		JInternalFrame internalFrame = new JInternalFrame("Contact Details");
		internalFrame.setFrameIcon(null);
		internalFrame.getContentPane().setBackground(new Color(128, 128, 128));
		internalFrame.setBounds(10, 486, 958, 155);
		contentPane.add(internalFrame);
		internalFrame.getContentPane().setLayout(null);
		
		JLabel lblAddress = new JLabel(" Address            :");
		lblAddress.setForeground(Color.BLACK);
		lblAddress.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblAddress.setBounds(10, 14, 139, 25);
		internalFrame.getContentPane().add(lblAddress);
		
		R10 = new JTextField();
		R10.setColumns(10);
		R10.setBounds(159, 10, 282, 31);
		internalFrame.getContentPane().add(R10);
		
		JLabel lblMobileNo = new JLabel("Mobile No        :");
		lblMobileNo.setForeground(Color.BLACK);
		lblMobileNo.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblMobileNo.setBounds(10, 64, 139, 25);
		internalFrame.getContentPane().add(lblMobileNo);
		
		R11 = new JTextField();
		R11.setColumns(10);
		R11.setBounds(159, 60, 282, 31);
		internalFrame.getContentPane().add(R11);
		
		JLabel lblCity = new JLabel("City                 :");
		lblCity.setForeground(Color.BLACK);
		lblCity.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblCity.setBounds(501, 14, 139, 25);
		internalFrame.getContentPane().add(lblCity);
		
		R12 = new JTextField();
		R12.setColumns(10);
		R12.setBounds(650, 8, 282, 31);
		internalFrame.getContentPane().add(R12);
		
		JLabel lblDistrict = new JLabel(" District            :");
		lblDistrict.setForeground(Color.BLACK);
		lblDistrict.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblDistrict.setBounds(501, 64, 139, 25);
		internalFrame.getContentPane().add(lblDistrict);
		
		R13 = new JTextField();
		R13.setColumns(10);
		R13.setBounds(650, 58, 282, 31);
		internalFrame.getContentPane().add(R13);
		
		JButton btnNewButton_1_1 = new JButton("Back");
		btnNewButton_1_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Applicant_Welcome ob = new Applicant_Welcome();
				ob.setVisible(true);
				dispose();

			}
		});
		btnNewButton_1_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1_1.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 25));
		btnNewButton_1_1.setBounds(32, 651, 179, 41);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Clear");
		btnNewButton_1_2.setBackground(new Color(255, 255, 255));
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				R1.setText(null);
				R2.setText(null);
				R3.setText(null);
				R4.setText(null);
				R5.setText(null);
				R6.setText(null);
				R7.setText(null);
				R8.setText(null);
				R10.setText(null);
				R11.setText(null);
				R12.setText(null);
				R13.setText(null);
				
			}
		});
		btnNewButton_1_2.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 25));
		btnNewButton_1_2.setBounds(363, 651, 179, 41);
		contentPane.add(btnNewButton_1_2);
		
		
		JButton btnNewButton_1_5 = new JButton("Submit");
		btnNewButton_1_5.setBackground(new Color(255, 255, 255));
		btnNewButton_1_5.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				
			
				if (R1.getText().equals("") || R2.getText().equals("")||R3.getText().equals("")||R4.getText().equals("")||R5.getText().equals("")||R6.getText().equals("")||R7.getText().equals("")||R8.getText().equals("")||R10.getText().equals("")||R11.getText().equals("")||R12.getText().equals("")||R13.getText().equals("")) {
					
					JOptionPane.showMessageDialog(null, "Please fill Complete Information");
				}else {
				
				String firstname = R1.getText();
				String lastname = R2.getText();
				String username = R3.getText();
				String Password = R4.getText();
				String nicNo = R5.getText();
				String dob = R6.getText();
				String gender = R7.getText();
				String religion = R8.getText();
				String address = R10.getText();
				String mobileNo = R11.getText();
				String city = R12.getText();
				String district = R13.getText();
				
				int Mob =Integer.parseInt(mobileNo);
				
				JOptionPane.showMessageDialog(null, "Registration Successful!");
				
				Applicant ar = new Applicant(firstname,lastname,username,Password,nicNo,dob,gender,religion,address,Mob,city,district);
				ar.register(firstname,lastname,username,Password,nicNo,dob,gender,religion,address,Mob,city,district);
				
				Applicant_LogIn MI = new Applicant_LogIn();
				MI.setVisible(true);
				dispose();
				}
			}		
		});
		btnNewButton_1_5.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 25));
		btnNewButton_1_5.setBounds(711, 651, 173, 41);
		contentPane.add(btnNewButton_1_5);
		internalFrame.setVisible(true);
		PersanalDetails.setVisible(true);
	
	

	}
}
