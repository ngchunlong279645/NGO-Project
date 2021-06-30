package Cancer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminLogin extends JFrame {

	private JPanel contentPane;
	private JTextField UsernameField;
	private JTextField PasswordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setTitle("AdminLogin");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 646, 532);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 245, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 78, 493);
		panel.setBackground(new Color(255, 228, 225));
		contentPane.add(panel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(552, 0, 78, 493);
		panel_3.setBackground(new Color(255, 228, 225));
		contentPane.add(panel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(177, 103, 275, 319);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(AdminLogin.class.getResource("user-icon.png")));
		lblNewLabel_1.setBounds(79, 0, 128, 155);
		panel_1.add(lblNewLabel_1);
		
		JLabel UsernameLabel = new JLabel("Username :");
		UsernameLabel.setFont(new Font("TypeWrong", Font.PLAIN, 15));
		UsernameLabel.setBounds(10, 211, 110, 24);
		panel_1.add(UsernameLabel);
		
		JLabel PasswordLabel = new JLabel("Password :");
		PasswordLabel.setFont(new Font("TypeWrong", Font.PLAIN, 15));
		PasswordLabel.setBounds(10, 246, 110, 24);
		panel_1.add(PasswordLabel);
		
		UsernameField = new JTextField();
		UsernameField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName = "Neiji";
				UsernameField.setText(userName);
			}
		});
		UsernameField.setHorizontalAlignment(SwingConstants.CENTER);
		UsernameField.setFont(new Font("TypeWrong", Font.PLAIN, 13));
		UsernameField.setBounds(123, 209, 128, 24);
		panel_1.add(UsernameField);
		UsernameField.setColumns(10);
		
		PasswordField = new JTextField();
		PasswordField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pass = "xyz987";
				PasswordField.setText(pass);
			}
		});
		PasswordField.setFont(new Font("TypeWrong", Font.PLAIN, 13));
		PasswordField.setHorizontalAlignment(SwingConstants.CENTER);
		PasswordField.setColumns(10);
		PasswordField.setBounds(123, 243, 128, 24);
		panel_1.add(PasswordField);
		
		JLabel lblHiAdmin = new JLabel("Hi Admin!");
		lblHiAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		lblHiAdmin.setFont(new Font("TypeWrong", Font.PLAIN, 14));
		lblHiAdmin.setBounds(0, 142, 275, 24);
		panel_1.add(lblHiAdmin);
		
		JLabel lblPleaseLogIn = new JLabel("Please log in first.");
		lblPleaseLogIn.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseLogIn.setFont(new Font("TypeWrong", Font.PLAIN, 14));
		lblPleaseLogIn.setBounds(0, 162, 275, 24);
		panel_1.add(lblPleaseLogIn);
		
		JButton LoginButton = new JButton("Login");
		LoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					if(UsernameField.getText().equals("Neiji") && PasswordField.getText().equals("xyz987")) {
						//JOptionPane.showMessageDialog(null, "Login Successful");
						
						//AdminPage AP = new AdminPage(); //calling another frame/window
							AdminPage frame = new AdminPage();
							frame.setModalExclusionType(null);
				            frame.setVisible(true);
				            dispose(); //login frame will disappear
					}else
						JOptionPane.showMessageDialog(null, "Please enter the right user name and pswd");
					
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the right user name and pswd");
				}
			}
		});
		LoginButton.setBackground(new Color(169, 169, 169));
		LoginButton.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		LoginButton.setBounds(103, 276, 85, 31);
		panel_1.add(LoginButton);
		
		JLabel lblNewLabel = new JLabel("Admin Login");
		lblNewLabel.setBounds(86, 25, 451, 29);
		lblNewLabel.setFont(new Font("TypeWrong", Font.BOLD, 27));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(136, 11, 351, 3);
		panel_2.setBackground(new Color(0, 0, 0));
		contentPane.add(panel_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(136, 65, 351, 3);
		panel_2_1.setBackground(Color.BLACK);
		contentPane.add(panel_2_1);
		
		JButton HomeButton = new JButton("Home");
		HomeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage frame = new HomePage();
				frame.setVisible(true);
				dispose();
			}
		});
		HomeButton.setBounds(272, 439, 96, 40);
		HomeButton.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 25));
		HomeButton.setBackground(new Color(240, 128, 128));
		contentPane.add(HomeButton);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 228, 225));
		panel_4.setBounds(75, 131, 72, 70);
		contentPane.add(panel_4);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setBackground(new Color(255, 228, 225));
		panel_4_1.setBounds(75, 234, 48, 70);
		contentPane.add(panel_4_1);
		
		JPanel panel_4_2 = new JPanel();
		panel_4_2.setBackground(new Color(255, 228, 225));
		panel_4_2.setBounds(75, 333, 27, 70);
		contentPane.add(panel_4_2);
		
		JPanel panel_4_3 = new JPanel();
		panel_4_3.setBackground(new Color(255, 228, 225));
		panel_4_3.setBounds(480, 131, 72, 70);
		contentPane.add(panel_4_3);
		
		JPanel panel_4_4 = new JPanel();
		panel_4_4.setBackground(new Color(255, 228, 225));
		panel_4_4.setBounds(504, 234, 48, 70);
		contentPane.add(panel_4_4);
		
		JPanel panel_4_5 = new JPanel();
		panel_4_5.setBackground(new Color(255, 228, 225));
		panel_4_5.setBounds(525, 333, 27, 70);
		contentPane.add(panel_4_5);
		
		JPanel panel_4_2_1 = new JPanel();
		panel_4_2_1.setBackground(new Color(255, 228, 225));
		panel_4_2_1.setBounds(75, 34, 27, 70);
		contentPane.add(panel_4_2_1);
		
		JPanel panel_4_2_2 = new JPanel();
		panel_4_2_2.setBackground(new Color(255, 228, 225));
		panel_4_2_2.setBounds(525, 34, 27, 70);
		contentPane.add(panel_4_2_2);
	}
}
