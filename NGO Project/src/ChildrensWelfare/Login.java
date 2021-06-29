package ChildrensWelfare;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import javax.swing.JPasswordField;
import javax.swing.JCheckBox;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUsername;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setForeground(Color.BLUE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("")); //C:\\Users\\chyim\\OneDrive\\Pictures\\Au Chyi Min\\Logo-Big-removebg-preview.png
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 935, 634);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 204, 255));
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 204)));
		panel.setBounds(0, 0, 921, 597);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 204)));
		panel_1.setBackground(new Color(0, 204, 255));
		panel_1.setBounds(77, 37, 758, 155);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("CHILDREN'S PROTECTION SOCIETY");
		lblNewLabel.setFont(new Font("Rockwell Extra Bold", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel.setBounds(172, 53, 559, 54);
		panel_1.add(lblNewLabel);
		
		JLabel ImejLabel = new JLabel("");
		ImejLabel.setBounds(10, 10, 141, 135);
		panel_1.add(ImejLabel);
		ImejLabel.setBackground(new Color(240, 240, 240));
		ImejLabel.setIcon(new ImageIcon("")); //C:\\Users\\chyim\\OneDrive\\Pictures\\Au Chyi Min\\Logo-Big-removebg-preview.png
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 204)));
		panel_1_1.setBackground(new Color(0, 204, 255));
		panel_1_1.setBounds(197, 253, 217, 65);
		panel.add(panel_1_1);
		
		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblUsername.setBounds(44, 10, 130, 45);
		panel_1_1.add(lblUsername);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 204)));
		panel_1_1_1.setBackground(new Color(0, 204, 255));
		panel_1_1_1.setBounds(200, 349, 214, 65);
		panel.add(panel_1_1_1);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblPassword.setBounds(44, 10, 133, 45);
		panel_1_1_1.add(lblPassword);
		
		textFieldUsername = new JTextField();
		textFieldUsername.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName = "Chyi Min";
				textFieldUsername.setText(userName);
			}
		});
		textFieldUsername.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		textFieldUsername.setBounds(458, 253, 217, 65);
		panel.add(textFieldUsername);
		textFieldUsername.setColumns(10);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setBounds(257, 474, 151, 54);
		panel.add(btnLogin);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					if(textFieldUsername.getText().equals("Chyi Min") && passwordField.getText().equals("mandy123")) {
						//JOptionPane.showMessageDialog(null, "Login Succesful");
						
						//RegistrationSystem RegSys = new RegistrationSystem(); //calling another frame/window
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
		btnLogin.setBackground(new Color(204, 255, 255));
		btnLogin.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 20));
		
		JButton btnReset = new JButton("RESET");
		btnReset.setBounds(508, 474, 137, 54);
		panel.add(btnReset);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldUsername.setText("");
				passwordField.setText("");
			}
		});
		btnReset.setBackground(new Color(204, 255, 255));
		btnReset.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 20));
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mainpage frame = new Mainpage();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(204, 255, 255));
		btnNewButton.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 20));
		btnNewButton.setBounds(760, 517, 137, 54);
		panel.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		passwordField.setBounds(458, 349, 217, 65);
		panel.add(passwordField);
		
		JCheckBox chckbxShowPassword = new JCheckBox("Show Password");
		chckbxShowPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxShowPassword.isSelected()) {
					passwordField.setEchoChar((char)0);
				}
				else {
					passwordField.setEchoChar('*');
				}
			}
		});
		chckbxShowPassword.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		chckbxShowPassword.setBounds(457, 420, 218, 31);
		panel.add(chckbxShowPassword);
	}

}
