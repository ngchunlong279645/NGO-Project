package SoupKitchen;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class FinanceAdmin extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel totalDonation;
	private JPanel panel_1;
	private JPanel panel_2;
	private JLabel totalDonation_2;
	private JScrollPane scrollPane;
	private JTable table;
	private JTextField textFieldparticipant;
	private JTextField textFieldfee;
	private JTextField textFieldprogram;
	private JTextField textFieldother;
	private JLabel totalgross;
	private JLabel totalexpenses;
	private JLabel netincome;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FinanceAdmin frame = new FinanceAdmin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 ** 
	 */
	public void addDonation(String d) {//get value from other frame
		totalDonation.setText(d);
	}
	
	public FinanceAdmin() {
		setTitle("Finance");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1030, 630);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(216, 191, 216));
		contentPane.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 102, 153)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Finance");
		lblNewLabel.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 33));
		lblNewLabel.setBounds(429, 33, 130, 62);
		contentPane.add(lblNewLabel);
		
		panel = new JPanel();
		panel.setBackground(new Color(216, 191, 216));
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 102, 153)));
		panel.setBounds(69, 114, 368, 201);
		contentPane.add(panel);
		panel.setLayout(null);
		
		totalDonation = new JLabel("");
		totalDonation.setBounds(197, 17, 120, 26);
		panel.add(totalDonation);
		
		JLabel lblNewLabel_1 = new JLabel("Total donation : RM");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(10, 11, 126, 32);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Registration fee : RM");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(10, 54, 126, 35);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Total participant : ");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_2.setBounds(10, 118, 126, 14);
		panel.add(lblNewLabel_1_2);
		
		textFieldparticipant = new JTextField();
		textFieldparticipant.setColumns(10);
		textFieldparticipant.setBounds(197, 113, 120, 26);
		panel.add(textFieldparticipant);
		
		textFieldfee = new JTextField();
		textFieldfee.setColumns(10);
		textFieldfee.setBounds(197, 61, 120, 26);
		panel.add(textFieldfee);
		
		totalgross = new JLabel("");
		totalgross.setBounds(197, 161, 120, 26);
		panel.add(totalgross);
		
		JButton btnNewButton = new JButton("Total gross income : RM");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double donate ,fee, participant, ans;
				donate = Double.parseDouble(totalDonation.getText());//get value from other frame
				fee = Double.parseDouble(textFieldfee.getText());
				participant = Double.parseDouble(textFieldparticipant.getText());
				ans = donate + (fee * participant);
				totalgross.setText(Double.toString(ans));
			}
		});
		btnNewButton.setBounds(10, 164, 177, 23);
		panel.add(btnNewButton);
		
		panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 102, 153)));
		panel_1.setBackground(new Color(216, 191, 216));
		panel_1.setBounds(494, 112, 447, 294);
		contentPane.add(panel_1);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 427, 221);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Donation", "Registration fee", "Participant", "Total (RM)", "Program expenses", "Other expenses", "Total expenses", "Total net income (RM)"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnNewButton_2_2 = new JButton("UPLOAD");
		btnNewButton_2_2.setBounds(329, 250, 108, 33);
		panel_1.add(btnNewButton_2_2);
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\lzw_1\\eclipse-workspace\\Project\\src\\SoupKitchen\\Finance.txt");
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
		btnNewButton_2_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 102, 153)));
		panel_2.setBackground(new Color(216, 191, 216));
		panel_2.setBounds(69, 359, 368, 192);
		contentPane.add(panel_2);
		
		totalDonation_2 = new JLabel("Program expenses : RM");
		totalDonation_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		totalDonation_2.setBounds(10, 11, 140, 31);
		panel_2.add(totalDonation_2);
		
		JLabel totalDonation_2_1 = new JLabel("Other expenses : RM");
		totalDonation_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		totalDonation_2_1.setBounds(10, 53, 140, 31);
		panel_2.add(totalDonation_2_1);
		
		textFieldprogram = new JTextField();
		textFieldprogram.setColumns(10);
		textFieldprogram.setBounds(195, 17, 121, 26);
		panel_2.add(textFieldprogram);
		
		textFieldother = new JTextField();
		textFieldother.setColumns(10);
		textFieldother.setBounds(195, 59, 121, 26);
		panel_2.add(textFieldother);
		
		totalexpenses = new JLabel("");
		totalexpenses.setBounds(195, 107, 121, 26);
		panel_2.add(totalexpenses);
		
		JButton btnNewButton_1 = new JButton("Total expenses : RM");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double program, other, ans;
				program = Double.parseDouble(textFieldprogram.getText());//get value from other frame
				other = Double.parseDouble(textFieldother.getText()); 
				ans = program + other;
				totalexpenses.setText(Double.toString(ans));
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(10, 107, 175, 23);
		panel_2.add(btnNewButton_1);
		
		netincome = new JLabel("");
		netincome.setBounds(195, 155, 121, 26);
		panel_2.add(netincome);
		
		JButton btnNewButton_1_1 = new JButton("Total net income : RM");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double total, expenses, ans;
				total = Double.parseDouble(totalgross.getText());
				expenses = Double.parseDouble(totalexpenses.getText());
				ans = total - expenses;
				netincome.setText(Double.toString(ans));
			}
		});
		btnNewButton_1_1.setBounds(10, 158, 175, 23);
		panel_2.add(btnNewButton_1_1);
		
		JButton btnNewButton_2 = new JButton("ADD");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double donation, fee, participant, gross, program, other, expenses, net;
				donation = Double.parseDouble(totalDonation.getText());
				fee = Double.parseDouble(textFieldfee.getText());
				participant = Double.parseDouble(textFieldparticipant.getText());
				gross = Double.parseDouble(totalgross.getText());
				program = Double.parseDouble(textFieldprogram.getText());
				other = Double.parseDouble(textFieldother.getText());
				expenses = Double.parseDouble(totalexpenses.getText());
				net = Double.parseDouble(netincome.getText());
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						donation,
						fee,
						participant,
						gross,
						program,
						other,
						expenses,
						net,
												
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Donater Information Update confirmed", "Hope Soup Kitchen",
								JOptionPane.OK_OPTION);
					}
				}
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_2.setBounds(494, 436, 108, 33);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("DELETE");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Hope Soup Kitchen", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Hope Soup Kitchen", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_2_1.setBounds(635, 436, 108, 33);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2_1 = new JButton("PRINT");
		btnNewButton_2_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent o) {
				try {
					table.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No printer found", e.getMessage());
				}
			}
		});
		btnNewButton_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_2_2_1.setBounds(494, 508, 108, 33);
		contentPane.add(btnNewButton_2_2_1);
		
		JButton btnNewButton_2_2_2 = new JButton("EXIT");
		btnNewButton_2_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Donating", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnNewButton_2_2_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_2_2_2.setBounds(635, 508, 108, 33);
		contentPane.add(btnNewButton_2_2_2);
	}
}
