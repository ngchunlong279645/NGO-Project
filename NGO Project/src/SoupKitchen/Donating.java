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
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class Donating extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField name;
	private JTextField email;
	private JTextField number;
	private JTextField donation;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JFrame frame;
	private double total;
	private String paymentMethod = "";
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Donating frame = new Donating();
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
	public Donating() {
		setTitle("Donating");
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
		
		JLabel lblNewLabel = new JLabel("Donation");
		lblNewLabel.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 33));
		lblNewLabel.setBounds(419, 36, 134, 47);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 102, 153)));
		panel.setBackground(new Color(216, 191, 216));
		panel.setBounds(40, 124, 383, 342);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 11, 51, 35);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Email:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(10, 60, 83, 35);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Contact number:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1_1.setBounds(10, 106, 99, 35);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Total donation: RM");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1_1_1.setBounds(10, 163, 113, 35);
		panel.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Payment method: ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(10, 234, 113, 14);
		panel.add(lblNewLabel_2);
		
		name = new JTextField();
		name.setFont(new Font("Tahoma", Font.PLAIN, 13));
		name.setBounds(71, 16, 271, 26);
		panel.add(name);
		name.setColumns(10);
		
		email = new JTextField();
		email.setFont(new Font("Tahoma", Font.PLAIN, 13));
		email.setColumns(10);
		email.setBounds(71, 69, 271, 26);
		panel.add(email);
		
		number = new JTextField();
		number.setFont(new Font("Tahoma", Font.PLAIN, 13));
		number.setColumns(10);
		number.setBounds(123, 110, 219, 26);
		panel.add(number);
		
		donation = new JTextField();
		donation.setFont(new Font("Tahoma", Font.PLAIN, 13));
		donation.setColumns(10);
		donation.setBounds(135, 167, 207, 26);
		panel.add(donation);
		
		JRadioButton rdbtnonlineBnaking = new JRadioButton("Online banking");
		buttonGroup.add(rdbtnonlineBnaking);
		rdbtnonlineBnaking.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnonlineBnaking.setBounds(123, 231, 156, 26);
		panel.add(rdbtnonlineBnaking);
		
		JRadioButton rdbtnDebitcreditCard = new JRadioButton("Debit/Credit card");
		buttonGroup.add(rdbtnDebitcreditCard);
		rdbtnDebitcreditCard.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnDebitcreditCard.setBounds(123, 272, 156, 26);
		panel.add(rdbtnDebitcreditCard);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 102, 153)));
		panel_1.setBackground(new Color(216, 191, 216));
		panel_1.setBounds(500, 128, 448, 338);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 428, 248);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Email", "Contact number", "Total (RM)"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnTotal = new JButton("TOTAL (RM)");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnonlineBnaking.isSelected()) {
					paymentMethod = "Online banking";
				}
				else{
					paymentMethod = "Credit/card";
				}
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
			    // iterate over all columns
			    for (int i = 0 ; i < model.getRowCount()  ; i++) {
			        // null or not Integer will throw exception
			        String s = String.valueOf(model.getValueAt(i, 3));
			        total += Double.parseDouble(s);
			    }
			    textField = new JTextField();
				textField.setBounds(153, 278, 134, 49);
				panel_1.add(textField);
				textField.setColumns(10);
				String result = String.valueOf(total);
				textField.setText(result);
				String t = textField.getText();
				FinanceAdmin f = new FinanceAdmin();//pass value
				f.addDonation(t);
				f.setVisible(true);
				dispose();
			}
		});
		btnTotal.setForeground(Color.WHITE);
		btnTotal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTotal.setBackground(new Color(153, 102, 153));
		btnTotal.setBounds(10, 278, 134, 49);
		panel_1.add(btnTotal);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\lzw_1\\eclipse-workspace\\Project\\src\\SoupKitchen\\Donation.txt");
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
		btnUpload.setForeground(Color.WHITE);
		btnUpload.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnUpload.setBackground(new Color(153, 102, 153));
		btnUpload.setBounds(304, 278, 134, 49);
		panel_1.add(btnUpload);
		
		JButton btnNewButton = new JButton("DONATE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						name.getText(),
						email.getText(),
						number.getText(),
						donation.getText(),
						
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Partipant Information Update confirmed", "Hope Soup Kitchen",
								JOptionPane.OK_OPTION);
					}
				}
				}
			
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(153, 102, 153));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(40, 514, 134, 49);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1_1 = new JButton("EXIT");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Hope Soup Kitchen", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_1.setBackground(new Color(153, 102, 153));
		btnNewButton_1_1.setBounds(814, 514, 134, 49);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("DELETE");
		btnNewButton_1_2.addActionListener(new ActionListener() {
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
		btnNewButton_1_2.setForeground(Color.WHITE);
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_2.setBackground(new Color(153, 102, 153));
		btnNewButton_1_2.setBounds(419, 514, 134, 49);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("PRINT");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent o) {
				try {
					table.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No printer found", e.getMessage());
				}
			}
		});
		btnNewButton_1_3.setForeground(Color.WHITE);
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_3.setBackground(new Color(153, 102, 153));
		btnNewButton_1_3.setBounds(618, 514, 134, 49);
		contentPane.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("EDIT");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(name.getText(),i,0);
			    	model.setValueAt(email.getText(),i,1);
			    	model.setValueAt(number.getText(),i,2);
			    	model.setValueAt(donation.getText(),i,3);
			    	
					JOptionPane.showMessageDialog(null, "Update Successful");
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
			    }
			}
		});
		btnNewButton_1_4.setForeground(Color.WHITE);
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_4.setBackground(new Color(153, 102, 153));
		btnNewButton_1_4.setBounds(220, 514, 134, 49);
		contentPane.add(btnNewButton_1_4);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage frame = new Homepage();
				frame.setVisible(true);
				dispose();
			}
		});
		btnHome.setForeground(Color.WHITE);
		btnHome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnHome.setBackground(new Color(153, 102, 153));
		btnHome.setBounds(40, 34, 134, 49);
		contentPane.add(btnHome);
	}
}
