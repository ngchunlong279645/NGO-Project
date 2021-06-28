package RacialInjusticePage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;

public class Admin extends JFrame {

	private JPanel contentPane;
	private JTextPane editAd;
	private JTextPane editAboutUs;
	private JTextField setAdExpenses;
	private JTextField setExtraExpenses;
	private JTextField setSponsor;
	private JTextField txt_filename;
	private JLabel lblAdminProfile;
	/**
	 * Launch the application.
	 */
	public void setData() {
		File file = new File("D:\\LeeJieHui279096\\STIA1123_Programming_A202(I)\\Assignment3\\GUI_NGO Racial Injusctice\\TextFileAss3\\Admin_UpdateDescription\\EvtInfo.txt");
		try {
		if(!file.exists()) {
			file.createNewFile();
		}
		BufferedReader br = new BufferedReader(new FileReader(file));
		Object[] Lines = br.lines().toArray();
		int i =0;
		int id = 0;
		for (i=0; i< Lines.length; i++) {
			String Line = Lines[i].toString().trim();
			String [] Row = Line.split(" |  ");
			id = Integer.parseInt(Row[0]);
		}
		int userId = id + 1;
		FileWriter fw = new FileWriter(file,true);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		pw.println(userId + " |  "+ setEventName.getText() + " |  " + setEventDate.getText()+" |  "+ setEventTime.getText() + " |  " + setLocation.getText()+" |  "+ setEventFees.getText());
		pw.flush();
		pw.close();
		bw.close();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
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
	private JTextField setEventName;
	private JTextField setEventDate;
	private JTextField setEventTime;
	private JTextField setLocation;
	private JTextField setEventFees;
	
	public Admin() {
		setTitle("Admin");  
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1029, 664);
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
		path = ""; //path to the image
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
		panelHighlight2.setOpaque(false);
		panelMainMenu.add(panelHighlight2);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBackground(new Color(109, 104, 117));
		panel2.setBounds(11, 154, 171, 51);
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
				e.setVisible(true);  //Open the Event.java window
				dispose();  //Close the Finance.java window
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
		panelHighlight4.setOpaque(false);
		panelMainMenu.add(panelHighlight4);
		
		JPanel panel4 = new JPanel();
		panel4.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				setColor(panel4);
				panel4.setOpaque(true);
				Admin a = new Admin();
				a.setVisible(true); //Open the Admin.java window (Editable All description and Settings)
				dispose(); //Close the Finance.java window
			}
		});
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
		
		JPanel panel5 = new JPanel();
		panel5.setLayout(null);
		panel5.setBackground(new Color(109, 104, 117));
		panel5.setBounds(11, 303, 171, 51);
		panelMainMenu.add(panel5);
		
		JLabel lblSettings = new JLabel("Settings");
		lblSettings.setHorizontalAlignment(SwingConstants.CENTER);
		lblSettings.setForeground(Color.BLACK);
		lblSettings.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblSettings.setBounds(29, 10, 115, 31);
		panel5.add(lblSettings);
		
		JPanel panelHighlight5 = new JPanel();
		panelHighlight5.setBounds(0, 303, 10, 52);
		panelMainMenu.add(panelHighlight5);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(180, 0, 835, 627);
		contentPane.add(scrollPane);
		
		JPanel panelAdminSettings = new JPanel();
		scrollPane.setViewportView(panelAdminSettings);
		panelAdminSettings.setBackground(new Color(255,180,162));
		panelAdminSettings.setLayout(null);
		
		JPanel panelFinance = new JPanel();
		panelFinance.setBounds(165, 20, 513, 68);
		panelFinance.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(204, 102, 153)));
		panelFinance.setLayout(null);
		panelFinance.setBackground(new Color(255,180,162)); 
		panelAdminSettings.add(panelFinance);
		
		JLabel lblSumWithUs = new JLabel("ADMIN");
		lblSumWithUs.setForeground(new Color(204, 102, 153));
		lblSumWithUs.setHorizontalAlignment(SwingConstants.CENTER);
		lblSumWithUs.setFont(new Font("Algerian", Font.BOLD, 50));
		lblSumWithUs.setBounds(99, 10, 320, 62);
		panelFinance.add(lblSumWithUs);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(508, 375, 265, 170);
		panelAdminSettings.add(scrollPane_1);
		
		JTextPane editAd = new JTextPane();
		editAd.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		scrollPane_1.setViewportView(editAd);
		editAd.setText(" Hi, there! Our community is going to organize a LUCKY DRAW in our coming soon event!\r\nHow to join it? Follow these 3 steps:\r\nStep 1: Go to our webpage done the registration & donation and join our event!\r\nStep 2: Like & share out this event post in public condition\r\nStep 3: Tag 5 friends and invite them join together.\r\nWe will welcome to anyone join with us! Let's raise the awareness about racial injustice and prohibit it.");
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(22, 140, 343, 168);
		panelAdminSettings.add(scrollPane_2);
		
		JTextPane editAboutUs_1 = new JTextPane();
		editAboutUs_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		scrollPane_2.setViewportView(editAboutUs_1);
		editAboutUs_1.setText(" About Us    : Sum With Us congregations use their financial resources to invest in programs and initiatives that build better relationship between different race in community and alleviation of discrimination.They help to avoid the perpetuate racial injustice.  \r\n\r\nOur Mission : The coummunity stands up for prohibition of racial injustice and fair.      \r\nContact No  : 04-981 4652      \r\nLocation    : Sum With Us-NGO, Jalan Ru 1, Changlun, 06050 Bukit Kayu Hitam.");
		
		JButton btnNewButton = new JButton("Update");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String adminEditAd= editAd.getText();//read the JTextField EventType data
				Advertisement ad = new Advertisement(); //obj created for class Advertisement() 
				//ad.admin_update(adminEditAd); // Execute the method admin_update to pass adminEdit
				ad.setVisible(false);
				JOptionPane.showMessageDialog(null, "Update Successfully");
			}
		});
		btnNewButton.setBounds(663, 555, 110, 38);
		panelAdminSettings.add(btnNewButton);
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("D:\\LeeJieHui279096\\STIA1123_Programming_A202(I)\\Assignment3\\GUI_NGO Racial Injusctice\\TextFileAss3\\Admin_UpdateDescription\\AboutUs.txt");
					if(!file.exists()) {
						file.createNewFile();
						}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
						bw.write(editAboutUs_1.getText() + "  ");
						bw.write("\n________\n");
						bw.close();
						fw.close();
						JOptionPane.showMessageDialog(null, "Data Exported");
					}
					catch(Exception ex) {
						ex.printStackTrace();
					}
				try {
					File file = new File("D:\\LeeJieHui279096\\STIA1123_Programming_A202(I)\\Assignment3\\GUI_NGO Racial Injusctice\\TextFileAss3\\Admin_UpdateDescription\\AdvertisementDescription.txt");
					if(!file.exists()) {
						file.createNewFile();
						}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
						bw.write(editAd.getText() + "  ");
						bw.write("\n________\n");
						bw.close();
						fw.close();
						JOptionPane.showMessageDialog(null, "Data Exported");
					}
					catch(Exception ex) {
						ex.printStackTrace();
					}
			}
		});
		btnUpload.setBounds(518, 555, 110, 38);
		panelAdminSettings.add(btnUpload);
		
		JLabel lbEditAd = new JLabel("Edit Advertisement Description");
		lbEditAd.setHorizontalAlignment(SwingConstants.CENTER);
		lbEditAd.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lbEditAd.setBounds(508, 342, 265, 23);
		panelAdminSettings.add(lbEditAd);
		
		JLabel lblEditAboutUs = new JLabel("Edit About Us");
		lblEditAboutUs.setHorizontalAlignment(SwingConstants.CENTER);
		lblEditAboutUs.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblEditAboutUs.setBounds(22, 107, 265, 23);
		panelAdminSettings.add(lblEditAboutUs);
		
		JLabel lblEditEventDescription = new JLabel("Edit Event Description");
		lblEditEventDescription.setHorizontalAlignment(SwingConstants.CENTER);
		lblEditEventDescription.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblEditEventDescription.setBounds(211, 335, 265, 23);
		panelAdminSettings.add(lblEditEventDescription);
		
		JLabel lblEditFinance = new JLabel("Edit Finance");
		lblEditFinance.setHorizontalAlignment(SwingConstants.CENTER);
		lblEditFinance.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblEditFinance.setBounds(487, 102, 265, 23);
		panelAdminSettings.add(lblEditFinance);
		
		JLabel lblSetAdExpenses = new JLabel("Set Ad Expenses    : RM");
		lblSetAdExpenses.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblSetAdExpenses.setBounds(407, 143, 199, 23);
		panelAdminSettings.add(lblSetAdExpenses);
		
		JButton btnSeeFinance = new JButton("See Finance");
		btnSeeFinance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double adFees = Double.parseDouble(setAdExpenses.getText());  //read the JTextField setAdExpenses data and convert String to double
			    String adFeesTxt = Double.toString(adFees); //convert the double back to the String
				
			    double extraFees = Double.parseDouble(setExtraExpenses.getText());  //read the JTextField setExtraExpenses data and convert String to double
			    String extraFeesTxt = Double.toString(extraFees); //convert the double back to the String
			    
			    double sponsor = Double.parseDouble(setSponsor.getText());  //read the JTextField setExtraExpenses data and convert String to double
			    String sponsorTxt = Double.toString(sponsor); //convert the double back to the String
				
				Finance f = new Finance(); //obj created for class Finance()
				f.admin_update(adFeesTxt, extraFeesTxt,sponsorTxt); // Execute the method my_update to pass str		
				
				f.setVisible(true);  //Open the Finance.java window
				dispose();  //Close the Admin.java window
			}
		});
		btnSeeFinance.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnSeeFinance.setBounds(581, 275, 137, 38);
		panelAdminSettings.add(btnSeeFinance);
		
		setAdExpenses = new JTextField();
		setAdExpenses.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		setAdExpenses.setBounds(616, 140, 141, 30);
		panelAdminSettings.add(setAdExpenses);
		setAdExpenses.setColumns(10);
		
		JLabel lblSetExtraExpenses = new JLabel("Set Extra Expenses: RM");
		lblSetExtraExpenses.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblSetExtraExpenses.setBounds(407, 183, 199, 23);
		panelAdminSettings.add(lblSetExtraExpenses);
		
		setExtraExpenses = new JTextField();
		setExtraExpenses.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		setExtraExpenses.setColumns(10);
		setExtraExpenses.setBounds(616, 180, 140, 30);
		panelAdminSettings.add(setExtraExpenses);
		
		JPanel panel = new JPanel();
		panel.setBounds(22, 335, 179, 235);
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(204, 102, 153)));
		panel.setLayout(null);
		panel.setBackground(new Color(255,180,162)); 
		panelAdminSettings.add(panel);

		JLabel lbl_imgPoster = new JLabel();
		lbl_imgPoster.setBounds(0, 0, 179, 230);
		panel.add(lbl_imgPoster);
		
		txt_filename = new JTextField(); //obj created for show the path of the ImagesFile that chosen
		txt_filename.setBounds(22, 580, 179, 23);
		panelAdminSettings.add(txt_filename);
		txt_filename.setColumns(10);
		
		JButton btnAttach = new JButton("Attach");
		btnAttach.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				chooser.showOpenDialog(null);
				File f = chooser.getSelectedFile();
				String filename = f.getAbsolutePath(); //get the path of the image
				txt_filename.setText(filename); //view the path or location of the image file
				Image getAbsolutePath = null;
				ImageIcon icon = new ImageIcon(filename); //set the path to the icon
				Image imgPoster = icon.getImage(); //converting ImageIcon into Image
				Image image = imgPoster.getScaledInstance(lbl_imgPoster.getWidth(), lbl_imgPoster.getHeight(), Image.SCALE_SMOOTH);//then scaling of this image
				ImageIcon ImagePoster = new ImageIcon(image); //finally set the image to the JLabel.
				lbl_imgPoster.setIcon(ImagePoster);
			}
		});
		btnAttach.setBounds(221, 572, 110, 38);
		panelAdminSettings.add(btnAttach);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*String image = txt_filename.getText();
				image = image.replace("\\","\\\\");
				
				double evtFees = Double.parseDouble(setEventFees.getText());  //read the JTextField setExtraExpenses data and convert String to double
			    String evtFeesTxt = Double.toString(evtFees); //convert the double back to the String
			    
			    Event evt = new Event(); //obj created for class Event()
				                        // Execute the method my_update to pass evtFeesTxt	
				evt.setVisible(true);  //Open the Finance.java window
				dispose();  //Close the Admin.java window*/
				try {
					if(!"".equals(setEventName.getText()) && !"".equals(setEventDate.getText()) && !"".equals(setLocation.getText()) && !"".equals(setEventFees.getText())) {
						setData();
						JOptionPane.showMessageDialog(null, "Submit Successful!");
						setEventName.setText(null);
						setEventDate.setText(null);
						setEventTime.setText(null);
						setLocation.setText(null);
						setEventFees.setText(null);
					}
					else 
						JOptionPane.showMessageDialog(null, "Please fill and set all the fields!");
				} 
				catch (Exception arg0) {
					arg0.printStackTrace();
			}
			}
		});
		btnSubmit.setBounds(363, 572, 110, 38);
		panelAdminSettings.add(btnSubmit);
		
		JLabel lblSetEventName = new JLabel("Event Name");
		lblSetEventName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblSetEventName.setBounds(213, 369, 110, 23);
		panelAdminSettings.add(lblSetEventName);
		
		setEventName = new JTextField();
		setEventName.setText("SetEventName");
		setEventName.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		setEventName.setColumns(10);
		setEventName.setBounds(344, 362, 141, 30);
		panelAdminSettings.add(setEventName);
		
		JLabel lblSetEventDate = new JLabel("Event Date");
		lblSetEventDate.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblSetEventDate.setBounds(211, 411, 110, 23);
		panelAdminSettings.add(lblSetEventDate);
		
		setEventDate = new JTextField();
		setEventDate.setText("SetEventDate");
		setEventDate.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		setEventDate.setColumns(10);
		setEventDate.setBounds(342, 404, 141, 30);
		panelAdminSettings.add(setEventDate);
		
		JLabel lblSetEventTime = new JLabel("Event Time");
		lblSetEventTime.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblSetEventTime.setBounds(211, 452, 110, 23);
		panelAdminSettings.add(lblSetEventTime);
		
		setEventTime = new JTextField();
		setEventTime.setText("SetEventTime");
		setEventTime.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		setEventTime.setColumns(10);
		setEventTime.setBounds(342, 449, 141, 30);
		panelAdminSettings.add(setEventTime);
		
		setLocation = new JTextField();
		setLocation.setText("SetLocation");
		setLocation.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		setLocation.setColumns(10);
		setLocation.setBounds(342, 489, 141, 30);
		panelAdminSettings.add(setLocation);
		
		JLabel lblSetLocation = new JLabel("Location");
		lblSetLocation.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblSetLocation.setBounds(211, 492, 134, 23);
		panelAdminSettings.add(lblSetLocation);
		
		JLabel lblSetEventFees = new JLabel("Event Fees: RM");
		lblSetEventFees.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblSetEventFees.setBounds(211, 532, 134, 23);
		panelAdminSettings.add(lblSetEventFees);
		
		setEventFees = new JTextField();
		setEventFees.setText("SetEventFees");
		setEventFees.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		setEventFees.setColumns(10);
		setEventFees.setBounds(342, 529, 141, 30);
		panelAdminSettings.add(setEventFees);
		
		JLabel lblSetSponsor = new JLabel("Set Sponsor           : RM");
		lblSetSponsor.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblSetSponsor.setBounds(407, 220, 199, 23);
		panelAdminSettings.add(lblSetSponsor);
		
		setSponsor = new JTextField();
		setSponsor.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		setSponsor.setColumns(10);
		setSponsor.setBounds(617, 217, 140, 30);
		panelAdminSettings.add(setSponsor);

	}
	
	
	
	private void setColor(JPanel pane) {
		pane.setBackground(new Color(181,131,141)); //English Lavender: B5838D
	}
}