package RacialInjusticePage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class Participant extends JFrame {

	private JPanel contentPane;
	private double total;
	private JTextField textFieldParticipate;
	private JTextField name;
	private JTextField age;
	private final ButtonGroup genderGroup = new ButtonGroup();
	private JTextField email;
	private JTextField contactNo;
	private final ButtonGroup malaysian = new ButtonGroup();
	private JTable table;
	private JTextField donateAmount;

	/**
	 * Launch the application.
	 */
	public void setData() {
		try {
			File file = new File("C:\\Users\\lzw_1\\eclipse-workspace\\Project\\src\\RacialInjusticePage\\Participant_RegistrationSystem.txt"); 
			if(!file.exists()) {
				file.createNewFile();
				}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			
			for (int i=0; i<table.getRowCount(); i++) { //rows
				bw.write((i+1) + "  ");
				for (int j=0; j<table.getColumnCount(); j++) { //columns
					bw.write(table.getModel().getValueAt(i, j).toString() + "  ");
					}
				bw.write("\n_______________________________________________________________________________\n");
				}
				bw.close();
				fw.close();
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Participant frame = new Participant(); //create new object
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
	public static String path;
	
	public void my_update(String str) { //method my_update to retrieve str
		textFieldParticipate.setText(str);
	}
	
	public Participant() { //constructor with no argument
		setTitle("RegistrationEvent");  
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("SumWithUsicon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,1184, 664);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelMainMenu = new JPanel();
		panelMainMenu.setBackground(new Color(109,104,117)); //Old Lavender: 6D6875
		panelMainMenu.setBounds(0, 0, 181, 627);
		contentPane.add(panelMainMenu);
		panelMainMenu.setLayout(null);
		
		JLabel lblLogo = new JLabel(); //initialization of JLabel 
		lblLogo.setBounds(37, 10, 105, 95);
		path = "SumWithUsiconFull.png"; //path to the image
		ImageIcon MyImg = new ImageIcon(getClass().getResource(path)); //set the path to the MyImage
		Image i = MyImg.getImage(); //converting ImageIcon into Image
		Image newImage = i.getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_SMOOTH); //then scaling of this image
		ImageIcon Img = new ImageIcon(newImage); //finally set the image to the JLabel.
		panelMainMenu.add(lblLogo);
		lblLogo.setIcon(Img);	
		
		JPanel panel1 = new JPanel();
		panel1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				setColor(panel1);
				panel1.setOpaque(true);
				Login login = new Login();
				login.setVisible(true);
				dispose();
			}
		});
		panel1.setBackground(new Color(109,104,117)); //Old Lavender: 6D6875
		panel1.setBounds(11, 103, 171, 51);
		panelMainMenu.add(panel1);
		panel1.setLayout(null);
		
		JLabel lblHome = new JLabel("Home");
		lblHome.setForeground(Color.BLACK);
		lblHome.setHorizontalAlignment(SwingConstants.CENTER);
		lblHome.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblHome.setBounds(29, 10, 108, 31);
		panel1.add(lblHome);
		
		JPanel panelHighlight1 = new JPanel();
		panelHighlight1.setBounds(0, 103, 10, 52);
		panelHighlight1.setOpaque(false);
		panelMainMenu.add(panelHighlight1);
		
		JPanel panelHighlight2 = new JPanel();
		panelHighlight2.setBounds(0, 154, 10, 52);
		panelMainMenu.add(panelHighlight2);
		
		JPanel panel2 = new JPanel();
		panel2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				setColor(panel2);
				panel2.setOpaque(true);
				SumWithUs s = new SumWithUs();
				s.setVisible(true);
				dispose();
			}
		});
		panel2.setLayout(null);
		panel2.setBackground(new Color(109, 104, 117));
		panel2.setBounds(11, 154, 171, 51);
		panelHighlight2.setOpaque(false);
		panelMainMenu.add(panel2);
		
		JLabel lblOrganization = new JLabel("Organization");
		lblOrganization.setHorizontalAlignment(SwingConstants.CENTER);
		lblOrganization.setForeground(Color.BLACK);
		lblOrganization.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblOrganization.setBounds(29, 10, 115, 31);
		panel2.add(lblOrganization);
		
		JPanel panelHighlight3 = new JPanel();
		panelHighlight3.setBounds(0, 203, 10, 52);
		panelHighlight3.setOpaque(false);
		panelMainMenu.add(panelHighlight3);
		
		JPanel panel3 = new JPanel();
		panel3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				setColor(panel3);
				panel3.setOpaque(true);
				Event e = new Event();
				e.setVisible(true);
				dispose();
			}
		});
		panel3.setLayout(null);
		panel3.setBackground(new Color(109, 104, 117));
		panel3.setBounds(11, 203, 171, 51);
		panelMainMenu.add(panel3);
		
		JLabel lblEvent = new JLabel("Event");
		lblEvent.setHorizontalAlignment(SwingConstants.CENTER);
		lblEvent.setForeground(Color.BLACK);
		lblEvent.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblEvent.setBounds(29, 10, 115, 31);
		panel3.add(lblEvent);
		
		JPanel panelHighlight4 = new JPanel();
		panelHighlight4.setBounds(0, 253, 10, 52);
		panelMainMenu.add(panelHighlight4);
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(null);
		panel4.setBackground(new Color(109, 104, 117));
		panel4.setBounds(11, 253, 171, 51);
		panelMainMenu.add(panel4);
		
		JLabel lblRegistration = new JLabel("Registration");
		lblRegistration.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistration.setForeground(Color.BLACK);
		lblRegistration.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblRegistration.setBounds(29, 10, 115, 31);
		panel4.add(lblRegistration);
		
		JPanel panelRegister = new JPanel();
		panelRegister.setBackground(new Color(255,180,162)); //Melon: FFB4A2
		panelRegister.setBounds(180, 0, 990, 627);
		contentPane.add(panelRegister);
		panelRegister.setLayout(null);
		
		JPanel panelRegistration = new JPanel();
		panelRegistration.setBounds(240, 18, 513, 68);
		panelRegistration.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(204, 102, 153)));
		panelRegistration.setLayout(null);
		panelRegistration.setBackground(new Color(255,180,162)); 
		panelRegister.add(panelRegistration);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(399, 100, 581, 397);
		panelRegister.add(scrollPane);
		
		JPanel panelInfoTable = new JPanel();
		scrollPane.setViewportView(panelInfoTable);
		panelInfoTable.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(204, 102, 153)));
		panelInfoTable.setBackground(new Color(238, 170, 153));
		panelInfoTable.setLayout(null);
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
					setData();
					JOptionPane.showMessageDialog(null, "Data Exported");
			}
		});
		btnUpload.setForeground(new Color(204, 102, 153));
		btnUpload.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnUpload.setBounds(216, 342, 165, 37);
		panelInfoTable.add(btnUpload);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(4, 4, 570, 328);
		panelInfoTable.add(scrollPane_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"EventType", "Name", "Age", "Gender", "Race", "State", "Malaysian", "Email", "Donate Amount", "Contact No"
			}
		));
		scrollPane_1.setViewportView(table);
		
		JLabel lblSumWithUs = new JLabel("REGISTRATION");
		lblSumWithUs.setForeground(new Color(204, 102, 153));
		lblSumWithUs.setHorizontalAlignment(SwingConstants.CENTER);
		lblSumWithUs.setFont(new Font("Algerian", Font.BOLD, 50));
		lblSumWithUs.setBounds(68, 10, 401, 62);
		panelRegistration.add(lblSumWithUs);
		
		JPanel panelRegisterInfo = new JPanel();
		panelRegisterInfo.setLayout(null);
		panelRegisterInfo.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(204, 102, 153)));
		panelRegisterInfo.setBackground(new Color(238, 170, 153));
		panelRegisterInfo.setBounds(10, 98, 379, 507);
		panelRegister.add(panelRegisterInfo);
		
		JLabel lblWelcome = new JLabel("Registration for Event ");
		lblWelcome.setBounds(10, 22, 237, 37);
		panelRegisterInfo.add(lblWelcome);
		lblWelcome.setHorizontalAlignment(SwingConstants.LEFT);
		lblWelcome.setFont(new Font("Sitka Banner", Font.PLAIN, 26));
		
		textFieldParticipate = new JTextField();
		textFieldParticipate.setEditable(false);
		textFieldParticipate.setFont(new Font("Sitka Banner", Font.PLAIN, 20));
		textFieldParticipate.setBounds(241, 26, 102, 30);
		panelRegisterInfo.add(textFieldParticipate);
		textFieldParticipate.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setHorizontalAlignment(SwingConstants.LEFT);
		lblName.setFont(new Font("Sitka Banner", Font.PLAIN, 26));
		lblName.setBounds(10, 65, 108, 37);
		panelRegisterInfo.add(lblName);
		
		name = new JTextField();
		name.setFont(new Font("Sitka Banner", Font.PLAIN, 20));
		name.setBounds(74, 69, 295, 30);
		panelRegisterInfo.add(name);
		name.setColumns(10);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setHorizontalAlignment(SwingConstants.LEFT);
		lblAge.setFont(new Font("Sitka Banner", Font.PLAIN, 26));
		lblAge.setBounds(10, 112, 108, 37);
		panelRegisterInfo.add(lblAge);
		
		age = new JTextField();
		age.setFont(new Font("Sitka Banner", Font.PLAIN, 20));
		age.setColumns(10);
		age.setBounds(74, 116, 85, 30);
		panelRegisterInfo.add(age);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setHorizontalAlignment(SwingConstants.LEFT);
		lblGender.setFont(new Font("Sitka Banner", Font.PLAIN, 26));
		lblGender.setBounds(169, 112, 90, 37);
		panelRegisterInfo.add(lblGender);
		
		JRadioButton genderF = new JRadioButton("F");
		genderGroup.add(genderF);
		genderF.setFont(new Font("Times New Roman", Font.BOLD, 20));
		genderF.setBounds(258, 113, 45, 30);
		panelRegisterInfo.add(genderF);
		
		JRadioButton genderM = new JRadioButton("M");
		genderGroup.add(genderM);
		genderM.setFont(new Font("Times New Roman", Font.BOLD, 20));
		genderM.setBounds(324, 113, 45, 30);
		panelRegisterInfo.add(genderM);
		
		JLabel lblRace = new JLabel("Race");
		lblRace.setHorizontalAlignment(SwingConstants.LEFT);
		lblRace.setFont(new Font("Sitka Banner", Font.PLAIN, 26));
		lblRace.setBounds(10, 156, 108, 37);
		panelRegisterInfo.add(lblRace);
		
		JComboBox race = new JComboBox();
		race.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		race.setModel(new DefaultComboBoxModel(new String[] {"Select race", "Chinese", "Indian", "Malay", "Others"}));
		race.setBounds(65, 159, 94, 29);
		panelRegisterInfo.add(race);
		
		JLabel lblState = new JLabel("State");
		lblState.setHorizontalAlignment(SwingConstants.LEFT);
		lblState.setFont(new Font("Sitka Banner", Font.PLAIN, 26));
		lblState.setBounds(169, 156, 108, 37);
		panelRegisterInfo.add(lblState);
		
		JComboBox state = new JComboBox();
		state.setModel(new DefaultComboBoxModel(new String[] {"Select state", "Johor", "Kedah", "Kelantan", "Melaka", "Negeri Sembilan", "Pahang", "Perak", "Perlis", "Penang", "Selangor", "Terengganu", "Sabah", "Sarawak"}));
		state.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		state.setBounds(227, 159, 138, 29);
		panelRegisterInfo.add(state);
		
		JLabel lblAreYouMalaysian = new JLabel("Are You Malaysian?");
		lblAreYouMalaysian.setHorizontalAlignment(SwingConstants.LEFT);
		lblAreYouMalaysian.setFont(new Font("Sitka Banner", Font.PLAIN, 26));
		lblAreYouMalaysian.setBounds(10, 202, 205, 37);
		panelRegisterInfo.add(lblAreYouMalaysian);
		
		JCheckBox chckbxTrue = new JCheckBox("True");
		malaysian.add(chckbxTrue);
		chckbxTrue.setFont(new Font("Times New Roman", Font.BOLD, 16));
		chckbxTrue.setBounds(227, 203, 64, 33);
		
		panelRegisterInfo.add(chckbxTrue);
		
		JCheckBox chckbxFalse = new JCheckBox("False");
		malaysian.add(chckbxFalse);
		chckbxFalse.setFont(new Font("Times New Roman", Font.BOLD, 16));
		chckbxFalse.setBounds(305, 203, 64, 33);	
		panelRegisterInfo.add(chckbxFalse);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmail.setFont(new Font("Sitka Banner", Font.PLAIN, 26));
		lblEmail.setBounds(10, 249, 108, 37);
		panelRegisterInfo.add(lblEmail);
		
		email = new JTextField();
		email.setFont(new Font("Sitka Banner", Font.PLAIN, 20));
		email.setColumns(10);
		email.setBounds(74, 249, 295, 30);
		panelRegisterInfo.add(email);
		
		JLabel lblContactNo = new JLabel("Contact No");
		lblContactNo.setHorizontalAlignment(SwingConstants.LEFT);
		lblContactNo.setFont(new Font("Sitka Banner", Font.PLAIN, 26));
		lblContactNo.setBounds(10, 296, 123, 37);
		panelRegisterInfo.add(lblContactNo);
		
		contactNo = new JTextField();
		contactNo.setFont(new Font("Sitka Banner", Font.PLAIN, 20));
		contactNo.setColumns(10);
		contactNo.setBounds(128, 296, 241, 30);
		panelRegisterInfo.add(contactNo);
		
		JButton btnDonation = new JButton("Donation");
		btnDonation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
			    // iterate over all columns
			    for (int i = 0 ; i < model.getRowCount()  ; i++) {
			        // null or not Integer will throw exception
			        String s = String.valueOf(model.getValueAt(i, 9));  //Search for the column Donation and collect the all the value
			        total += Double.parseDouble(s); //Sum up the all the value in the column donation when add record finished add
			    }
				String result = String.valueOf(total);
				Donation d = new Donation(); //obj created for class Advertisement() 
				d.setVisible(true); // Open the Advertisement.java window
				/*Finance f = new Finance();//obj created for Finance() 
				f.addDonation(result); //pass the value of the total result of column Donation to the Finance.java window
				f.setVisible(false); //The Finance.java window not view out bcs Finance windows only can view at Admin Interface*/
				dispose(); // Close the Participant.java window	
			}
		});
		btnDonation.setForeground(new Color(204, 102, 153));
		btnDonation.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnDonation.setBounds(10, 408, 355, 37);
		panelRegisterInfo.add(btnDonation);
		
		donateAmount = new JTextField();
		donateAmount.setFont(new Font("Sitka Banner", Font.PLAIN, 20));
		donateAmount.setColumns(10);
		donateAmount.setBounds(241, 351, 129, 30);
		panelRegisterInfo.add(donateAmount);
		
		JLabel lblDonation = new JLabel("Donate Amount: RM");
		lblDonation.setHorizontalAlignment(SwingConstants.LEFT);
		lblDonation.setFont(new Font("Sitka Banner", Font.PLAIN, 26));
		lblDonation.setBounds(10, 347, 220, 37);
		panelRegisterInfo.add(lblDonation);
		
		JButton btnAddRecord = new JButton("Add Record");
		btnAddRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gender = "";
				String malaysianStatus = " ";
				
				if(genderF.isSelected())
					gender = "Female";
				else if (genderM.isSelected())
					gender = "Male";
				
				if(chckbxTrue.isSelected())
					malaysianStatus = "Malaysian";
				else if (chckbxFalse.isSelected())
					malaysianStatus = "Foreigner";
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						textFieldParticipate.getText(),
						name.getText(),
						age.getText(),
						gender,
						race.getSelectedItem(),
						state.getSelectedItem(),
						malaysianStatus,
						email.getText(),
						contactNo.getText(),
						donateAmount.getText(),						
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Partipant Information Update confirmed", "Sum With Us Management System",
								JOptionPane.OK_OPTION);
					}
				} 
			}
		});
		btnAddRecord.setForeground(new Color(204, 102, 153));
		btnAddRecord.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnAddRecord.setBounds(428, 514, 165, 37);
		panelRegister.add(btnAddRecord);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gender = "";
				String malaysianStatus = " ";
				
				if(genderF.isSelected())
					gender = "Female";
				else if (genderM.isSelected())
					gender = "Male";
				
				if(chckbxTrue.isSelected())
					malaysianStatus = "Malaysian";
				else if (chckbxFalse.isSelected())
					malaysianStatus = "Foreigner";
				
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(textFieldParticipate.getText(),i,0);
			    	model.setValueAt(name.getText(),i,1);
			    	model.setValueAt(age.getText(),i,2);
			    	model.setValueAt(gender,i,3);
			    	model.setValueAt(race.getSelectedItem(),i,4);
			    	model.setValueAt(state.getSelectedItem(),i,5);
			    	model.setValueAt(malaysianStatus,i,6);
			    	model.setValueAt(email.getText(),i,7);
			    	model.setValueAt(contactNo.getText(),i,8);
			    	model.setValueAt(donateAmount.getText(),i,9);
					JOptionPane.showMessageDialog(null, "Update Successfully");
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
			    }
			}
		});
		btnUpdate.setForeground(new Color(204, 102, 153));
		btnUpdate.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnUpdate.setBounds(618, 514, 165, 37);
		panelRegister.add(btnUpdate);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldParticipate.setText(null);
				name.setText("");
				age.setText("");
				genderGroup.clearSelection();
				race.setSelectedItem("Select race");
				state.setSelectedItem("Select state");
				malaysian.clearSelection();
				email.setText("");
				contactNo.setText("");
				donateAmount.setText("");
			}
		});
		btnReset.setForeground(new Color(204, 102, 153));
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnReset.setBounds(803, 514, 165, 37);
		panelRegister.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Advertisement ad = new Advertisement(); //obj created for class Advertisement() 
				ad.setVisible(true); // Open the Advertisement.java window
				dispose(); // Close the Participant.java window	
			}
		});
		btnExit.setForeground(new Color(204, 102, 153));
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnExit.setBounds(803, 564, 165, 37);
		panelRegister.add(btnExit);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					table.print();
				} 
				catch (java.awt.print.PrinterException arg0) {
					System.err.format("No printer found", arg0.getMessage());
				}
			}
		});
		btnPrint.setForeground(new Color(204, 102, 153));
		btnPrint.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnPrint.setBounds(618, 564, 165, 37);
		panelRegister.add(btnPrint);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Sum With Us Management System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Sum With Us Management System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setForeground(new Color(204, 102, 153));
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnDelete.setBounds(428, 564, 165, 37);
		panelRegister.add(btnDelete);
	}
	
	private void setColor(JPanel pane) {
		pane.setBackground(new Color(181,131,141)); //English Lavender: B5838D
	}
}
