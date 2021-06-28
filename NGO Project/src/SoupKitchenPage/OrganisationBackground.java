package SoupKitchenPage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OrganisationBackground extends JFrame {

	private JPanel contentPane;
	private JLabel orgName;
	private JLabel location;
	private JLabel contactNumber;
	private JLabel establishmentYear;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrganisationBackground frame = new OrganisationBackground();
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
	
	public void updateOrgInfo(String name, String locationn, String number, String year) {//get value from other frame
		orgName.setText(name);
		location.setText(locationn);
		contactNumber.setText(number);
		establishmentYear.setText(year);
		
	}
	public OrganisationBackground() {
		setTitle("Hope Soup Kitchen's Background");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1030, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(216, 191, 216));
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 102, 153)));
		panel.setBounds(0, 0, 1016, 593);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_tittle = new JPanel();
		panel_tittle.setLayout(null);
		panel_tittle.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 102, 153)));
		panel_tittle.setBackground(new Color(216, 191, 216));
		panel_tittle.setBounds(279, 50, 429, 47);
		panel.add(panel_tittle);
		
		JLabel TittleLabel = new JLabel("ORGANISATION BACKGROUND");
		TittleLabel.setFont(new Font("Tahoma", Font.BOLD, 23));
		TittleLabel.setBounds(31, 11, 373, 25);
		panel_tittle.add(TittleLabel);
		
		JPanel panel_info = new JPanel();
		panel_info.setLayout(null);
		panel_info.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 102, 153)));
		panel_info.setBackground(new Color(216, 191, 216));
		panel_info.setBounds(414, 153, 516, 348);
		panel.add(panel_info);
		
		JTextArea txtrOrganisationNameHope = new JTextArea();
		txtrOrganisationNameHope.setText("Our main mission is to ensure that food, \r\nas one of the basic necessities, is\r\navailable to everyone especially those\r\nneeded.\r\n");
		txtrOrganisationNameHope.setFont(new Font("Monospaced", Font.BOLD, 20));
		txtrOrganisationNameHope.setBackground(new Color(216, 191, 216));
		txtrOrganisationNameHope.setEditable(false);
		txtrOrganisationNameHope.setBounds(10, 220, 496, 117);
		panel_info.add(txtrOrganisationNameHope);
		
		JLabel lblOrgName = new JLabel("Organisation name:");
		lblOrgName.setFont(new Font("Monospaced", Font.BOLD, 20));
		lblOrgName.setBounds(10, 11, 224, 23);
		panel_info.add(lblOrgName);
		
		JLabel lblEstablishmentYear = new JLabel("Establishment year:");
		lblEstablishmentYear.setFont(new Font("Monospaced", Font.BOLD, 20));
		lblEstablishmentYear.setBounds(10, 167, 228, 23);
		panel_info.add(lblEstablishmentYear);
		
		JLabel lblContactNumber = new JLabel("Contact number:");
		lblContactNumber.setFont(new Font("Monospaced", Font.BOLD, 20));
		lblContactNumber.setBounds(10, 111, 180, 23);
		panel_info.add(lblContactNumber);
		
		JLabel lblLocation = new JLabel("Location:");
		lblLocation.setFont(new Font("Monospaced", Font.BOLD, 20));
		lblLocation.setBounds(10, 60, 108, 23);
		panel_info.add(lblLocation);
		
		orgName = new JLabel("");
		orgName.setHorizontalAlignment(SwingConstants.LEFT);
		orgName.setFont(new Font("Monospaced", Font.BOLD, 20));
		orgName.setBounds(233, 11, 224, 23);
		panel_info.add(orgName);
		
		location = new JLabel("");
		location.setHorizontalAlignment(SwingConstants.LEFT);
		location.setFont(new Font("Monospaced", Font.BOLD, 20));
		location.setBounds(128, 60, 367, 23);
		panel_info.add(location);
		
		contactNumber = new JLabel("");
		contactNumber.setFont(new Font("Monospaced", Font.BOLD, 20));
		contactNumber.setBounds(210, 111, 224, 23);
		panel_info.add(contactNumber);
		
		establishmentYear = new JLabel("");
		establishmentYear.setFont(new Font("Monospaced", Font.BOLD, 20));
		establishmentYear.setBounds(248, 167, 224, 23);
		panel_info.add(establishmentYear);
		
		JLabel OrganisationLogo = new JLabel("");
		OrganisationLogo.setIcon(new ImageIcon(""));
		OrganisationLogo.setBounds(90, 174, 250, 274);
		panel.add(OrganisationLogo);
		OrganisationLogo.setLabelFor(this);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminOrganisationBackground frame = new AdminOrganisationBackground();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(153, 102, 153));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(10, 11, 126, 47);
		panel.add(btnNewButton);
	}
}
