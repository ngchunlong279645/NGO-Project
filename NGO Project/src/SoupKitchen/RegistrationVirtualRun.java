package SoupKitchen;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;  
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.Component;

import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class RegistrationVirtualRun extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField totaltextField;
	private JTextField name;
	private JTextField email;
	private JTextField number;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private String paymentMethod = " ";
	private double total;
	private JLabel passfee;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	
	public void updateFee(String f) {//get value
		passfee.setText(f);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationVirtualRun frame = new RegistrationVirtualRun();
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
	public RegistrationVirtualRun() {
		setTitle("Registration Virtual Run");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1030, 630);
		contentPane = new JPanel(){
			public void paintComponent(Graphics g) {  // inserting background picture
				Image img = Toolkit.getDefaultToolkit().getImage(
						RegistrationVirtualRun.class.getResource("bglight.PNG"));  
		                      g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);  
				                 }  
				           };  
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 102, 153)));
		panel.setBackground(new Color(216, 191, 216));
		panel.setBounds(446, 98, 510, 361);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 490, 276);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Email", "Contact number", "Total(RM)"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnNewButton_1_2 = new JButton("UPLOAD");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent O) {
				try {
					File file = new File("C:\\Users\\lzw_1\\eclipse-workspace\\Project\\src\\SoupKitchen\\Virtual Run Registration.txt");
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
		btnNewButton_1_2.setForeground(Color.WHITE);
		btnNewButton_1_2.setBackground(new Color(153, 102, 153));
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_1_2.setBounds(343, 298, 157, 44);
		panel.add(btnNewButton_1_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 102, 153)));
		panel_1.setBackground(new Color(216, 191, 216));
		panel_1.setBounds(52, 98, 346, 361);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JCheckBox onlinebankingCheckBox = new JCheckBox("Online banking");
		buttonGroup.add(onlinebankingCheckBox);
		onlinebankingCheckBox.setBounds(117, 247, 126, 23);
		panel_1.add(onlinebankingCheckBox);
		
		JCheckBox cardCheckBox = new JCheckBox("Debit/Credit card");
		buttonGroup.add(cardCheckBox);
		cardCheckBox.setBounds(117, 299, 126, 23);
		panel_1.add(cardCheckBox);
		
		JButton btnNewButton_1_2_1 = new JButton("TOTAL(RM)");
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(onlinebankingCheckBox.isSelected()) {
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
			    
				totaltextField = new JTextField();
				totaltextField.setEditable(false);
				totaltextField.setBounds(188, 309, 130, 29);
				panel.add(totaltextField);
				totaltextField.setColumns(10);
				String result = String.valueOf(total);
				totaltextField.setText(result);
				
			}
		});
		btnNewButton_1_2_1.setForeground(Color.WHITE);
		btnNewButton_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_1_2_1.setBackground(new Color(153, 102, 153));
		btnNewButton_1_2_1.setBounds(10, 298, 157, 44);
		panel.add(btnNewButton_1_2_1);
		
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 23, 52, 28);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Email:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(10, 84, 52, 28);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Contact number:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_2.setBounds(10, 142, 114, 28);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Payment method:");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_3.setBounds(10, 236, 114, 42);
		panel_1.add(lblNewLabel_1_3);
		
		name = new JTextField();
		name.setBounds(70, 25, 200, 28);
		panel_1.add(name);
		name.setColumns(10);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(72, 86, 200, 28);
		panel_1.add(email);
		
		number = new JTextField();
		number.setColumns(10);
		number.setBounds(117, 143, 153, 28);
		panel_1.add(number);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Fee: RM");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(10, 202, 65, 28);
		panel_1.add(lblNewLabel_1_1_1);
		
		passfee = new JLabel("");
		passfee.setFont(new Font("Tahoma", Font.PLAIN, 15));
		passfee.setBounds(70, 202, 145, 23);
		panel_1.add(passfee);
		
		JLabel lblNewLabel = new JLabel("Virtual Run Registration");
		lblNewLabel.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 30));
		lblNewLabel.setBounds(347, 30, 317, 44);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int pfee;
				pfee = Integer.parseInt(passfee.getText());
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						name.getText(),
						email.getText(),
						number.getText(),
						pfee,
						
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Partipant Information Update confirmed", "Hope Soup Kitchen",
								JOptionPane.OK_OPTION);
					}
				}
				}
			
		});
		btnNewButton.setBackground(new Color(153, 102, 153));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setBounds(52, 507, 157, 44);
		contentPane.add(btnNewButton);
		
		JButton btnEdit = new JButton("EDIT");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pfee;
				pfee = Integer.parseInt(passfee.getText());
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(name.getText(),i,0);
			    	model.setValueAt(email.getText(),i,1);
			    	model.setValueAt(number.getText(),i,2);
			    	model.setValueAt(pfee,i,3);
			    	
					JOptionPane.showMessageDialog(null, "Update Successfully");
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
			    }
			}
		});
		btnEdit.setForeground(Color.WHITE);
		btnEdit.setBackground(new Color(153, 102, 153));
		btnEdit.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnEdit.setBounds(241, 507, 157, 44);
		contentPane.add(btnEdit);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
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
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnDelete.setBackground(new Color(153, 102, 153));
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setBounds(436, 507, 157, 44);
		contentPane.add(btnDelete);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Hope Soup Kitchen", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setBackground(new Color(153, 102, 153));
		btnExit.setForeground(Color.WHITE);
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnExit.setBounds(799, 507, 157, 44);
		contentPane.add(btnExit);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent O) {
				try {
					table.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No printer found", e.getMessage());
				}
			}
		});
		btnPrint.setForeground(Color.WHITE);
		btnPrint.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnPrint.setBackground(new Color(153, 102, 153));
		btnPrint.setBounds(621, 507, 157, 44);
		contentPane.add(btnPrint);
		
		JButton btnNewButton_1_2_1_1 = new JButton("BACK");
		btnNewButton_1_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminProgramDescription frame = new AdminProgramDescription();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_2_1_1.setForeground(Color.WHITE);
		btnNewButton_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_1_2_1_1.setBackground(new Color(153, 102, 153));
		btnNewButton_1_2_1_1.setBounds(10, 11, 157, 35);
		contentPane.add(btnNewButton_1_2_1_1);
		
		JButton btnNewButton_1_2_1_1_1 = new JButton("HOME");
		btnNewButton_1_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage frame = new Homepage();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_2_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_1_2_1_1_1.setBackground(new Color(153, 102, 153));
		btnNewButton_1_2_1_1_1.setBounds(10, 57, 157, 35);
		contentPane.add(btnNewButton_1_2_1_1_1);
	}
	
}
