package passport_system;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import java.awt.Component;

import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import javax.swing.JTextPane;

public class Applicant_Home extends JFrame {

	private static final long serialVersionUID = 1L;
	protected static final Component frame = null;
	private JPanel contentPane;
	private JTextField Ap2;
	private JTextField Ap3;
	private JTextField Ap1;
	private JPanel View_App;
	private JPanel View;
	private JTextField V1;
	private JTextField V2;
	private JTextField V3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Applicant_Home frame = new Applicant_Home();
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
	public Applicant_Home() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\OOP Final Assingment\\Pic\\flight (1).png"));
		setFont(new Font("Calibri", Font.BOLD, 30));
		setTitle("Applicant");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 775, 544);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(10, 10, 802, 497);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		layeredPane.add(panel, "name_240872584944400");
		panel.setLayout(null);
		
		JLabel Passport = new JLabel("\r\n");
		Image img = new ImageIcon (this.getClass().getResource("/passp.png")).getImage();
		
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.setForeground(new Color(255, 255, 255));
		btnLogOut.setBackground(new Color(0, 0, 0));
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
               int result = javax.swing.JOptionPane.showConfirmDialog(frame, "Are you sure you want to LogOut?", "Exit Confirmation", javax.swing.JOptionPane.YES_NO_OPTION);
                
                if (result == javax.swing.JOptionPane.YES_OPTION) {
                    
                	 Applicant_LogIn MI = new  Applicant_LogIn();
     				MI.setVisible(true);
     				dispose();
     				
                   
    				  
                }
			}
		});
		btnLogOut.setFont(new Font("Calibri", Font.BOLD, 25));
		btnLogOut.setBounds(20, 450, 199, 37);
		panel.add(btnLogOut);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Welcome!  Ready to explore your passport details?");
		lblNewLabel_2_1_1.setForeground(new Color(0, 0, 64));
		lblNewLabel_2_1_1.setFont(new Font("UD Digi Kyokasho NK-R", Font.BOLD, 23));
		lblNewLabel_2_1_1.setBackground(Color.GRAY);
		lblNewLabel_2_1_1.setBounds(78, 10, 623, 51);
		panel.add(lblNewLabel_2_1_1);
		Passport.setIcon(new ImageIcon(img));
		Passport.setBounds(-57, 42, 450, 480);
		panel.add(Passport);
		
		JButton ViewStatues = new JButton("View Status");
		ViewStatues.setAutoscrolls(true);
		ViewStatues.setForeground(new Color(255, 255, 255));
		ViewStatues.setBackground(new Color(0, 0, 0));
		ViewStatues.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(View);
				layeredPane.repaint();
				layeredPane.revalidate();
				
			}
		});
		ViewStatues.setFont(new Font("Calibri", Font.BOLD, 20));
		ViewStatues.setBounds(576, 408, 147, 37);
		panel.add(ViewStatues);
		
		JButton btnMakeAppoinment = new JButton("Appoinment");
		btnMakeAppoinment.setForeground(new Color(255, 255, 255));
		btnMakeAppoinment.setBackground(new Color(0, 0, 0));
		btnMakeAppoinment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(View_App);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnMakeAppoinment.setFont(new Font("Calibri", Font.BOLD, 20));
		btnMakeAppoinment.setBounds(576, 246, 147, 37);
		panel.add(btnMakeAppoinment);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("View appointments effortlessly!");
		lblNewLabel_2_1_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_1_2.setBounds(397, 150, 276, 27);
		panel.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("Check scheduled slots and reschedule ");
		lblNewLabel_2_1_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_1_2_1.setBounds(446, 189, 290, 27);
		panel.add(lblNewLabel_2_1_2_1);
		
		JLabel lblNewLabel_2_1_2_2 = new JLabel("Stay updated! ");
		lblNewLabel_2_1_2_2.setForeground(Color.BLACK);
		lblNewLabel_2_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_1_2_2.setBounds(384, 318, 110, 27);
		panel.add(lblNewLabel_2_1_2_2);
		
		JLabel lblNewLabel_2_1_2_1_1 = new JLabel("Tap here to check your application status.");
		lblNewLabel_2_1_2_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_1_2_1_1.setBounds(403, 355, 333, 27);
		panel.add(lblNewLabel_2_1_2_1_1);
		
		View = new JPanel();
		View.setBackground(new Color(128, 128, 128));
		layeredPane.add(View, "name_350024650962300");
		View.setLayout(null);
		
		JButton btnNewButton_1_3_1_1 = new JButton("Back");
		btnNewButton_1_3_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Applicant_Home MI = new Applicant_Home ();
				MI.setVisible(true);
				dispose();
			}
		});
		
		JLabel lblNewLabel_2_1 = new JLabel("To Verify Your Status");
		lblNewLabel_2_1.setBackground(new Color(128, 128, 128));
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("UD Digi Kyokasho NK-R", Font.BOLD, 27));
		lblNewLabel_2_1.setBounds(251, 10, 304, 51);
		View.add(lblNewLabel_2_1);
		
		JButton btnNewButton_1_2_2 = new JButton("Clear");
		btnNewButton_1_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				V1.setText(null);
				V2.setText(null);
				V3.setText(null);
			}
		});
		btnNewButton_1_2_2.setForeground(Color.WHITE);
		btnNewButton_1_2_2.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 25));
		btnNewButton_1_2_2.setBackground(Color.BLACK);
		btnNewButton_1_2_2.setBounds(398, 306, 148, 41);
		View.add(btnNewButton_1_2_2);
		
		V2 = new JTextField();
		V2.setColumns(10);
		V2.setBounds(514, 197, 222, 37);
		View.add(V2);
		btnNewButton_1_3_1_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1_3_1_1.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1_3_1_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1_3_1_1.setBounds(20, 450, 104, 37);
		View.add(btnNewButton_1_3_1_1);
		
		JLabel lblUserName = new JLabel("UserName  :");
		lblUserName.setFont(new Font("Calibri", Font.PLAIN, 23));
		lblUserName.setBounds(384, 129, 134, 31);
		View.add(lblUserName);
		
		V1 = new JTextField();
		V1.setColumns(10);
		V1.setBounds(514, 129, 222, 34);
		View.add(V1);
		
		JLabel view_1 = new JLabel("\r\n");
		view_1.setOpaque(true);
		view_1.setAutoscrolls(true);
		view_1.setBackground(new Color(128, 128, 128));
		Image img2 = new ImageIcon (this.getClass().getResource("/viw.jpg")).getImage();
		
		JLabel lblNicno_1 = new JLabel("NICNo         :");
		lblNicno_1.setFont(new Font("Calibri", Font.PLAIN, 23));
		lblNicno_1.setBounds(384, 200, 134, 31);
		View.add(lblNicno_1);
		view_1.setIcon(new ImageIcon(img2));
		view_1.setBounds(10, 71, 364, 387);
		View.add(view_1);
		
		JButton btnNewButton_1_2_2_1 = new JButton("Show\r\n");
		
		btnNewButton_1_2_2_1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String userName = V1.getText();
		        String nicNo = V2.getText(); 
		        // Validate the input
		        if (userName.isEmpty() || nicNo.isEmpty()) {
		            V3.setText("Please enter both Username and NIC No.");
		        } else {
		            // Retrieve the status
		            Applicant Ap = new Applicant(userName, nicNo);
		            String status = Ap.View_Status(userName, nicNo);

		         
		            V3.setText(  status);
		        }
		    }

		});
		btnNewButton_1_2_2_1.setForeground(Color.WHITE);
		btnNewButton_1_2_2_1.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 25));
		btnNewButton_1_2_2_1.setBackground(Color.BLACK);
		btnNewButton_1_2_2_1.setBounds(588, 306, 148, 41);
		View.add(btnNewButton_1_2_2_1);
		
		JLabel lblNicno_1_1 = new JLabel("Status          :");
		lblNicno_1_1.setFont(new Font("Calibri", Font.PLAIN, 23));
		lblNicno_1_1.setBounds(384, 404, 134, 31);
		View.add(lblNicno_1_1);
		
		V3 = new JTextField();
		V3.setFont(new Font("Calibri", Font.PLAIN, 16));
		V3.setColumns(10);
		V3.setBounds(514, 401, 222, 37);
		View.add(V3);
		
		
		View_App = new JPanel();
		View_App.setBackground(new Color(192, 192, 192));
		layeredPane.add(View_App, "name_350044323022000");
		View_App.setLayout(null);
		
		JLabel App = new JLabel("");
		Image img1 = new ImageIcon (this.getClass().getResource("/Appo.jpg")).getImage();
		
		JButton btnNewButton_1_3_1 = new JButton("Back");
		btnNewButton_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Applicant_Home MI = new Applicant_Home ();
				MI.setVisible(true);
				dispose();

				
			}
		});
		
		JLabel lblMessage = new JLabel("Message:");
		lblMessage.setFont(new Font("Calibri", Font.PLAIN, 23));
		lblMessage.setBounds(362, 317, 100, 31);
		View_App.add(lblMessage);
		
		JTextPane Ap4 = new JTextPane();
		Ap4.setBounds(472, 306, 252, 92);
		View_App.add(Ap4);
		
		JButton btnNewButton_1_2_3 = new JButton("Show");
		btnNewButton_1_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String NicNo = Ap1.getText();

		        Applicant Ap = new Applicant(NicNo);

		        String[] appointmentInfo = Ap.view_Appointment(NicNo);

		        // Check if the appointment information is retrieved successfully
		        if (appointmentInfo != null && appointmentInfo.length == 3) {
		            String date = appointmentInfo[0];
		            String time = appointmentInfo[1];
		            String message = appointmentInfo[2];

		            
		            Ap2.setText(date);
		            Ap3.setText(time);
		            Ap4.setText(message);

		            // Display success message 
		            JOptionPane.showMessageDialog(contentPane, "Appointment information retrieved successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
		        } else {
		            // Display an error message
		            JOptionPane.showMessageDialog(contentPane, "Error retrieving appointment information", "Error", JOptionPane.ERROR_MESSAGE);
		        }
		    }
		});
		btnNewButton_1_2_3.setForeground(Color.WHITE);
		btnNewButton_1_2_3.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 22));
		btnNewButton_1_2_3.setBackground(Color.BLACK);
		btnNewButton_1_2_3.setBounds(543, 81, 108, 37);
		View_App.add(btnNewButton_1_2_3);
		btnNewButton_1_3_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1_3_1.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1_3_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1_3_1.setBounds(59, 422, 124, 41);
		View_App.add(btnNewButton_1_3_1);
		
		JButton btnNewButton_1_2_1 = new JButton("Reschedule");
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				String NICNo = Ap1.getText();
		        String Date = Ap2.getText();
		        String time = Ap3.getText();
		        String Message = Ap4.getText();

		        
		            Applicant Pc = new Applicant(NICNo,Date,time,Message);
		            Pc.ReShedule(NICNo,Date,time,Message);

		            // Display success message
		            JOptionPane.showMessageDialog(contentPane, "Submission successful", "Success", JOptionPane.INFORMATION_MESSAGE);

				
				
				Applicant_Home MI = new Applicant_Home ();
				MI.setVisible(true);
				dispose();
			}
			
		});
		btnNewButton_1_2_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1_2_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1_2_1.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 25));
		btnNewButton_1_2_1.setBounds(513, 421, 148, 41);
		View_App.add(btnNewButton_1_2_1);
		
		JButton btnNewButton_1_2 = new JButton("Clear");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ap1.setText(null);
				Ap2.setText(null);
				Ap3.setText(null);
				Ap4.setText(null);
			}
		});
		btnNewButton_1_2.setForeground(new Color(255, 255, 255));
		btnNewButton_1_2.setBackground(new Color(0, 0, 0));
		btnNewButton_1_2.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 25));
		btnNewButton_1_2.setBounds(275, 421, 148, 41);
		View_App.add(btnNewButton_1_2);
		App.setIcon(new ImageIcon(img1));
		App.setBounds(34, 159, 300, 217);
		View_App.add(App);
		
		Ap1 = new JTextField();
		Ap1.setColumns(10);
		Ap1.setBounds(140, 80, 252, 37);
		View_App.add(Ap1);
		
		JLabel lblNicno = new JLabel("NICNo  :");
		lblNicno.setFont(new Font("Calibri", Font.PLAIN, 25));
		lblNicno.setBounds(43, 83, 87, 31);
		View_App.add(lblNicno);
		
		Ap3 = new JTextField();
		Ap3.setColumns(10);
		Ap3.setBounds(472, 244, 252, 37);
		View_App.add(Ap3);
		
		JLabel lblTime = new JLabel("Time    :");
		lblTime.setFont(new Font("Calibri", Font.PLAIN, 23));
		lblTime.setBounds(375, 246, 87, 31);
		View_App.add(lblTime);
		
		Ap2 = new JTextField();
		Ap2.setBounds(472, 167, 252, 37);
		View_App.add(Ap2);
		Ap2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("It's great to see you!  ");
		lblNewLabel_1.setBounds(260, 10, 232, 46);
		lblNewLabel_1.setBackground(new Color(192, 192, 192));
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setFont(new Font("Sitka Display", Font.BOLD, 25));
		View_App.add(lblNewLabel_1);
		
		JLabel lblDate = new JLabel("Date    :");
		lblDate.setFont(new Font("Calibri", Font.PLAIN, 23));
		lblDate.setBounds(375, 170, 87, 31);
		View_App.add(lblDate);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBackground(new Color(128, 128, 128));
		lblNewLabel_2.setBounds(10, 63, 726, 424);
		View_App.add(lblNewLabel_2);
	
	}
}
