package Cancer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setTitle("HomePage");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 694);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, -59, 734, 714);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel LogoLabel = new JLabel("");
		LogoLabel.setIcon(new ImageIcon(HomePage.class.getResource("Cahaya cancer association.png")));
		LogoLabel.setBounds(261, 88, 196, 204);
		panel.add(LogoLabel);
		
		JLabel CCALabel = new JLabel("We're Cahaya Cancer Association");
		CCALabel.setHorizontalAlignment(SwingConstants.CENTER);
		CCALabel.setFont(new Font("TypeWrong", Font.BOLD, 17));
		CCALabel.setBounds(-10, 306, 734, 29);
		panel.add(CCALabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(112, 260, 451, -33);
		panel.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLACK);
		panel_2.setBounds(141, 330, 430, 3);
		panel.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 0, 0));
		panel_3.setBounds(131, 384, 128, 134);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel Staff = new JLabel("");
		Staff.setBounds(0, 0, 128, 128);
		panel_3.add(Staff);
		Staff.setIcon(new ImageIcon(HomePage.class.getResource("Patients-icon.png")));
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(new Color(32, 178, 170));
		panel_3_1.setBounds(283, 384, 128, 134);
		panel.add(panel_3_1);
		panel_3_1.setLayout(null);
		
		JLabel CashLabel = new JLabel("");
		CashLabel.setBounds(0, 0, 128, 128);
		panel_3_1.add(CashLabel);
		CashLabel.setIcon(new ImageIcon(HomePage.class.getResource("Money-icon.png")));
		
		JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setBackground(new Color(255, 215, 0));
		panel_3_1_1.setBounds(439, 384, 128, 134);
		panel.add(panel_3_1_1);
		panel_3_1_1.setLayout(null);
		
		JLabel Patient = new JLabel("");
		Patient.setBounds(64, 5, 0, 0);
		panel_3_1_1.add(Patient);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(0, 5, 128, 129);
		panel_3_1_1.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon(HomePage.class.getResource("users-icon.png")));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(HomePage.class.getResource("download.jpg")));
		lblNewLabel.setBounds(178, 11, 211, 182);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(HomePage.class.getResource("download (1).jpg")));
		lblNewLabel_2.setBounds(387, 11, 164, 171);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(HomePage.class.getResource("hp.jpg")));
		lblNewLabel_3.setBounds(550, 11, 184, 171);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(HomePage.class.getResource("images (1).jpg")));
		lblNewLabel_4.setBounds(0, 11, 178, 171);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Since 2009, we had support those people affected by it. ");
		lblNewLabel_5.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(0, 346, 734, 17);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("20%");
		lblNewLabel_6.setFont(new Font("Tw Cen MT", Font.BOLD, 30));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(131, 516, 128, 38);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("RM 500");
		lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1.setFont(new Font("Tw Cen MT", Font.BOLD, 30));
		lblNewLabel_6_1.setBounds(283, 516, 128, 38);
		panel.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("250");
		lblNewLabel_6_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_2.setFont(new Font("Tw Cen MT", Font.BOLD, 30));
		lblNewLabel_6_2.setBounds(439, 516, 128, 38);
		panel.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_7 = new JLabel("of the staff are");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Tw Cen MT", Font.PLAIN, 17));
		lblNewLabel_7.setBounds(131, 546, 128, 29);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("cancer survivors.");
		lblNewLabel_7_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 17));
		lblNewLabel_7_1.setBounds(131, 556, 128, 29);
		panel.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_7_2 = new JLabel("from the fund will be");
		lblNewLabel_7_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_2.setFont(new Font("Tw Cen MT", Font.PLAIN, 17));
		lblNewLabel_7_2.setBounds(283, 546, 140, 29);
		panel.add(lblNewLabel_7_2);
		
		JLabel lblNewLabel_7_3 = new JLabel("is the current total");
		lblNewLabel_7_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_3.setFont(new Font("Tw Cen MT", Font.PLAIN, 17));
		lblNewLabel_7_3.setBounds(443, 546, 128, 29);
		panel.add(lblNewLabel_7_3);
		
		JLabel lblNewLabel_7_4 = new JLabel("donated to other");
		lblNewLabel_7_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_4.setFont(new Font("Tw Cen MT", Font.PLAIN, 17));
		lblNewLabel_7_4.setBounds(293, 556, 128, 29);
		panel.add(lblNewLabel_7_4);
		
		JLabel lblNewLabel_7_5 = new JLabel("patients we had");
		lblNewLabel_7_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_5.setFont(new Font("Tw Cen MT", Font.PLAIN, 17));
		lblNewLabel_7_5.setBounds(449, 556, 122, 29);
		panel.add(lblNewLabel_7_5);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 0, 0));
		panel_4.setBounds(0, 631, 734, 103);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("Cahaya Cancer Association");
		lblNewLabel_8.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_8.setBounds(10, 30, 198, 14);
		panel_4.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Contact Us");
		lblNewLabel_9.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNewLabel_9.setForeground(new Color(255, 255, 255));
		lblNewLabel_9.setBounds(10, 11, 156, 14);
		panel_4.add(lblNewLabel_9);
		
		JLabel lblNewLabel_8_1 = new JLabel("PT 195, Jalan Manis,");
		lblNewLabel_8_1.setForeground(Color.WHITE);
		lblNewLabel_8_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		lblNewLabel_8_1.setBounds(10, 49, 198, 14);
		panel_4.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_8_2 = new JLabel("17500 Tanah Merah, Kelantan.");
		lblNewLabel_8_2.setForeground(Color.WHITE);
		lblNewLabel_8_2.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		lblNewLabel_8_2.setBounds(10, 65, 198, 14);
		panel_4.add(lblNewLabel_8_2);
		
		JButton AboutUsButton = new JButton("About Us");
		AboutUsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AboutUs frame = new AboutUs();
				frame.setVisible(true);
				dispose();
			}
		});
		AboutUsButton.setBackground(new Color(240, 128, 128));
		AboutUsButton.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		AboutUsButton.setBounds(24, 193, 103, 29);
		panel.add(AboutUsButton);
		
		JButton EventButton = new JButton("Event");
		EventButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventParticipant frame = new EventParticipant();
				frame.setVisible(true);
				dispose();
			}
		});
		EventButton.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		EventButton.setBackground(new Color(240, 128, 128));
		EventButton.setBounds(137, 193, 89, 29);
		panel.add(EventButton);
		
		JButton btnDonate = new JButton("Donate");
		btnDonate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Donation frame = new Donation();
				frame.setVisible(true);
				dispose();
			}
		});
		btnDonate.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		btnDonate.setBackground(new Color(240, 128, 128));
		btnDonate.setBounds(619, 193, 89, 29);
		panel.add(btnDonate);
		
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin frame = new AdminLogin();
				frame.setVisible(true);
				dispose();
			}
		});
		btnAdmin.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		btnAdmin.setBackground(new Color(240, 128, 128));
		btnAdmin.setBounds(497, 195, 95, 29);
		panel.add(btnAdmin);
		
		JLabel lblNewLabel_7_4_1 = new JLabel("selected association");
		lblNewLabel_7_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_4_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 17));
		lblNewLabel_7_4_1.setBounds(283, 565, 140, 29);
		panel.add(lblNewLabel_7_4_1);
		
		JLabel lblNewLabel_7_3_1 = new JLabel("support");
		lblNewLabel_7_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_3_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 17));
		lblNewLabel_7_3_1.setBounds(443, 565, 128, 29);
		panel.add(lblNewLabel_7_3_1);
	}
}
