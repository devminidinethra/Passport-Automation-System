package passport_system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Admin_Welcome extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_Welcome frame = new Admin_Welcome();
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
	public Admin_Welcome() {
		setTitle("Admin_Welcome");
		setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\OOP Final Assingment\\Pic\\flight (1).png"));
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 769, 663);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBackground(new Color(255, 255, 255));
		layeredPane.setOpaque(true);
		contentPane.add(layeredPane, "name_2151239291220300");
		layeredPane.setLayout(null);
		
		JLabel lblWelcome = new JLabel("Welcome ");
		lblWelcome.setBounds(273, 10, 142, 49);
		lblWelcome.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		layeredPane.add(lblWelcome);
		
		JLabel Welcome = new JLabel("");
		Welcome.setBounds(58, 10, 612, 418);
		Image img = new ImageIcon (this.getClass().getResource("/Admin_3.jpg")).getImage();
		Welcome.setIcon(new ImageIcon(img));
		layeredPane.add(Welcome);
		
		JButton btnLogin_2 = new JButton("LogIn");
		btnLogin_2.setBounds(230, 442, 255, 54);
		btnLogin_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin_LogIn MI = new Admin_LogIn();
				MI.setVisible(true);
				dispose();
			}
		});
		btnLogin_2.setForeground(Color.WHITE);
		btnLogin_2.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 25));
		btnLogin_2.setBackground(new Color(0, 0, 64));
		layeredPane.add(btnLogin_2);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(230, 529, 253, 54);
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin_Reg MI = new Admin_Reg();
				MI.setVisible(true);
				dispose();
			}
		});
		btnRegister.setForeground(Color.WHITE);
		btnRegister.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 25));
		btnRegister.setBackground(new Color(0, 0, 64));
		layeredPane.add(btnRegister);
		Image img1 = new ImageIcon (this.getClass().getResource("/Blue_1.jpg")).getImage();
	}
}
