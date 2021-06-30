package Cancer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
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

public class Finance extends JFrame {


	private JPanel contentPane;
	private JTextField FeeCollectedField;
	private JTextField DonationField;
	private JTextField SponsorshipField;
	private JTextField EventExpensesField;
	private JTextField OtherExpensesField;
	private JTable table;
	private JTextField FundField;
	private JTextField ExpenditureField;
	private JTextField BalanceField;
	private JTextField ParticipantField;
	private JTextField FeeField;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finance frame = new Finance();
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
	public Finance() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 692, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10, 11, 656, 490);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("The Financial of Cahaya Cancer Association");
		lblNewLabel.setBounds(10, 21, 636, 70);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("TypeWrong", Font.BOLD, 20));
		lblNewLabel.setIcon(new ImageIcon(Finance.class.getResource("coins-icon.png")));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 21, 636, 70);
		panel_1.setBackground(new Color(255, 192, 203));
		panel_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(205, 92, 92)));
		panel.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 102, 319, 326);
		panel_2.setBackground(new Color(255, 228, 225));
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JComboBox EventCombo = new JComboBox();
		EventCombo.setModel(new DefaultComboBoxModel(new String[] {"Select Event", "Pink Ribbon Charity Dinner", "Run For Pink Ribbon", "Let's Fight The Breast Cancer Together"}));
		EventCombo.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 17));
		EventCombo.setBounds(20, 19, 286, 24);
		panel_2.add(EventCombo);
		
		JLabel lblNewLabel_1 = new JLabel("Event");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 17));
		lblNewLabel_1.setBounds(26, 0, 280, 25);
		panel_2.add(lblNewLabel_1);
		
		JLabel FeeCollectedLabel = new JLabel("Total Event Fee Collected (RM)");
		FeeCollectedLabel.setHorizontalAlignment(SwingConstants.CENTER);
		FeeCollectedLabel.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 17));
		FeeCollectedLabel.setBounds(20, 67, 286, 25);
		panel_2.add(FeeCollectedLabel);
		
		FeeCollectedField = new JTextField();
		FeeCollectedField.setHorizontalAlignment(SwingConstants.CENTER);
		FeeCollectedField.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		FeeCollectedField.setColumns(10);
		FeeCollectedField.setBounds(20, 93, 286, 24);
		panel_2.add(FeeCollectedField);
		
		DonationField = new JTextField();
		DonationField.setText(Integer.toString(Donation.getTotalDonation()));
		DonationField.setHorizontalAlignment(SwingConstants.CENTER);
		DonationField.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		DonationField.setColumns(10);
		DonationField.setBounds(20, 139, 286, 24);
		panel_2.add(DonationField);
		
		JLabel DonationReceived = new JLabel("Donation Received (RM)");
		DonationReceived.setHorizontalAlignment(SwingConstants.CENTER);
		DonationReceived.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 17));
		DonationReceived.setBounds(20, 115, 286, 25);
		panel_2.add(DonationReceived);
		
		JLabel Sponsor = new JLabel("Sponsorship (RM)");
		Sponsor.setHorizontalAlignment(SwingConstants.CENTER);
		Sponsor.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 17));
		Sponsor.setBounds(20, 162, 286, 25);
		panel_2.add(Sponsor);
		
		SponsorshipField = new JTextField();
		SponsorshipField.setHorizontalAlignment(SwingConstants.CENTER);
		SponsorshipField.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		SponsorshipField.setColumns(10);
		SponsorshipField.setBounds(20, 187, 286, 24);
		panel_2.add(SponsorshipField);
		
		JLabel EventExpenses = new JLabel("Event Expenses (RM)");
		EventExpenses.setHorizontalAlignment(SwingConstants.CENTER);
		EventExpenses.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 17));
		EventExpenses.setBounds(20, 208, 286, 25);
		panel_2.add(EventExpenses);
		
		EventExpensesField = new JTextField();
		EventExpensesField.setHorizontalAlignment(SwingConstants.CENTER);
		EventExpensesField.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		EventExpensesField.setColumns(10);
		EventExpensesField.setBounds(20, 227, 286, 24);
		panel_2.add(EventExpensesField);
		
		JLabel OtherExpenses = new JLabel("Other Expenses(RM)");
		OtherExpenses.setHorizontalAlignment(SwingConstants.CENTER);
		OtherExpenses.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 17));
		OtherExpenses.setBounds(20, 248, 286, 20);
		panel_2.add(OtherExpenses);
		
		OtherExpensesField = new JTextField();
		OtherExpensesField.setHorizontalAlignment(SwingConstants.CENTER);
		OtherExpensesField.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		OtherExpensesField.setColumns(10);
		OtherExpensesField.setBounds(20, 262, 286, 24);
		panel_2.add(OtherExpensesField);
		
		JButton AddRecordButton = new JButton("Add Record");
		AddRecordButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {
						EventCombo.getSelectedItem(),
						FeeCollectedField.getText(),
						DonationField.getText(),
						SponsorshipField.getText(),
						EventExpensesField.getText(),
						OtherExpensesField.getText(),
				});
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "All the datas have been added", "Cahaya Cancer Association Management",
								JOptionPane.OK_OPTION);
					}
				}
			}
		});
		AddRecordButton.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 17));
		AddRecordButton.setBounds(96, 297, 109, 29);
		panel_2.add(AddRecordButton);
		
		ParticipantField = new JTextField();
		ParticipantField.setHorizontalAlignment(SwingConstants.CENTER);
		ParticipantField.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		ParticipantField.setColumns(10);
		ParticipantField.setBounds(61, 44, 82, 24);
		panel_2.add(ParticipantField);
		
		JLabel lblNewLabel_1_1 = new JLabel("Participant");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(0, 46, 61, 25);
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Fee");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBounds(153, 47, 61, 25);
		panel_2.add(lblNewLabel_1_1_1);
		
		FeeField = new JTextField();
		int fee = 50;
		String tFee = String.valueOf(fee);
		FeeField.setText(tFee);
		FeeField.setHorizontalAlignment(SwingConstants.CENTER);
		FeeField.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		FeeField.setColumns(10);
		FeeField.setBounds(202, 44, 82, 24);
		panel_2.add(FeeField);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(334, 102, 312, 164);
		panel_3.setBackground(new Color(240, 128, 128));
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 292, 104);
		panel_3.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Month", "Event Fee Collected", "Donation Received", "Sponsorship", "Event Expenses", "OtherExpenses"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton UploadButton = new JButton("Upload");
		UploadButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\lzw_1\\eclipse-workspace\\Project\\src\\Cancer\\FinancialStatement.txt");
					if (!file.exists()) {
						file.createNewFile();
					}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
				
					bw.write(
							"\n__________________________________________________________________________________________________________________________________\n");
					for (int i = 0; i < table.getRowCount(); i++) {
						for (int j = 0; j < table.getColumnCount(); j++) {
							bw.write(table.getModel().getValueAt(i, j) + "		|");
						}
						bw.write(
								"\n__________________________________________________________________________________________________________________________________\n");
					}
					bw.close();
					fw.close();
					JOptionPane.showMessageDialog(null, "Data Exported");
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		UploadButton.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 17));
		UploadButton.setBounds(10, 124, 90, 29);
		panel_3.add(UploadButton);
		
		JButton UpdateButton = new JButton("Update");
		UpdateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(EventCombo.getSelectedItem(),i,0);
			    	model.setValueAt(FeeCollectedField.getText(),i,1);
			    	model.setValueAt(DonationField.getText(),i,2);
			    	model.setValueAt(SponsorshipField.getText(), i, 3);
			    	model.setValueAt(EventExpensesField.getText(), i, 4);
			    	model.setValueAt(OtherExpensesField.getText(), i, 5);
					JOptionPane.showMessageDialog(null, "The data have been updated!");
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
			    }
			}
		});
		UpdateButton.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 17));
		UpdateButton.setBounds(117, 124, 90, 29);
		panel_3.add(UpdateButton);
		
		JButton DeleteButton = new JButton("Delete");
		DeleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Cahaya Cancer Association Management System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Cahaya Cancer Association Management System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
			
		});
		DeleteButton.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 17));
		DeleteButton.setBounds(217, 124, 90, 29);
		panel_3.add(DeleteButton);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBounds(334, 273, 312, 153);
		panel_3_1.setBackground(new Color(255, 240, 245));
		panel.add(panel_3_1);
		panel_3_1.setLayout(null);
		
		JLabel TotalFund = new JLabel("Total Fund (RM)");
		TotalFund.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 17));
		TotalFund.setBounds(16, 11, 109, 25);
		panel_3_1.add(TotalFund);
		
		JLabel TotalExpenditure = new JLabel("Total Expenditure (RM)");
		TotalExpenditure.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 17));
		TotalExpenditure.setBounds(16, 41, 140, 25);
		panel_3_1.add(TotalExpenditure);
		
		JLabel TotalBalance = new JLabel("Total Balance (RM)");
		TotalBalance.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 17));
		TotalBalance.setBounds(16, 72, 120, 25);
		panel_3_1.add(TotalBalance);
		
		FundField = new JTextField();
		FundField.setHorizontalAlignment(SwingConstants.CENTER);
		FundField.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		FundField.setColumns(10);
		FundField.setBounds(120, 9, 125, 24);
		panel_3_1.add(FundField);
		
		ExpenditureField = new JTextField();
		ExpenditureField.setHorizontalAlignment(SwingConstants.CENTER);
		ExpenditureField.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		ExpenditureField.setColumns(10);
		ExpenditureField.setBounds(162, 39, 125, 24);
		panel_3_1.add(ExpenditureField);
		
		BalanceField = new JTextField();
		BalanceField.setHorizontalAlignment(SwingConstants.CENTER);
		BalanceField.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		BalanceField.setColumns(10);
		BalanceField.setBounds(134, 70, 125, 24);
		panel_3_1.add(BalanceField);
		
		JButton CalculateButton = new JButton("Calculate");
		CalculateButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				//TotalFee
				String Fee = FeeField.getText();
				String Participant = ParticipantField.getText();
				
				int totFee =  Integer.parseInt(Fee)*Integer.parseInt(Participant);
				String totalFee = String.valueOf(totFee);
				FeeCollectedField.setText(totalFee);
				
				//FundOwned = sponsor+eventFeeCollected+Donation
				String F = FeeCollectedField.getText();
				String D = DonationField.getText();
				String S = SponsorshipField.getText();
				
				int totFund = Integer.parseInt(F)+Integer.parseInt(D)+Integer.parseInt(S);
				String totalFund = String.valueOf(totFund);
				FundField.setText(totalFund);
				
				//Expenditure = eventexpenses+otherexpenses
				String EE = EventExpensesField.getText();
				String OE = OtherExpensesField.getText();
				
				int totExpenditure = Integer.parseInt(EE)+Integer.parseInt(OE);
				String totalExpenditure = String.valueOf(totExpenditure);
				ExpenditureField.setText(totalExpenditure);
				
				//balance = fund-expenditure
				String FF = FundField.getText();
				String EF = ExpenditureField.getText();
				
				int totBalance = Integer.parseInt(FF)-Integer.parseInt(EF);
				String totalBalance = String.valueOf(totBalance);
				BalanceField.setText(totalBalance);
			}
			
			
			
		});
		CalculateButton.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 17));
		CalculateButton.setBounds(102, 113, 109, 29);
		panel_3_1.add(CalculateButton);
		
		JButton HomeButton = new JButton("Home");
		HomeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage frame = new HomePage();
				frame.setVisible(true);
				dispose();
			}
		});
		HomeButton.setBackground(new Color(240, 128, 128));
		HomeButton.setForeground(new Color(0, 0, 0));
		HomeButton.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		HomeButton.setBounds(285, 447, 89, 31);
		panel.add(HomeButton);
		
		}
	}

