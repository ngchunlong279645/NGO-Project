package SoupKitchenPage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminOrganisationBackground extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldorg;
	private JTextField textFieldloc;
	private JTextField textFieldyear;
	private JTextField textFieldnum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminOrganisationBackground frame = new AdminOrganisationBackground();
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
	public AdminOrganisationBackground() {
		setTitle("Admin Hope Soup Kitchen's Background");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(216, 191, 216));
		contentPane.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 102, 153)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Organisation name:");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel.setBounds(74, 105, 184, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblLocation = new JLabel("Location:");
		lblLocation.setFont(new Font("Arial", Font.PLAIN, 20));
		lblLocation.setBounds(74, 170, 90, 40);
		contentPane.add(lblLocation);
		
		JLabel lblContactNumber = new JLabel("Contact number:");
		lblContactNumber.setFont(new Font("Arial", Font.PLAIN, 20));
		lblContactNumber.setBounds(74, 233, 159, 40);
		contentPane.add(lblContactNumber);
		
		JLabel lblEstablishmentYear = new JLabel("Establishment year:");
		lblEstablishmentYear.setFont(new Font("Arial", Font.PLAIN, 20));
		lblEstablishmentYear.setBounds(74, 298, 184, 40);
		contentPane.add(lblEstablishmentYear);
		
		JButton btnNewButton = new JButton("UPLOAD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textFieldorg.getText();
				String loc = textFieldloc.getText();
				String num = textFieldnum.getText();
				String year = textFieldyear.getText();
				OrganisationBackground orgbg = new OrganisationBackground();
				orgbg.updateOrgInfo(name, loc, num, year);//passing value
				orgbg.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(153, 102, 153));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(269, 365, 159, 40);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("Organisation Background");
		lblNewLabel_4.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 25));
		lblNewLabel_4.setBounds(202, 23, 302, 34);
		contentPane.add(lblNewLabel_4);
		
		textFieldorg = new JTextField();
		textFieldorg.setBounds(268, 112, 214, 33);
		contentPane.add(textFieldorg);
		textFieldorg.setColumns(10);
		
		textFieldloc = new JTextField();
		textFieldloc.setColumns(10);
		textFieldloc.setBounds(269, 177, 214, 33);
		contentPane.add(textFieldloc);
		
		textFieldyear = new JTextField();
		textFieldyear.setColumns(10);
		textFieldyear.setBounds(268, 298, 214, 33);
		contentPane.add(textFieldyear);
		
		textFieldnum = new JTextField();
		textFieldnum.setColumns(10);
		textFieldnum.setBounds(268, 233, 214, 33);
		contentPane.add(textFieldnum);
	}
}
