package SoupKitchenPage;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Graphics;  
import java.awt.Image;  
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class LoginUser extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUsername;
	private JTextField textFieldPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUser frame = new LoginUser();
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
	public LoginUser() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel() {
		public void paintComponent(Graphics g) {  // inserting background picture
			Image img = Toolkit.getDefaultToolkit().getImage(
					LoginUser.class.getResource(""));  
	                      g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);  
			                 }  
			           };  
	
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBackground(new Color(240, 240, 240));
		lblLogin.setForeground(new Color(0, 0, 102));
		lblLogin.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 35));
		lblLogin.setBounds(198, 68, 85, 70);
		contentPane.add(lblLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldUsername.setText("");
				textFieldPassword.setText("");
			}
		});
		btnReset.setBackground(SystemColor.control);
		btnReset.setForeground(new Color(0, 0, 102));
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnReset.setBounds(63, 364, 138, 50);
		contentPane.add(btnReset);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setFont(new Font("Dialog", Font.BOLD, 19));
		lblUsername.setBackground(SystemColor.menu);
		lblUsername.setBounds(106, 147, 95, 58);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Dialog", Font.BOLD, 19));
		lblPassword.setBackground(SystemColor.menu);
		lblPassword.setBounds(106, 248, 95, 50);
		contentPane.add(lblPassword);
		
		textFieldUsername = new JTextField();
		textFieldUsername.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName = "farah";
				textFieldUsername.setText(userName);
			}
		});
		textFieldUsername.setBounds(229, 161, 138, 36);
		contentPane.add(textFieldUsername);
		textFieldUsername.setColumns(10);
		
		textFieldPassword = new JTextField();
		textFieldPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password = "abc123";
				textFieldPassword.setText(password);
			}
		});
		textFieldPassword.setColumns(10);
		textFieldPassword.setBounds(229, 258, 138, 36);
		contentPane.add(textFieldPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
try {
					
					if(textFieldUsername.getText().equals("farah") && textFieldPassword.getText().equals("abc123")) {
						//JOptionPane.showMessageDialog(null, "Login Succesful!");	
						Home frame = new Home();
						frame.setModalExclusionType(null);
						frame.setVisible(true);
						dispose();
					}else
						JOptionPane.showMessageDialog(null, "Please enter the right username and password!");
					
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the right username and password!");
				}
			}
		});
		btnLogin.setForeground(new Color(0, 0, 102));
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnLogin.setBackground(SystemColor.menu);
		btnLogin.setBounds(263, 364, 138, 50);
		contentPane.add(btnLogin);
	}
}
