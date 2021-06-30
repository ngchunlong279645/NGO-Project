package Cancer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Donation extends JFrame {

	private JPanel contentPane;
	private JTextField EmailField;
	private JTextField CreditCardField;
	private JTextField NameField;
	public static int totalDonation;
	private JTextField DonatedAmountField;
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
	
	public static int getTotalDonation() {
		return totalDonation;
	}

	/**
	 * Create the frame.
	 */
	public Donation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 612, 672);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10, 11, 592, 734);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 228, 225));
		panel_1.setBounds(114, 11, 340, 37);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Donation is not about giving.");
		lblNewLabel.setBounds(29, 0, 287, 17);
		panel_1.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("TypeWrong", Font.PLAIN, 15));
		
		JLabel lblItsMakingA = new JLabel("It's making a difference");
		lblItsMakingA.setBounds(-110, 11, 567, 27);
		panel_1.add(lblItsMakingA);
		lblItsMakingA.setHorizontalAlignment(SwingConstants.CENTER);
		lblItsMakingA.setFont(new Font("TypeWrong", Font.PLAIN, 15));
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(Donation.class.getResource("download.jfif")));
		lblNewLabel_1_1.setBounds(294, 451, 256, 191);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("You can either choose among these or type another amount.");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(21, 138, 544, 32);
		panel.add(lblNewLabel_2_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(240, 230, 140));
		panel_2.setBounds(141, 378, 324, 48);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCahayaCancerAssociation = new JLabel("Cahaya Cancer Association");
		lblCahayaCancerAssociation.setBounds(-107, 0, 567, 32);
		panel_2.add(lblCahayaCancerAssociation);
		lblCahayaCancerAssociation.setHorizontalAlignment(SwingConstants.CENTER);
		lblCahayaCancerAssociation.setFont(new Font("TypeWrong", Font.PLAIN, 13));
		
		JLabel lblThankyouForYour = new JLabel("Thankyou for your generous gift to ");
		lblThankyouForYour.setBounds(-107, 16, 577, 32);
		panel_2.add(lblThankyouForYour);
		lblThankyouForYour.setHorizontalAlignment(SwingConstants.CENTER);
		lblThankyouForYour.setFont(new Font("TypeWrong", Font.PLAIN, 13));
		
		EmailField = new JTextField();
		EmailField.setHorizontalAlignment(SwingConstants.CENTER);
		EmailField.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		EmailField.setColumns(10);
		EmailField.setBounds(199, 84, 178, 27);
		panel.add(EmailField);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_3_1.setBackground(Color.WHITE);
		panel_3_1.setBounds(80, 168, 109, 48);
		panel.add(panel_3_1);
		panel_3_1.setLayout(null);
		
		JLabel RM50Label = new JLabel("50");
		RM50Label.setBounds(0, 0, 109, 48);
		panel_3_1.add(RM50Label);
		RM50Label.setIcon(new ImageIcon(Donation.class.getResource("US-dollar-icon.png")));
		RM50Label.setHorizontalAlignment(SwingConstants.CENTER);
		RM50Label.setFont(new Font("Comic Sans MS", Font.BOLD, 29));
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_3_2.setBackground(Color.WHITE);
		panel_3_2.setBounds(237, 168, 119, 48);
		panel.add(panel_3_2);
		panel_3_2.setLayout(null);
		
		JLabel RM100Label = new JLabel("100");
		RM100Label.setBounds(0, 0, 112, 48);
		panel_3_2.add(RM100Label);
		RM100Label.setIcon(new ImageIcon(Donation.class.getResource("US-dollar-icon.png")));
		RM100Label.setHorizontalAlignment(SwingConstants.CENTER);
		RM100Label.setFont(new Font("Comic Sans MS", Font.BOLD, 29));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setBounds(407, 168, 119, 48);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel RM1000Label = new JLabel("1000");
		RM1000Label.setBounds(0, 0, 119, 47);
		panel_4.add(RM1000Label);
		RM1000Label.setIcon(new ImageIcon(Donation.class.getResource("US-dollar-icon.png")));
		RM1000Label.setHorizontalAlignment(SwingConstants.CENTER);
		RM1000Label.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Donation.class.getResource("download.jfif")));
		lblNewLabel_1.setBounds(50, 451, 253, 191);
		panel.add(lblNewLabel_1);
		
		JLabel EmailLabel = new JLabel("Email ");
		EmailLabel.setHorizontalAlignment(SwingConstants.CENTER);
		EmailLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		EmailLabel.setBounds(199, 52, 178, 32);
		panel.add(EmailLabel);
		
		CreditCardField = new JTextField();
		CreditCardField.setHorizontalAlignment(SwingConstants.CENTER);
		CreditCardField.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		CreditCardField.setColumns(10);
		CreditCardField.setBounds(387, 84, 178, 27);
		panel.add(CreditCardField);
		
		JButton DonateButton = new JButton("Donate");
		DonateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int messageType = JOptionPane.PLAIN_MESSAGE;
				JOptionPane.showMessageDialog(DonateButton,
						"\nHere is the proof of your donation. Thankyou."+
								 "\n ---------------------------------------------------------" +
							     "\n        Donor's Detail         "+             
								 "\n ---------------------------------------------------------"+
								 "\n   Name : " +NameField.getText()     +    
								 "\n   Email : " +EmailField.getText()          +
								 "\n   Credit Card Number :" + CreditCardField.getText()              +
								 "\n   Amount Donated : RM " + DonatedAmountField.getText()              +
								 "\n ----------------------------------------------------------");
						
				String Donation = DonatedAmountField.getText();
				totalDonation = Integer.parseInt(Donation)+totalDonation;
			}
		});
		DonateButton.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		DonateButton.setBounds(39, 383, 92, 32);
		panel.add(DonateButton);
		
		JButton HomeButton = new JButton("Home");
		HomeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage frame = new HomePage();
				frame.setVisible(true);
				dispose();
			}
		});
		HomeButton.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		HomeButton.setBounds(473, 383, 92, 32);
		panel.add(HomeButton);
		
		JLabel lblCreditCardNumber = new JLabel("Credit Card Number");
		lblCreditCardNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreditCardNumber.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblCreditCardNumber.setBounds(389, 52, 176, 32);
		panel.add(lblCreditCardNumber);
		
		NameField = new JTextField();
		NameField.setHorizontalAlignment(SwingConstants.CENTER);
		NameField.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		NameField.setColumns(10);
		NameField.setBounds(11, 84, 178, 27);
		panel.add(NameField);
		
		JLabel NameLabel = new JLabel("Name");
		NameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		NameLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		NameLabel.setBounds(11, 52, 178, 32);
		panel.add(NameLabel);
		
		DonatedAmountField = new JTextField();
		DonatedAmountField.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		DonatedAmountField.setHorizontalAlignment(SwingConstants.CENTER);
		DonatedAmountField.setBounds(224, 236, 160, 37);
		panel.add(DonatedAmountField);
		DonatedAmountField.setColumns(10);
	}
}
