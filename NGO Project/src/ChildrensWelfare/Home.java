package ChildrensWelfare;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

public class Home extends JFrame {

	private JPanel contentPane;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setTitle("Home");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 839, 632);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 204, 255));
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 204)));
		panel.setBounds(0, 0, 825, 573);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(49, 11, 728, 55);
		panel.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 204)));
		panel_1.setBackground(new Color(0, 204, 255));
		
		JLabel lblNewLabel = new JLabel("CHILDREN'S PROTECTION SOCIETY");
		lblNewLabel.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 26));
		lblNewLabel.setBounds(66, 10, 584, 34);
		panel_1.add(lblNewLabel);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Home", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setBackground(new Color(204, 204, 204));
		btnExit.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 22));
		btnExit.setBounds(694, 517, 110, 35);
		panel.add(btnExit);
		
		JLabel lblCompanyIcon = new JLabel("");
		lblCompanyIcon.setIcon(new ImageIcon(Home.class.getResource("Logo-Big-removebg-preview.png")));
		lblCompanyIcon.setBounds(142, 97, 141, 149);
		panel.add(lblCompanyIcon);
		
		JButton btnCompany = new JButton("Company");
		btnCompany.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CompanyBackground frame = new CompanyBackground();
				frame.setVisible(true);
				dispose();
			}
		});
		btnCompany.setBackground(new Color(204, 204, 255));
		btnCompany.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 18));
		btnCompany.setBounds(126, 256, 172, 37);
		panel.add(btnCompany);
		
		JLabel lblParticipantIcon = new JLabel("");
		lblParticipantIcon.setIcon(new ImageIcon(Home.class.getResource("participant-removebg-preview.png"))); 
		lblParticipantIcon.setBounds(322, 313, 189, 149);
		panel.add(lblParticipantIcon);
		
		JButton btnRegister = new JButton("Registration");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ParticipantRegistration frame = new ParticipantRegistration();
				frame.setVisible(true);
				dispose();
			}
		});
		btnRegister.setBackground(new Color(204, 204, 255));
		btnRegister.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 18));
		btnRegister.setBounds(307, 472, 204, 37);
		panel.add(btnRegister);
		
		JLabel lblEventIcon = new JLabel("");
		lblEventIcon.setIcon(new ImageIcon(Home.class.getResource("event-removebg-preview.png")));
		lblEventIcon.setBounds(511, 97, 224, 149);
		panel.add(lblEventIcon);
		
		JButton btnEvent = new JButton("Event");
		btnEvent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventDescription frame = new EventDescription();
				frame.setVisible(true);
				dispose();
			}
		});
		btnEvent.setBackground(new Color(204, 204, 255));
		btnEvent.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 18));
		btnEvent.setBounds(543, 256, 172, 37);
		panel.add(btnEvent);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mainpage frame = new Mainpage();
				frame.setVisible(true);
				dispose();
			}
		});
		btnBack.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 22));
		btnBack.setBackground(new Color(204, 204, 204));
		btnBack.setBounds(543, 517, 110, 35);
		panel.add(btnBack);
		
	}

}
