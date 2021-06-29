package ChildrensWelfare;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Mainpage extends JFrame {

	private JPanel contentPane;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mainpage frame = new Mainpage();
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
	public Mainpage() {
		setTitle("Main Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 945, 659);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 204, 255));
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 204)));
		panel.setBounds(0, 0, 931, 622);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(153, 204, 255));
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 51, 255)));
		panel_1.setBounds(68, 26, 795, 73);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblTitle = new JLabel("WELCOME TO CHILDREN'S PROTECTION SOCIETY");
		lblTitle.setFont(new Font("Rockwell Extra Bold", Font.BOLD | Font.ITALIC, 25));
		lblTitle.setBounds(20, 10, 754, 53);
		panel_1.add(lblTitle);
		
		JButton btnParticipant = new JButton("Participant");
		btnParticipant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home frame = new Home();
				frame.setVisible(true);
				dispose();
			}
		});
		btnParticipant.setBackground(new Color(204, 204, 204));
		btnParticipant.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 22));
		btnParticipant.setBounds(195, 470, 187, 54);
		panel.add(btnParticipant);
		
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login frame = new Login();
				frame.setVisible(true);
				dispose();
			}
		});
		btnAdmin.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 22));
		btnAdmin.setBackground(new Color(204, 204, 204));
		btnAdmin.setBounds(544, 470, 187, 54);
		panel.add(btnAdmin);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setBounds(309, 142, 331, 286);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("")); //C:\\Users\\chyim\\OneDrive\\Pictures\\Au Chyi Min\\main logo.png
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Main Page", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 22));
		btnExit.setBackground(new Color(204, 204, 204));
		btnExit.setBounds(368, 546, 187, 54);
		panel.add(btnExit);
	
	}
}
