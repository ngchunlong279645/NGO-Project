package Cancer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JFormattedTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;

public class EventParticipant extends JFrame {

	private JPanel contentPane;
	private JTextField VenueField;
	private JTextField FeeField;
	public JComboBox<String> DateTimeCombo;
	public JComboBox<String> comboBoxModel;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				//2.2 Exception Handling
				try {
					EventParticipant frame = new EventParticipant();
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
	public EventParticipant() {
		setBackground(new Color(219, 112, 147));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1061, 845);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 1049, 749);
		contentPane.add(panel);
		
		JButton HomeButton = new JButton("Home");
		HomeButton.setBounds(905, 64, 120, 36);
		HomeButton.setBackground(new Color(240, 128, 128));
		HomeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage frame = new HomePage();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
		panel.setLayout(null);
		HomeButton.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 26));
		panel.add(HomeButton);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(225, 471, 571, 228);
		panel_3.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.BLACK));
		panel_3.setBackground(new Color(219, 112, 147));
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel Event = new JLabel("Event");
		Event.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 25));
		Event.setBounds(12, 17, 144, 42);
		panel_3.add(Event);
		
		JLabel DateTimeLabel = new JLabel("Date/Time");
		DateTimeLabel.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 25));
		DateTimeLabel.setBounds(12, 70, 266, 42);
		panel_3.add(DateTimeLabel);
		
		JLabel VenueLabel = new JLabel("Venue");
		VenueLabel.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 25));
		VenueLabel.setBounds(12, 123, 207, 42);
		panel_3.add(VenueLabel);
		
		JLabel FeeLabel = new JLabel("Fee");
		FeeLabel.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 25));
		FeeLabel.setBounds(12, 176, 224, 42);
		panel_3.add(FeeLabel);
		
		JComboBox EventCombo = new JComboBox();
		EventCombo.setModel(new DefaultComboBoxModel(new String[] {"Select The Event", "Pink Ribbon Charity Dinner", "Run For Pink Ribbon", "Let's Fight The Breast Cancer Together"}));
		EventCombo.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				JTable t = EventAdmin.getTable();
				//DateTimeCombo.removeAllItems();
				//DateTimeCombo.setSelectedItem(null);
				if(EventCombo.getSelectedItem().equals("Pink Ribbon Charity Dinner")) {
					//DateTimeCombo.removeAllItems();
					//DateTimeCombo.setSelectedItem(null);
					DateTimeCombo.addItem("30 January 2021, Saturday (5:30 P.M");
					DateTimeCombo.addItem("30 January 2021, Saturday (8:45 P.M");
					
					DateTimeCombo.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							String eventVenue, eventFee;
								for(int i=0; i<t.getRowCount(); i++) {
									if(DateTimeCombo.getSelectedItem().equals(t.getValueAt(i, 1))) {
										eventVenue = String.valueOf(t.getValueAt(i, 2));
										eventFee = String.valueOf(t.getValueAt(i, 3));
										VenueField.setText(eventVenue);
										FeeField.setText(eventFee);
									}
								}
						}
					});
				}
				
						else 
							if(EventCombo.getSelectedItem().equals("Run For Pink Ribbon")) {
								//DateTimeCombo.removeAllItems();
								//DateTimeCombo.setSelectedItem(null);
								DateTimeCombo.addItem("20 February 2021, Saturday  (8.00 A.M)");
								DateTimeCombo.addItem("20 February 2021, Saturday (10.00 A.M)");
								
								DateTimeCombo.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										String eventVenue, eventFee;
										//DateTimeCombo.removeAllItems();
											for(int i=0; i<t.getRowCount(); i++) {
												if(DateTimeCombo.getSelectedItem().equals(t.getValueAt(i, 1))) {
													eventVenue = String.valueOf(t.getValueAt(i, 2));
													eventFee = String.valueOf(t.getValueAt(i, 3));
													VenueField.setText(eventVenue);
													FeeField.setText(eventFee);
												} 
											}
									}
								});
						}
				
								else 
								/*if(EventCombo.getSelectedItem().equals("Let's Fight The Breast Cancer Together"))*/ {
									//DateTimeCombo.removeAllItems();
									//DateTimeCombo.setSelectedItem(null);
										DateTimeCombo.addItem("21 March 2021,Sunday (10:00 A.M)");
										DateTimeCombo.addItem("21 March 2021, Sunday (2:00 P.M");
										
										DateTimeCombo.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												//JTable t = EventAdmin.getTable();
												String eventVenue,eventFee;
													for(int i=0; i<t.getRowCount(); i++) {
														if(DateTimeCombo.getSelectedItem().equals(t.getValueAt(i, 1))) {
															eventVenue = String.valueOf(t.getValueAt(i, 2));
															eventFee = String.valueOf(t.getValueAt(i, 3));
															VenueField.setText(eventVenue);
															FeeField.setText(eventFee);
														}
													}
											}
										});
									}
			}
			
		});
		EventCombo.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 30));
		EventCombo.setBounds(108, 22, 424, 30);
		panel_3.add(EventCombo);
		
		DateTimeCombo = new JComboBox();
		DateTimeCombo.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 30));
		DateTimeCombo.setBounds(108, 75, 424, 30);
		panel_3.add(DateTimeCombo);
		
		VenueField = new JTextField();
		VenueField.setHorizontalAlignment(SwingConstants.CENTER);
		VenueField.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 30));
		VenueField.setBounds(108, 128, 424, 30);
		panel_3.add(VenueField);
		VenueField.setColumns(10);
		
		FeeField = new JTextField();
		FeeField.setHorizontalAlignment(SwingConstants.CENTER);
		FeeField.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 30));
		FeeField.setColumns(10);
		FeeField.setBounds(108, 178, 424, 30);
		panel_3.add(FeeField);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(6, 0, 1113, 749);
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setForeground(new Color(255, 192, 203));
		lblNewLabel_1.setIcon(null);
		panel.add(lblNewLabel_1);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(-4, 0, 1053, 36);
		panel.add(menuBar);
		
		JMenu mnNewMenu_1 = new JMenu("About Us");
		mnNewMenu_1.setForeground(Color.BLACK);
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("About US");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AboutUs frame = new AboutUs();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu = new JMenu("Event");
		mnNewMenu.setForeground(Color.BLACK);
		mnNewMenu.setBackground(Color.WHITE);
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Event");
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventParticipant frame = new EventParticipant();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnDonation = new JMenu("");
		mnDonation.setForeground(Color.BLACK);
		mnDonation.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnDonation);
		
		JMenuItem mntmDonation = new JMenuItem("Donation");
		mntmDonation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Donation frame = new Donation();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
		mntmDonation.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnDonation.add(mntmDonation);
		
		JMenu mnRegistration = new JMenu("ParticipantRegistration");
		mnRegistration.setForeground(Color.BLACK);
		mnRegistration.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnRegistration);
		
		JMenuItem mntmRegistration = new JMenuItem("ParticipantRegistration");
		mntmRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ParticipantRegistration frame = new ParticipantRegistration();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
		mntmRegistration.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnRegistration.add(mntmRegistration);
		
		JLabel lblNewLabel = new JLabel("Upcoming Events");
		lblNewLabel.setFont(new Font("TypeWrong", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 59, 1029, 47);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(278, 117, 468, 4);
		panel.add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.BLACK);
		panel_1_1.setBounds(278, 47, 468, 4);
		panel.add(panel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Join Us Now and Be Part of Our Story!");
		lblNewLabel_2.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(267, 128, 479, 24);
		panel.add(lblNewLabel_2);
		
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(EventParticipant.class.getResource("CharityDinnerProg.png")));
		lblNewLabel_3.setBounds(116, 152, 177, 195);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(EventParticipant.class.getResource("RunProgram.png")));
		lblNewLabel_4.setBounds(430, 163, 199, 209);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(EventParticipant.class.getResource("FightProgram.png")));
		lblNewLabel_5.setBounds(792, 136, 192, 211);
		panel.add(lblNewLabel_5);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		String Voucher =Adsvertisement.getVoucher();
		if(Voucher!=null) {
		textArea.setText("---------------------------------------------------------------------------------------------------------------------------------------------------------------------\r\n*"
				+ "  So don't hesitate to join us now! Those who joining, you will get Shoppe's Voucher RM  "+Voucher+" OFF!!\r\n---------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}

		textArea.setBounds(142, 404, 676, 56);
		{
		panel.add(textArea);
	}
}
}