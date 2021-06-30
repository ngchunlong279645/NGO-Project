package SoupKitchen;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Advertisement extends JFrame {

	private JPanel contentPane;
	private JTextArea soupkitchen;
	private JTextArea virtualrun;
	private JTextArea us;
	private JButton btnNewButton;
	private JButton btnBack;

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
	
	public void updateAdvertisement(String p1, String p2, String org) {
		soupkitchen.setText(p1);
		virtualrun.setText(p2);
		us.setText(org);
	}
	
	public Advertisement() {
		setTitle("Advertisement");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1030, 630);
		contentPane = new JPanel(){
			public void paintComponent(Graphics g) {  // inserting background picture
				Image img = Toolkit.getDefaultToolkit().getImage(
						Donating.class.getResource("bglight.PNG"));  
		                      g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);  
				                 }  
				           };  
				           
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BENEFITS OF JOINING OUR PROGRAMS ");
		lblNewLabel.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 30));
		lblNewLabel.setBounds(239, 41, 526, 47);
		contentPane.add(lblNewLabel);
		
		soupkitchen = new JTextArea();
		soupkitchen.setEditable(false);
		soupkitchen.setForeground(Color.WHITE);
		soupkitchen.setFont(new Font("Arial", Font.PLAIN, 13));
		soupkitchen.setBackground(new Color(153, 102, 153));
		soupkitchen.setBounds(32, 112, 468, 452);
		contentPane.add(soupkitchen);
		
		virtualrun = new JTextArea();
		virtualrun.setForeground(Color.WHITE);
		virtualrun.setFont(new Font("Arial", Font.PLAIN, 13));
		virtualrun.setEditable(false);
		virtualrun.setBackground(new Color(153, 102, 153));
		virtualrun.setBounds(545, 112, 416, 214);
		contentPane.add(virtualrun);
		
		us = new JTextArea();
		us.setForeground(Color.WHITE);
		us.setFont(new Font("Arial", Font.PLAIN, 13));
		us.setEditable(false);
		us.setBackground(new Color(153, 102, 153));
		us.setBounds(545, 345, 416, 219);
		contentPane.add(us);
		
		btnNewButton = new JButton("Home");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage frame = new Homepage();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(153, 102, 153));
		btnNewButton.setBounds(32, 39, 89, 23);
		contentPane.add(btnNewButton);
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminAdvertisement frame = new AdminAdvertisement();
				frame.setVisible(true);
				dispose();
			}
		});
		btnBack.setBackground(new Color(153, 102, 153));
		btnBack.setForeground(Color.WHITE);
		btnBack.setBounds(32, 78, 89, 23);
		contentPane.add(btnBack);
	}
}
