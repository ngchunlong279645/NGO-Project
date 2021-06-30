package RacialInjusticePage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Donation extends JFrame {

	private JPanel contentPane;
	private JRadioButton rdbtnGiveOnce;
	private final ButtonGroup donateTimesGroup = new ButtonGroup();
	private JTextField donateMonth;
	private JTextField tacNo;
	private JTextField bankAccNo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Donation frame = new Donation();
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
	public static String path;
	private JTextField creditCardNo;
	private JTextField securityCode;
	private JTextField expires;
	private JTextField cardType;
	
	public Donation() {
		setTitle("Donation");
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("SumWithUsicon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1029,590);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1015,553);
		panel.setBackground(new Color(255,180,162));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panelFinance = new JPanel();
		panelFinance.setBounds(256, 20, 513, 68);
		panelFinance.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(204, 102, 153)));
		panelFinance.setLayout(null);
		panelFinance.setBackground(new Color(255,180,162)); 
		panel.add(panelFinance);
		
		JLabel lblSumWithUs = new JLabel("DONATION");
		lblSumWithUs.setForeground(new Color(204, 102, 153));
		lblSumWithUs.setHorizontalAlignment(SwingConstants.CENTER);
		lblSumWithUs.setFont(new Font("Algerian", Font.BOLD, 50));
		lblSumWithUs.setBounds(96, 10, 320, 62);
		panelFinance.add(lblSumWithUs);
		
		JPanel panelDonation = new JPanel();
		panelDonation.setLayout(null);
		panelDonation.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(204, 102, 153)));
		panelDonation.setBackground(new Color(255, 180, 162));
		panelDonation.setBounds(10, 97, 498, 409);
		panel.add(panelDonation);
		
		JLabel lblDonateTimes = new JLabel("Select Donate Times:");
		lblDonateTimes.setBounds(20, 27, 239, 46);
		panelDonation.add(lblDonateTimes);
		lblDonateTimes.setHorizontalAlignment(SwingConstants.LEFT);
		lblDonateTimes.setForeground(new Color(204, 102, 153));
		lblDonateTimes.setFont(new Font("Sitka Banner", Font.BOLD, 25));
		
		rdbtnGiveOnce = new JRadioButton("Give Once");
		donateTimesGroup.add(rdbtnGiveOnce);
		rdbtnGiveOnce.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		rdbtnGiveOnce.setBounds(249, 27, 110, 33);
		panelDonation.add(rdbtnGiveOnce);
		
		JRadioButton rdbtnMonthly = new JRadioButton("Monthly");
		donateTimesGroup.add(rdbtnMonthly);
		rdbtnMonthly.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		rdbtnMonthly.setBounds(376, 27, 96, 33);
		panelDonation.add(rdbtnMonthly);
		
		JLabel lblHowManyMonth = new JLabel("How many month would you like to donate?");
		lblHowManyMonth.setHorizontalAlignment(SwingConstants.LEFT);
		lblHowManyMonth.setForeground(new Color(204, 102, 153));
		lblHowManyMonth.setFont(new Font("Sitka Banner", Font.BOLD, 25));
		lblHowManyMonth.setBounds(20, 83, 452, 46);
		panelDonation.add(lblHowManyMonth);
		
		donateMonth = new JTextField();
		donateMonth.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		donateMonth.setBounds(20, 125, 115, 33);
		panelDonation.add(donateMonth);
		donateMonth.setColumns(10);
		
		JComboBox donateMethodcomboBox = new JComboBox();
		donateMethodcomboBox.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		donateMethodcomboBox.setModel(new DefaultComboBoxModel(new String[] {"Cash", "Credit/Debit", "Account", "Online Banking"}));
		donateMethodcomboBox.setBounds(269, 165, 208, 33);
		panelDonation.add(donateMethodcomboBox);
		
		JPanel panelViewDonateMethod = new JPanel();
		panelViewDonateMethod.setLayout(null);
		panelViewDonateMethod.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(204, 102, 153)));
		panelViewDonateMethod.setBackground(new Color(255, 180, 162));
		panelViewDonateMethod.setBounds(517, 98, 488, 409);
		panel.add(panelViewDonateMethod);
		
		JButton btnDonateMethod = new JButton("Select Donate Method:");
		btnDonateMethod.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(donateMethodcomboBox.getSelectedItem().equals("Cash")) {
				JButton btnConfirm1 = new JButton("Confirm");
				btnConfirm1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(null, "Donation Done Succesful!");
						Advertisement ad = new Advertisement(); //obj created for Advertisement()
						ad.setVisible(true); //Open the Advertisement.java window
						dispose(); //Close Donation.java window
					}
				});
				btnConfirm1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
				btnConfirm1.setBounds(266, 230, 155, 36);
				panelViewDonateMethod.add(btnConfirm1);
			}
			else if(donateMethodcomboBox.getSelectedItem().equals("Credit/Debit")) {
				JLabel lblEnterCardType = new JLabel("Enter card Type:");
				lblEnterCardType.setHorizontalAlignment(SwingConstants.LEFT);
				lblEnterCardType.setForeground(new Color(204, 102, 153));
				lblEnterCardType.setFont(new Font("Sitka Banner", Font.BOLD, 25));
				lblEnterCardType.setBounds(37, 25, 177, 46);
				panelViewDonateMethod.add(lblEnterCardType);
				
				creditCardNo = new JTextField();
				creditCardNo.setFont(new Font("Times New Roman", Font.PLAIN, 18));
				creditCardNo.setText("Please enter the credit card number at here! ");
				creditCardNo.setBounds(68, 121, 343, 31);
				panelViewDonateMethod.add(creditCardNo);
				creditCardNo.setColumns(10);
				
				securityCode = new JTextField();
				securityCode.setFont(new Font("Times New Roman", Font.PLAIN, 18));
				securityCode.setColumns(10);
				securityCode.setBounds(263, 353, 204, 31);
				panelViewDonateMethod.add(securityCode);
				
				JLabel lblSecurityCode = new JLabel("Enter security code:");
				lblSecurityCode.setHorizontalAlignment(SwingConstants.LEFT);
				lblSecurityCode.setForeground(new Color(204, 102, 153));
				lblSecurityCode.setFont(new Font("Sitka Banner", Font.BOLD, 25));
				lblSecurityCode.setBounds(37, 348, 249, 46);
				panelViewDonateMethod.add(lblSecurityCode);
				
				expires = new JTextField();
				expires.setText("Expires date:");
				expires.setFont(new Font("Times New Roman", Font.PLAIN, 18));
				expires.setColumns(10);
				expires.setBounds(237, 296, 230, 31);
				panelViewDonateMethod.add(expires);
				
				JLabel lblExpiresDate = new JLabel("Enter Expires:");
				lblExpiresDate.setHorizontalAlignment(SwingConstants.LEFT);
				lblExpiresDate.setForeground(new Color(204, 102, 153));
				lblExpiresDate.setFont(new Font("Sitka Banner", Font.BOLD, 25));
				lblExpiresDate.setBounds(37, 291, 177, 46);
				panelViewDonateMethod.add(lblExpiresDate);
				
				cardType = new JTextField();
				cardType.setText("MasterCard/Visa");
				cardType.setFont(new Font("Times New Roman", Font.PLAIN, 18));
				cardType.setColumns(10);
				cardType.setBounds(237, 30, 230, 31);
				panelViewDonateMethod.add(cardType);
				
				JLabel lblCreditDebitCard = new JLabel(); //initialization of JLabel 
				lblCreditDebitCard.setBounds(35, 25, 409, 302);
				path = "creditCard.png"; //path to the image
				ImageIcon MyImage = new ImageIcon(getClass().getResource(path)); //set the path to the MyImage
				Image img = MyImage.getImage(); //converting ImageIcon into Image	
				Image newImg = img.getScaledInstance(lblCreditDebitCard.getWidth(), lblCreditDebitCard.getHeight(), Image.SCALE_SMOOTH); //then scaling of this image
				ImageIcon image = new ImageIcon(newImg); //finally set the image to the JLabel
				panelViewDonateMethod.add(lblCreditDebitCard);
				lblCreditDebitCard.setIcon(image);	

				JButton btnConfirm2 = new JButton("Confirm");
				btnConfirm2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(null, "Donation Done Succesful!");
						Advertisement ad = new Advertisement(); //obj created for Advertisement()
						ad.setVisible(true); //Open the Advertisement.java window
						dispose(); //Close Donation.java window
					}
				});
				btnConfirm2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
				btnConfirm2.setBounds(270, 338, 155, 36);
				panelViewDonateMethod.add(btnConfirm2);
			}
			else if(donateMethodcomboBox.getSelectedItem().equals("Account")) {
				JLabel lblHaveAnPaypal = new JLabel("Have an PayPal account? Sign in to give faster.");
				lblHaveAnPaypal.setBounds(20, 24, 458, 46);
				panelViewDonateMethod.add(lblHaveAnPaypal);
				lblHaveAnPaypal.setHorizontalAlignment(SwingConstants.LEFT);
				lblHaveAnPaypal.setForeground(new Color(204, 102, 153));
				lblHaveAnPaypal.setFont(new Font("Sitka Banner", Font.BOLD, 23));
				
				JCheckBox chckbxHvPayPalAcc = new JCheckBox("True");
				chckbxHvPayPalAcc.setBounds(20, 65, 110, 33);
				panelViewDonateMethod.add(chckbxHvPayPalAcc);
				chckbxHvPayPalAcc.setFont(new Font("Times New Roman", Font.PLAIN, 18));
				
				JButton btnConfirm3 = new JButton("Confirm");
				btnConfirm3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(null, "Donation Done Succesful!");
						Advertisement ad = new Advertisement(); //obj created for Advertisement()
						ad.setVisible(true); //Open the Advertisement.java window
						dispose(); //Close Donation.java window
					}
				});
				btnConfirm3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
				btnConfirm3.setBounds(266, 230, 155, 36);
				panelViewDonateMethod.add(btnConfirm3);
			}
			else if (donateMethodcomboBox.getSelectedItem().equals("Online Banking")) {
				JComboBox bankName = new JComboBox();
				bankName.setModel(new DefaultComboBoxModel(new String[] {"Select Bank", "Maybank", "CIMB", "Public Bank Bhd", "RHB Bank", "Hong Leong Bank", "AmBank", "UOB Bank", "Bank Rakyat", "OCBC Bank", "HSBC Bank Malaysia"}));
				bankName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
				bankName.setBounds(256, 28, 210, 33);
				panelViewDonateMethod.add(bankName);
				
				JLabel lblSelectBankName = new JLabel("Select Bank Name:");
				lblSelectBankName.setHorizontalAlignment(SwingConstants.LEFT);
				lblSelectBankName.setForeground(new Color(204, 102, 153));
				lblSelectBankName.setFont(new Font("Sitka Banner", Font.BOLD, 25));
				lblSelectBankName.setBounds(19, 24, 239, 46);
				panelViewDonateMethod.add(lblSelectBankName);
				
				JLabel lblBankAccNo = new JLabel("Please enter the bank account no:");
				lblBankAccNo.setHorizontalAlignment(SwingConstants.LEFT);
				lblBankAccNo.setForeground(new Color(204, 102, 153));
				lblBankAccNo.setFont(new Font("Sitka Banner", Font.BOLD, 25));
				lblBankAccNo.setBounds(19, 73, 384, 46);
				panelViewDonateMethod.add(lblBankAccNo);
				
				bankAccNo = new JTextField();
				bankAccNo.setFont(new Font("Times New Roman", Font.PLAIN, 18));
				bankAccNo.setColumns(10);
				bankAccNo.setBounds(26, 112, 254, 33);
				panelViewDonateMethod.add(bankAccNo);
				
				JLabel lblTacNo = new JLabel("Please Key in Tac No:");
				lblTacNo.setBounds(213, 150, 247, 46);
				panelViewDonateMethod.add(lblTacNo);
				lblTacNo.setHorizontalAlignment(SwingConstants.LEFT);
				lblTacNo.setForeground(new Color(204, 102, 153));
				lblTacNo.setFont(new Font("Sitka Banner", Font.BOLD, 25));
				
				tacNo = new JTextField();
				tacNo.setFont(new Font("Times New Roman", Font.PLAIN, 18));
				tacNo.setBounds(206, 187, 254, 33);
				panelViewDonateMethod.add(tacNo);
				tacNo.setColumns(10);

				JButton btnConfirm4 = new JButton("Confirm");
				btnConfirm4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (tacNo.getText().equals("520947")) {
							JOptionPane.showMessageDialog(null, "Donation Done Succesful!");
							Advertisement ad = new Advertisement(); //obj created for Advertisement()
							ad.setVisible(true); //Open the Advertisement.java window
							dispose(); //Close Donation.java window
						}
						else {
							JOptionPane.showMessageDialog(null, "Incorrect!Please Request TacNo and Key In Again!");
							tacNo.setText(null);
						}
					}
				});
				btnConfirm4.setFont(new Font("Times New Roman", Font.PLAIN, 18));
				btnConfirm4.setBounds(266, 230, 155, 36);
				panelViewDonateMethod.add(btnConfirm4);
				
				JButton btnRequestTacno = new JButton("Request TacNo");
				btnRequestTacno.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JLabel lblTacNoView = new JLabel("520947");
						lblTacNoView.setHorizontalAlignment(SwingConstants.CENTER);
						lblTacNoView.setForeground(new Color(204, 102, 153));
						lblTacNoView.setFont(new Font("Sitka Banner", Font.BOLD, 34));
						lblTacNoView.setBounds(31, 199, 138, 46);
						lblTacNoView.setVisible(true);
						panelViewDonateMethod.add(lblTacNoView);
					}
				});
				btnRequestTacno.setFont(new Font("Times New Roman", Font.PLAIN, 18));
				btnRequestTacno.setBounds(21, 152, 155, 36);
				panelViewDonateMethod.add(btnRequestTacno);
			}
			}
		});
		btnDonateMethod.setBounds(20, 168, 239, 33);
		btnDonateMethod.setForeground(new Color(204, 102, 153));
		btnDonateMethod.setFont(new Font("Sitka Banner", Font.BOLD, 22));
		panelDonation.add(btnDonateMethod);
	}
}
