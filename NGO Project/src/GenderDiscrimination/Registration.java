package GenderDiscrimination;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.Toolkit;

public class Registration extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtContact;
	private JTextField txtEmail;
	private JTextField txtAge;
	private JTextField txtDonation;
	protected JTable table;
	private JTextField txtTaxReduction;
	private String donation1, donation2, donation3;
	protected static double totalDonation1, totalDonation2, totalDonation3;
	protected static int totalParticipant1, totalParticipant2, totalParticipant3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration frame = new Registration();
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
	public Registration() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Registration.class.getResource("gender equality.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1010, 642);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 204, 255));
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.BLUE));
		panel.setBounds(0, 0, 996, 605);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.BLUE));
		panel_1.setBackground(new Color(51, 255, 255));
		panel_1.setBounds(10, 10, 976, 83);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Event Registration");
		lblNewLabel.setBackground(new Color(0, 204, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel.setBounds(10, 10, 956, 63);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.BLUE));
		panel_2.setBackground(new Color(51, 204, 255));
		panel_2.setBounds(10, 103, 391, 384);
		panel.add(panel_2);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setLayout(null);
		panel_2_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.BLUE));
		panel_2_2.setBackground(new Color(51, 204, 255));
		panel_2_2.setBounds(161, 381, 391, 94);
		panel_2.add(panel_2_2);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
		lblName.setBounds(17, 50, 101, 24);
		panel_2.add(lblName);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtName.setBounds(128, 50, 240, 25);
		panel_2.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblContact = new JLabel("Contact");
		lblContact.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 17));
		lblContact.setBounds(17, 140, 101, 24);
		panel_2.add(lblContact);
		
		txtContact = new JTextField();
		txtContact.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtContact.setColumns(10);
		txtContact.setBounds(128, 140, 240, 25);
		panel_2.add(txtContact);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 17));
		lblEmail.setBounds(17, 182, 101, 24);
		panel_2.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtEmail.setColumns(10);
		txtEmail.setBounds(128, 184, 240, 25);
		panel_2.add(txtEmail);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 17));
		lblAddress.setBounds(17, 228, 101, 24);
		panel_2.add(lblAddress);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
		lblAge.setBounds(17, 96, 101, 24);
		panel_2.add(lblAge);
		
		txtAge = new JTextField();
		txtAge.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtAge.setColumns(10);
		txtAge.setBounds(128, 96, 240, 25);
		panel_2.add(txtAge);
		
		JLabel lblDonation = new JLabel("Donation(RM)");
		lblDonation.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 17));
		lblDonation.setBounds(17, 297, 186, 24);
		panel_2.add(lblDonation);
		
		txtDonation = new JTextField();
		txtDonation.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtDonation.setColumns(10);
		txtDonation.setBounds(213, 299, 155, 25);
		panel_2.add(txtDonation);
		
		JComboBox event = new JComboBox();
		event.setBounds(128, 12, 240, 24);
		panel_2.add(event);
		event.setBackground(new Color(204, 255, 255));
		event.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		event.setModel(new DefaultComboBoxModel(new String[] {"~ Select Event ~", "Event 1", "Event 2", "Event 3"}));
		
		JLabel lblEvent = new JLabel("Event");
		lblEvent.setBounds(17, 10, 101, 24);
		panel_2.add(lblEvent);
		lblEvent.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
		
		JLabel lblTaxReduction = new JLabel("Tax Reduction(RM)");
		lblTaxReduction.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 16));
		lblTaxReduction.setBounds(17, 346, 186, 24);
		panel_2.add(lblTaxReduction);
		
		txtTaxReduction = new JTextField();
		txtTaxReduction.setEditable(false);
		txtTaxReduction.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtTaxReduction.setColumns(10);
		txtTaxReduction.setBounds(213, 346, 155, 25);
		panel_2.add(txtTaxReduction);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(128, 228, 240, 60);
		panel_2.add(scrollPane_1);
		
		JTextPane addressTextPane = new JTextPane();
		scrollPane_1.setViewportView(addressTextPane);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.BLUE));
		panel_2_1.setBackground(new Color(51, 204, 255));
		panel_2_1.setBounds(411, 103, 575, 384);
		panel.add(panel_2_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 555, 289);
		panel_2_1.add(scrollPane);
		
		table = new JTable();
		table.setBackground(Color.WHITE);
		table.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Event", "Name", "Age", "Contact", "Email", "Address", "Donation(RM)", "Tax Reduction(RM)"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\lzw_1\\OneDrive\\Desktop\\Assignment\\Programming II\\Assignment 3\\Txt File\\Participant.txt");
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
		btnUpload.setFont(new Font("Engravers MT", Font.PLAIN, 17));
		btnUpload.setBounds(195, 313, 157, 49);
		panel_2_1.add(btnUpload);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setLayout(null);
		panel_2_3.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.BLUE));
		panel_2_3.setBackground(new Color(51, 204, 255));
		panel_2_3.setBounds(10, 497, 976, 98);
		panel.add(panel_2_3);
		
		JPanel panel_2_2_1 = new JPanel();
		panel_2_2_1.setLayout(null);
		panel_2_2_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.BLUE));
		panel_2_2_1.setBackground(new Color(51, 204, 255));
		panel_2_2_1.setBounds(161, 381, 391, 94);
		panel_2_3.add(panel_2_2_1);
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					
					double td = Double.parseDouble(txtDonation.getText());
					double tr;
					
					// Calculate tax reduction for different event
					if(event.getSelectedIndex() == 1){
						if(td < 1000) {
							txtTaxReduction.setText("-");
						}
						else if(td > 1000) {
							double taxr1 = Double.parseDouble(Advertisement.tr1);
							tr = td * taxr1/100;
							txtTaxReduction.setText(String.format("%.2f", tr));
							}
					}
					else if(event.getSelectedIndex() == 2){
						if(td < 1000) {
							txtTaxReduction.setText("-");
						}
						else if(td >= 1000) {
							double taxr2 = Double.parseDouble(Advertisement.tr2);
							tr = td * taxr2/100;
							txtTaxReduction.setText(String.format("%.2f", tr));
						}
					}
					else if(event.getSelectedIndex() == 3){
						if(td < 1000) {
							txtTaxReduction.setText("-");
						}
						else if(td >= 1000) {
							double taxr3 = Double.parseDouble(Advertisement.tr3);
							tr = td * taxr3/100;
							txtTaxReduction.setText(String.format("%.2f", tr));
						}
					}
					
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					
					model.addRow(new Object[]{
							event.getSelectedItem(),
							txtName.getText(),
							txtAge.getText(),
							txtContact.getText(),
							txtEmail.getText(),
							addressTextPane.getText(),
							txtDonation.getText(),
							txtTaxReduction.getText()
					});
					
					
					// calculate total participant and total donation for each event
					totalDonation1 = 0;
					totalParticipant1 =0;
					totalDonation2 = 0;
					totalParticipant2 =0;
					totalDonation3 = 0;
					totalParticipant3 = 0;
					for(int i = 0; i<model.getRowCount(); i++) {
						String e1 = "Event 1";
						String e2 = "Event 2";
						String e3 = "Event 3";
						if(String.valueOf(model.getValueAt(i, 0)).equals(e1)){
							donation1 = String.valueOf(model.getValueAt(i, 6));
							totalParticipant1 = 1 + totalParticipant1;
							totalDonation1 = Double.parseDouble(donation1) + totalDonation1;
						}
						else if(String.valueOf(model.getValueAt(i, 0)).equals(e2)){
							donation2 = String.valueOf(model.getValueAt(i, 6));
							totalParticipant2 = 1 + totalParticipant2;
							totalDonation2 = Double.parseDouble(donation2) + totalDonation2;
						}
						else if(String.valueOf(model.getValueAt(i, 0)).equals(e3)){
							donation3 = String.valueOf(model.getValueAt(i, 6));
							totalParticipant3 = 1 + totalParticipant3;
							totalDonation3 = Double.parseDouble(donation3) + totalDonation3;
						}
					}
					
					
					if (table.getSelectedRow() == -1) {
						if (table.getRowCount() == 0) {
							JOptionPane.showMessageDialog(null, "Participant Update Confirmed", "Event Registration System",
									JOptionPane.OK_OPTION);
						}
					}
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please register your information");
				}
			}
		});
		btnRegister.setFont(new Font("Engravers MT", Font.PLAIN, 14));
		btnRegister.setBounds(21, 24, 137, 49);
		panel_2_3.add(btnRegister);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				event.setSelectedItem("~ Select Event ~");
				txtName.setText("");
				txtAge.setText("");
				txtContact.setText("");
				txtEmail.setText("");
				addressTextPane.setText("");
				txtDonation.setText("");
				txtTaxReduction.setText("");
			}	
		});
		btnReset.setFont(new Font("Engravers MT", Font.PLAIN, 14));
		btnReset.setBounds(178, 24, 114, 49);
		panel_2_3.add(btnReset);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Event Registration System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Event Registration System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setFont(new Font("Engravers MT", Font.PLAIN, 14));
		btnDelete.setBounds(438, 24, 114, 49);
		panel_2_3.add(btnDelete);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					table.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No printer found", e.getMessage());
				}
			}
		});
		btnPrint.setFont(new Font("Engravers MT", Font.PLAIN, 14));
		btnPrint.setBounds(575, 24, 114, 49);
		panel_2_3.add(btnPrint);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Event Registration System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Engravers MT", Font.PLAIN, 14));
		btnExit.setBounds(852, 24, 114, 49);
		panel_2_3.add(btnExit);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(event.getSelectedItem(), i, 0);
			    	model.setValueAt(txtName.getText(), i, 1);
			    	model.setValueAt(txtAge.getText(), i, 2);
			    	model.setValueAt(txtContact.getText(), i, 3);
			    	model.setValueAt(txtEmail.getText(), i, 4);
			    	model.setValueAt(addressTextPane.getText(), i, 5);
			    	model.setValueAt(txtDonation.getText(), i, 6);
			    	model.setValueAt(txtTaxReduction.getText(), i, 7);
			    	
					JOptionPane.showMessageDialog(null, "Update Successfully");
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
			    }
			}
		});
		btnUpdate.setFont(new Font("Engravers MT", Font.PLAIN, 14));
		btnUpdate.setBounds(313, 24, 114, 49);
		panel_2_3.add(btnUpdate);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventDescription evDes = new EventDescription(Advertisement.event1,Advertisement.event2,Advertisement.event3);
				evDes.setModalExclusionType(null);
				evDes.setVisible(true);
			}
		});
		btnBack.setFont(new Font("Engravers MT", Font.PLAIN, 14));
		btnBack.setBounds(712, 24, 122, 49);
		panel_2_3.add(btnBack);
	}
}
