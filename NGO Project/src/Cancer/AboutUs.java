package Cancer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import GenderDiscrimination.AdminLogin;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AboutUs extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutUs frame = new AboutUs();
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
	public AboutUs() {
		setTitle("AboutAssociation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 448);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 245, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(20, 51, 577, 279);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panelName = new JPanel();
		panelName.setBackground(new Color(255, 160, 122));
		panelName.setBounds(10, 11, 557, 31);
		panel.add(panelName);
		
		JLabel NameLabel = new JLabel("Cahaya Cancer Association");
		NameLabel.setFont(new Font("OCR A Extended", Font.PLAIN, 18));
		NameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panelName.add(NameLabel);
		
		JPanel panelLocation = new JPanel();
		panelLocation.setBackground(new Color(250, 128, 114));
		panelLocation.setBounds(10, 53, 557, 31);
		panel.add(panelLocation);
		
		JLabel LocationLabel = new JLabel("PT 195, Jalan Manis, 17500 Tanah Merah, Kelantan");
		LocationLabel.setIcon(new ImageIcon(AboutUs.class.getResource("Home-icon.png")));
		LocationLabel.setFont(new Font("OCR A Extended", Font.PLAIN, 18));
		panelLocation.add(LocationLabel);
		
		JPanel panelContact = new JPanel();
		panelContact.setBackground(new Color(240, 128, 128));
		panelContact.setBounds(10, 97, 557, 31);
		panel.add(panelContact);
		
		JLabel ContactLabel = new JLabel("09-9555875 (Office) /  09-9551613 (Fax)");
		ContactLabel.setIcon(new ImageIcon(AboutUs.class.getResource("phone-icon.png")));
		ContactLabel.setFont(new Font("OCR A Extended", Font.PLAIN, 18));
		panelContact.add(ContactLabel);
		
		JPanel panelEmail = new JPanel();
		panelEmail.setBackground(new Color(255, 182, 193));
		panelEmail.setBounds(10, 142, 557, 31);
		panel.add(panelEmail);
		
		JLabel EmailLabel = new JLabel("cahaya.association@gmail.com");
		EmailLabel.setFont(new Font("OCR A Extended", Font.PLAIN, 18));
		EmailLabel.setIcon(new ImageIcon(AboutUs.class.getResource("mail-icon.png")));
		panelEmail.add(EmailLabel);
		
		JPanel panelWeb = new JPanel();
		panelWeb.setBackground(new Color(250, 235, 215));
		panelWeb.setBounds(10, 189, 557, 31);
		panel.add(panelWeb);
		
		JLabel WebLabel = new JLabel("www.cahayacancerassociationtm.com.my");
		WebLabel.setIcon(new ImageIcon(AboutUs.class.getResource("websites-folder-icon.png")));
		WebLabel.setFont(new Font("OCR A Extended", Font.PLAIN, 18));
		panelWeb.add(WebLabel);
		
		JPanel panelWWD = new JPanel();
		panelWWD.setBackground(new Color(250, 240, 230));
		panelWWD.setBounds(10, 231, 557, 37);
		panel.add(panelWWD);
		
		JLabel WWDLabel = new JLabel("We Want To Raise Public Awareness About Cancer Through Education ");
		WWDLabel.setFont(new Font("OCR A Extended", Font.PLAIN, 14));
		panelWWD.add(WWDLabel);
		
		JLabel AboutUsLabel = new JLabel("About Us");
		AboutUsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		AboutUsLabel.setFont(new Font("TypeWrong", Font.BOLD, 40));
		AboutUsLabel.setBounds(20, 11, 577, 38);
		contentPane.add(AboutUsLabel);
		
		JButton HomeButton = new JButton("Home");
		HomeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage frame = new HomePage();
				frame.setVisible(true);
				dispose();
			}
		});
		HomeButton.setForeground(new Color(0, 0, 0));
		HomeButton.setBackground(new Color(240, 128, 128));
		HomeButton.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 25));
		HomeButton.setBounds(249, 356, 106, 38);
		contentPane.add(HomeButton);
	}
}
