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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminEvent extends JFrame {

	private JPanel contentPane;
	private static JTable table;
	private JTextField textFieldName;
	private JTextField textFieldLocation;
	private JTextField textFieldDate;
	private JTextField textFieldTime;
	private JTextField textFieldFee;
	DefaultTableModel model1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminEvent frame = new AdminEvent();
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
	public AdminEvent() {
		setTitle("Admin Event ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 888, 594);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 204, 255));
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 204)));
		panel.setBounds(0, 0, 874, 557);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 51, 255)));
		panel_1.setBackground(new Color(153, 204, 255));
		panel_1.setBounds(101, 25, 655, 63);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblEventDesc = new JLabel("Event Description");
		lblEventDesc.setFont(new Font("Rockwell Extra Bold", Font.BOLD | Font.ITALIC, 26));
		lblEventDesc.setBounds(190, 10, 314, 43);
		panel_1.add(lblEventDesc);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 51, 255)));
		panel_1_1.setBackground(new Color(153, 204, 255));
		panel_1_1.setBounds(30, 113, 814, 191);
		panel.add(panel_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 794, 171);
		panel_1_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Visit To Orpahanage", "30 June 2021", "8 a.m.", "Penang Shan Children's Home", "4"},
				{"Seminar: Children Protection", "28 June 2021", "10 a.m.", "Island Plaza Mall", "3"},
			},
			new String[] {
				"Event Name", "Date", "Time", "Location", "Fee"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(162);
		scrollPane.setViewportView(table);
		
		JLabel lblEventName = new JLabel("Event Name");
		lblEventName.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblEventName.setBounds(53, 343, 125, 34);
		panel.add(lblEventName);
		
		JLabel lblLocation = new JLabel("Location");
		lblLocation.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblLocation.setBounds(53, 387, 125, 34);
		panel.add(lblLocation);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblDate.setBounds(53, 431, 125, 34);
		panel.add(lblDate);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblTime.setBounds(518, 343, 125, 34);
		panel.add(lblTime);
		
		JLabel lblFee = new JLabel("Fee");
		lblFee.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblFee.setBounds(518, 387, 125, 34);
		panel.add(lblFee);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(172, 343, 318, 34);
		panel.add(textFieldName);
		textFieldName.setColumns(10);
		
		textFieldLocation = new JTextField();
		textFieldLocation.setColumns(10);
		textFieldLocation.setBounds(172, 387, 318, 34);
		panel.add(textFieldLocation);
		
		textFieldDate = new JTextField();
		textFieldDate.setColumns(10);
		textFieldDate.setBounds(172, 431, 318, 34);
		panel.add(textFieldDate);
		
		textFieldTime = new JTextField();
		textFieldTime.setColumns(10);
		textFieldTime.setBounds(637, 343, 185, 34);
		panel.add(textFieldTime);
		
		textFieldFee = new JTextField();
		textFieldFee.setColumns(10);
		textFieldFee.setBounds(637, 391, 185, 34);
		panel.add(textFieldFee);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					EventDescription frame = new EventDescription(); 
					frame.setVisible(true);
					dispose();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnConfirm.setBackground(new Color(204, 204, 255));
		btnConfirm.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
		btnConfirm.setBounds(53, 491, 145, 34);
		panel.add(btnConfirm);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model1 = (DefaultTableModel) table.getModel();
				model1.addRow(new Object[] {
						textFieldName.getText(),
						textFieldLocation.getText(),
						textFieldDate.getText(),
						textFieldTime.getText(),
						textFieldFee.getText(),
				});
				if (table.getSelectedRow() == -1) {
					if(table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Event Update confirmed", "Event Management System", JOptionPane.OK_OPTION);
					}
				}
			}
		});
		btnAdd.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
		btnAdd.setBackground(new Color(204, 204, 255));
		btnAdd.setBounds(227, 491, 114, 34);
		panel.add(btnAdd);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldName.setText("");
				textFieldLocation.setText("");
				textFieldDate.setText("");
				textFieldTime.setText("");
				textFieldFee.setText("");
			}
		});
		btnReset.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
		btnReset.setBackground(new Color(204, 204, 255));
		btnReset.setBounds(374, 491, 114, 34);
		panel.add(btnReset);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model1 = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Event Management System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Event Management System", JOptionPane.OK_OPTION);
					}
				}else {
					model1.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
		btnDelete.setBackground(new Color(204, 204, 255));
		btnDelete.setBounds(518, 491, 125, 34);
		panel.add(btnDelete);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminPage frame = new AdminPage();
				frame.setVisible(true);
				dispose();
			}
		});
		btnBack.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
		btnBack.setBackground(new Color(204, 204, 255));
		btnBack.setBounds(744, 502, 107, 34);
		panel.add(btnBack);
	}
	
	public static JTable getTable() {
		return table;
	}

}
