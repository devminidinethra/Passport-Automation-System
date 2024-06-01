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
import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import java.awt.Toolkit;
import javax.swing.JTextPane;

public class Admin_Home extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel Mag;
	private JPanel Applicant_de;
	private JPanel Forward_infor;
	private JTextField M1;
	private JTextField M3;
	private JTextField M4;
	private JTextField M2;
	protected Component frame;
	private JTextField Pname;
	private JTextField Pnic;
	private JTextField Pcity;
	private JPanel Insert;
	private JPanel Update;
	private JPanel Delete;
	private JTextField In1;
	private JTextField In2;
	private JTextField In3;
	private JTextField U1;
	private JTextField U2;
	private JTextField U3;
	private JTextField D1;
	private JTextField D2;
	private JPanel Shedule_app;
	private JTextField p1;
	private JTextField P2;
	private JTextField P3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_Home frame = new Admin_Home();
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
	public Admin_Home() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\OOP Final Assingment\\Pic\\flight (1).png"));
		setFont(new Font("Calibri", Font.BOLD, 40));
		setTitle("Admin");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 691, 512);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 677, 525);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 128));
		layeredPane.add(panel, "name_335614435055400");
		
		JLabel admin = new JLabel("New label");
		admin.setBounds(-23, 79, 330, 337);
		admin.setOpaque(true);
		admin.setBackground(new Color(128, 128, 128));
		Image img = new ImageIcon (this.getClass().getResource("/Admin.png")).getImage();
		panel.setLayout(null);
		admin.setIcon(new ImageIcon(img));
		panel.add(admin);
		
		JButton btnViewApplicatDetails = new JButton("Applicant Details");
		btnViewApplicatDetails.setBackground(new Color(0, 0, 0));
		btnViewApplicatDetails.setForeground(new Color(255, 255, 255));
		btnViewApplicatDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(Applicant_de);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		
		
		btnViewApplicatDetails.setFont(new Font("Calibri", Font.BOLD, 20));
		btnViewApplicatDetails.setBounds(476, 105, 185, 36);
		panel.add(btnViewApplicatDetails);
		
		JButton btnViewPoliceReport = new JButton("Forwerd Details ");
		btnViewPoliceReport.setBackground(new Color(0, 0, 0));
		btnViewPoliceReport.setForeground(new Color(255, 255, 255));
		btnViewPoliceReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(Forward_infor);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnViewPoliceReport.setFont(new Font("Calibri", Font.BOLD, 20));
		btnViewPoliceReport.setBounds(476, 214, 185, 36);
		panel.add(btnViewPoliceReport);
		
		JButton Msg = new JButton("Send Message");
		Msg.setBackground(new Color(0, 0, 0));
		Msg.setForeground(new Color(255, 255, 255));
		Msg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				layeredPane.removeAll();
				layeredPane.add(Mag);
				layeredPane.repaint();
				layeredPane.revalidate();
				
			}
		});
		Msg.setFont(new Font("Calibri", Font.BOLD, 20));
		Msg.setBounds(476, 323, 185, 36);
		panel.add(Msg);
		
		JButton btnLogout = new JButton("LogOut");
		btnLogout.setBackground(new Color(0, 0, 0));
		btnLogout.setForeground(new Color(255, 255, 255));
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 // Display a confirmation dialog
	               int result = javax.swing.JOptionPane.showConfirmDialog(frame, "Are you sure you want to LogOut?", "Exit Confirmation", javax.swing.JOptionPane.YES_NO_OPTION);
	                
	                // Check the user's choice
	                if (result == javax.swing.JOptionPane.YES_OPTION) {
	                    // If yes, exit the application
	                	 Admin_LogIn MI = new  Admin_LogIn();
	     				MI.setVisible(true);
	     				dispose();
	                }
			}
		});
		btnLogout.setFont(new Font("Calibri", Font.BOLD, 20));
		btnLogout.setBounds(10, 432, 121, 36);
		panel.add(btnLogout);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Welcome, Admin! ");
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_1_1_1.setBounds(170, 10, 242, 36);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Check out applicant details by clicking here →");
		lblNewLabel_2_1_2.setLabelFor(this);
		lblNewLabel_2_1_2.setForeground(Color.WHITE);
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_1_2.setBounds(308, 60, 351, 27);
		panel.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("Send applicant info to the police ");
		lblNewLabel_2_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_1_2_1.setBounds(317, 151, 261, 27);
		panel.add(lblNewLabel_2_1_2_1);
		
		JLabel lblNewLabel_2_1_2_1_1 = new JLabel("with a click here →");
		lblNewLabel_2_1_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_1_2_1_1.setBounds(460, 177, 153, 27);
		panel.add(lblNewLabel_2_1_2_1_1);
		
		JLabel lblNewLabel_2_1_2_1_1_1 = new JLabel("Clicking here to reach out to");
		lblNewLabel_2_1_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_1_2_1_1_1.setBounds(340, 260, 229, 27);
		panel.add(lblNewLabel_2_1_2_1_1_1);
		
		JLabel lblNewLabel_2_1_2_1_1_2 = new JLabel(" the applicant →");
		lblNewLabel_2_1_2_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_2_1_2_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_1_2_1_1_2.setBounds(482, 286, 153, 27);
		panel.add(lblNewLabel_2_1_2_1_1_2);
		
		JLabel lblNewLabel_2_1_2_1_1_2_1 = new JLabel(" Arrange meetings with a few clicks");
		lblNewLabel_2_1_2_1_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_2_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_1_2_1_1_2_1.setBounds(330, 369, 269, 27);
		panel.add(lblNewLabel_2_1_2_1_1_2_1);
		
		JLabel lblNewLabel_2_1_2_1_1_2_2 = new JLabel(" for a smooth process  →");
		lblNewLabel_2_1_2_1_1_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_1_2_1_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_1_2_1_1_2_2.setBounds(465, 395, 202, 27);
		panel.add(lblNewLabel_2_1_2_1_1_2_2);
		
		JButton btnSheduleAppoinment = new JButton("Shedule Appoinment");
		btnSheduleAppoinment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(Shedule_app);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnSheduleAppoinment.setForeground(Color.WHITE);
		btnSheduleAppoinment.setFont(new Font("Calibri", Font.BOLD, 20));
		btnSheduleAppoinment.setBackground(Color.BLACK);
		btnSheduleAppoinment.setBounds(441, 432, 220, 36);
		panel.add(btnSheduleAppoinment);
		
		Mag = new JPanel();
		Mag.setBackground(new Color(128, 128, 128));
		layeredPane.add(Mag, "name_341196628439300");
		Mag.setLayout(null);
		
		JLabel Msg_1 = new JLabel("");
		Msg_1.setForeground(new Color(128, 128, 128));
		Msg_1.setOpaque(true);
		Msg_1.setBackground(new Color(128, 128, 128));
		Image img1 = new ImageIcon (this.getClass().getResource("/Mssg.jpg")).getImage();
		
		JButton btnNewButton_1_3_1 = new JButton("Back");
		btnNewButton_1_3_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1_3_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin_Home MI = new Admin_Home();
				MI.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_3_1.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 23));
		btnNewButton_1_3_1.setBounds(10, 419, 105, 35);
		Mag.add(btnNewButton_1_3_1);
		Msg_1.setIcon(new ImageIcon(img1));
		Msg_1.setBounds(10, 114, 323, 273);
		Mag.add(Msg_1);
		
		JLabel lblUserName = new JLabel("User Name      :");
		lblUserName.setForeground(Color.BLACK);
		lblUserName.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblUserName.setBounds(358, 101, 139, 25);
		Mag.add(lblUserName);
		
		M1 = new JTextField();
		M1.setColumns(10);
		M1.setBounds(404, 136, 257, 31);
		Mag.add(M1);
		
		JLabel lblNicNo = new JLabel("NIC No            :");
		lblNicNo.setForeground(Color.BLACK);
		lblNicNo.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblNicNo.setBounds(358, 253, 139, 25);
		Mag.add(lblNicNo);
		
		M3 = new JTextField();
		M3.setColumns(10);
		M3.setBounds(404, 288, 257, 31);
		Mag.add(M3);
		
		JLabel lblMessage = new JLabel("Message         :");
		lblMessage.setForeground(Color.BLACK);
		lblMessage.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblMessage.setBounds(358, 329, 139, 25);
		Mag.add(lblMessage);
		
		M4 = new JTextField();
		M4.setColumns(10);
		M4.setBounds(404, 356, 257, 31);
		Mag.add(M4);
		
		JLabel lblFirstName = new JLabel("MobileNo       :");
		lblFirstName.setForeground(Color.BLACK);
		lblFirstName.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblFirstName.setBounds(358, 177, 139, 25);
		Mag.add(lblFirstName);
		
		M2 = new JTextField();
		M2.setColumns(10);
		M2.setBounds(404, 212, 257, 31);
		Mag.add(M2);
		
		JButton btnNewButton_1_3 = new JButton("Submit");
		btnNewButton_1_3.setBackground(new Color(0, 0, 0));
		btnNewButton_1_3.setForeground(new Color(255, 255, 255));
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (M1.getText().equals("") || M2.getText().equals("")||M3.getText().equals("")||M4.getText().equals("")) {
					
					JOptionPane.showMessageDialog(null, "Please fill Complete Information");
				}else {
				
					String UserName = M1.getText();
					String mobileNo = M2.getText();
					String nicno = M3.getText();
					String message = M4.getText();
					
					int Mob =Integer.parseInt(mobileNo);
				
				JOptionPane.showMessageDialog(null, "Message send Successfuly!");
				
				Administrator ar = new Administrator(UserName,Mob,nicno,message);
				ar.generateMassage(UserName,Mob,nicno,message);
				
				Admin_Home MI = new Admin_Home();
				MI.setVisible(true);
				dispose();
				}
			}		
			
		});
		btnNewButton_1_3.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 25));
		btnNewButton_1_3.setBounds(501, 419, 148, 41);
		Mag.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_3_1_1 = new JButton("Clear");
		btnNewButton_1_3_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				M1.setText(null);
				M2.setText(null);
				M3.setText(null);
				M4.setText(null);
			}
		});
		btnNewButton_1_3_1_1.setForeground(Color.WHITE);
		btnNewButton_1_3_1_1.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 25));
		btnNewButton_1_3_1_1.setBackground(Color.BLACK);
		btnNewButton_1_3_1_1.setBounds(226, 413, 148, 41);
		Mag.add(btnNewButton_1_3_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Ready to send some messages?");
		lblNewLabel_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1_1_1_1.setBounds(148, 26, 349, 36);
		Mag.add(lblNewLabel_1_1_1_1);
		
		
		
		Applicant_de = new JPanel();
		Applicant_de.setBackground(new Color(128, 128, 128));
		layeredPane.add(Applicant_de, "name_343819957791000");
		Applicant_de.setLayout(null);
		
		JLabel Details = new JLabel("");
		Image img2 = new ImageIcon (this.getClass().getResource("/detail.jpg")).getImage();
		Details.setIcon(new ImageIcon(img2));

		Details.setBounds(10, 83, 323, 338);
		Applicant_de.add(Details);
		
		JLabel lblNewLabel_1_1 = new JLabel("Manage Applicant Details");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(171, 36, 354, 36);
		Applicant_de.add(lblNewLabel_1_1);
		
		JButton btnNewButton_1 = new JButton("Insert ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(Insert);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
			
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 22));
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setBounds(512, 153, 155, 36);
		Applicant_de.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Update ");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(Update);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 22));
		btnNewButton_1_1.setBackground(Color.BLACK);
		btnNewButton_1_1.setBounds(512, 259, 155, 36);
		Applicant_de.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Delete");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(Delete);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnNewButton_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1_1.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 22));
		btnNewButton_1_1_1.setBackground(Color.BLACK);
		btnNewButton_1_1_1.setBounds(512, 355, 155, 36);
		Applicant_de.add(btnNewButton_1_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Click here to insert status →");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("UD Digi Kyokasho NK-R", Font.PLAIN, 17));
		lblNewLabel_2_1.setBounds(343, 116, 249, 27);
		Applicant_de.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Click here to update status →");
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("UD Digi Kyokasho NK-R", Font.PLAIN, 17));
		lblNewLabel_2_1_1.setBounds(343, 212, 249, 27);
		Applicant_de.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Click here to delete recods →");
		lblNewLabel_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1.setFont(new Font("UD Digi Kyokasho NK-R", Font.PLAIN, 17));
		lblNewLabel_2_1_1_1.setBounds(343, 318, 249, 27);
		Applicant_de.add(lblNewLabel_2_1_1_1);
		
		JButton btnBack_1 = new JButton("Back");
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin_Home MI = new Admin_Home();
				MI.setVisible(true);
				dispose();
			}
		});
		btnBack_1.setForeground(Color.WHITE);
		btnBack_1.setFont(new Font("UD Digi Kyokasho NK-R", Font.BOLD, 20));
		btnBack_1.setBackground(Color.BLACK);
		btnBack_1.setBounds(10, 431, 110, 36);
		Applicant_de.add(btnBack_1);
		
		Forward_infor = new JPanel();
		Forward_infor.setBackground(new Color(128, 128, 128));
		layeredPane.add(Forward_infor, "name_343986680051700");
		Forward_infor.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Forward information to...");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_1.setBounds(28, 23, 336, 36);
		Forward_infor.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Police");
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (Pname.getText().equals("") || Pnic.getText().equals("")||Pcity.getText().equals("")) {
					
					JOptionPane.showMessageDialog(null, "Please fill Complete Information");
				}else {
				
					String username = Pname.getText();
					String nicNo = Pnic.getText();
					String city = Pcity.getText();
				
				JOptionPane.showMessageDialog(null, "Details Forward Successfuly!");
				
				Administrator ar = new Administrator (username,nicNo,city);
				ar.Forward_Details(username,nicNo,city);
				
				Admin_Home MI = new Admin_Home();
				MI.setVisible(true);
				dispose();
				}
			}		
				
			
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("UD Digi Kyokasho NK-R", Font.BOLD, 20));
		btnNewButton.setBounds(417, 80, 125, 36);
		Forward_infor.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Forward information to police→");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("UD Digi Kyokasho NK-R", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(85, 88, 325, 21);
		Forward_infor.add(lblNewLabel_2);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(new Color(0, 0, 0));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin_Home MI = new Admin_Home();
				MI.setVisible(true);
				dispose();
			}
		});
		btnBack.setForeground(new Color(255, 255, 255));
		btnBack.setFont(new Font("UD Digi Kyokasho NK-R", Font.BOLD, 20));
		btnBack.setBounds(167, 421, 125, 36);
		Forward_infor.add(btnBack);
		
		JLabel lblUserName_1 = new JLabel("User Name      :");
		lblUserName_1.setForeground(Color.BLACK);
		lblUserName_1.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblUserName_1.setBounds(288, 160, 139, 25);
		Forward_infor.add(lblUserName_1);
		
		Pname = new JTextField();
		Pname.setColumns(10);
		Pname.setBounds(298, 198, 323, 31);
		Forward_infor.add(Pname);
		
		JLabel lblNicno = new JLabel("NICNo              :");
		lblNicno.setForeground(Color.BLACK);
		lblNicno.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblNicno.setBounds(288, 250, 139, 25);
		Forward_infor.add(lblNicno);
		
		Pnic = new JTextField();
		Pnic.setColumns(10);
		Pnic.setBounds(298, 285, 323, 31);
		Forward_infor.add(Pnic);
		
		JLabel lblCity = new JLabel("City                 :");
		lblCity.setForeground(Color.BLACK);
		lblCity.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblCity.setBounds(298, 332, 139, 25);
		Forward_infor.add(lblCity);
		
		Pcity = new JTextField();
		Pcity.setColumns(10);
		Pcity.setBounds(298, 370, 333, 31);
		Forward_infor.add(Pcity);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pname.setText(null);
				Pnic.setText(null);
				Pcity.setText(null);
			}
		});
		btnClear.setBackground(new Color(0, 0, 0));
		btnClear.setForeground(new Color(255, 255, 255));
		btnClear.setFont(new Font("UD Digi Kyokasho NK-R", Font.BOLD, 20));
		btnClear.setBounds(436, 421, 125, 36);
		Forward_infor.add(btnClear);
		
		JLabel Forward = new JLabel("");
		Image img3 = new ImageIcon (this.getClass().getResource("/Forward.jpg")).getImage();
		Forward.setIcon(new ImageIcon(img3));
		Forward.setBounds(24, 173, 229, 206);
		Forward_infor.add(Forward);
		
		Insert = new JPanel();
		Insert.setBackground(new Color(128, 128, 128));
		layeredPane.add(Insert, "name_541742259938400");
		Insert.setLayout(null);
		
		JLabel in = new JLabel("");
		Image img4 = new ImageIcon (this.getClass().getResource("/infor_1.png")).getImage();
		in.setIcon(new ImageIcon(img4));
		in.setBounds(10, 76, 400, 337);
		Insert.add(in);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Ready to insert new status?");
		lblNewLabel_1_1_2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1_1_2.setBounds(196, 10, 305, 36);
		Insert.add(lblNewLabel_1_1_2);
		
		In1 = new JTextField();
		In1.setColumns(10);
		In1.setBounds(431, 145, 218, 31);
		Insert.add(In1);
		
		JLabel lblUserName_1_2 = new JLabel("User Name      :");
		lblUserName_1_2.setForeground(Color.BLACK);
		lblUserName_1_2.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblUserName_1_2.setBounds(420, 107, 132, 25);
		Insert.add(lblUserName_1_2);
		
		JLabel lblUserName_1_1_1 = new JLabel("NIC No             :");
		lblUserName_1_1_1.setForeground(Color.BLACK);
		lblUserName_1_1_1.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblUserName_1_1_1.setBounds(421, 200, 142, 25);
		Insert.add(lblUserName_1_1_1);
		
		In2 = new JTextField();
		In2.setColumns(10);
		In2.setBounds(431, 238, 218, 31);
		Insert.add(In2);
		
		JLabel lblUserName_1_1_1_1 = new JLabel("Status             :");
		lblUserName_1_1_1_1.setForeground(Color.BLACK);
		lblUserName_1_1_1_1.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblUserName_1_1_1_1.setBounds(421, 293, 142, 25);
		Insert.add(lblUserName_1_1_1_1);
		
		In3 = new JTextField();
		In3.setColumns(10);
		In3.setBounds(431, 337, 218, 31);
		Insert.add(In3);
		
		JButton btnBack_2 = new JButton("Back");
		btnBack_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(Applicant_de);
				layeredPane.repaint();
				layeredPane.revalidate();

			}
			
		});
		btnBack_2.setForeground(Color.WHITE);
		btnBack_2.setFont(new Font("UD Digi Kyokasho NK-R", Font.BOLD, 20));
		btnBack_2.setBackground(Color.BLACK);
		btnBack_2.setBounds(40, 423, 125, 36);
		Insert.add(btnBack_2);
		
		JButton btnClear_1 = new JButton("Clear");
		btnClear_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				In1.setText(null);
				In2.setText(null);
				In3.setText(null);
			}
		
		});
		btnClear_1.setForeground(Color.WHITE);
		btnClear_1.setFont(new Font("UD Digi Kyokasho NK-R", Font.BOLD, 20));
		btnClear_1.setBackground(Color.BLACK);
		btnClear_1.setBounds(322, 423, 125, 36);
		Insert.add(btnClear_1);
		
		JButton btnClear_1_1 = new JButton("Submit");
		btnClear_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Username = In1.getText();
		        String NicNo = In2.getText();
		        String status = In3.getText();
		        

		        // Validate if all fields are filled
		        if (Username.isEmpty() || NicNo.isEmpty() ||status.isEmpty() ) {
		            JOptionPane.showMessageDialog(contentPane, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
		        } else {
		            // All fields are filled, proceed with submission
		            Administrator Pc = new Administrator (Username, NicNo, status);
		            Pc.Insert_Status(Username, NicNo, status);

		            // Display success message
		            JOptionPane.showMessageDialog(contentPane, "Submission successful", "Success", JOptionPane.INFORMATION_MESSAGE);

		           
		            layeredPane.removeAll();
					layeredPane.add(Applicant_de);
					layeredPane.repaint();
					layeredPane.revalidate();
		        }

			}
		});
		btnClear_1_1.setForeground(Color.WHITE);
		btnClear_1_1.setFont(new Font("UD Digi Kyokasho NK-R", Font.BOLD, 20));
		btnClear_1_1.setBackground(Color.BLACK);
		btnClear_1_1.setBounds(524, 423, 125, 36);
		Insert.add(btnClear_1_1);
		
		Update = new JPanel();
		Update.setBackground(new Color(128, 128, 128));
		layeredPane.add(Update, "name_541827183764199");
		Update.setLayout(null);
		
		JLabel in_2 = new JLabel("");
		Image img5 = new ImageIcon (this.getClass().getResource("/infor_1.png")).getImage();
		in_2.setIcon(new ImageIcon(img5));
		in_2.setBounds(10, 74, 400, 337);
		Update.add(in_2);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Ready to give applicant statuses a refresh? ");
		lblNewLabel_1_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 23));
		lblNewLabel_1_1_2_1.setBounds(137, 25, 444, 36);
		Update.add(lblNewLabel_1_1_2_1);
		
		JLabel lblUserName_1_2_1 = new JLabel("User Name      :");
		lblUserName_1_2_1.setForeground(Color.BLACK);
		lblUserName_1_2_1.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblUserName_1_2_1.setBounds(438, 105, 132, 25);
		Update.add(lblUserName_1_2_1);
		
		U1 = new JTextField();
		U1.setColumns(10);
		U1.setBounds(449, 143, 218, 31);
		Update.add(U1);
		
		JLabel lblUserName_1_1_1_2 = new JLabel("NIC No             :");
		lblUserName_1_1_1_2.setForeground(Color.BLACK);
		lblUserName_1_1_1_2.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblUserName_1_1_1_2.setBounds(439, 198, 142, 25);
		Update.add(lblUserName_1_1_1_2);
		
		U2 = new JTextField();
		U2.setColumns(10);
		U2.setBounds(449, 236, 218, 31);
		Update.add(U2);
		
		JLabel lblUserName_1_1_1_1_1 = new JLabel("Status             :");
		lblUserName_1_1_1_1_1.setForeground(Color.BLACK);
		lblUserName_1_1_1_1_1.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblUserName_1_1_1_1_1.setBounds(439, 291, 142, 25);
		Update.add(lblUserName_1_1_1_1_1);
		
		U3 = new JTextField();
		U3.setColumns(10);
		U3.setBounds(449, 335, 218, 31);
		Update.add(U3);
		
		JButton btnClear_1_1_1 = new JButton("Update");
		btnClear_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = U1.getText();
		        String nicNo = U2.getText();
		        String status = U3.getText();
		        
		        // Validate if all fields are filled
		        if (username.isEmpty() || nicNo.isEmpty() ||status.isEmpty() ) {
		            JOptionPane.showMessageDialog(contentPane, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
		        } else {
		            // All fields are filled, proceed with update
		            Administrator Pc = new Administrator (username, nicNo, status);
		            Pc.Update_Status(username, nicNo, status);

		            // Display success message
		            JOptionPane.showMessageDialog(contentPane, "Update successful", "Success", JOptionPane.INFORMATION_MESSAGE);

		           
		            layeredPane.removeAll();
					layeredPane.add(Applicant_de);
					layeredPane.repaint();
					layeredPane.revalidate();
		        }
			}
		});
		btnClear_1_1_1.setForeground(Color.WHITE);
		btnClear_1_1_1.setFont(new Font("UD Digi Kyokasho NK-R", Font.BOLD, 20));
		btnClear_1_1_1.setBackground(Color.BLACK);
		btnClear_1_1_1.setBounds(520, 421, 125, 36);
		Update.add(btnClear_1_1_1);
		
		JButton btnClear_1_2 = new JButton("Clear");
		btnClear_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				U1.setText(null);
				U2.setText(null);
				U3.setText(null);
			}
		});
		btnClear_1_2.setForeground(Color.WHITE);
		btnClear_1_2.setFont(new Font("UD Digi Kyokasho NK-R", Font.BOLD, 20));
		btnClear_1_2.setBackground(Color.BLACK);
		btnClear_1_2.setBounds(304, 421, 125, 36);
		Update.add(btnClear_1_2);
		
		JButton btnBack_2_1 = new JButton("Back");
		btnBack_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(Applicant_de);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnBack_2_1.setForeground(Color.WHITE);
		btnBack_2_1.setFont(new Font("UD Digi Kyokasho NK-R", Font.BOLD, 20));
		btnBack_2_1.setBackground(Color.BLACK);
		btnBack_2_1.setBounds(58, 421, 125, 36);
		Update.add(btnBack_2_1);
		
		Delete = new JPanel();
		Delete.setBackground(new Color(128, 128, 128));
		layeredPane.add(Delete, "name_541831308913000");
		Delete.setLayout(null);
		
		JLabel in_3 = new JLabel("");
		Image img6 = new ImageIcon (this.getClass().getResource("/infor_1.png")).getImage();
		in_3.setIcon(new ImageIcon(img6));
		in_3.setBounds(23, 72, 400, 337);
		Delete.add(in_3);
		
		JLabel lblUserName_1_2_1_1 = new JLabel("User Name      :");
		lblUserName_1_2_1_1.setForeground(Color.BLACK);
		lblUserName_1_2_1_1.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblUserName_1_2_1_1.setBounds(433, 120, 132, 25);
		Delete.add(lblUserName_1_2_1_1);
		
		D1 = new JTextField();
		D1.setColumns(10);
		D1.setBounds(449, 174, 218, 31);
		Delete.add(D1);
		
		JLabel lblUserName_1_1_1_2_1 = new JLabel("NIC No             :");
		lblUserName_1_1_1_2_1.setForeground(Color.BLACK);
		lblUserName_1_1_1_2_1.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblUserName_1_1_1_2_1.setBounds(433, 238, 142, 25);
		Delete.add(lblUserName_1_1_1_2_1);
		
		D2 = new JTextField();
		D2.setColumns(10);
		D2.setBounds(449, 297, 218, 31);
		Delete.add(D2);
		
		JButton btnBack_2_1_1 = new JButton("Back");
		btnBack_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(Applicant_de);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnBack_2_1_1.setForeground(Color.WHITE);
		btnBack_2_1_1.setFont(new Font("UD Digi Kyokasho NK-R", Font.BOLD, 20));
		btnBack_2_1_1.setBackground(Color.BLACK);
		btnBack_2_1_1.setBounds(58, 422, 125, 36);
		Delete.add(btnBack_2_1_1);
		
		JButton btnClear_1_2_1 = new JButton("Clear");
		btnClear_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				D1.setText(null);
				D2.setText(null);
			}
		});
		btnClear_1_2_1.setForeground(Color.WHITE);
		btnClear_1_2_1.setFont(new Font("UD Digi Kyokasho NK-R", Font.BOLD, 20));
		btnClear_1_2_1.setBackground(Color.BLACK);
		btnClear_1_2_1.setBounds(327, 422, 125, 36);
		Delete.add(btnClear_1_2_1);
		
		JButton btndelete = new JButton("Delete");
		btndelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  String Username = D1.getText();
			        String NicNo = D2.getText();
			        
			       
			        int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete?", "Confirmation", JOptionPane.YES_NO_OPTION);

			        if (choice == JOptionPane.YES_OPTION) {
			           
			        	Administrator ob = new Administrator(Username, NicNo);
			            ob.Delete_Status(Username, NicNo);
			            
			            layeredPane.removeAll();
						layeredPane.add(Applicant_de);
						layeredPane.repaint();
						layeredPane.revalidate();
			        }
			       
			       
			    }
		});
		btndelete.setForeground(Color.WHITE);
		btndelete.setFont(new Font("UD Digi Kyokasho NK-R", Font.BOLD, 20));
		btndelete.setBackground(Color.BLACK);
		btndelete.setBounds(520, 422, 125, 36);
		Delete.add(btndelete);
		
		JLabel lblNewLabel_1_1_2_1_1 = new JLabel("Ready to give applicant details a clean sweep?");
		lblNewLabel_1_1_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 23));
		lblNewLabel_1_1_2_1_1.setBounds(126, 20, 472, 36);
		Delete.add(lblNewLabel_1_1_2_1_1);
		
		Shedule_app = new JPanel();
		Shedule_app.setBackground(new Color(128, 128, 128));
		layeredPane.add(Shedule_app, "name_592203497057100");
		Shedule_app.setLayout(null);
		
		JLabel lblNewLabel_1_1_2_1_2 = new JLabel("Ready to schedule appointments effortlessly?");
		lblNewLabel_1_1_2_1_2.setForeground(new Color(0, 0, 64));
		lblNewLabel_1_1_2_1_2.setFont(new Font("Times New Roman", Font.BOLD, 23));
		lblNewLabel_1_1_2_1_2.setBounds(78, 10, 463, 36);
		Shedule_app.add(lblNewLabel_1_1_2_1_2);
		
		JLabel App = new JLabel("");
		Image img7 = new ImageIcon (this.getClass().getResource("/Appoin.png")).getImage();
		App.setIcon(new ImageIcon(img7));

		App.setBounds(0, 114, 298, 268);
		Shedule_app.add(App);
		
		p1 = new JTextField();
		p1.setColumns(10);
		p1.setBounds(123, 67, 189, 31);
		Shedule_app.add(p1);
		
		JLabel lblNicno_1 = new JLabel("NICNo  :");
		lblNicno_1.setFont(new Font("Calibri", Font.PLAIN, 25));
		lblNicno_1.setBounds(26, 70, 87, 31);
		Shedule_app.add(lblNicno_1);
		
		JLabel lblDate = new JLabel("Date    :");
		lblDate.setFont(new Font("Calibri", Font.PLAIN, 23));
		lblDate.setBounds(311, 131, 87, 31);
		Shedule_app.add(lblDate);
		
		P2 = new JTextField();
		P2.setColumns(10);
		P2.setBounds(419, 128, 241, 37);
		Shedule_app.add(P2);
		
		JLabel lblTime = new JLabel("Time    :");
		lblTime.setFont(new Font("Calibri", Font.PLAIN, 23));
		lblTime.setBounds(311, 207, 87, 31);
		Shedule_app.add(lblTime);
		
		P3 = new JTextField();
		P3.setColumns(10);
		P3.setBounds(418, 205, 241, 37);
		Shedule_app.add(P3);
		
		JLabel lblMessage_1 = new JLabel("Message:");
		lblMessage_1.setFont(new Font("Calibri", Font.PLAIN, 23));
		lblMessage_1.setBounds(308, 276, 106, 31);
		Shedule_app.add(lblMessage_1);
		
		JTextPane p4 = new JTextPane();
		p4.setBounds(418, 265, 241, 92);
		Shedule_app.add(p4);
		
		JButton btnNewButton_1_3_1_2 = new JButton("Back");
		btnNewButton_1_3_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin_Home MI = new Admin_Home();
				MI.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_3_1_2.setForeground(Color.WHITE);
		btnNewButton_1_3_1_2.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1_3_1_2.setBackground(Color.BLACK);
		btnNewButton_1_3_1_2.setBounds(26, 408, 124, 41);
		Shedule_app.add(btnNewButton_1_3_1_2);
		
		JButton btnNewButton_1_2 = new JButton("Clear");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p1.setText(null);
				P2.setText(null);
				P3.setText(null);
				p4.setText(null);
			}
		});
		btnNewButton_1_2.setForeground(Color.WHITE);
		btnNewButton_1_2.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 25));
		btnNewButton_1_2.setBackground(Color.BLACK);
		btnNewButton_1_2.setBounds(242, 407, 148, 41);
		Shedule_app.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_2_1 = new JButton("Schedule");
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nicNo = p1.getText();
		        String date = P2.getText();
		        String time = P3.getText();
		        String message = p4.getText();

		        Administrator admin = new Administrator(nicNo, date, time, message);

		        // Display a confirmation dialog
		        int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to schedule this appointment?", "Confirmation", JOptionPane.YES_NO_OPTION);

		        if (choice == JOptionPane.YES_OPTION) {
		            // If user clicks "Yes," proceed with scheduling the appointment
		            admin.Shedule_Appoinment(nicNo, date, time, message);

		            //  display a success message
		            JOptionPane.showMessageDialog(null, "Appointment scheduled successfully!");
		            
		            Admin_Home MI = new Admin_Home();
					MI.setVisible(true);
					dispose();
		        }
		        
		    }
			
		});
		btnNewButton_1_2_1.setForeground(Color.WHITE);
		btnNewButton_1_2_1.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 25));
		btnNewButton_1_2_1.setBackground(Color.BLACK);
		btnNewButton_1_2_1.setBounds(480, 407, 148, 41); 
		Shedule_app.add(btnNewButton_1_2_1);
	}

}
