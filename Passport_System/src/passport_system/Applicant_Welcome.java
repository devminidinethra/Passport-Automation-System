package passport_system;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Applicant_Welcome extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Applicant_Welcome frame = new Applicant_Welcome();
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
	public Applicant_Welcome() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\OOP Final Assingment\\Pic\\flight (1).png"));
		setFont(new Font("Calibri", Font.PLAIN, 40));
		setTitle("Welcome");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 759);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Rocket = new JLabel("");
		Image img2 = new ImageIcon (this.getClass().getResource("/Rocket.png")).getImage();
		Rocket.setIcon(new ImageIcon(img2));
		Rocket.setBounds(424, 448, 38, 38);
		contentPane.add(Rocket);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 625, 463);
		contentPane.add(layeredPane);
		layeredPane.setLayout(null);
		
		JLabel Plane_1 = new JLabel("");
		Image img = new ImageIcon (this.getClass().getResource("/Plane_2.jpg")).getImage();
		
		JLabel lblWelcome = new JLabel("Welcome ");
		lblWelcome.setBounds(219, 10, 142, 49);
		layeredPane.add(lblWelcome);
		lblWelcome.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		Plane_1.setIcon(new ImageIcon(img));
		Plane_1.setBounds(-11, 0, 637, 463);
		layeredPane.add(Plane_1);
		
		JLabel Blue = new JLabel("");
		Image img1 = new ImageIcon (this.getClass().getResource("/Blue_1.jpg")).getImage();
		Blue.setIcon(new ImageIcon(img1));
		Blue.setBounds(0, 356, 600, 386);
		
		
		JLabel lblNewLabel = new JLabel("Make your passport faster");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(134, 448, 304, 47);
		contentPane.add(lblNewLabel);
		
		
		
		JButton btnLogin = new JButton("LogIn");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Applicant_LogIn AI = new Applicant_LogIn();
				AI.setVisible(true);
				dispose();

			}
		});
		btnLogin.setBackground(new Color(0, 0, 64));
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 25));
		btnLogin.setBounds(148, 522, 255, 54);
		contentPane.add(btnLogin);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Applicant_Registration ob = new Applicant_Registration();
				ob.setVisible(true);
				dispose();
			}
		});
		btnRegister.setBackground(new Color(0, 0, 64));
		btnRegister.setForeground(Color.WHITE);
		btnRegister.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 25));
		btnRegister.setBounds(148, 597, 253, 54);
		contentPane.add(btnRegister);
		
		contentPane.add(Blue);
	}

	public void NewScreen1() {
		// TODO Auto-generated method stub
		
	}

}
