package ChildrensWelfare;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
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

public class AdminPage extends JFrame {

	private JPanel contentPane;
	private JFrame frame;

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
		setTitle("Admin Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 839, 632);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 204)));
		panel_1.setBackground(new Color(153, 204, 255));
		
		JLabel lblNewLabel = new JLabel("CHILDREN'S PROTECTION SOCIETY");
		lblNewLabel.setFont(new Font("Rockwell Extra Bold", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel.setBounds(74, 10, 584, 34);
		panel_1.add(lblNewLabel);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Admin Page", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnLogout.setBackground(new Color(204, 204, 204));
		btnLogout.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 22));
		btnLogout.setBounds(663, 517, 141, 35);
		panel.add(btnLogout);
		
		JLabel lblCompanyIcon = new JLabel("");
		lblCompanyIcon.setIcon(new ImageIcon("")); //C:\\Users\\chyim\\OneDrive\\Pictures\\Au Chyi Min\\Logo-Big-removebg-preview.png
		lblCompanyIcon.setBounds(142, 97, 141, 149);
		panel.add(lblCompanyIcon);
		
		JButton btnCompany = new JButton("Company");
		btnCompany.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminCompanyBackground frame = new AdminCompanyBackground();
				frame.setVisible(true);
				dispose();
			}
		});
		btnCompany.setBackground(new Color(204, 204, 255));
		btnCompany.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 18));
		btnCompany.setBounds(126, 256, 172, 37);
		panel.add(btnCompany);
		
		JLabel lblAdsIcon = new JLabel("");
		lblAdsIcon.setIcon(new ImageIcon("")); //C:\\Users\\chyim\\OneDrive\\Pictures\\Au Chyi Min\\advertising-removebg-preview.png
		lblAdsIcon.setBounds(524, 97, 201, 149);
		panel.add(lblAdsIcon);
		
		JLabel lblFinanceIcon = new JLabel("");
		lblFinanceIcon.setIcon(new ImageIcon("")); //C:\\Users\\chyim\\OneDrive\\Pictures\\Au Chyi Min\\finance_1-removebg-preview.png
		lblFinanceIcon.setBounds(501, 303, 224, 149);
		panel.add(lblFinanceIcon);
		
		JButton btnAds = new JButton("Advertisement");
		btnAds.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Advertisement frame = new Advertisement();
				frame.setVisible(true);
				dispose();
			}
		});
		btnAds.setBackground(new Color(204, 204, 255));
		btnAds.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 18));
		btnAds.setBounds(521, 256, 204, 37);
		panel.add(btnAds);
		
		JButton btnFinance = new JButton("Finance");
		btnFinance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Finance frame = new Finance();
				frame.setVisible(true);
				dispose();
			}
		});
		btnFinance.setBackground(new Color(204, 204, 255));
		btnFinance.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 18));
		btnFinance.setBounds(540, 462, 172, 37);
		panel.add(btnFinance);
		
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
		btnBack.setBounds(511, 517, 110, 35);
		panel.add(btnBack);
		
		JLabel lblEventIcon = new JLabel("");
		lblEventIcon.setIcon(new ImageIcon("")); //C:\\Users\\chyim\\OneDrive\\Pictures\\Au Chyi Min\\event-removebg-preview.png
		lblEventIcon.setBounds(112, 303, 204, 149);
		panel.add(lblEventIcon);
		
		JButton btnEvent = new JButton("Event");
		btnEvent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminEvent frame = new AdminEvent();
				frame.setVisible(true);
				dispose();
			}
		});
		btnEvent.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 18));
		btnEvent.setBackground(new Color(204, 204, 255));
		btnEvent.setBounds(126, 462, 172, 37);
		panel.add(btnEvent);
	}

}
