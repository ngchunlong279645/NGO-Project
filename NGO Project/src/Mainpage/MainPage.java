package Mainpage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import RacialInjusticePage.Login;
import SoupKitchen.Homepage;
import SoupKitchen.OrganisationBackground;
import VolunteerTeacherPage.Donation;
import VolunteerTeacherPage.Main;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.border.MatteBorder;

import Cancer.HomePage;
import ChildrensWelfare.Mainpage;
import GenderDiscrimination.AdminLogin;
import GenderDiscrimination.UNWomen;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class MainPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage frame = new MainPage();
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
	public MainPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 932, 631);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(255, 160, 122)));
		panel.setBackground(new Color(255, 218, 185));
		panel.setBounds(0, 0, 918, 594);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("~WELCOME TO NGO ORGANISATION~");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tekton Pro", Font.BOLD, 40));
		lblNewLabel.setBounds(45, 26, 827, 81);
		panel.add(lblNewLabel);
		
		JButton btnRacialInjustice = new JButton("RACIAL INJUSTICE");
		btnRacialInjustice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login frame = new Login();
				frame.setVisible(true);
				setVisible(false);
			}
		});
		btnRacialInjustice.setBackground(new Color(152, 251, 152));
		btnRacialInjustice.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		btnRacialInjustice.setBounds(619, 147, 236, 44);
		panel.add(btnRacialInjustice);
		
		JButton btnVolunteerTeacher = new JButton("<html><center>VOLUNTEER <br/>TEACHER</html>");
		btnVolunteerTeacher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Main frame = new Main();
				frame.setVisible(true);
				setVisible(false);
			}
		});
		btnVolunteerTeacher.setBackground(new Color(135, 206, 235));
		btnVolunteerTeacher.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		btnVolunteerTeacher.setBounds(63, 357, 201, 67);
		panel.add(btnVolunteerTeacher);
		
		JButton btnSoupKitchen = new JButton("SOUP KITCHEN");
		btnSoupKitchen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage frame = new Homepage();
				frame.setVisible(true);
				setVisible(false);
			}
		});
		btnSoupKitchen.setBackground(new Color(175, 238, 238));
		btnSoupKitchen.setBounds(63, 147, 201, 45);
		panel.add(btnSoupKitchen);
		btnSoupKitchen.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		
		JButton btnGenderDiscrimination = new JButton("<html><center>GENDER<br/>DISCRIMINATION</html>");
		btnGenderDiscrimination.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UNWomen frame = new UNWomen();
				frame.setVisible(true);
				setVisible(false);
			}
		});
		btnGenderDiscrimination.setBackground(new Color(176, 196, 222));
		btnGenderDiscrimination.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		btnGenderDiscrimination.setBounds(646, 358, 201, 65);
		panel.add(btnGenderDiscrimination);
		
		JButton btnChildrensWelfare = new JButton("<html><center>CHILDREN'S<br/>WELFARE</html>");
		btnChildrensWelfare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mainpage frame = new Mainpage();
				frame.setVisible(true);
				setVisible(false);
			}
		});
		btnChildrensWelfare.setBackground(new Color(240, 128, 128));
		btnChildrensWelfare.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		btnChildrensWelfare.setBounds(348, 357, 201, 67);
		panel.add(btnChildrensWelfare);
		
		JButton btnCancer = new JButton("CANCER ");
		btnCancer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage frame = new HomePage();
				frame.setVisible(true);
				setVisible(false);
			}
		});
		btnCancer.setBackground(new Color(238, 130, 238));
		btnCancer.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		btnCancer.setBounds(348, 147, 201, 44);
		panel.add(btnCancer);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(55, 106, 817, 1);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(45, 26, 827, 1);
		panel.add(separator_1);
		
		JLabel lblSoupKitchen = new JLabel("");
		lblSoupKitchen.setIcon(new ImageIcon(new ImageIcon(MainPage.class.getResource("OrganisationBackground.PNG")).getImage().getScaledInstance( 201, 129, Image.SCALE_DEFAULT)));
		lblSoupKitchen.setBounds(63, 202, 201, 129);
		panel.add(lblSoupKitchen);
		
		JLabel lblCancer = new JLabel("");
		lblCancer.setIcon(new ImageIcon(new ImageIcon(MainPage.class.getResource("Cahaya cancer association.PNG")).getImage().getScaledInstance( 201, 129, Image.SCALE_DEFAULT)));
		lblCancer.setBounds(348, 201, 201, 129);
		panel.add(lblCancer);
		
		JLabel lblRacialInjustice = new JLabel("");
		lblRacialInjustice.setIcon(new ImageIcon(new ImageIcon(MainPage.class.getResource("SumWithUsiconFull.PNG")).getImage().getScaledInstance( 201, 129, Image.SCALE_DEFAULT)));
		lblRacialInjustice.setBounds(652, 201, 201, 129);
		panel.add(lblRacialInjustice);
		
		JLabel lblVolunteerTeacher = new JLabel("");
		lblVolunteerTeacher.setIcon(new ImageIcon(new ImageIcon(MainPage.class.getResource("SOL24.PNG")).getImage().getScaledInstance( 201, 129, Image.SCALE_DEFAULT)));
		lblVolunteerTeacher.setBounds(63, 434, 201, 129);
		panel.add(lblVolunteerTeacher);
		
		JLabel lblChildrenWelfare = new JLabel("");
		lblChildrenWelfare.setIcon(new ImageIcon(new ImageIcon(MainPage.class.getResource("Logo-Big-removebg-preview.png")).getImage().getScaledInstance( 201, 129, Image.SCALE_DEFAULT)));
		lblChildrenWelfare.setBounds(348, 434, 201, 129);
		panel.add(lblChildrenWelfare);
		
		JLabel lblGenderDiscrimination = new JLabel("");
		lblGenderDiscrimination.setIcon(new ImageIcon(new ImageIcon(MainPage.class.getResource("UN Women Logo.jpg")).getImage().getScaledInstance( 201, 129, Image.SCALE_DEFAULT)));
		lblGenderDiscrimination.setBounds(652, 433, 201, 129);
		panel.add(lblGenderDiscrimination);

	}
}
