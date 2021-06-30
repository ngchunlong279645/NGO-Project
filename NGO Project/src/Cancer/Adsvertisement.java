package Cancer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Adsvertisement extends JFrame {

	private JPanel contentPane;
	private JTextField VoucherField;
	private static String voucher;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Adsvertisement frame = new Adsvertisement();
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
	public Adsvertisement() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 519, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 11, 483, 239);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel AdsLabel = new JLabel("For those that joining this, going to get Shoppee's voucher RM");
		AdsLabel.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 20));
		AdsLabel.setBounds(10, 89, 415, 38);
		panel.add(AdsLabel);
		
		VoucherField = new JTextField();
		VoucherField.setHorizontalAlignment(SwingConstants.CENTER);
		VoucherField.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 20));
		VoucherField.setBounds(377, 98, 56, 20);
		panel.add(VoucherField);
		VoucherField.setColumns(10);
		
		JLabel lblOff = new JLabel(" OFF !!");
		lblOff.setHorizontalAlignment(SwingConstants.CENTER);
		lblOff.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 20));
		lblOff.setBounds(436, 89, 37, 38);
		panel.add(lblOff);
		
		JButton UpdateButton = new JButton("Update ");
		UpdateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				voucher = VoucherField.getText();
				
				try {
					EventParticipant frame = new EventParticipant();
					frame.setVisible(true);
					setVisible(false);
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
				
			}
		});
		UpdateButton.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		UpdateButton.setBounds(105, 155, 108, 31);
		panel.add(UpdateButton);
		
		JLabel lblSoDontHesitate = new JLabel("So, dont hesitate to joining us now.");
		lblSoDontHesitate.setHorizontalAlignment(SwingConstants.CENTER);
		lblSoDontHesitate.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 20));
		lblSoDontHesitate.setBounds(30, 61, 415, 38);
		panel.add(lblSoDontHesitate);
		
		JButton Home = new JButton("Home");
		Home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage frame = new HomePage();
				frame.setVisible(true);
				dispose();
			}
		});
		Home.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		Home.setBounds(235, 155, 108, 31);
		panel.add(Home);
		
	}
	public static String getVoucher() {
			return voucher;
		}
	}

