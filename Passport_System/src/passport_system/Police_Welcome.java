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
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Police_Welcome extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Police_Welcome frame = new Police_Welcome();
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
	public Police_Welcome() {
		setTitle("Welcome");
		setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\OOP Final Assingment\\Pic\\flight (1).png"));
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 607, 596);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setOpaque(true);
		layeredPane.setBackground(new Color(255, 255, 255));
		layeredPane.setBounds(0, 0, 593, 559);
		contentPane.add(layeredPane);
		
		JLabel Police = new JLabel("");
		Image img = new ImageIcon (this.getClass().getResource("/police_2.png")).getImage();
		
		JLabel lblWelcome = new JLabel("Welcome ");
		lblWelcome.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblWelcome.setBounds(209, 10, 142, 49);
		layeredPane.add(lblWelcome);
		Police.setIcon(new ImageIcon(img));
		Police.setBounds(57, 28, 478, 334);
		layeredPane.add(Police);
		
		JButton btnLogin_2 = new JButton("LogIn");
		btnLogin_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Police_Login MI = new Police_Login();
				MI.setVisible(true);
				dispose();
			}
		});
		btnLogin_2.setForeground(Color.WHITE);
		btnLogin_2.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 25));
		btnLogin_2.setBackground(new Color(0, 0, 64));
		btnLogin_2.setBounds(179, 372, 255, 54);
		layeredPane.add(btnLogin_2);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Police_Registration ob = new Police_Registration();
				ob.setVisible(true);
				dispose();
			}
		});
		btnRegister.setForeground(Color.WHITE);
		btnRegister.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 25));
		btnRegister.setBackground(new Color(0, 0, 64));
		btnRegister.setBounds(179, 459, 253, 54);
		layeredPane.add(btnRegister);
		
		JLabel Blue = new JLabel("");
		Image img1 = new ImageIcon (this.getClass().getResource("/Blue_1.jpg")).getImage();
		Blue.setIcon(new ImageIcon(img1));
		Blue.setBounds(0, 218, 600, 341);
		layeredPane.add(Blue);
	}

}
