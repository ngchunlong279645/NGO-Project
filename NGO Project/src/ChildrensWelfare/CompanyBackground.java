package ChildrensWelfare;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CompanyBackground extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldName;
	private JTextField textFieldAddress;
	private JTextField textFieldContactNo;
	private JTextField textFieldWeb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CompanyBackground frame = new CompanyBackground();
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
	public CompanyBackground() {
		setTitle("Company Background");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 945, 684);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 204, 255));
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 204)));
		panel.setBounds(0, 0, 931, 647);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(153, 204, 255));
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 51, 255)));
		panel_1.setBounds(170, 26, 567, 73);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblTitle = new JLabel("COMPANY BACKGROUND");
		lblTitle.setFont(new Font("Rockwell Extra Bold", Font.BOLD | Font.ITALIC, 26));
		lblTitle.setBounds(87, 10, 411, 53);
		panel_1.add(lblTitle);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home frame = new Home();
				frame.setVisible(true);
				dispose();
			}
		});
		btnBack.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 22));
		btnBack.setBackground(new Color(204, 204, 204));
		btnBack.setBounds(715, 568, 187, 54);
		panel.add(btnBack);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 51, 255)));
		panel_1_1.setBackground(new Color(153, 204, 255));
		panel_1_1.setBounds(68, 129, 795, 429);
		panel.add(panel_1_1);
		
		JTextPane txtpnOrganizationNameChildrens = new JTextPane();
		txtpnOrganizationNameChildrens.setText("Organization Goal:\r\nThe objectives of CPS are both immediate and longer-term.\r\n\r\ni. The immediate objectives is to provide children at risk with a safe supportive environment conducive to their healthy development.\r\nii. In the longer-term we seek to support projects that enhance community-based facilities for children and development in areas where such facilities are lacking. ");
		txtpnOrganizationNameChildrens.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		txtpnOrganizationNameChildrens.setBackground(new Color(153, 204, 255));
		txtpnOrganizationNameChildrens.setBounds(193, 170, 592, 249);
		panel_1_1.add(txtpnOrganizationNameChildrens);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(21, 10, 151, 169);
		panel_1_1.add(lblNewLabel);
		lblNewLabel.setIcon((new ImageIcon(CompanyBackground.class.getResource("Logo-Big-removebg-preview.png"))));
		
		JLabel lblName = new JLabel("Organization Name");
		lblName.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblName.setBounds(193, 10, 170, 32);
		panel_1_1.add(lblName);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblAddress.setBounds(193, 52, 170, 32);
		panel_1_1.add(lblAddress);
		
		JLabel lblContactNo = new JLabel("Contact Number");
		lblContactNo.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblContactNo.setBounds(193, 94, 170, 32);
		panel_1_1.add(lblContactNo);
		
		JLabel lblWebsite = new JLabel("Website");
		lblWebsite.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblWebsite.setBounds(193, 136, 170, 32);
		panel_1_1.add(lblWebsite);
		
		textFieldName = new JTextField();
		JTable t = AdminCompanyBackground.getTable();
		String n = "";
			for(int i = 0; i < t.getRowCount(); i++) {
				n = String.valueOf(t.getValueAt(i, 0));
			}
			textFieldName.setText(n);
		textFieldName.setBackground(new Color(153, 204, 255));
		textFieldName.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		textFieldName.setBounds(373, 10, 342, 32);
		panel_1_1.add(textFieldName);
		textFieldName.setColumns(10);
		
		textFieldAddress = new JTextField();
		JTable t1 = AdminCompanyBackground.getTable();
		String a = "";
			for(int i = 0; i < t1.getRowCount(); i++) {
				a = String.valueOf(t1.getValueAt(i, 1));
			}
			textFieldAddress.setText(a);
		textFieldAddress.setBackground(new Color(153, 204, 255));
		textFieldAddress.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		textFieldAddress.setColumns(10);
		textFieldAddress.setBounds(373, 52, 342, 32);
		panel_1_1.add(textFieldAddress);
		
		textFieldContactNo = new JTextField();
		JTable t2 = AdminCompanyBackground.getTable();
		String c = "";
			for(int i = 0; i < t2.getRowCount(); i++) {
				c = String.valueOf(t2.getValueAt(i, 2));
			}
			textFieldContactNo.setText(c);
		textFieldContactNo.setBackground(new Color(153, 204, 255));
		textFieldContactNo.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		textFieldContactNo.setColumns(10);
		textFieldContactNo.setBounds(373, 94, 342, 32);
		panel_1_1.add(textFieldContactNo);
		
		textFieldWeb = new JTextField();
		JTable t3 = AdminCompanyBackground.getTable();
		String w = "";
			for(int i = 0; i < t3.getRowCount(); i++) {
				w = String.valueOf(t3.getValueAt(i, 3));
			}
			textFieldWeb.setText(w);
		textFieldWeb.setBackground(new Color(153, 204, 255));
		textFieldWeb.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		textFieldWeb.setColumns(10);
		textFieldWeb.setBounds(373, 136, 342, 32);
		panel_1_1.add(textFieldWeb);
	}

}
