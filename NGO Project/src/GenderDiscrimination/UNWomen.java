package GenderDiscrimination;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class UNWomen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UNWomen frame = new UNWomen();
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
	public UNWomen() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(UNWomen.class.getResource("gender equality.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1012, 608);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.BLUE, Color.BLUE));
		panel.setForeground(Color.BLACK);
		panel.setBackground(new Color(102, 204, 255));
		panel.setBounds(0, 0, 998, 571);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setForeground(Color.BLACK);
		panel_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.BLUE, Color.BLUE));
		panel_1.setBackground(new Color(153, 204, 255));
		panel_1.setBounds(10, 10, 966, 104);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO UN WOMEN");
		lblNewLabel.setBackground(new Color(153, 204, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel.setBounds(10, 10, 946, 87);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setForeground(Color.BLACK);
		panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.BLUE, Color.BLUE));
		panel_2.setBackground(new Color(153, 204, 255));
		panel_2.setBounds(384, 124, 592, 386);
		panel.add(panel_2);
		
		JTextPane txtpnUNWomenDescription = new JTextPane();
		txtpnUNWomenDescription.setEditable(false);
		txtpnUNWomenDescription.setBackground(new Color(153, 204, 255));
		txtpnUNWomenDescription.setFont(new Font("Berlin Sans FB", Font.PLAIN, 20));
		txtpnUNWomenDescription.setForeground(Color.BLACK);
		txtpnUNWomenDescription.setText("Organization Name:  United Nations Entity for Gender Equality and the Empowerment of Women (UN Women)\r\n\r\nDate of Formation: 2 July 2010\r\n\r\nHQ Location: New York City, United States\r\n\r\nHQ Contact: +1 646 781-4400\r\n\r\nOrganization Goal: \r\ni)   Aim to elimination of discrimination against women and girls\"\r\nii)  Aim to empowerment of women\r\niii) Achievement of equality between women and men as partners and beneficiaries of development, human rights, humanitarian action and peace and security.");
		txtpnUNWomenDescription.setBounds(10, 10, 572, 363);
		panel_2.add(txtpnUNWomenDescription);
		
		// Go to event description frame
		JButton btnParticipant = new JButton("PARTICIPANT");
		btnParticipant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventDescription evDes = new EventDescription(Advertisement.event1,Advertisement.event2,Advertisement.event3);
				evDes.setModalExclusionType(null);
				evDes.setVisible(true);
			}
		});
		btnParticipant.setBackground(new Color(204, 204, 255));
		btnParticipant.setFont(new Font("STHupo", Font.PLAIN, 30));
		btnParticipant.setBounds(38, 359, 276, 67);
		panel.add(btnParticipant);
		
		// Go to admin login frame
		JButton btnAdmin = new JButton("ADMIN");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin adLogin = new AdminLogin();
				adLogin.setModalExclusionType(null);
				adLogin.setVisible(true);
			}
		});
		btnAdmin.setFont(new Font("STHupo", Font.PLAIN, 20));
		btnAdmin.setBackground(new Color(204, 204, 255));
		btnAdmin.setBounds(869, 520, 107, 41);
		panel.add(btnAdmin);
		
		JLabel lblUNWomenLogo = new JLabel("");
		lblUNWomenLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblUNWomenLogo.setIcon(new ImageIcon(new ImageIcon(UNWomen.class.getResource("UN Women Logo.jpg")).getImage().getScaledInstance(300, 150, Image.SCALE_DEFAULT)));
		lblUNWomenLogo.setBounds(20, 124, 309, 167);
		panel.add(lblUNWomenLogo);
		
	}
}
