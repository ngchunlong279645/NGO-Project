package SoupKitchen;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class DonatingSet extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTable table;
	private JTextField numberField;
	private final ButtonGroup sessionbuttonGroup = new ButtonGroup();
	private JTextField nameField;
	private JTextField emailField;
	private JTextField paxField;
	private JLabel breakfast;
	private JLabel lunch;
	private JLabel dinner;
	private String paymentMethod = " ";
	private double total;
	
	
	
	
	private final ButtonGroup paymentbuttonGroup = new ButtonGroup();
	private JTextField textField;
	private JLabel tax;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DonatingSet frame = new DonatingSet();
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
	
	public void updatePrice(String bf, String lch, String dn) { //get value
		breakfast.setText(bf);
		lunch.setText(lch);
		dinner.setText(dn);
	}
	
	
	
	
	public DonatingSet() {
		setTitle("Donating Set Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1030, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(216, 191, 216));
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 102, 153)));
		panel.setBounds(0, 0, 1016, 593);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_tittle = new JPanel();
		panel_tittle.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 102, 153)));
		panel_tittle.setBackground(new Color(216, 191, 216));
		panel_tittle.setBounds(393, 33, 271, 56);
		panel.add(panel_tittle);
		panel_tittle.setLayout(null);
		
		JLabel tittleLabel = new JLabel("DONATION by SET");
		tittleLabel.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 28));
		tittleLabel.setBounds(24, 11, 225, 36);
		panel_tittle.add(tittleLabel);
		
		JPanel panel_table = new JPanel();
		panel_table.setLayout(null);
		panel_table.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 102, 153)));
		panel_table.setBackground(new Color(216, 191, 216));
		panel_table.setBounds(429, 223, 528, 238);
		panel.add(panel_table);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 508, 171);
		panel_table.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Email", "Session", "Pax", "Total (RM)"
			}	
		));
		scrollPane.setViewportView(table);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\lzw_1\\eclipse-workspace\\Project\\src\\SoupKitchen\\Donation Set Menu.txt");
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
		btnUpload.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnUpload.setBounds(10, 193, 110, 34);
		panel_table.add(btnUpload);

		
		JPanel panel_menu = new JPanel();
		panel_menu.setLayout(null);
		panel_menu.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 102, 153)));
		panel_menu.setBackground(new Color(216, 191, 216));
		panel_menu.setBounds(429, 111, 528, 86);
		panel.add(panel_menu);
		
		JTextArea txtrMenu = new JTextArea();
		txtrMenu.setEditable(false);
		txtrMenu.setFont(new Font("Monospaced", Font.BOLD, 14));
		txtrMenu.setBackground(new Color(216, 191, 216));
		txtrMenu.setText("Breakfast : Bihun goreng - 1 pax : RM \r\nLunch : Nasi putih + ikan + sayur - 1 pax : RM\r\nDinner : Nasi goreng kampung - 1 pax : RM");
		txtrMenu.setBounds(10, 11, 404, 64);
		panel_menu.add(txtrMenu);
		
		breakfast = new JLabel("");
		breakfast.setBounds(424, 11, 49, 14);
		panel_menu.add(breakfast);
		
		lunch = new JLabel("");
		lunch.setBounds(424, 32, 49, 18);
		panel_menu.add(lunch);
		
		dinner = new JLabel("");
		dinner.setBounds(424, 61, 49, 14);
		panel_menu.add(dinner);
		
		JPanel panel_inputinfo = new JPanel();
		panel_inputinfo.setLayout(null);
		panel_inputinfo.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 102, 153)));
		panel_inputinfo.setBackground(new Color(216, 191, 216));
		panel_inputinfo.setBounds(20, 110, 376, 351);
		panel.add(panel_inputinfo);
		
		JLabel nameLabel = new JLabel("Name:");
		nameLabel.setBounds(10, 11, 70, 30);
		panel_inputinfo.add(nameLabel);
		nameLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JLabel emailLabel = new JLabel("Email:");
		emailLabel.setBounds(10, 52, 70, 30);
		panel_inputinfo.add(emailLabel);
		emailLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JLabel contactNumberLabel = new JLabel("Contact number:");
		contactNumberLabel.setBounds(10, 93, 130, 44);
		panel_inputinfo.add(contactNumberLabel);
		contactNumberLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel sessionLabel = new JLabel("Session:");
		sessionLabel.setBounds(10, 148, 101, 30);
		panel_inputinfo.add(sessionLabel);
		sessionLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JLabel paxLabel = new JLabel("Pax:");
		paxLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		paxLabel.setBounds(10, 270, 40, 30);
		panel_inputinfo.add(paxLabel);
		
		JLabel paymentMethodLabel = new JLabel("Payment method:");
		paymentMethodLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		paymentMethodLabel.setBounds(10, 305, 137, 30);
		panel_inputinfo.add(paymentMethodLabel);
		
		JRadioButton rdbtnBreakfast = new JRadioButton("Breakfast");
		rdbtnBreakfast.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnBreakfast.setBounds(83, 155, 111, 23);
		panel_inputinfo.add(rdbtnBreakfast);
		sessionbuttonGroup.add(rdbtnBreakfast);
		
		JRadioButton rdbtnLunch = new JRadioButton("Lunch");
		rdbtnLunch.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnLunch.setBounds(83, 196, 111, 23);
		panel_inputinfo.add(rdbtnLunch);
		sessionbuttonGroup.add(rdbtnLunch);
		
		JRadioButton rdbtnDinner = new JRadioButton("Dinner");
		rdbtnDinner.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnDinner.setBounds(83, 239, 111, 23);
		panel_inputinfo.add(rdbtnDinner);
		sessionbuttonGroup.add(rdbtnDinner);
		
		numberField = new JTextField();
		numberField.setBounds(148, 101, 202, 33);
		panel_inputinfo.add(numberField);
		numberField.setColumns(10);
		
		nameField = new JTextField();
		nameField.setColumns(10);
		nameField.setBounds(148, 11, 202, 33);
		panel_inputinfo.add(nameField);
		
		emailField = new JTextField();
		emailField.setColumns(10);
		emailField.setBounds(148, 52, 202, 33);
		panel_inputinfo.add(emailField);
		
		paxField = new JTextField();
		paxField.setColumns(10);
		paxField.setBounds(83, 277, 111, 22);
		panel_inputinfo.add(paxField);
		
		
		
		JPanel panel_button = new JPanel();
		panel_button.setLayout(null);
		panel_button.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 102, 153)));
		panel_button.setBackground(new Color(216, 191, 216));
		panel_button.setBounds(20, 486, 937, 56);
		panel.add(panel_button);
		
		JButton btnOrder = new JButton("DONATE");
		btnOrder.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String session = " ";
				String priceS = " ";
				
				double priceBreakfast = Double.parseDouble(breakfast.getText());//get value from other frame
				double priceLunch = Double.parseDouble(lunch.getText());
				double priceDinner = Double.parseDouble(dinner.getText());
								
				if (rdbtnBreakfast.isSelected()) {
					session = rdbtnBreakfast.getText();
					priceS = Double. toString(priceBreakfast); //convert double into String
				} 
				else if (rdbtnLunch.isSelected()) {
					session = rdbtnLunch.getText();
					priceS = Double. toString(priceLunch);
				}
				else {
					session = rdbtnDinner.getText();
					priceS = Double. toString(priceDinner);
				}
				
				int pax;
				pax = Integer.parseInt(paxField.getText());
				
				double totalPrice = Double.parseDouble(priceS) * pax; //convert String to double
				String totalPriceStr = Double. toString(totalPrice);
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						nameField.getText(),
						emailField.getText(),
						session,
						pax,
						totalPriceStr,
												
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Donater Information Update confirmed", "Hope Soup Kitchen",
								JOptionPane.OK_OPTION);
					}
				}
			}
		});
		btnOrder.setBounds(10, 11, 110, 34);
		panel_button.add(btnOrder);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"- choose payment method -", "Online banking", "Credit/Debit card"}));
		comboBox.setBounds(157, 312, 193, 22);
		panel_inputinfo.add(comboBox);
		
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Donating", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setBounds(817, 11, 110, 34);
		panel_button.add(btnExit);
		
		JButton btnTotal = new JButton("TOTAL");
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(comboBox.equals("Online banking")) {
					paymentMethod = "Online banking";
				}
				else{
					paymentMethod = "Credit/card";
				}
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
			    // iterate over all columns
			    for (int i = 0 ; i < model.getRowCount()  ; i++) {
			        // null or not Integer will throw exception
			        String s = String.valueOf(model.getValueAt(i, 4));
			        total += Double.parseDouble(s);
			    }
			    
			    textField = new JTextField();
				textField.setEditable(false);
				textField.setBounds(414, 20, 96, 20);
				panel_button.add(textField);
				textField.setColumns(10);
				String result = String.valueOf(total);
				textField.setText(result);
				String t = textField.getText();
				FinanceAdmin f = new FinanceAdmin();//pass value to finance
				f.addDonation(t);
				f.setVisible(true);
				dispose();
				
			}
		});
		btnTotal.setBounds(287, 11, 110, 34);
		panel_button.add(btnTotal);
		
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
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDelete.setBounds(149, 11, 110, 34);
		panel_button.add(btnDelete);
		
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
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPrint.setBounds(697, 11, 110, 34);
		panel_button.add(btnPrint);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AdminMenuSetPrice frame = new AdminMenuSetPrice();
				frame.setVisible(true);
				dispose();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnBack.setBounds(20, 11, 110, 34);
		panel.add(btnBack);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage frame = new Homepage();
				frame.setVisible(true);
				dispose();
			}
		});
		btnHome.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnHome.setBounds(20, 55, 110, 34);
		panel.add(btnHome);
		
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
