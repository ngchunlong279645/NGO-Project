package SoupKitchenPage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminProgramDescription extends JFrame {

	private JPanel contentPane;
	private JTextField prog1;
	private JTextField loc1;
	private JTextField day1;
	private JTextField time1;
	private JTextField prog2;
	private JTextField loc2;
	private JTextField day2;
	private JTextField time2;
	private JTextField date2;
	private JTextField fee2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminProgramDescription frame = new AdminProgramDescription();
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
	public AdminProgramDescription() {
		setTitle("Admin Program Description");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 864, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(216, 191, 216));
		contentPane.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 102, 153)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("UPLOAD DESCRIPTION");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String p1 = prog1.getText();
				String l1 = loc1.getText();
				String d1 = day1.getText();
				String t1 = time1.getText();
				String p2 = prog2.getText();
				String l2 = loc2.getText();
				String d2 = day2.getText();
				String t2 = time2.getText();
				String dt = date2.getText();
				String f2 = fee2.getText();
				ProgramDescription pd = new ProgramDescription();
				pd.updateProgramDesc(p1, l1, d1, t1, p2, l2, d2, t2, dt, f2);//passing value
				pd.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(153, 102, 153));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setBounds(82, 368, 266, 51);
		contentPane.add(btnNewButton);
		
		JButton btnUploadRegistration = new JButton("UPLOAD REGISTRATION FEE");
		btnUploadRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String f2 = fee2.getText();
				RegistrationVirtualRun vr = new RegistrationVirtualRun();//create object f2
				vr.updateFee(f2);//passing value
				vr.setVisible(true);
				dispose();
			}
		});
		btnUploadRegistration.setForeground(Color.WHITE);
		btnUploadRegistration.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnUploadRegistration.setBackground(new Color(153, 102, 153));
		btnUploadRegistration.setBounds(82, 451, 266, 51);
		contentPane.add(btnUploadRegistration);
		
		JLabel lblNewLabel = new JLabel("Program Description");
		lblNewLabel.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 30));
		lblNewLabel.setBounds(287, 29, 279, 43);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 102, 153)));
		panel.setBackground(new Color(216, 191, 216));
		panel.setBounds(53, 128, 325, 212);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Program 1:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 25, 82, 18);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Location:");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(10, 72, 69, 18);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Day:");
		lblNewLabel_1_2.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(10, 122, 82, 18);
		panel.add(lblNewLabel_1_2);
		
		prog1 = new JTextField();
		prog1.setBounds(102, 25, 202, 20);
		panel.add(prog1);
		prog1.setColumns(10);
		
		loc1 = new JTextField();
		loc1.setColumns(10);
		loc1.setBounds(102, 72, 202, 20);
		panel.add(loc1);
		
		day1 = new JTextField();
		day1.setColumns(10);
		day1.setBounds(102, 122, 202, 20);
		panel.add(day1);
		
		time1 = new JTextField();
		time1.setColumns(10);
		time1.setBounds(102, 164, 202, 20);
		panel.add(time1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Time:");
		lblNewLabel_1_3.setBounds(10, 164, 82, 18);
		panel.add(lblNewLabel_1_3);
		lblNewLabel_1_3.setFont(new Font("Arial", Font.PLAIN, 15));
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 102, 153)));
		panel_1.setBackground(new Color(216, 191, 216));
		panel_1.setBounds(416, 128, 382, 374);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_1_4 = new JLabel("Program 2:");
		lblNewLabel_1_4.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_1_4.setBounds(10, 26, 82, 18);
		panel_1.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Location:");
		lblNewLabel_1_4_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_1_4_1.setBounds(10, 80, 82, 18);
		panel_1.add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_4_2 = new JLabel("Day:");
		lblNewLabel_1_4_2.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_1_4_2.setBounds(10, 135, 82, 18);
		panel_1.add(lblNewLabel_1_4_2);
		
		JLabel lblNewLabel_1_4_3 = new JLabel("Time:");
		lblNewLabel_1_4_3.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_1_4_3.setBounds(10, 194, 82, 18);
		panel_1.add(lblNewLabel_1_4_3);
		
		JLabel lblNewLabel_1_4_4 = new JLabel("Date:");
		lblNewLabel_1_4_4.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_1_4_4.setBounds(10, 260, 82, 18);
		panel_1.add(lblNewLabel_1_4_4);
		
		JLabel lblNewLabel_1_4_5 = new JLabel("Fee: RM");
		lblNewLabel_1_4_5.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_1_4_5.setBounds(10, 320, 82, 18);
		panel_1.add(lblNewLabel_1_4_5);
		
		prog2 = new JTextField();
		prog2.setColumns(10);
		prog2.setBounds(102, 26, 251, 20);
		panel_1.add(prog2);
		
		
		loc2 = new JTextField();
		loc2.setColumns(10);
		loc2.setBounds(102, 80, 251, 20);
		panel_1.add(loc2);
		
		day2 = new JTextField();
		day2.setColumns(10);
		day2.setBounds(102, 135, 251, 20);
		panel_1.add(day2);
		
		time2 = new JTextField();
		time2.setColumns(10);
		time2.setBounds(102, 194, 251, 20);
		panel_1.add(time2);
		
		date2 = new JTextField();
		date2.setColumns(10);
		date2.setBounds(102, 260, 251, 20);
		panel_1.add(date2);
		
		fee2 = new JTextField();
		fee2.setColumns(10);
		fee2.setBounds(102, 320, 251, 20);
		panel_1.add(fee2);
	}
}
