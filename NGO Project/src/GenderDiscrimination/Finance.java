package GenderDiscrimination;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.Toolkit;

public class Finance extends JFrame {

	private JPanel contentPane;
    private JTextField txtIncome;
    private JTextField txtTotalSponsor;
    private JTextField txtTotalExpenses;
    private JTable table;
    private JTextField txtNetIncome;
    private JTextField txtIncomeTaxReduction;
    private JTextField txtNetProfit;
    private String totalIncome, totalTaxReduction;
	private double netProfit;

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
			setIconImage(Toolkit.getDefaultToolkit().getImage(Finance.class.getResource("gender equality.jpg")));
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 999, 635);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JPanel panel = new JPanel();
			panel.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 204), new Color(0, 0, 255), new Color(0, 0, 204), new Color(0, 0, 255)));
			panel.setBackground(new Color(51, 204, 255));
			panel.setBounds(0, 0, 985, 598);
			contentPane.add(panel);
			panel.setLayout(null);
			
			JPanel panel_1 = new JPanel();
			panel_1.setLayout(null);
			panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 204), new Color(0, 0, 255), new Color(0, 0, 204), new Color(0, 0, 255)));
			panel_1.setBackground(new Color(153, 255, 255));
			panel_1.setBounds(10, 10, 965, 81);
			panel.add(panel_1);
			
			JLabel lblNewLabel = new JLabel("UN WOMEN FINANCE REPORT");
			lblNewLabel.setBackground(new Color(51, 204, 255));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("Segoe Script", Font.PLAIN, 40));
			lblNewLabel.setBounds(10, 10, 945, 61);
			panel_1.add(lblNewLabel);
			
			JButton btnBack = new JButton("BACK");
			btnBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Sales s = new Sales();
					s.setModalExclusionType(null);
					s.setVisible(true);
				}
			});
			btnBack.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 10));
			btnBack.setBackground(new Color(51, 204, 255));
			btnBack.setBounds(10, 10, 69, 26);
			panel_1.add(btnBack);
			
			JPanel panel_1_1 = new JPanel();
			panel_1_1.setLayout(null);
			panel_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 204), new Color(0, 0, 255), new Color(0, 0, 204), new Color(0, 0, 255)));
			panel_1_1.setBackground(new Color(51, 204, 255));
			panel_1_1.setBounds(10, 101, 367, 385);
			panel.add(panel_1_1);
			
			JLabel lblMonth = new JLabel("MONTH");
			lblMonth.setFont(new Font("ROG Fonts", Font.PLAIN, 14));
			lblMonth.setBounds(10, 10, 185, 33);
			panel_1_1.add(lblMonth);
			
			JLabel lblTotalDonation = new JLabel("INCOME (RM)");
			lblTotalDonation.setFont(new Font("ROG Fonts", Font.PLAIN, 13));
			lblTotalDonation.setBounds(10, 139, 185, 33);
			panel_1_1.add(lblTotalDonation);
			
			JLabel lblTotalSponsor = new JLabel("TOTAL SPONSOR (RM)");
			lblTotalSponsor.setFont(new Font("ROG Fonts", Font.PLAIN, 13));
			lblTotalSponsor.setBounds(10, 192, 185, 33);
			panel_1_1.add(lblTotalSponsor);
			
			JLabel lblTotalExpenses = new JLabel("TOTAL EXPENSES(RM)");
			lblTotalExpenses.setFont(new Font("ROG Fonts", Font.PLAIN, 13));
			lblTotalExpenses.setBounds(10, 96, 185, 33);
			panel_1_1.add(lblTotalExpenses);
			
			JLabel lblNetIncome = new JLabel("NET INCOME (RM)");
			lblNetIncome.setFont(new Font("ROG Fonts", Font.PLAIN, 14));
			lblNetIncome.setBounds(10, 244, 185, 33);
			panel_1_1.add(lblNetIncome);
			
			JLabel lblIncomeTaxReduction = new JLabel("INCOME TAX REDUCTION (RM)");
			lblIncomeTaxReduction.setFont(new Font("ROG Fonts", Font.PLAIN, 15));
			lblIncomeTaxReduction.setBounds(10, 299, 347, 33);
			panel_1_1.add(lblIncomeTaxReduction);
			
			JLabel lblEvent = new JLabel("EVENT");
			lblEvent.setFont(new Font("ROG Fonts", Font.PLAIN, 14));
			lblEvent.setBounds(10, 53, 185, 33);
			panel_1_1.add(lblEvent);
			
			// Set the month combo box info
			JComboBox monthComboBox = new JComboBox();
			monthComboBox.setBackground(new Color(153, 255, 255));
			monthComboBox.setFont(new Font("Segoe Print", Font.PLAIN, 13));
			monthComboBox.setModel(new DefaultComboBoxModel(new String[] {"~ Select Month ~", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
			monthComboBox.setBounds(205, 10, 152, 33);
			panel_1_1.add(monthComboBox);
			
			// Show the total expenses and total income for the selected event
			JComboBox eventComboBox = new JComboBox();
			eventComboBox.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(eventComboBox.getSelectedIndex() == 1) {
						txtTotalExpenses.setText(String.format("%.2f",Sales.totalExpenses1));
						txtIncome.setText(String.format("%.2f",Sales.income1));
					}
					else if(eventComboBox.getSelectedIndex() == 2) {
						txtTotalExpenses.setText(String.format("%.2f",Sales.totalExpenses2));
						txtIncome.setText(String.format("%.2f",Sales.income2));
					}
					else if(eventComboBox.getSelectedIndex() == 3) {
						txtTotalExpenses.setText(String.format("%.2f",Sales.totalExpenses3));
						txtIncome.setText(String.format("%.2f",Sales.income3));
					}
				}
			});
			eventComboBox.setBackground(new Color(153, 255, 255));
			eventComboBox.setModel(new DefaultComboBoxModel(new String[] {"~ Select Event ~", "Event 1", "Event 2", "Event 3"}));
			eventComboBox.setFont(new Font("Segoe Print", Font.PLAIN, 13));
			eventComboBox.setBounds(205, 53, 152, 33);
			panel_1_1.add(eventComboBox);
			
			txtIncome = new JTextField();
			txtIncome.setEditable(false);
			txtIncome.setFont(new Font("Segoe Print", Font.PLAIN, 14));
			txtIncome.setColumns(10);
			txtIncome.setBounds(205, 139, 152, 33);
			panel_1_1.add(txtIncome);
			
			txtTotalSponsor = new JTextField();
			txtTotalSponsor.setFont(new Font("Segoe Print", Font.PLAIN, 14));
			txtTotalSponsor.setColumns(10);
			txtTotalSponsor.setBounds(205, 192, 152, 33);
			panel_1_1.add(txtTotalSponsor);
			
			txtTotalExpenses = new JTextField();
			txtTotalExpenses.setEditable(false);
			txtTotalExpenses.setFont(new Font("Segoe Print", Font.PLAIN, 14));
			txtTotalExpenses.setColumns(10);
			txtTotalExpenses.setBounds(205, 96, 152, 33);
			panel_1_1.add(txtTotalExpenses);
			
			txtNetIncome = new JTextField();
			txtNetIncome.setEditable(false);
			txtNetIncome.setFont(new Font("Segoe Print", Font.PLAIN, 14));
			txtNetIncome.setColumns(10);
			txtNetIncome.setBounds(205, 244, 152, 33);
			panel_1_1.add(txtNetIncome);
			
			txtIncomeTaxReduction = new JTextField();
			txtIncomeTaxReduction.setEditable(false);
			txtIncomeTaxReduction.setFont(new Font("Segoe Print", Font.PLAIN, 15));
			txtIncomeTaxReduction.setColumns(10);
			txtIncomeTaxReduction.setBounds(10, 342, 347, 33);
			panel_1_1.add(txtIncomeTaxReduction);
			
			JPanel panel_1_1_1 = new JPanel();
			panel_1_1_1.setLayout(null);
			panel_1_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 204), new Color(0, 0, 255), new Color(0, 0, 204), new Color(0, 0, 255)));
			panel_1_1_1.setBackground(new Color(51, 204, 255));
			panel_1_1_1.setBounds(387, 101, 588, 297);
			panel.add(panel_1_1_1);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 10, 568, 219);
			panel_1_1_1.add(scrollPane);
			
			table = new JTable();
			table.setBackground(Color.WHITE);
			table.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"MONTH", "EVENT", "TOTAL EXPENSE (RM)", "INCOME (RM)", "TOTAL SPONSOR (RM)", "NET INCOME (RM)", "INCOME TAX REDUCTION (RM)"
				}
			));
			scrollPane.setViewportView(table);
			
			// Export the information on the table to txt file
			JButton btnUpload = new JButton("UPLOAD");
			btnUpload.setBackground(new Color(153, 255, 255));
			btnUpload.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						File file = new File("C:\\Users\\lzw_1\\OneDrive\\Desktop\\Assignment\\Programming II\\Assignment 3\\Txt File\\Finance.txt");
						if(!file.exists()) {
							file.createNewFile();
							}
						FileWriter fw = new FileWriter(file.getAbsoluteFile());
						BufferedWriter bw = new BufferedWriter(fw);
						
						for (int i=0; i<table.getRowCount(); i++) {
							for (int j=0; j<table.getColumnCount(); j++) {
								bw.write(table.getModel().getValueAt(i, j) + "  |  ");
								}
							bw.write("\n_____________________________________________________________________\n");
							}
							bw.close();
							fw.close();
							JOptionPane.showMessageDialog(null, "Data Uploaded");
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
			});
			btnUpload.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 20));
			btnUpload.setBounds(209, 240, 130, 47);
			panel_1_1_1.add(btnUpload);
			
			JPanel panel_1_1_1_1 = new JPanel();
			panel_1_1_1_1.setLayout(null);
			panel_1_1_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 204), new Color(0, 0, 255), new Color(0, 0, 204), new Color(0, 0, 255)));
			panel_1_1_1_1.setBackground(new Color(51, 204, 255));
			panel_1_1_1_1.setBounds(10, 508, 965, 80);
			panel.add(panel_1_1_1_1);
			
			// Calculate the net income and income tax reduction for the event
			JButton btnNewButton = new JButton("CALCULATE");
			btnNewButton.setBackground(new Color(153, 255, 255));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						double ti = Double.parseDouble(txtIncome.getText());
						double ts = Double.parseDouble(txtTotalSponsor.getText());
						double te = Double.parseDouble(txtTotalExpenses.getText());
						double netIncome =  ti + ts - te;
						double taxReduction = netIncome*0.10;
						
						txtNetIncome.setText(String.format("%.2f", netIncome));
						txtIncomeTaxReduction.setText(String.format("%.2f", taxReduction));
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Please enter finance report");
					}
				}
			});
			btnNewButton.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 20));
			btnNewButton.setBounds(10, 10, 130, 60);
			panel_1_1_1_1.add(btnNewButton);
			
			// Add the event's information to the table
			JButton btnAddRecord = new JButton("ADD RECORD");
			btnAddRecord.setBackground(new Color(153, 255, 255));
			btnAddRecord.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					if(monthComboBox.getSelectedIndex()!=0 && eventComboBox.getSelectedIndex() != 0) {
						DefaultTableModel model = (DefaultTableModel) table.getModel();
					
							model.addRow(new Object[]{
							monthComboBox.getSelectedItem(),
							eventComboBox.getSelectedItem(),
							txtTotalExpenses.getText(),
							txtIncome.getText(),
							txtTotalSponsor.getText(),
							txtNetIncome.getText(),
							txtIncomeTaxReduction.getText()
							});
							
							for(int i = 0; i<model.getRowCount(); i++) {
								totalIncome = String.valueOf(model.getValueAt(i, 5));
								totalTaxReduction = String.valueOf(model.getValueAt(i, 6));
								netProfit = netProfit+ Double.parseDouble(totalIncome) - Double.parseDouble(totalTaxReduction);
							}

							if (table.getSelectedRow() == -1) {
								if (table.getRowCount() == 0) {
									JOptionPane.showMessageDialog(null, "Finance Update confirmed", "Finance Management System",
									JOptionPane.OK_OPTION);
								}
							}
						}
					else {
						JOptionPane.showMessageDialog(null, "Please enter finance report");
					}
				}
				
			});
			btnAddRecord.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 20));
			btnAddRecord.setBounds(172, 10, 140, 60);
			panel_1_1_1_1.add(btnAddRecord);
			
			// Delete the selected row information from the table
			JButton btnDelete = new JButton("DELETE");
			btnDelete.setBackground(new Color(153, 255, 255));
			btnDelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					DefaultTableModel model = (DefaultTableModel)table.getModel();
					if(table.getSelectedRow()==-1) {
						if(table.getRowCount()==0) {
							JOptionPane.showMessageDialog(null,"No data to delete",
									"Finance Management System", JOptionPane.OK_OPTION);
						}else {
							JOptionPane.showMessageDialog(null,"Select a row to delete",
									"Finance Management System", JOptionPane.OK_OPTION);
						}
					}else {
						model.removeRow(table.getSelectedRow());
					}
				}
			});
			btnDelete.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 20));
			btnDelete.setBounds(508, 10, 130, 60);
			panel_1_1_1_1.add(btnDelete);
			
			// Reset all the information to default
			JButton btnReset = new JButton("RESET");
			btnReset.setBackground(new Color(153, 255, 255));
			btnReset.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					monthComboBox.setSelectedItem("~ Select Month ~");
					eventComboBox.setSelectedItem("~ Select Event ~");
					txtIncome.setText("");
					txtTotalSponsor.setText("");
					txtTotalExpenses.setText("");
					txtNetIncome.setText("");
					txtIncomeTaxReduction.setText("");
				}
			});
			btnReset.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 20));
			btnReset.setBounds(345, 10, 130, 60);
			panel_1_1_1_1.add(btnReset);
			
			// Print the information on the table
			JButton btnPrint = new JButton("PRINT");
			btnPrint.setBackground(new Color(153, 255, 255));
			btnPrint.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						table.print();
					} catch (java.awt.print.PrinterException e) {
						System.err.format("No printer found", e.getMessage());
					}
				}
			});
			btnPrint.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 20));
			btnPrint.setBounds(667, 10, 130, 60);
			panel_1_1_1_1.add(btnPrint);
			
			// Exit from the application
			JButton btnExit = new JButton("EXIT");
			btnExit.setBackground(new Color(153, 255, 255));
			btnExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JFrame frame = new JFrame();
					if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Finance Management System", 
							JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
						System.exit(0);
					}
				}
			});
			btnExit.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 20));
			btnExit.setBounds(825, 10, 130, 60);
			panel_1_1_1_1.add(btnExit);
			
			JPanel panel_1_2 = new JPanel();
			panel_1_2.setLayout(null);
			panel_1_2.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 204), new Color(0, 0, 255), new Color(0, 0, 204), new Color(0, 0, 255)));
			panel_1_2.setBackground(new Color(51, 204, 255));
			panel_1_2.setBounds(387, 408, 588, 78);
			panel.add(panel_1_2);
			
			// Get the net profit from all event by pressing this button
			JButton btnNetRprofitrm = new JButton("NET RPROFIT (RM)");
			btnNetRprofitrm.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					txtNetProfit.setText(String.format("%.2f", netProfit));
				}
			});
			btnNetRprofitrm.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 20));
			btnNetRprofitrm.setBackground(new Color(153, 255, 255));
			btnNetRprofitrm.setBounds(10, 10, 187, 58);
			panel_1_2.add(btnNetRprofitrm);
			
			txtNetProfit = new JTextField();
			txtNetProfit.setEditable(false);
			txtNetProfit.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			txtNetProfit.setBounds(207, 10, 371, 58);
			panel_1_2.add(txtNetProfit);
			txtNetProfit.setColumns(10);
		}
}
