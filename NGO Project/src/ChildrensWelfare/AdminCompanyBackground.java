package ChildrensWelfare;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminCompanyBackground extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldName;
	private JTextField textFieldAddress;
	private JTextField textFieldContactNo;
	private JTextField textFieldWebsite;
	private static JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminCompanyBackground frame = new AdminCompanyBackground();
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
	public AdminCompanyBackground() {
		setTitle("Admin Company Background");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 949, 667);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 204, 255));
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 204)));
		panel.setBounds(0, 0, 935, 630);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 51, 255)));
		panel_1.setBackground(new Color(153, 204, 255));
		panel_1.setBounds(111, 29, 713, 76);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("COMPANY BACKGROUND");
		lblNewLabel.setFont(new Font("Rockwell Extra Bold", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel.setBounds(148, 10, 424, 56);
		panel_1.add(lblNewLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 51, 255)));
		panel_1_1.setBackground(new Color(153, 204, 255));
		panel_1_1.setBounds(57, 130, 821, 426);
		panel.add(panel_1_1);
		
		JLabel lblName = new JLabel("Organization Name: ");
		lblName.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 16));
		lblName.setBounds(10, 21, 206, 39);
		panel_1_1.add(lblName);
		
		JLabel lblAddress = new JLabel("Address: ");
		lblAddress.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 16));
		lblAddress.setBounds(10, 80, 206, 39);
		panel_1_1.add(lblAddress);
		
		JLabel lblContactNumber = new JLabel("Contact Number: ");
		lblContactNumber.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 16));
		lblContactNumber.setBounds(10, 136, 206, 39);
		panel_1_1.add(lblContactNumber);
		
		JLabel lblWebsite = new JLabel("Website: ");
		lblWebsite.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 16));
		lblWebsite.setBounds(10, 195, 206, 39);
		panel_1_1.add(lblWebsite);
		
		textFieldName = new JTextField();
		textFieldName.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 16));
		textFieldName.setBounds(226, 21, 365, 39);
		panel_1_1.add(textFieldName);
		textFieldName.setColumns(10);
		
		textFieldAddress = new JTextField();
		textFieldAddress.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 16));
		textFieldAddress.setColumns(10);
		textFieldAddress.setBounds(226, 80, 365, 39);
		panel_1_1.add(textFieldAddress);
		
		textFieldContactNo = new JTextField();
		textFieldContactNo.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 16));
		textFieldContactNo.setColumns(10);
		textFieldContactNo.setBounds(226, 136, 365, 39);
		panel_1_1.add(textFieldContactNo);
		
		textFieldWebsite = new JTextField();
		textFieldWebsite.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 16));
		textFieldWebsite.setColumns(10);
		textFieldWebsite.setBounds(226, 195, 365, 39);
		panel_1_1.add(textFieldWebsite);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					model.addRow(new Object[] {
							textFieldName.getText(),
							textFieldAddress.getText(),
							textFieldContactNo.getText(),
							textFieldWebsite.getText(),
					});
					if(table.getSelectedRow() == -1) {
						if(table.getRowCount() == 0) {
							JOptionPane.showMessageDialog(null, "Event Description Update confirmed", "Advertisement", JOptionPane.OK_OPTION);
						}
					}
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the right Username and Password!", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnConfirm.setBackground(new Color(204, 204, 204));
		btnConfirm.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 22));
		btnConfirm.setBounds(620, 251, 150, 39);
		panel_1_1.add(btnConfirm);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 323, 801, 79);
		panel_1_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Organization Name", "Address", "Contact No.", "Website"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminPage frame = new AdminPage();
				frame.setVisible(true);
				dispose();
			}
		});
		btnBack.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 22));
		btnBack.setBackground(new Color(204, 204, 204));
		btnBack.setBounds(759, 566, 150, 39);
		panel.add(btnBack);
	}
	
	public static void AddRowToJtable(Object[] dataRow) {
		DefaultTableModel model = (DefaultTableModel)getTable().getModel();
		model.addRow(dataRow);
	}

	public static JTable getTable() {
		return table;
	}
	
	public static void setTable(JTable table) {
		AdminCompanyBackground.table = table;
	}
}
