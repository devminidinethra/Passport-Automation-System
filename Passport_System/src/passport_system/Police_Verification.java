package passport_system;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.Toolkit;

public class Police_Verification extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField UserNa;
	private JTextField UserN;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Police_Verification frame = new Police_Verification();
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
	@SuppressWarnings("unchecked")
	public Police_Verification() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\OOP Final Assingment\\Pic\\flight (1).png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 678, 486);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		
        String[] Passport = {"","Reject","Approve"};
        String[] Character = {"","Good","Bad"};
        
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Police = new JLabel("");
		Image img = new ImageIcon (this.getClass().getResource("/Police.png")).getImage();
		Police.setIcon(new ImageIcon(img));
		Police.setBounds(33, 110, 216, 236);
		contentPane.add(Police);
		
		JLabel lblUsername = new JLabel("UserName :");
		lblUsername.setFont(new Font("Calibri", Font.PLAIN, 25));
		lblUsername.setBounds(270, 112, 120, 31);
		contentPane.add(lblUsername);
		
		UserNa = new JTextField();
		UserNa.setColumns(10);
		UserNa.setBounds(400, 109, 245, 37);
		contentPane.add(UserNa);
		
		JLabel lblNicno_1 = new JLabel("NICNo        :");
		lblNicno_1.setFont(new Font("Calibri", Font.PLAIN, 25));
		lblNicno_1.setBounds(270, 180, 126, 31);
		contentPane.add(lblNicno_1);
		
		UserN = new JTextField();
		UserN.setColumns(10);
		UserN.setBounds(403, 177, 245, 37);
		contentPane.add(UserN);
		
		JLabel lblCharacter = new JLabel("Character  :");
		lblCharacter.setFont(new Font("Calibri", Font.PLAIN, 25));
		lblCharacter.setBounds(270, 246, 120, 31);
		contentPane.add(lblCharacter);
		
		JLabel lblVerification = new JLabel("Passport :");
		lblVerification.setFont(new Font("Calibri", Font.PLAIN, 25));
		lblVerification.setBounds(270, 315, 134, 31);
		contentPane.add(lblVerification);
		
		JLabel lblNewLabel_2 = new JLabel("To Verify a User ");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("UD Digi Kyokasho NK-R", Font.BOLD, 27));
		lblNewLabel_2.setBounds(175, 28, 239, 37);
		contentPane.add(lblNewLabel_2);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Police_Registration ob = new Police_Registration();
				ob.setVisible(true);
				dispose();
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("UD Digi Kyokasho NK-R", Font.BOLD, 20));
		btnBack.setBackground(Color.BLACK);
		btnBack.setBounds(53, 387, 125, 36);
		contentPane.add(btnBack);
		
		JComboBox<String> Ps = new JComboBox<>(Passport);
        Ps.setBounds(410, 310, 238, 31);
        contentPane.add(Ps);
           
		Ps.setBounds(410, 310, 235, 31);
		contentPane.add(Ps);
		
		JComboBox<String> Ch = new JComboBox<>(Character);
		Ch.setBounds(410, 310, 238, 31);
		contentPane.add(Ps);
		Ch.setBounds(410, 246, 235, 31);
		contentPane.add(Ch);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Username = UserNa.getText();
		        String NicNo = UserN.getText();
		        String Character = (String) Ch.getSelectedItem();
		        String Passport = (String) Ps.getSelectedItem();

		        // Validate if all fields are filled
		        if (Username.isEmpty() || NicNo.isEmpty() || Character == null || Passport == null) {
		            JOptionPane.showMessageDialog(contentPane, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
		        } else {
		           
		            Police Pc = new Police(Username, NicNo, Character, Passport);
		            Pc.ProvideReport(Username, NicNo, Character, Passport);

		            // Display success message
		            JOptionPane.showMessageDialog(contentPane, "Submission successful", "Success", JOptionPane.INFORMATION_MESSAGE);



		            Police_Registration MI = new  Police_Registration();
		            MI.setVisible(true);
		            dispose();
		        }
			}
		});
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setFont(new Font("UD Digi Kyokasho NK-R", Font.BOLD, 20));
		btnSubmit.setBackground(Color.BLACK);
		btnSubmit.setBounds(478, 387, 125, 36);
		contentPane.add(btnSubmit);
		
		JButton Clear = new JButton("Clear");
		Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserNa.setText(null);
				UserN.setText(null);
	    		 Ch.setSelectedIndex(0);
				Ps.setSelectedIndex(0);
			}
		});
		Clear.setForeground(Color.WHITE);
		Clear.setFont(new Font("UD Digi Kyokasho NK-R", Font.BOLD, 20));
		Clear.setBackground(Color.BLACK);
		Clear.setBounds(265, 387, 125, 36);
		contentPane.add(Clear);
		
       
        
        
	}

}
