package SoupKitchen;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginAdmin extends JFrame {

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
					LoginAdmin frame = new LoginAdmin();
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
	public LoginAdmin() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(216, 191, 216));
		contentPane.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 102, 153)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelLogin = new JLabel("Admin Login");
		labelLogin.setForeground(Color.BLACK);
		labelLogin.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 30));
		labelLogin.setBounds(154, 66, 168, 44);
		contentPane.add(labelLogin);
		
		JLabel labelUsername = new JLabel("Username");
		labelUsername.setFont(new Font("Dialog", Font.BOLD, 19));
		labelUsername.setBounds(68, 153, 102, 44);
		contentPane.add(labelUsername);
		
		JLabel labelPassword = new JLabel("Password");
		labelPassword.setFont(new Font("Dialog", Font.BOLD, 19));
		labelPassword.setBounds(68, 238, 109, 44);
		contentPane.add(labelPassword);
		
		textFieldUsername = new JTextField();
		textFieldUsername.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName = "farah";
				textFieldUsername.setText(userName);
			}
		});
		textFieldUsername.setBounds(199, 163, 157, 32);
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
		textFieldPassword.setBounds(199, 248, 157, 32);
		contentPane.add(textFieldPassword);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setForeground(Color.WHITE);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldUsername.setText("");
				textFieldPassword.setText("");
			}
		});
		btnReset.setBackground(new Color(153, 102, 153));
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnReset.setBounds(69, 342, 133, 44);
		contentPane.add(btnReset);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					if(textFieldUsername.getText().equals("farah") && textFieldPassword.getText().equals("abc123")) {
						//JOptionPane.showMessageDialog(null, "Login Succesful!");	
						HomeAdmin frame = new HomeAdmin();
						frame.setModalExclusionType(null);//action
						frame.setVisible(true);
						dispose();
					}else
						JOptionPane.showMessageDialog(null, "Please enter the right username and password!");
					
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the right username and password!");
				}
			}
		});
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnLogin.setBackground(new Color(153, 102, 153));
		btnLogin.setBounds(276, 342, 133, 44);
		contentPane.add(btnLogin);
	}
}
