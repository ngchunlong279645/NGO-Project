package ChildrensWelfare;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Advertisement extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldDonation;
	private JTextField textFieldDiscount;
	private static String donation;
	private static String discount;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Advertisement frame = new Advertisement();
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
	public Advertisement() {
		setTitle("Advertisement");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 826, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 204, 255));
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 204)));
		panel.setBounds(0, 0, 811, 293);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(153, 204, 255));
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 51, 255)));
		panel_1.setBounds(117, 21, 568, 64);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Advertisement");
		lblNewLabel.setFont(new Font("Rockwell Extra Bold", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel.setBounds(163, 10, 267, 44);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(153, 204, 255));
		panel_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 51, 255)));
		panel_2.setBounds(46, 109, 718, 104);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("We have a session of donate is to help orphans and poor children!!!");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(26, 21, 520, 34);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("If you donate MORE THAN RM");
		lblNewLabel_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(26, 54, 243, 34);
		panel_2.add(lblNewLabel_1_1);
		
		textFieldDonation = new JTextField();
		textFieldDonation.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		textFieldDonation.setBounds(272, 54, 61, 34);
		panel_2.add(textFieldDonation);
		textFieldDonation.setColumns(10);
		
		JLabel lblNewLabel_1_1_1 = new JLabel(", you can get a ");
		lblNewLabel_1_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lblNewLabel_1_1_1.setBounds(333, 54, 110, 34);
		panel_2.add(lblNewLabel_1_1_1);
		
		textFieldDiscount = new JTextField();
		textFieldDiscount.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		textFieldDiscount.setColumns(10);
		textFieldDiscount.setBounds(445, 54, 44, 34);
		panel_2.add(textFieldDiscount);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("% discount!!!");
		lblNewLabel_1_1_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1.setBounds(489, 54, 110, 34);
		panel_2.add(lblNewLabel_1_1_1_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(652, 233, 131, 44);
		panel.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminPage frame = new AdminPage();
				frame.setVisible(true);
				dispose();
			}
		});
		btnBack.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
		btnBack.setBackground(new Color(204, 204, 255));
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				donation = textFieldDonation.getText();
				discount = textFieldDiscount.getText();
				
				try {
					EventDescription frame = new EventDescription();
					frame.setVisible(true);
					setVisible(false);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnConfirm.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
		btnConfirm.setBackground(new Color(204, 204, 255));
		btnConfirm.setBounds(484, 233, 143, 44);
		panel.add(btnConfirm);
	}
	
		public static String getDonation() {
			return donation;
		}
		
		public static String getDiscount() {
			return discount;
		}
}
