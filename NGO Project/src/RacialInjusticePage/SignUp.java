package RacialInjusticePage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JCheckBox;

public class SignUp extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField UserTextField;
	private JPasswordField confirmPasswordField;

	/**
	 * Launch the application.
	 */
	public void setData() {
			File file = new File(""); //D:\\LeeJieHui279096\\STIA1123_Programming_A202(I)\\Assignment3\\GUI_NGO Racial Injusctice\\TextFileAss3\\UserPwdData.txt
			try {
			if(!file.exists()) {
				file.createNewFile();
			}
			BufferedReader br = new BufferedReader(new FileReader(file));
			Object[] Lines = br.lines().toArray();
			int i =0;
			int id = 0;
			for (i=0; i< Lines.length; i++) {
				String Line = Lines[i].toString().trim();
				String [] Row = Line.split(", ");
				id = Integer.parseInt(Row[0]);
			}
			int userId = id + 1;
			FileWriter fw = new FileWriter(file,true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			pw.println(userId + ", "+ UserTextField.getText() + ", " + passwordField.getText());
			pw.flush();
			pw.close();
			bw.close();
			}catch(Exception ex) {
				ex.printStackTrace();
			}
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp(); //create new object
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
	public SignUp() { //constructor with no argument
		setTitle("First Time User Sign Up");
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource(""))); //Icon/SumWithUsicon.png
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 559, 618);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(238, 170, 153)); //Wax Flower Color
		panel.setBounds(0, 0, 545, 578);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panelSumWithUs = new JPanel();
		panelSumWithUs.setBounds(23, 21, 510, 70);
		panelSumWithUs.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(204, 102, 153)));
		panelSumWithUs.setLayout(null);
		panelSumWithUs.setBackground(new Color(238, 170, 153));
		panel.add(panelSumWithUs);

		JLabel lblSumWithUs = new JLabel("Sign Up Account");
		lblSumWithUs.setForeground(new Color(204, 102, 153));
		lblSumWithUs.setHorizontalAlignment(SwingConstants.CENTER);
		lblSumWithUs.setFont(new Font("Algerian", Font.BOLD, 50));
		lblSumWithUs.setBounds(37, 10, 438, 62);
		panelSumWithUs.add(lblSumWithUs);
		
		JLabel lblItsFree = new JLabel("It's free and only takes a minute");
		lblItsFree.setHorizontalAlignment(SwingConstants.CENTER);
		lblItsFree.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblItsFree.setBounds(8, 96, 525, 38);
		panel.add(lblItsFree);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setIcon(new ImageIcon(getClass().getResource(""))); //Icon/icons8-user-36.png
		lblUsername.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblUsername.setBounds(33, 128, 149, 38);
		panel.add(lblUsername);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setIcon(new ImageIcon(getClass().getResource(""))); //Icon/icons8-password-36.png
		lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblPassword.setBounds(33, 209, 149, 38);
		panel.add(lblPassword);
		
		UserTextField = new JTextField();
		UserTextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserTextField.setText("");
				String [] username = new String[] {UserTextField.getText()};
			}
		});
		UserTextField.setHorizontalAlignment(SwingConstants.CENTER);
		UserTextField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		UserTextField.setBounds(43, 166, 463, 33);
		panel.add(UserTextField);
		UserTextField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		passwordField.setBounds(43, 243, 463, 33);
		panel.add(passwordField);
		
		JCheckBox chckbxShowPassword = new JCheckBox("Show Password");
		chckbxShowPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxShowPassword.isSelected())
				{
					passwordField.setEchoChar((char)0);
				}
				else
				{
					passwordField.setEchoChar('*');
				}
			}
		});
		chckbxShowPassword.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		chckbxShowPassword.setBounds(43, 286, 163, 26);
		panel.add(chckbxShowPassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password");
		lblConfirmPassword.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblConfirmPassword.setBounds(43, 322, 223, 38);
		panel.add(lblConfirmPassword);
		
		confirmPasswordField = new JPasswordField();
		confirmPasswordField.setHorizontalAlignment(SwingConstants.CENTER);
		confirmPasswordField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		confirmPasswordField.setBounds(43, 356, 463, 33);
		panel.add(confirmPasswordField);
		
		JCheckBox chckbxShowConfirmPassword = new JCheckBox("Show Confirm Password");
		chckbxShowConfirmPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxShowConfirmPassword.isSelected())
				{
					confirmPasswordField.setEchoChar((char)0);
				}
				else
				{
					confirmPasswordField.setEchoChar('*');
				}
			}
		});
		chckbxShowConfirmPassword.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		chckbxShowConfirmPassword.setBounds(43, 399, 237, 26);
		panel.add(chckbxShowConfirmPassword);
		
		JCheckBox chckbxAgreeTerms = new JCheckBox("Click tick for agree our Terms\r\n& Conditions and Policy Privacy.");
		chckbxAgreeTerms.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		chckbxAgreeTerms.setBounds(43, 441, 480, 38);
		chckbxAgreeTerms.setOpaque(false);
		panel.add(chckbxAgreeTerms);
		
		JButton btnBack = new JButton("Back");
		btnBack.setHorizontalAlignment(SwingConstants.LEFT);
		btnBack.setIcon(new ImageIcon(getClass().getResource(""))); //Icon/icons8-back-45.png
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login l = new Login();
				l.setVisible(true);
				dispose(); //Close the SignUp.java window
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btnBack.setBounds(43, 500, 163, 44);
		panel.add(btnBack);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxAgreeTerms.isSelected()== true) {
					try {
						if(!"".equals(UserTextField.getText()) && !"".equals(passwordField.getText()) && !"".equals(confirmPasswordField.getText())) {
							if(confirmPasswordField.getText().equals(passwordField.getText())) {
							setData();
							JOptionPane.showMessageDialog(null, "User Sign Up Succesfully!");
							UserTextField.setText(null);
							passwordField.setText(null);
							confirmPasswordField.setText(null);
							}
							else 
								JOptionPane.showMessageDialog(null, "Please re-enter and make sure both password is same!");
					}
					else 
						JOptionPane.showMessageDialog(null, "Please fill all the fields!");
					} 
					catch (Exception arg0) {
						arg0.printStackTrace();
					}
				} else if (chckbxAgreeTerms.isSelected()== false)
					JOptionPane.showMessageDialog(null, "Please tick to agree the terms and conditions!");
			}
		});
		btnSubmit.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btnSubmit.setBounds(343, 500, 163, 44);
		panel.add(btnSubmit);
	}
}
