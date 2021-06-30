package ChildrensWelfare;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;               
import javax.swing.JPanel;                 
import javax.swing.JTable;               
import javax.swing.border.EmptyBorder;       
import javax.swing.border.MatteBorder;      
import java.awt.Color;                       
import javax.swing.JLabel;              
import javax.swing.JOptionPane;           
import javax.swing.table.TableModel;        

import java.awt.Font;                  
import javax.swing.JTextField;             
import javax.swing.JComboBox;                 
import javax.swing.DefaultComboBoxModel;        
import javax.swing.JScrollPane;              
import javax.swing.table.DefaultTableModel;   
import javax.swing.JButton;                   
import java.awt.event.ActionListener;       
import java.io.BufferedWriter;              
import java.io.File;                    
import java.io.FileWriter;               
import java.awt.event.ActionEvent;        

public class ParticipantRegistration extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldName;
	private JTextField textFieldAge;
	private JTextField textFieldContactNo;
	private JTextField textFieldAddress;
	private JTextField textFieldEmail;
	private JTextField textFieldDonation;
	private static JTable table;
	private JFrame frame;
	private double fee = 0;
	private double fee1 = 0;
	private String discount;
	private static double total;
	String d = Advertisement.getDonation();
	String dis = Advertisement.getDiscount();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ParticipantRegistration frame = new ParticipantRegistration();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static double getTotal() {
		if(table != null) {
			for(int i = 0; i < table.getRowCount(); i++) {
				String t = String.valueOf(table.getValueAt(i,10));
				total += Double.parseDouble(t);
			}
		}
		return total; //return in double
	}

	/**
	 * Create the frame.
	 */
	public ParticipantRegistration() { //constructor with 2 arg
		JTable tt = AdminEvent.getTable(); //get the table from AdminEvent frame
		
		setTitle("Participant Registration System");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1099, 682);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		contentPane.setLayout(null);
		panel.setBackground(new Color(102, 204, 255));
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 204)));
		panel.setBounds(0, 0, 1085, 645);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(153, 204, 255));
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 51, 255)));
		panel_1.setBounds(35, 22, 1012, 59);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblTitle = new JLabel("Participant Registration System");
		lblTitle.setFont(new Font("Rockwell Extra Bold", Font.BOLD | Font.ITALIC, 26));
		lblTitle.setBounds(244, 10, 539, 39);
		panel_1.add(lblTitle);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 51, 255)));
		panel_1_1.setBackground(new Color(153, 204, 255));
		panel_1_1.setBounds(35, 101, 339, 406);
		panel.add(panel_1_1);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblName.setBounds(10, 22, 94, 31);
		panel_1_1.add(lblName);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblAge.setBounds(10, 63, 94, 31);
		panel_1_1.add(lblAge);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblGender.setBounds(10, 101, 94, 31);
		panel_1_1.add(lblGender);
		
		JLabel lblContactNo = new JLabel("Contact No.");
		lblContactNo.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblContactNo.setBounds(10, 142, 94, 31);
		panel_1_1.add(lblContactNo);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblAddress.setBounds(10, 183, 94, 31);
		panel_1_1.add(lblAddress);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblEmail.setBounds(10, 224, 94, 31);
		panel_1_1.add(lblEmail);
		
		JLabel lblEvent = new JLabel("Event");
		lblEvent.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblEvent.setBounds(10, 265, 94, 31);
		panel_1_1.add(lblEvent);
		
		JLabel lblDonation = new JLabel("Donation (RM)");
		lblDonation.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblDonation.setBounds(10, 306, 94, 31);
		panel_1_1.add(lblDonation);
		
		textFieldName = new JTextField();
		textFieldName.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		textFieldName.setBounds(114, 22, 188, 31);
		panel_1_1.add(textFieldName);
		textFieldName.setColumns(10);
		
		textFieldAge = new JTextField();
		textFieldAge.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		textFieldAge.setColumns(10);
		textFieldAge.setBounds(114, 63, 188, 31);
		panel_1_1.add(textFieldAge);
		
		textFieldContactNo = new JTextField();
		textFieldContactNo.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		textFieldContactNo.setColumns(10);
		textFieldContactNo.setBounds(114, 142, 188, 31);
		panel_1_1.add(textFieldContactNo);
		
		textFieldAddress = new JTextField();
		textFieldAddress.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		textFieldAddress.setColumns(10);
		textFieldAddress.setBounds(114, 183, 188, 31);
		panel_1_1.add(textFieldAddress);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(114, 224, 188, 31);
		panel_1_1.add(textFieldEmail);
		
		textFieldDonation = new JTextField();
		textFieldDonation.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		textFieldDonation.setColumns(10);
		textFieldDonation.setBounds(114, 306, 188, 31);
		panel_1_1.add(textFieldDonation);
		
		JComboBox comboBoxGender = new JComboBox();
		comboBoxGender.setModel(new DefaultComboBoxModel(new String[] {"Make a selection", "Female", "Male"}));
		comboBoxGender.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		comboBoxGender.setBounds(114, 101, 188, 31);
		panel_1_1.add(comboBoxGender);
		
		JComboBox comboBoxEvent = new JComboBox();
		comboBoxEvent.setModel(new DefaultComboBoxModel(new String[] {"Make a selection", String.valueOf(tt.getValueAt(0, 0)), String.valueOf(tt.getValueAt(1, 0))}));
		comboBoxEvent.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		comboBoxEvent.setBounds(114, 265, 188, 31);
		panel_1_1.add(comboBoxEvent);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 51, 255)));
		panel_1_1_1.setBackground(new Color(153, 204, 255));
		panel_1_1_1.setBounds(393, 101, 654, 406);
		panel.add(panel_1_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 634, 344);
		panel_1_1_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Age", "Gender", "Contact No", "Address", "Email", "Event", "Fee", "Donation", "Discount", "Total Price"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\lzw_1\\eclipse-workspace\\Project\\src\\ChildrensWelfare\\ParticipantReg.txt");
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
		btnUpload.setBackground(new Color(204, 204, 255));
		btnUpload.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
		btnUpload.setBounds(282, 364, 131, 32);
		panel_1_1_1.add(btnUpload);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 51, 255)));
		panel_1_2.setBackground(new Color(153, 204, 255));
		panel_1_2.setBounds(35, 530, 1012, 59);
		panel.add(panel_1_2);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				if(comboBoxEvent.getSelectedItem().equals(String.valueOf(tt.getValueAt(0, 0)))) {
					String f = String.valueOf(tt.getValueAt(0, 4));
					fee = Integer.parseInt(f);
				}
				else if(comboBoxEvent.getSelectedItem().equals(String.valueOf(tt.getValueAt(1, 0)))) {
					String f = String.valueOf(tt.getValueAt(1, 4));
					fee = Integer.parseInt(f);
				}
				
				CalculationRegistration cal = new CalculationRegistration();
				cal.setDiscount(Integer.parseInt(dis));
				cal.setDonation(Integer.parseInt(d));
				double totalPrice = cal.totalPrice(fee, Integer.parseInt(textFieldDonation.getText()));
				if(Integer.parseInt(textFieldDonation.getText()) > Integer.parseInt(d)) {
					discount = dis + "%";
				}
				else {
					discount = "0%";
				}
				
				model.addRow(new Object[] {
						textFieldName.getText(),
						textFieldAge.getText(),
						comboBoxGender.getSelectedItem(),
						textFieldContactNo.getText(),
						textFieldAddress.getText(),
						textFieldEmail.getText(),
						comboBoxEvent.getSelectedItem(),
						fee,
						textFieldDonation.getText(),
						discount,
						totalPrice,
				});
				
				if(table.getSelectedRow() == -1) {
					if(table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Participant Update Confirmed", "Participant Registration System", JOptionPane.OK_OPTION);
					}
				}
			}
		});
		btnAdd.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
		btnAdd.setBackground(new Color(204, 204, 255));
		btnAdd.setBounds(10, 10, 131, 32);
		panel_1_2.add(btnAdd);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldName.setText("");
				textFieldAge.setText("");
				comboBoxGender.setSelectedItem("Make a selection");
				textFieldContactNo.setText("");
				textFieldAddress.setText("");
				textFieldEmail.setText("");
				comboBoxEvent.setSelectedItem("Make a selection");
				textFieldDonation.setText("");
			}
		});
		btnReset.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
		btnReset.setBackground(new Color(204, 204, 255));
		btnReset.setBounds(151, 10, 131, 32);
		panel_1_2.add(btnReset);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				if(comboBoxEvent.getSelectedItem().equals(String.valueOf(tt.getValueAt(0, 0)))) {
					String f = String.valueOf(tt.getValueAt(0, 4));
					fee = Integer.parseInt(f);
				}
				else if(comboBoxEvent.getSelectedItem().equals(String.valueOf(tt.getValueAt(1, 0)))) {
					String f = String.valueOf(tt.getValueAt(1, 4));
					fee = Integer.parseInt(f);
				}
				
				CalculationRegistration cal = new CalculationRegistration();
				cal.setDiscount(Integer.parseInt(dis));
				cal.setDonation(Integer.parseInt(d));
				double totalPrice = cal.totalPrice(fee, Integer.parseInt(textFieldDonation.getText()));
				if(Integer.parseInt(textFieldDonation.getText()) > Integer.parseInt(d)) {
					discount = dis + "%";
				}
				else {
					discount = "0%";
				}
				int i = table.getSelectedRow();
				if (i >= 0) {
					model.setValueAt(textFieldName, i, 0);
					model.setValueAt(textFieldAge, i, 1);
					model.setValueAt(comboBoxGender.getSelectedItem(), i, 2);
					model.setValueAt(textFieldContactNo, i, 3);
					model.setValueAt(textFieldAddress, i, 4);
					model.setValueAt(textFieldEmail, i, 5);
					model.setValueAt(comboBoxEvent.getSelectedItem(), i, 6);
					model.setValueAt(fee, i, 7);
					model.setValueAt(textFieldDonation, i, 8);
					model.setValueAt(discount, i, 9);
					model.setValueAt(totalPrice, i, 10);
						JOptionPane.showMessageDialog(null, "Update Successfully!");
				}
				else {
					JOptionPane.showMessageDialog(null, "Pease Select a Row First!");
				}
			}
		});
		btnUpdate.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
		btnUpdate.setBackground(new Color(204, 204, 255));
		btnUpdate.setBounds(292, 10, 131, 32);
		panel_1_2.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Event Management System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Event Management System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
		btnDelete.setBackground(new Color(204, 204, 255));
		btnDelete.setBounds(433, 10, 131, 32);
		panel_1_2.add(btnDelete);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					table.print();
				} catch (java.awt.print.PrinterException e1) {
					System.err.format("No printer found", e1.getMessage());
				}
			}
		});
		btnPrint.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
		btnPrint.setBackground(new Color(204, 204, 255));
		btnPrint.setBounds(574, 10, 131, 32);
		panel_1_2.add(btnPrint);
		
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
		btnBack.setBounds(715, 10, 131, 32);
		panel_1_2.add(btnBack);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Participant Registration System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
		btnExit.setBackground(new Color(204, 204, 255));
		btnExit.setBounds(856, 10, 131, 32);
		panel_1_2.add(btnExit);
	}
}
