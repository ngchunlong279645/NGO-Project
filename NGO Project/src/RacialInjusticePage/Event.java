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
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

public class Event extends JFrame {

	private JPanel contentPane;
	private JTextArea txtrEventInfo;
	protected String nameOfEvent, dateOfEvent, timeOfEvent,location; //Event description
	protected String eventFees;
	protected static String eventA = "Event Name: Without Us, Without Country"
								   + "\r\nDate: 8 June to 12 June 2021 "
								   + "\r\nTime: 9am to 4pm" 
								   + "\r\nLocation: Zoom_Online"
								   + "\r\nFees: RM 30.00 ";
	
	protected static String eventB = "Event Name: Be Justice to Racial: Everyone Is Same"
								   + "\r\nDate: 1 July to 5 July 2021"
								   + "\r\nTime: 11am to 2pm " 
								   + "\r\nLocation: Google Meet "
								   + "\r\nFees: RM 20.00";
	
	protected static String eventC = "Event Name: Try To Hear Other Voice"
			                       + "\r\nDate: 20 July to 22 July 2021"
			                       + "\r\nTime: 4:30pm to 8:30pm" 
			                       + "\r\nLocation: Microsoft Team"
			                       + "\r\nFees: RM  10.00 ";
	
	protected static String eventD = "Event Name: Global village - Know different cultures from each others"
								   + "\r\nDate: 8 August to 12 August 2021"
								   + "\r\nTime: 5pm to 10pm" 
								   + "\r\nLocation: Webex"
								   + "\r\nFees: RM 50.00 ";
	JLabel lblEventPosterA = new JLabel();//initialization of JLabel 
	JLabel lblEventPosterB = new JLabel();//initialization of JLabel 
	JLabel lblEventPosterC = new JLabel();//initialization of JLabel 
	JLabel lblEventPosterD = new JLabel();//initialization of JLabel 
	/**
	 * Launch the application.
	 */
	public void setData() {
		File f = new File("C:\\Users\\lzw_1\\eclipse-workspace\\Project\\src\\RacialInjusticePage\\EvtInfo.txt"); 
		try{
			if(!f.exists()) {
				f.createNewFile();
		}
		BufferedReader br = new BufferedReader(new FileReader(f));
		Object[] Lines = br.lines().toArray();
		int i =0;
		int id = 0;
		for (i=0; i< Lines.length; i++) {
			String Line = Lines[i].toString().trim();
			String [] Row = Line.split(" ");
			nameOfEvent.equals(Row[1]);
			dateOfEvent.equals(Row[2]);
			timeOfEvent.equals(Row[3]);
			location.equals(Row[4]);
			eventFees.equals(Row[5]);
			
			id = Integer.parseInt(Row[0]);
		}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Event frame = new Event();
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
	private final ButtonGroup participate = new ButtonGroup();
	private final ButtonGroup viewEventInfo = new ButtonGroup();

	public Event() {  //constructor with no argument
		setTitle("Event Description");
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("SumWithUsicon.png")));
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
		
		JLabel lblLogo = new JLabel();//initialization of JLabel 
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
				Login login = new Login(); //obj created for class Login() 
				login.setVisible(true); // Open the Login.java window 
				setVisible(false); //Close the Event.java windows
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
				SumWithUs s = new SumWithUs(); //obj created for class SumWithUs() 
				s.setVisible(true); // Open the SumWithUs.java window 
				setVisible(false); //Close the Event.java windows
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
		panelMainMenu.add(panelHighlight3);
		
		JPanel panel3 = new JPanel();
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
				Participant p = new Participant(); //obj created for class Participant()
				p.setVisible(true); //Open the Participant.java window
				dispose(); //Close the Event.java windows
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
		
		JPanel panelSumWithUs = new JPanel();
	    panelSumWithUs.setBackground(new Color(181,131,141)); //English Lavender: B5838D
		panelSumWithUs.setBounds(180, 0, 420, 627);
		contentPane.add(panelSumWithUs);
		panelSumWithUs.setLayout(null);
		
		JPanel panelInfo = new JPanel();
		panelInfo.setBounds(10, 20, 400, 118);
		panelInfo.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255,180,162)));
		panelInfo.setLayout(null);
		panelInfo.setBackground(new Color(181,131,141));
		panelSumWithUs.add(panelInfo);
		
		JLabel lblSumWithUs = new JLabel("Sum With Us");
		lblSumWithUs.setForeground(new Color(255,180,162)); //Melon: FFB4A2
		lblSumWithUs.setHorizontalAlignment(SwingConstants.CENTER);
		lblSumWithUs.setFont(new Font("Algerian", Font.BOLD, 55));
		lblSumWithUs.setBounds(32, 21, 347, 51);
		panelInfo.add(lblSumWithUs);
		
		JLabel lblOrgInfo = new JLabel("04-9814652");
		lblOrgInfo.setIcon(new ImageIcon(getClass().getResource("icons8-phone-34.png")));
		lblOrgInfo.setForeground(new Color(255,180,162)); //Melon: FFB4A2
		lblOrgInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblOrgInfo.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblOrgInfo.setBounds(0, 78, 157, 30);
		panelInfo.add(lblOrgInfo);
		
		JLabel lblSumwithusfb = new JLabel("SumWithUs@fb.com");
		lblSumwithusfb.setIcon(new ImageIcon(getClass().getResource("icons8-facebook-34.png"))); 
		lblSumwithusfb.setHorizontalAlignment(SwingConstants.CENTER);
		lblSumwithusfb.setForeground(new Color(255, 180, 162));
		lblSumwithusfb.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblSumwithusfb.setBounds(152, 78, 248, 30);
		panelInfo.add(lblSumwithusfb);
		
		JLabel lblNewLabel = new JLabel("Recent Campaigns");
		lblNewLabel.setForeground(new Color(255,180,162)); //Melon: FFB4A2
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel.setBounds(86, 148, 238, 37);
		panelSumWithUs.add(lblNewLabel);
		
		JLabel lblEventView = new JLabel("Which event do you prefer to participate?");
		lblEventView.setBounds(10, 429, 400, 67);
		panelSumWithUs.add(lblEventView);
		lblEventView.setHorizontalAlignment(SwingConstants.LEFT);
		lblEventView.setFont(new Font("Sitka Banner", Font.PLAIN, 24));
		
		JRadioButton rdbtnA = new JRadioButton("A");
		participate.add(rdbtnA);
		rdbtnA.setBounds(20, 502, 72, 37);
		panelSumWithUs.add(rdbtnA);
		rdbtnA.setFont(new Font("Times New Roman", Font.BOLD, 24));
		
		JRadioButton rdbtnB = new JRadioButton("B");
		participate.add(rdbtnB);
		rdbtnB.setBounds(122, 502, 72, 37);
		panelSumWithUs.add(rdbtnB);
		rdbtnB.setFont(new Font("Times New Roman", Font.BOLD, 24));
		
		JRadioButton rdbtnC = new JRadioButton("C");
		participate.add(rdbtnC);
		rdbtnC.setBounds(226, 502, 72, 37);
		panelSumWithUs.add(rdbtnC);
		rdbtnC.setFont(new Font("Times New Roman", Font.BOLD, 24));
		
		JRadioButton rdbtnD = new JRadioButton("D");
		participate.add(rdbtnD);
		rdbtnD.setBounds(328, 502, 72, 37);
		panelSumWithUs.add(rdbtnD);
		rdbtnD.setFont(new Font("Times New Roman", Font.BOLD, 24));
		
		JRadioButton rdbtnViewEvtA = new JRadioButton("A. Without Us, Without Country");
		viewEventInfo.add(rdbtnViewEvtA);
		rdbtnViewEvtA.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		rdbtnViewEvtA.setBounds(10, 191, 400, 37);
		rdbtnViewEvtA.setOpaque(false);
		panelSumWithUs.add(rdbtnViewEvtA);
		
		JRadioButton rdbtnViewEvtB = new JRadioButton("B. Be Justice to Racial: Everyone Is Same");
		viewEventInfo.add(rdbtnViewEvtB);
		rdbtnViewEvtB.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		rdbtnViewEvtB.setBounds(10, 240, 400, 37);
		rdbtnViewEvtB.setOpaque(false);
		panelSumWithUs.add(rdbtnViewEvtB);
		
		JRadioButton rdbtnViewEvtC = new JRadioButton("C. Try To Hear Other Voice");
		viewEventInfo.add(rdbtnViewEvtC);
		rdbtnViewEvtC.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		rdbtnViewEvtC.setBounds(10, 289, 400, 37);
		rdbtnViewEvtC.setOpaque(false);
		panelSumWithUs.add(rdbtnViewEvtC);
		
		JRadioButton rdbtnViewEvtD = new JRadioButton("D. Global village - Know different cultures from each others");
		viewEventInfo.add(rdbtnViewEvtD);
		rdbtnViewEvtD.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		rdbtnViewEvtD.setBounds(10, 339, 400, 37);
		rdbtnViewEvtD.setOpaque(false);
		panelSumWithUs.add(rdbtnViewEvtD);
		
		JPanel panelRight = new JPanel();
		panelRight.setBackground(new Color(255,180,162)); //Melon: FFB4A2
		panelRight.setBounds(595, 0, 420, 627);
		contentPane.add(panelRight);
		panelRight.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		panel.setBounds(48, 17, 332, 418);
		panelRight.add(panel);
		panel.setLayout(null);
		
		JButton btnViewEvent = new JButton("View Event Description");
		btnViewEvent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {			
				if(rdbtnViewEvtA.isSelected()) {
					//eventA = txtrEventInfo.getText();
					
					lblEventPosterA.setBounds(4, 4, 323, 409);				
					panel.add(lblEventPosterA);
					path = "EventA.jpg"; //path to the image 
					ImageIcon MyImage = new ImageIcon(getClass().getResource(path)); //set the path to the MyImage
					Image img = MyImage.getImage(); //converting ImageIcon into Image
					Image newImg = img.getScaledInstance(lblEventPosterA.getWidth(), lblEventPosterA.getHeight(), Image.SCALE_SMOOTH); //then scaling of this image
					ImageIcon image = new ImageIcon(newImg); //finally set the image to the JLabel.
					lblEventPosterA.setIcon(image);	
					}
		    	else if (rdbtnViewEvtB.isSelected()) {
		    		//eventB = txtrEventInfo.getText();
		    		
		    		lblEventPosterB.setBounds(4, 4, 323, 409);				
					panel.add(lblEventPosterB);
					path = "EventB.jpg"; //path to the image 
					ImageIcon MyImage = new ImageIcon(getClass().getResource(path)); //set the path to the MyImage
					Image img = MyImage.getImage(); //converting ImageIcon into Image
					Image newImg = img.getScaledInstance(lblEventPosterB.getWidth(), lblEventPosterB.getHeight(), Image.SCALE_SMOOTH); //then scaling of this image
					ImageIcon image = new ImageIcon(newImg); //finally set the image to the JLabel.
					lblEventPosterB.setIcon(image);	
				}
		    	else if (rdbtnViewEvtC.isSelected()) {
		    		//eventC = txtrEventInfo.getText();
		    		
			    	lblEventPosterC.setBounds(4, 4, 323, 409);				
					panel.add(lblEventPosterC);
					path = "EventC.jpg"; //path to the image  
					ImageIcon MyImage = new ImageIcon(getClass().getResource(path)); //set the path to the MyImage
					Image img = MyImage.getImage(); //converting ImageIcon into Image
					Image newImg = img.getScaledInstance(lblEventPosterC.getWidth(), lblEventPosterC.getHeight(), Image.SCALE_SMOOTH); //then scaling of this image
					ImageIcon image = new ImageIcon(newImg); //finally set the image to the JLabel.
					lblEventPosterC.setIcon(image);	
				}
				else if (rdbtnViewEvtD.isSelected()) {
					//eventD = txtrEventInfo.getText();
					
				 	lblEventPosterD.setBounds(4, 4, 323, 409);				
					panel.add(lblEventPosterD);
					path = "EventD.jpg"; //path to the image
					ImageIcon MyImage = new ImageIcon(getClass().getResource(path)); //set the path to the MyImage
					Image img = MyImage.getImage(); //converting ImageIcon into Image
					Image newImg = img.getScaledInstance(lblEventPosterD.getWidth(), lblEventPosterD.getHeight(), Image.SCALE_SMOOTH); //then scaling of this image
					ImageIcon image = new ImageIcon(newImg); //finally set the image to the JLabel.
					lblEventPosterD.setIcon(image);	
				}				
			}
		});
		
		btnViewEvent.setBounds(35, 386, 353, 43);
		panelSumWithUs.add(btnViewEvent);
		btnViewEvent.setForeground(new Color(204, 102, 153));
		btnViewEvent.setFont(new Font("Times New Roman", Font.BOLD, 30));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 445, 365, 119);
		panelRight.add(scrollPane);
		
		JTextArea txtrEventInfo = new JTextArea();
		txtrEventInfo.setText("Event A \r\nEvent Name: Without Us, Without Country\r\nDate: 8 June to 12 June 2021 \r\nTime: 9am to 4pm\r\nLocation: Zoom_Online\r\nFees: RM 30.00 \r\n\r\nEvent B\r\nEvent Name: Be Justice to Racial: Everyone Is Same\r\nDate: 1 July to 5 July 2021\r\nTime: 11am to 2pm\r\nLocation: Google Meet \r\nFees: RM 20.00\";\r\n\t\r\nEvent C\r\nEvent Name: Try To Hear Other Voice\r\nDate: 20 July to 22 July 2021\r\nTime: 4:30pm to 8:30pm\r\nLocation: Microsoft Team\r\nFees: RM  10.00 \r\n\r\nEvent D\r\nEvent Name: Global village - Know different cultures from each others\r\nDate: 8 August to 12 August 2021\r\nTime: 5pm to 10pm\r\nLocation: Webex\r\nFees: RM 50.00 ");
		txtrEventInfo.setFont(new Font("Monospaced", Font.PLAIN, 20));
		txtrEventInfo.getText();
		scrollPane.setViewportView(txtrEventInfo);
		
		JButton btnClickHereTo = new JButton("Event Registration >>>");
		btnClickHereTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char eventType = 'A';
				
				if(rdbtnA.isSelected())
					eventType = 'A';
				else if (rdbtnB.isSelected())
					eventType = 'B';
				else if (rdbtnC.isSelected())
					eventType = 'C';
				else if (rdbtnD.isSelected())
				    eventType = 'D';
				
				String str= Character.toString(eventType);// read the JRadioButton EventType data
				
				Participant p = new Participant(); //obj created for class Participant() 
				p.my_update(str); // Execute the method my_update to pass str
				
				p.setVisible(true); // Open the Participant.java window
				dispose(); // Close the Event.java window
			}
		});
		btnClickHereTo.setForeground(new Color(204, 102, 153));
		btnClickHereTo.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnClickHereTo.setBounds(28, 574, 365, 43);
		panelRight.add(btnClickHereTo);
	}
	
	//2.3 Encapsulation (Use setter)	
	   void setDate(String dateOfEvent) {
			this.dateOfEvent = dateOfEvent;
		}
		void setTime(String timeOfEvent) {
			this.timeOfEvent = timeOfEvent;
		}
		void setLocation(String platform) {
			this.location= platform;
		}
		void setEventFees(String evtFees) {
			this.eventFees = evtFees;
		}
	//2.3 Encapsulation (Use getter)
	   public String getName() {
		      return this.nameOfEvent;
		}
	   public String getDate() {
		      return this.dateOfEvent;
		}
		public String getTime() {
			return this.timeOfEvent;
		}
	
		public String getEventFees() {
			return this.eventFees;
		}
	private void setColor(JPanel pane) {
		pane.setBackground(new Color(181,131,141)); //English Lavender: B5838D
	}
}
