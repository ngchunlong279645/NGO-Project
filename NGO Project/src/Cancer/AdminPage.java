package Cancer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPage frame = new AdminPage();
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
	public AdminPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 652, 469);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 228, 196));
		panel.setBounds(10, 11, 616, 408);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(AdminPage.class.getResource("user-icon.png")));
		lblNewLabel_1.setBounds(240, 11, 128, 171);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Welcome Admin!");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("TypeWrong", Font.PLAIN, 15));
		lblNewLabel.setBounds(205, 163, 192, 26);
		panel.add(lblNewLabel);
		
		JLabel lblWhatYouWould = new JLabel("What you would like to see/edit?");
		lblWhatYouWould.setHorizontalAlignment(SwingConstants.CENTER);
		lblWhatYouWould.setFont(new Font("TypeWrong", Font.PLAIN, 15));
		lblWhatYouWould.setBounds(121, 179, 355, 26);
		panel.add(lblWhatYouWould);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(233, 150, 122));
		panel_1.setBounds(0, 0, 128, 125);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_1_4 = new JPanel();
		panel_1_4.setBounds(0, 0, 111, 109);
		panel_1.add(panel_1_4);
		panel_1_4.setBackground(new Color(255, 160, 122));
		panel_1_4.setLayout(null);
		
		JPanel panel_1_4_1_1_1 = new JPanel();
		panel_1_4_1_1_1.setBackground(new Color(250, 128, 114));
		panel_1_4_1_1_1.setBounds(0, 0, 95, 96);
		panel_1_4.add(panel_1_4_1_1_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(233, 150, 122));
		panel_1_1.setBounds(0, 283, 128, 125);
		panel.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JPanel panel_1_4_1 = new JPanel();
		panel_1_4_1.setBackground(new Color(255, 160, 122));
		panel_1_4_1.setBounds(0, 16, 111, 109);
		panel_1_1.add(panel_1_4_1);
		panel_1_4_1.setLayout(null);
		
		JPanel panel_1_4_1_1 = new JPanel();
		panel_1_4_1_1.setBounds(0, 11, 95, 96);
		panel_1_4_1.add(panel_1_4_1_1);
		panel_1_4_1_1.setBackground(new Color(250, 128, 114));
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(new Color(233, 150, 122));
		panel_1_2.setBounds(488, 283, 128, 125);
		panel.add(panel_1_2);
		panel_1_2.setLayout(null);
		
		JPanel panel_1_4_2 = new JPanel();
		panel_1_4_2.setBackground(new Color(255, 160, 122));
		panel_1_4_2.setBounds(17, 16, 111, 109);
		panel_1_2.add(panel_1_4_2);
		panel_1_4_2.setLayout(null);
		
		JPanel panel_1_4_1_1_3 = new JPanel();
		panel_1_4_1_1_3.setBackground(new Color(250, 128, 114));
		panel_1_4_1_1_3.setBounds(16, 11, 95, 96);
		panel_1_4_2.add(panel_1_4_1_1_3);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBackground(new Color(233, 150, 122));
		panel_1_3.setBounds(488, 0, 128, 125);
		panel.add(panel_1_3);
		panel_1_3.setLayout(null);
		
		JPanel panel_1_4_3 = new JPanel();
		panel_1_4_3.setBackground(new Color(255, 160, 122));
		panel_1_4_3.setBounds(17, 0, 111, 109);
		panel_1_3.add(panel_1_4_3);
		panel_1_4_3.setLayout(null);
		
		JPanel panel_1_4_1_1_2 = new JPanel();
		panel_1_4_1_1_2.setBackground(new Color(250, 128, 114));
		panel_1_4_1_1_2.setBounds(16, 0, 95, 96);
		panel_1_4_3.add(panel_1_4_1_1_2);
		
		JButton btnNewButton = new JButton("Finance");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Finance frame = new Finance();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(240, 128, 128));
		btnNewButton.setFont(new Font("TypeWrong", Font.BOLD, 14));
		btnNewButton.setBounds(187, 339, 238, 33);
		panel.add(btnNewButton);
		
		JButton AdsButton = new JButton("Adsvertisement");
		AdsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Adsvertisement frame = new Adsvertisement();
				frame.setVisible(true);
				dispose();
			}
		});
		AdsButton.setFont(new Font("TypeWrong", Font.BOLD, 14));
		AdsButton.setBackground(new Color(240, 128, 128));
		AdsButton.setBounds(187, 248, 238, 33);
		panel.add(AdsButton);
		
		JButton EventButton = new JButton("Event Management");
		EventButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventAdmin frame = new EventAdmin();
				frame.setVisible(true);
				dispose();
			}
		});
		EventButton.setFont(new Font("TypeWrong", Font.BOLD, 14));
		EventButton.setBackground(new Color(240, 128, 128));
		EventButton.setBounds(187, 295, 238, 33);
		panel.add(EventButton);
		

			}
}
