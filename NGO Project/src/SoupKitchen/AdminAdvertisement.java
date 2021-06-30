package SoupKitchen;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminAdvertisement extends JFrame {

	private JPanel contentPane;
	private JTextArea p1;
	private JTextArea p2;
	private JTextArea us;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminAdvertisement frame = new AdminAdvertisement();
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
	public AdminAdvertisement() {
		setTitle("Admin advertisement");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1030, 630);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(216, 191, 216));
		contentPane.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 102, 153)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		p1 = new JTextArea();
		p1.setForeground(Color.WHITE);
		p1.setBackground(new Color(153, 102, 153));
		p1.setFont(new Font("Arial", Font.PLAIN, 13));
		p1.setBounds(57, 86, 434, 418);
		contentPane.add(p1);
		
		p2 = new JTextArea();
		p2.setForeground(Color.WHITE);
		p2.setFont(new Font("Arial", Font.PLAIN, 13));
		p2.setBackground(new Color(153, 102, 153));
		p2.setBounds(538, 86, 415, 251);
		contentPane.add(p2);
		
		us = new JTextArea();
		us.setForeground(Color.WHITE);
		us.setFont(new Font("Arial", Font.PLAIN, 13));
		us.setBackground(new Color(153, 102, 153));
		us.setBounds(538, 367, 415, 182);
		contentPane.add(us);
		
		JLabel lblNewLabel = new JLabel("ADVERTISEMENT");
		lblNewLabel.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 30));
		lblNewLabel.setBounds(394, 29, 238, 32);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String big = p1.getText();
				String medium = p2.getText();
				String small = us.getText();
				Advertisement a = new Advertisement();
				a.updateAdvertisement(big, medium, small);
				a.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(153, 102, 153));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(57, 528, 118, 32);
		contentPane.add(btnNewButton);
	}

}
