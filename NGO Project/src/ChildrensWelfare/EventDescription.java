package ChildrensWelfare;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EventDescription extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EventDescription frame = new EventDescription();
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
	public EventDescription() {
		setTitle("Event ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 892, 574);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 204, 255));
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 204)));
		panel.setBounds(0, 0, 869, 578);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 153));
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 153, 153)));
		panel_1.setBounds(67, 35, 723, 168);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblAds = new JLabel("Advertisement");
		lblAds.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblAds.setBounds(10, 10, 161, 26);
		panel_1.add(lblAds);
		
		JTextArea textArea = new JTextArea();
		
		String d = Advertisement.getDonation();
		String dis = Advertisement.getDiscount();
		if (d != null && dis != null) {
			textArea.setText("=================================================================\r\nWe have a session of donate is to help orphans and poor children!!!\r\nIf you donate MORE THAN RM" + d + ", you can get a " + dis + "% discount!!!\r\n=================================================================");
		}
		
		textArea.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		textArea.setBackground(new Color(255, 255, 153));
		textArea.setBounds(10, 40, 703, 118);
		panel_1.add(textArea);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 153, 153)));
		panel_1_1.setBackground(new Color(255, 255, 153));
		panel_1_1.setBounds(67, 238, 723, 168);
		panel.add(panel_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 703, 148);
		panel_1_1.add(scrollPane);
		
		table = new JTable();
		JTable t = AdminEvent.getTable();  // pass the table from AdminEvent to this EventDescription frame
		if (t != null) {
			table = t;
			table.getColumnModel().getColumn(0).setPreferredWidth(162);
			scrollPane.setViewportView(table);
		}
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (d != null && dis != null) {
					ParticipantRegistration frame = new ParticipantRegistration ();  // pass the amount of donation and discount rate to participant registration
					frame.setVisible(true);
				}
			}
		});
		btnRegister.setBackground(new Color(204, 204, 255));
		btnRegister.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
		btnRegister.setBounds(416, 444, 176, 51);
		panel.add(btnRegister);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home frame = new Home();
				frame.setVisible(true);
				dispose();
			}
		});
		btnBack.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
		btnBack.setBackground(new Color(204, 204, 255));
		btnBack.setBounds(656, 444, 176, 51);
		panel.add(btnBack);
		
	}
}
