package Cancer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class EventAdmin extends JFrame {

	private JPanel contentPane;
	private JTextField VenueField;
	public static JTable table;
	private JTextField FeeField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				//2.2 Exception Handling
				try {
					EventAdmin frame = new EventAdmin();
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
	public EventAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 797, 696);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(30, 30, 30, 30, (Color) new Color(255, 182, 193)));
		panel.setBackground(new Color(255, 240, 245));
		panel.setBounds(0, 0, 786, 662);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(null);
		panel_1_1.setBackground(new Color(255, 192, 203));
		panel_1_1.setBounds(174, 90, 412, 220);
		panel.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel EventLabel = new JLabel("Event");
		EventLabel.setHorizontalAlignment(SwingConstants.CENTER);
		EventLabel.setBounds(77, 0, 282, 29);
		EventLabel.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		panel_1_1.add(EventLabel);
		
		JLabel TimeLabel = new JLabel("Time/Date");
		TimeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		TimeLabel.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		TimeLabel.setBounds(77, 46, 282, 31);
		panel_1_1.add(TimeLabel);
		
		JLabel VenueLabell = new JLabel("Venue");
		VenueLabell.setHorizontalAlignment(SwingConstants.CENTER);
		VenueLabell.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		VenueLabell.setBounds(78, 94, 282, 31);
		panel_1_1.add(VenueLabell);
		
		VenueField = new JTextField();
		VenueField.setHorizontalAlignment(SwingConstants.CENTER);
		VenueField.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		VenueField.setColumns(10);
		VenueField.setBounds(10, 122, 392, 28);
		panel_1_1.add(VenueField);
		
		JComboBox EventCombo = new JComboBox();
		
		EventCombo.setModel(new DefaultComboBoxModel(new String[] {"Select The Event", "Pink Ribbon Charity Dinner", "Run For Pink Ribbon", "Let's Fight The Breast Cancer Together"}));
		EventCombo.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		EventCombo.setBounds(10, 23, 392, 28);
		panel_1_1.add(EventCombo);
		
		JComboBox TimeDateCombo = new JComboBox();
		
		EventCombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(EventCombo.getSelectedItem().equals("Pink Ribbon Charity Dinner")) {
					TimeDateCombo.removeAllItems();
					TimeDateCombo.setSelectedItem(null);
					TimeDateCombo.addItem("30 January 2021, Saturday (5:30 P.M");
					TimeDateCombo.addItem("30 January 2021, Saturday (8:45 P.M");
				}
				
				else 
					if(EventCombo.getSelectedItem().equals("Run For Pink Ribbon")) {
						TimeDateCombo.removeAllItems();
						TimeDateCombo.setSelectedItem(null);
						TimeDateCombo.addItem("20 February 2021, Saturday  (8.00 A.M)");
						TimeDateCombo.addItem("20 February 2021, Saturday (10.00 A.M)");
						
				}
				
					else 
						if(EventCombo.getSelectedItem().equals("Let's Fight The Breast Cancer Together")) {
							TimeDateCombo.removeAllItems();
							TimeDateCombo.setSelectedItem(null);
							TimeDateCombo.addItem("21 March 2021,Sunday (10:00 A.M)");
							TimeDateCombo.addItem("21 March 2021, Sunday (2:00 P.M");
							
						}
					
				}
			
		});
		
		TimeDateCombo.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		TimeDateCombo.setBounds(10, 71, 392, 28);
		panel_1_1.add(TimeDateCombo);
		
		JLabel lblFeerm = new JLabel("Fee (RM)");
		lblFeerm.setHorizontalAlignment(SwingConstants.CENTER);
		lblFeerm.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		lblFeerm.setBounds(78, 142, 282, 37);
		panel_1_1.add(lblFeerm);
		
		FeeField = new JTextField();
		FeeField.setHorizontalAlignment(SwingConstants.CENTER);
		FeeField.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		FeeField.setColumns(10);
		FeeField.setBounds(10, 178, 392, 31);
		panel_1_1.add(FeeField);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(63, 334, 672, 157);
		panel.add(scrollPane);
		//2.3 File IO
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 12));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"Event", "Time/Date", "Venue", "Fee"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setBackground(new Color(240, 128, 128));
		btnConfirm.setForeground(new Color(0, 0, 0));
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String event = (String) EventCombo.getSelectedItem();
				String eventTimeDate = (String) TimeDateCombo.getSelectedItem();
				String eventVenue = VenueField.getText();
				String eventFee = FeeField.getText();
				//2.2 Exception handling
				try {
				if(eventVenue.equals("")) 
					JOptionPane.showMessageDialog(null, "This section can't be empty.");
				
				else if (eventFee.equals(""))
					JOptionPane.showMessageDialog(null, "This section can't be empty.");
				
				else {
					
					JOptionPane.showMessageDialog(null, "Confirm successful");
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					model.addRow(new Object[]{
						event,
						eventTimeDate,
						eventVenue,
						eventFee
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Information Update confirmed", "Cahaya Cancer Association",
								JOptionPane.OK_OPTION);
					}
				}
			}
		  } catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the correct info", "Error", JOptionPane.ERROR_MESSAGE);
				}
		}
		
		});
		btnConfirm.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 23));
		btnConfirm.setBounds(43, 545, 116, 46);
		panel.add(btnConfirm);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBackground(new Color(240, 128, 128));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Cahaya Cancer Association Event", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Cahaya Cancer Association Event", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			
			}
		});
		btnDelete.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 23));
		btnDelete.setBounds(422, 545, 116, 46);
		panel.add(btnDelete);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBackground(new Color(240, 128, 128));
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(EventCombo.getSelectedItem(),i,0);
			    	model.setValueAt(TimeDateCombo.getSelectedItem(),i,1);
			    	model.setValueAt(VenueField.getText(),i,3);
			    	model.setValueAt(FeeField.getText(),i,4);

					JOptionPane.showMessageDialog(null, "Update Successfully");
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
			    }
			}
		});
		btnUpdate.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 23));
		btnUpdate.setBounds(169, 545, 116, 46);
		panel.add(btnUpdate);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBackground(new Color(240, 128, 128));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventCombo.setSelectedItem("Select The Event");
				TimeDateCombo.setSelectedItem(null);
				VenueField.setText("");
				FeeField.setText("");
			}
		});
		btnReset.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 23));
		btnReset.setBounds(548, 545, 99, 46);
		panel.add(btnReset);
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.setBackground(new Color(240, 128, 128));
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\lzw_1\\eclipse-workspace\\Project\\src\\Cancer\\Event.txt");
					if(!file.exists()) {
						file.createNewFile();
						}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					
					for (int i=0; i<table.getRowCount(); i++) {
						for (int j=0; j<table.getColumnCount(); j++) {
							bw.write(table.getModel().getValueAt(i, j) + "  ");
							}
						bw.write("\n________\n");
						}
						bw.close();
						fw.close();
						JOptionPane.showMessageDialog(null, "Data Exported");
					}
					catch(Exception ex) {
						ex.printStackTrace();
					}
			}
		});
		btnUpload.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 23));
		btnUpload.setBounds(296, 545, 116, 46);
		panel.add(btnUpload);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(new Color(240, 128, 128));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin frame = new AdminLogin();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
		btnExit.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 23));
		btnExit.setBounds(657, 545, 99, 46);
		panel.add(btnExit);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 751, 26);
		panel.add(menuBar);
		
		JMenu mnHomePage = new JMenu("HomePage");
		mnHomePage.setForeground(Color.BLACK);
		mnHomePage.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnHomePage);
		
		JMenuItem mntmHomePage = new JMenuItem("HomePage");
		mntmHomePage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage frame = new HomePage();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
		mntmHomePage.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnHomePage.add(mntmHomePage);
		
		JMenu mnAdsvertisement = new JMenu("Adsvertisement");
		mnAdsvertisement.setForeground(Color.BLACK);
		mnAdsvertisement.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnAdsvertisement);
		
		JMenuItem mntnAdsvertisement = new JMenuItem("Adsvertisement");
		mntnAdsvertisement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Finance E = new Finance();
				E.setModalExclusionType(null);
				E.setVisible(true);
				dispose();
			}
		});
		mntnAdsvertisement.setForeground(Color.BLACK);
		mntnAdsvertisement.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnAdsvertisement.add(mntnAdsvertisement);
		
		JMenu mnFinance = new JMenu("Finance");
		mnFinance.setForeground(Color.BLACK);
		mnFinance.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnFinance);
		
		JMenuItem mntmFinance = new JMenuItem("Finance");
		mntmFinance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Finance frame = new Finance();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
		mntmFinance.setForeground(Color.BLACK);
		mntmFinance.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnFinance.add(mntmFinance);
		
		JLabel lblNewLabel = new JLabel("Cahaya Cancer Association Event");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 26, 707, 48);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("TypeWrong", Font.BOLD, 25));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(79, 66, 593, 5);
		panel.add(panel_1);
	}
	public static void AddRowToJtable(Object[] dataRow) {
		DefaultTableModel model = (DefaultTableModel)getTable().getModel();
		model.addRow(dataRow);
	}

	public static JTable getTable() {
		return table;
	}

	public static void setTable(JTable table) {
		EventAdmin.table = table;
	}
}