package passport_system;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Main_Interface extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_Interface frame = new Main_Interface();
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
	public Main_Interface() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\OOP Final Assingment\\Pic\\flight (1).png"));
		setFont(new Font("Candara", Font.BOLD, 40));
		setTitle("Passport Automation System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 949, 529);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Plane = new JLabel("");
		Image img1 = new ImageIcon (this.getClass().getResource("/Plane.png")).getImage();
		
		JLabel lblNewLabel = new JLabel("Click Here  >>>");
		lblNewLabel.setFont(new Font("Calibri Light", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(456, 329, 146, 34);
		contentPane.add(lblNewLabel);
		Plane.setIcon(new ImageIcon(img1));
		Plane.setBounds(842, 198, 45, 40);
		contentPane.add(Plane);
		
		JLabel lblNewLabel_3 = new JLabel("Automation System");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Courier New", Font.BOLD, 37));
		lblNewLabel_3.setBounds(457, 194, 400, 55);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("To Passport ");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Courier New", Font.BOLD, 37));
		lblNewLabel_2.setBounds(532, 134, 281, 40);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome ");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Courier New", Font.BOLD, 37));
		lblNewLabel_1.setBounds(568, 56, 179, 48);
		contentPane.add(lblNewLabel_1);
		
		JLabel Background = new JLabel((String) null);
		Background.setOpaque(true);
		Image img2= new ImageIcon (this.getClass().getResource("/Blu.jpg")).getImage();
		
		JButton btnNewButton = new JButton("Applicant");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Applicant_Welcome Ob = new Applicant_Welcome();
				Ob.setVisible(true);
				dispose();

			}
		});
		btnNewButton.setFont(new Font("Cambria", Font.BOLD, 20));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(443, 391, 128, 34);
		contentPane.add(btnNewButton);
		
		JButton btnPolice = new JButton("Police\r\n");
		btnPolice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Police_Welcome PI = new Police_Welcome();
				PI.setVisible(true);
				dispose();

			}
		});
		btnPolice.setForeground(Color.BLACK);
		btnPolice.setFont(new Font("Cambria", Font.BOLD, 20));
		btnPolice.setBounds(609, 391, 121, 34);
		contentPane.add(btnPolice);
		
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin_Welcome Al = new Admin_Welcome();
				Al.setVisible(true);
				dispose();
			}
		});
		btnAdmin.setForeground(Color.BLACK);
		btnAdmin.setFont(new Font("Cambria", Font.BOLD, 20));
		btnAdmin.setBounds(766, 391, 121, 34);
		contentPane.add(btnAdmin);
		Background.setIcon(new ImageIcon(img2));
		Background.setBackground(new Color(128, 128, 255));
		Background.setForeground(new Color(0, 0, 0));
		Background.setBounds(403, 10, 511, 454);
		contentPane.add(Background);
		
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(192, 192, 192));
		panel.setBounds(10, 10, 364, 454);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel Passport = new JLabel("");
		Image img = new ImageIcon (this.getClass().getResource("/Passport_3.jpg")).getImage();
		Passport.setIcon(new ImageIcon(img));
		Passport.setBounds(-134, 0, 498, 464);
		panel.add(Passport);
		
		
	}
}
