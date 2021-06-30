package Cancer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class ParticipantRegistration extends JFrame {
	private JPanel contentPane;
	private JTextField NameField;
	private JTextField EmailField;
	private JTextField PhoneField;
	private static JTable table;
	protected JFrame frame;
	private JTextField FeeField;




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
	
	/**
	 * Create the frame.
	 */
	public ParticipantRegistration() {
		setTitle("ParticpantRegistration");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 619);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(10, 21, 108, 10);
		contentPane.add(panel);
		
		JLabel ParticipanRegLabel = new JLabel("Participant Registration");
		ParticipanRegLabel.setFont(new Font("TypeWrong", Font.BOLD, 23));
		ParticipanRegLabel.setHorizontalAlignment(SwingConstants.CENTER);
		ParticipanRegLabel.setBounds(118, 0, 415, 56);
		contentPane.add(ParticipanRegLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 153, 153));
		panel_1.setBounds(10, 42, 629, 289);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Please enter the required informations in order to join the event.");
		lblNewLabel.setBounds(0, 0, 629, 25);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		panel_1.add(lblNewLabel);
		
		JLabel NameLabel = new JLabel("Name :");
		NameLabel.setBounds(10, 33, 115, 35);
		NameLabel.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		panel_1.add(NameLabel);
		
		JLabel GenderLabel = new JLabel("Gender :");
		GenderLabel.setBounds(10, 154, 66, 25);
		GenderLabel.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		panel_1.add(GenderLabel);
		
		JLabel EmailLabel = new JLabel("Email :");
		EmailLabel.setBounds(10, 79, 115, 25);
		EmailLabel.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		panel_1.add(EmailLabel);
		
		JLabel PhoneLabel = new JLabel("Phone :");
		PhoneLabel.setBounds(10, 112, 123, 35);
		PhoneLabel.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		panel_1.add(PhoneLabel);
		
		NameField = new JTextField();
		NameField.setHorizontalAlignment(SwingConstants.CENTER);
		NameField.setBounds(71, 36, 232, 32);
		NameField.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 23));
		panel_1.add(NameField);
		NameField.setColumns(10);
		
		EmailField = new JTextField();
		EmailField.setHorizontalAlignment(SwingConstants.CENTER);
		EmailField.setBounds(71, 75, 232, 32);
		EmailField.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 23));
		EmailField.setColumns(10);
		panel_1.add(EmailField);
		
		PhoneField = new JTextField();
		PhoneField.setHorizontalAlignment(SwingConstants.CENTER);
		PhoneField.setBounds(71, 115, 232, 32);
		PhoneField.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		PhoneField.setColumns(10);
		panel_1.add(PhoneField);
		
		JLabel Event = new JLabel("Event :");
		Event.setBounds(10, 192, 66, 25);
		Event.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		panel_1.add(Event);
		
		JComboBox GenderCombo = new JComboBox();
		GenderCombo.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 23));
		GenderCombo.setModel(new DefaultComboBoxModel(new String[] {"Select Gender", "Male", "Female"}));
		GenderCombo.setBounds(71, 151, 232, 35);
		panel_1.add(GenderCombo);
		
		JComboBox EventCombo = new JComboBox();
		EventCombo.setModel(new DefaultComboBoxModel(new String[] {"Select Event", "Pink Ribbon Charity Dinner", "Run For Pink Ribbon", "Let's Fight The Breast Cancer Together"}));
		EventCombo.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 23));
		EventCombo.setBounds(71, 190, 232, 35);
		panel_1.add(EventCombo);
		
		JButton AddRecordButton = new JButton("Add Record");
		AddRecordButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				model.addRow(new Object[] {
						NameField.getText(),
						EmailField.getText(),
						PhoneField.getText(),
						GenderCombo.getSelectedItem(),
						EventCombo.getSelectedItem(),
						FeeField.getText(),
						
				});
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "All the datas have been added", "Cahaya Cancer Association Management",
								JOptionPane.OK_OPTION);
					
					}
				}

			}
		});
		AddRecordButton.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		AddRecordButton.setBackground(new Color(255, 102, 102));
		AddRecordButton.setBounds(470, 55, 115, 32);
		panel_1.add(AddRecordButton);
		
		JButton ResetButton = new JButton("Reset");
		ResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NameField.setText(" ");
				EmailField.setText(" ");
				PhoneField.setText(" ");
				GenderCombo.setSelectedItem("Make a selection");
				EventCombo.setSelectedItem("Make a selection");
				FeeField.setText(" ");
			}
		});
		ResetButton.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		ResetButton.setBackground(new Color(255, 102, 102));
		ResetButton.setBounds(470, 98, 115, 32);
		panel_1.add(ResetButton);
		
		JButton ExitButton = new JButton("Exit");
		ExitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Cahaya Cancer Association Financial Statement", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		ExitButton.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		ExitButton.setBackground(new Color(255, 102, 102));
		ExitButton.setBounds(470, 150, 115, 32);
		panel_1.add(ExitButton);
		
		FeeField = new JTextField();
		FeeField.setHorizontalAlignment(SwingConstants.CENTER);
		FeeField.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		FeeField.setColumns(10);
		FeeField.setBounds(71, 235, 232, 32);
		panel_1.add(FeeField);
		
		JLabel lblFeerm = new JLabel("Fee :");
		lblFeerm.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		lblFeerm.setBounds(10, 240, 66, 25);
		panel_1.add(lblFeerm);
		
		JLabel lblNewLabel_2 = new JLabel("Please enter 50");
		lblNewLabel_2.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 19));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(71, 274, 232, 15);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLACK);
		panel_2.setBounds(531, 21, 108, 10);
		contentPane.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 204, 204));
		panel_3.setBounds(10, 335, 375, 220);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 355, 142);
		panel_3.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
			},
			new String[] {
				"Name", "Email", "Phone", "Gender", "Event", "Fee"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton UpdateButton = new JButton("Update");
		UpdateButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(NameField.getText(),i,0);
			    	model.setValueAt(EmailField.getText(),i,1);
			    	model.setValueAt(PhoneField.getText(),i,2);
			    	model.setValueAt(GenderCombo.getSelectedItem(),i,3);
			    	model.setValueAt(EventCombo.getSelectedItem(),i,4);
			    	model.setValueAt(FeeField.getText(),i,5);

			    	
			  
					JOptionPane.showMessageDialog(null, "The data have been updated!");
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
			    }
			}
		});
		UpdateButton.setBounds(10, 171, 115, 32);
		panel_3.add(UpdateButton);
		UpdateButton.setBackground(new Color(255, 102, 102));
		UpdateButton.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		
		JButton UploadButton = new JButton("Upload");
		UploadButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					try {
						
					File file = new File("C:\\Users\\lzw_1\\eclipse-workspace\\Project\\src\\Cancer\\ParticipantRegistration.txt");
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
		UploadButton.setBounds(135, 171, 115, 32);
		panel_3.add(UploadButton);
		UploadButton.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		UploadButton.setBackground(new Color(255, 102, 102));
		
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
		DeleteButton.setBounds(260, 171, 105, 32);
		panel_3.add(DeleteButton);
		DeleteButton.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		DeleteButton.setBackground(new Color(255, 102, 102));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 245, 238));
		panel_4.setBounds(388, 335, 251, 220);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel ThankyouLabel = new JLabel("Our team'll contact you for the");
		ThankyouLabel.setHorizontalAlignment(SwingConstants.CENTER);
		ThankyouLabel.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		ThankyouLabel.setBounds(0, 2, 251, 40);
		panel_4.add(ThankyouLabel);
		
		JLabel Label = new JLabel("Hope You Enjoy The Program.");
		Label.setHorizontalAlignment(SwingConstants.CENTER);
		Label.setFont(new Font("Pristina", Font.BOLD, 20));
		Label.setBounds(0, 75, 251, 33);
		panel_4.add(Label);
		
		JLabel lblSeeYouSoon = new JLabel("-Cahaya Cancer Association-");
		lblSeeYouSoon.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSeeYouSoon.setFont(new Font("Rage Italic", Font.PLAIN, 20));
		lblSeeYouSoon.setBounds(10, 180, 241, 40);
		panel_4.add(lblSeeYouSoon);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(ParticipantRegistration.class.getResource("heart-face-9-icon.png")));
		lblNewLabel_1.setBounds(106, 136, 48, 40);
		panel_4.add(lblNewLabel_1);
		
		JLabel lblSeeYouSoon_1 = new JLabel("See You Soon!");
		lblSeeYouSoon_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeeYouSoon_1.setFont(new Font("Pristina", Font.BOLD, 20));
		lblSeeYouSoon_1.setBounds(0, 109, 251, 40);
		panel_4.add(lblSeeYouSoon_1);
		
		JLabel ThankyouLabel_1 = new JLabel("Thankyou For Joining Us, Dear!");
		ThankyouLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		ThankyouLabel_1.setFont(new Font("Pristina", Font.BOLD, 20));
		ThankyouLabel_1.setBounds(0, 53, 251, 40);
		panel_4.add(ThankyouLabel_1);
		
		JLabel lblConfirmation = new JLabel("confirmation.");
		lblConfirmation.setHorizontalAlignment(SwingConstants.CENTER);
		lblConfirmation.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		lblConfirmation.setBounds(0, 16, 251, 40);
		panel_4.add(lblConfirmation);
	}
}
