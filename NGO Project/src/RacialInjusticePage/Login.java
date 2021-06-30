package RacialInjusticePage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class Login extends JFrame {
	private javax.swing.JButton Minimize;
	private javax.swing.JButton Close;
	private JFrame frame;
	private JPanel contentPane;
	private JTextField UsernameTextField;
	private JPasswordField passwordField;
	
	/**
	 * Launch the application.
	 */
    public boolean verifyUser() throws IOException{
    	File f = new File("C:\\Users\\lzw_1\\eclipse-workspace\\Project\\src\\RacialInjusticePage\\UserPwdData.txt"); 
    	if(!f.exists()) {
    		f.createNewFile();
    	}
    	BufferedReader br = new BufferedReader(new FileReader(f));
    	Object[] Lines = br.lines().toArray();
    	int i =0;
    	for(i=0; i<Lines.length ; i++) {
    		String Line = Lines[i].toString().trim();
    		String[] Row = Line.split(", ");
    		if(UsernameTextField.getText().equals(Row[1]) && passwordField.getText().equals(Row[2])) {
    			return true;
    		}
    	}
    	return false;
    }
    
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login(); //create new object
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
	
	public Login() { //constructor without argument
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1016, 628);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelSumWithUs = new JPanel();
		panelSumWithUs.setBackground(new Color(181,131,141)); //English Lavender: B5838D
		panelSumWithUs.setBounds(0, 0, 432, 627);
		contentPane.add(panelSumWithUs);
		panelSumWithUs.setLayout(null);
		
		JLabel lblSumWithUs = new JLabel("Sum With Us");
		lblSumWithUs.setForeground(new Color(255,180,162)); //Melon: FFB4A2
		lblSumWithUs.setHorizontalAlignment(SwingConstants.CENTER);
		lblSumWithUs.setFont(new Font("Algerian", Font.BOLD, 55));
		lblSumWithUs.setBounds(40, 412, 347, 85);
		panelSumWithUs.add(lblSumWithUs);
		
		JLabel lblNewLabel = new JLabel("NGO Organization");
		lblNewLabel.setForeground(new Color(255,180,162)); //Melon: FFB4A2
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel.setBounds(82, 479, 262, 48);
		panelSumWithUs.add(lblNewLabel);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(getClass().getResource("SumWithUsiconFull.png")));
		lblLogo.setBounds(60, 94, 320, 309);
		panelSumWithUs.add(lblLogo);

		JPanel panelLogin = new JPanel();
		panelLogin.setBackground(new Color(255,180,162)); //Melon: FFB4A2
		panelLogin.setBounds(432, 0, 583, 627);
		contentPane.add(panelLogin);
		panelLogin.setLayout(null);
		
		JLabel lblWelcome = new JLabel("Welcome To Sum With Us Website!");
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setFont(new Font("Sitka Banner", Font.PLAIN, 26));
		lblWelcome.setBounds(89, 55, 426, 48);
		panelLogin.add(lblWelcome);
		
		JComboBox loginOption = new JComboBox();
		loginOption.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		loginOption.setModel(new DefaultComboBoxModel(new String[] {"Select a login option", "User", "Admin"}));
		loginOption.setBounds(328, 111, 214, 34);
		panelLogin.add(loginOption);
		
		JLabel lblUsername = new JLabel("Username: ");
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setForeground(new Color(181,131,141)); //English Lavender: B5838D
		lblUsername.setFont(new Font("Algerian", Font.BOLD, 32));
		lblUsername.setBounds(39, 176, 214, 64);
		panelLogin.add(lblUsername);

		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setForeground(new Color(181,131,141)); //English Lavender: B5838D
		lblPassword.setFont(new Font("Algerian", Font.BOLD, 32));
		lblPassword.setBounds(39, 253, 214, 64);
		panelLogin.add(lblPassword);
		
		UsernameTextField = new JTextField();
		UsernameTextField.setText("Enter username...");
		UsernameTextField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(181,131,141))); //English Lavender: B5838D
		UsernameTextField.setBackground(new Color(255,180,162)); //Melon: FFB4A2
		UsernameTextField.setHorizontalAlignment(SwingConstants.CENTER);
		UsernameTextField.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		UsernameTextField.setBounds(251, 189, 291, 40);
		panelLogin.add(UsernameTextField);
		UsernameTextField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(181,131,141))); //English Lavender: B5838D
		passwordField.setBackground(new Color(255,180,162)); //Melon: FFB4A2
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		passwordField.setBounds(251, 262, 291, 48);
		panelLogin.add(passwordField);
		
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
		chckbxShowPassword.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		chckbxShowPassword.setBounds(251, 328, 171, 34);
		panelLogin.add(chckbxShowPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (loginOption.getSelectedItem().equals("User")) {
						try {
							if(verifyUser() == true) {
								JOptionPane.showMessageDialog(null, "Login Successful!");
								SumWithUs s = new SumWithUs(); // obj created for class SumWithUs() 
								s.setVisible(true); // Open the SumWithUs.java window after user log in successful
								dispose(); // Close the Login.java window
							}
							else
								JOptionPane.showMessageDialog(null, "Login Incorrect! \nPlease reset and re-enter again!");
						}
				       catch(Exception ex) {
					       ex.printStackTrace();
				       }							
				}
				else if(loginOption.getSelectedItem().equals("Admin")) {
					if(UsernameTextField.getText().equals("Admin01") && passwordField.getText().equals("5umW17hUs") || UsernameTextField.getText().equals("Admin02") && passwordField.getText().equals("SvmWithVs")) {
						JOptionPane.showMessageDialog(null, "Login Successful!");
						Admin a = new Admin(); //obj created for class Admin() 
						a.setVisible(true);	// Open the Admin.java window after admin log in successful
						setVisible(false); // Close the Login.java window	
					}					
					else 
						JOptionPane.showMessageDialog(null, "Login Incorrect! \nPlease reset and re-enter again!");
				}
			}
		});
		btnLogin.setIcon(new ImageIcon(getClass().getResource("icons8-user-24.png"))); 
		btnLogin.setBorder(new MatteBorder(2,2,2,2, (Color) new Color (181,131,141))); //English Lavender: B5838D
		btnLogin.setForeground(new Color(181,131,141));
		btnLogin.setBackground(new Color(255,180,162)); //Melon: FFB4A2
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnLogin.setBounds(55, 383, 487, 48);
		panelLogin.add(btnLogin);
		
		JLabel lblDontHave = new JLabel("Don't have an account?  Click below to SignUp");
		lblDontHave.setHorizontalAlignment(SwingConstants.CENTER);
		lblDontHave.setFont(new Font("Sitka Banner", Font.PLAIN, 18));
		lblDontHave.setBounds(55, 441, 487, 34);
		panelLogin.add(lblDontHave);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUp signUp = new SignUp();  //obj created for class SignUp() 
				signUp.setVisible(true); // Open the SignUp.java window if the user is first time user
				dispose(); // Close the Login.java window
			}
		});
		btnSignUp.setIcon(new ImageIcon(getClass().getResource("icons8-add-user-male-24.png")));
		btnSignUp.setForeground(new Color(181, 131, 141));
		btnSignUp.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnSignUp.setBorder(new MatteBorder(2,2,2,2, (Color) new Color (181,131,141)));
		btnSignUp.setBackground(new Color(255, 180, 162));
		btnSignUp.setBounds(55, 470, 487, 48);
		panelLogin.add(btnSignUp);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UsernameTextField.setText("");
				passwordField.setText("");
			}
		});
		btnReset.setIcon(new ImageIcon(getClass().getResource("icons8-reset-24.png"))); 
		btnReset.setForeground(new Color(181, 131, 141));
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnReset.setBorder(new MatteBorder(2,2,2,2, (Color) new Color (181,131,141)));
		btnReset.setBackground(new Color(255, 180, 162));
		btnReset.setBounds(55, 538, 236, 48);
		panelLogin.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Sum With Us System", 
					JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0); //Exit the program
				}
			}
		});
		btnExit.setIcon(new ImageIcon(getClass().getResource("icons8-exit-24.png")));
		btnExit.setForeground(new Color(181, 131, 141));
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnExit.setBorder(new MatteBorder(2,2,2,2, (Color) new Color (181,131,141)));
		btnExit.setBackground(new Color(255, 180, 162));
		btnExit.setBounds(301, 538, 236, 48);
		panelLogin.add(btnExit);
		
		JButton Close = new JButton();
		Close.setIcon(new ImageIcon(getClass().getResource("icons8-macos-close-45.png")));
        Close.setToolTipText("Close");
        Close.setBorder(null);
        Close.setBorderPainted(false);
        Close.setContentAreaFilled(false);
        Close.setRequestFocusEnabled(false);
        Close.setRolloverIcon(new ImageIcon(getClass().getResource("icons8-macos-close-45 (2).png"))); 
        Close.setVerifyInputWhenFocusTarget(false);
        Close.setBounds(527, 10, 46, 40);
		panelLogin.add(Close);
		Close.addActionListener(new java.awt.event.ActionListener() {
	        public void actionPerformed(java.awt.event.ActionEvent evt) {
	            CloseActionPerformed(evt);
	        }
        });
		 
        JButton Minimize = new JButton();
        Minimize.setIcon(new ImageIcon(getClass().getResource("icons8-macos-minimize-45 (1).png")));
        Minimize.setToolTipText("Minimize");
        Minimize.setBorder(null);
        Minimize.setRequestFocusEnabled(false);
        Minimize.setContentAreaFilled(false);
        Minimize.setBorderPainted(false);
        Minimize.setFocusPainted(false);
        Minimize.setRequestFocusEnabled(false);
        Minimize.setRolloverIcon(new ImageIcon(getClass().getResource("icons8-macos-minimize-45.png")));
        Minimize.setVerifyInputWhenFocusTarget(false);
        Minimize.setBounds(469, 10, 46, 40);
        panelLogin.add(Minimize);
      
        Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent e) {
            	MinimizeMouseClicked(e);
            }
        });         
        
        Minimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
            	MinimizeActionPerformed(e);
            }
        });
	}
	
	private void MinimizeActionPerformed(java.awt.event.ActionEvent e) {//GEN-FIRST:event_MinimizeActionPerformed  
   
	}
	 
	private void MinimizeMouseClicked(java.awt.event.MouseEvent e) {//GEN-FIRST:event_jButton11MouseClicked
	        this.setState(ICONIFIED);
	}

	private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        this.dispose(); // Close the Login.java window
    }
}
