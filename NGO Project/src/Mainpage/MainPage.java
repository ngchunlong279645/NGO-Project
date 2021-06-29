package Mainpage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import RacialInjusticePage.Advertisement;
import RacialInjusticePage.Login;
import RacialInjusticePage.SumWithUs;

import VolunteerTeacherPage.Main;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.border.MatteBorder;

import ChildrensWelfare.Home;
import ChildrensWelfare.Mainpage;

import java.awt.Font;
import javax.swing.JSeparator;

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
		setBounds(100, 100, 838, 395);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(255, 160, 122)));
		panel.setBackground(new Color(255, 218, 185));
		panel.setBounds(0, 0, 822, 356);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("RACIAL INJUSTICE");
		btnNewButton_1.setBackground(new Color(152, 251, 152));
		btnNewButton_1.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		btnNewButton_1.setBounds(309, 163, 201, 44);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("~WELCOME TO NGO ORGANISATION~");
		lblNewLabel.setFont(new Font("Tekton Pro", Font.BOLD, 40));
		lblNewLabel.setBounds(76, 38, 641, 69);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("VOLUNTEER TEACHER");
		btnNewButton.setBackground(new Color(135, 206, 235));
		btnNewButton.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		btnNewButton.setBounds(23, 259, 245, 48);
		panel.add(btnNewButton);
		
		JButton btnSoup = new JButton("SOUP KITCHEN");
		btnSoup.setBackground(new Color(175, 238, 238));
		btnSoup.setBounds(63, 162, 172, 46);
		panel.add(btnSoup);
		btnSoup.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		
		JButton btnNewButton_2 = new JButton("GENDER DISCRIMINATION");
		btnNewButton_2.setBackground(new Color(176, 196, 222));
		btnNewButton_2.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		btnNewButton_2.setBounds(539, 261, 260, 44);
		panel.add(btnNewButton_2);
		
		JButton btnChildrensWelfare = new JButton("CHILDREN'S WELFARE ");
		btnChildrensWelfare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mainpage frame = new Mainpage();
				frame.setVisible(true);
				setVisible(false);
			}
		});
		btnChildrensWelfare.setBackground(new Color(240, 128, 128));
		btnChildrensWelfare.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		btnChildrensWelfare.setBounds(278, 260, 251, 46);
		panel.add(btnChildrensWelfare);
		
		JButton btnCancer = new JButton("CANCER ");
		btnCancer.setBackground(new Color(238, 130, 238));
		btnCancer.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		btnCancer.setBounds(574, 165, 159, 38);
		panel.add(btnCancer);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(65, 105, 652, 2);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(63, 26, 660, 1);
		panel.add(separator_1);
		btnSoup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Main frame = new Main();
				frame.setVisible(true);
				setVisible(false);
				
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login frame = new Login();
				frame.setVisible(true);
				setVisible(false);
			}
		});
	}
}
