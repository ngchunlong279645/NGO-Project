package RacialInjusticePage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileReader;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class SumWithUs extends JFrame {

	private JPanel contentPane;
	private JTextPane txtpnAbout;
	/**
	 * Launch the application.
	 */
	
	public static void TextFromFile(JTextPane txtpnHowToJoinLuckyDraw) { //Read and import from AboutUs txtFile 
		try {
			String path = "C:\\Users\\lzw_1\\eclipse-workspace\\Project\\src\\RacialInjusticePage\\AboutUs.txt"; 
			File file = new File(path);
			FileReader fr = new FileReader(file);
			while(fr.read() != -1) {
				txtpnHowToJoinLuckyDraw.read(fr, null);
			}
			fr.close();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SumWithUs frame = new SumWithUs();//create new object
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
	
	public SumWithUs() {  //constructor with no argument
		JTextPane txtpnAbout= new JTextPane();
		txtpnAbout.setEditable(false);
		TextFromFile(txtpnAbout);
		Font font = new Font("Monotype Corsiva",Font.PLAIN,24);
		txtpnAbout.setFont(font);
		txtpnAbout.setForeground(Color.black);
		
		setTitle("Sum With Us");
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
				dispose(); // Close the SumWithUs.java window
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
				Event e = new Event();//obj created for class Event() 
				e.setVisible(true); // Open the Event.java window 
				dispose(); // Close the SumWithUs.java window
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
				Participant p = new Participant(); //obj created for class Participant() 
				p.setVisible(true); // Open the Participant.java window 
				dispose(); // Close the SumWithUs.java window		
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
		panelSumWithUs.setBounds(180, 0, 392, 627);
		contentPane.add(panelSumWithUs);
		panelSumWithUs.setLayout(null);
		
		JLabel lblSumWithUs = new JLabel("Sum With Us");
		lblSumWithUs.setForeground(new Color(255,180,162)); //Melon: FFB4A2
		lblSumWithUs.setHorizontalAlignment(SwingConstants.CENTER);
		lblSumWithUs.setFont(new Font("Algerian", Font.BOLD, 55));
		lblSumWithUs.setBounds(24, 36, 347, 85);
		panelSumWithUs.add(lblSumWithUs);
		
		JLabel lblNewLabel = new JLabel("NGO Organization");
		lblNewLabel.setForeground(new Color(255,180,162)); //Melon: FFB4A2
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel.setBounds(78, 97, 238, 48);
		panelSumWithUs.add(lblNewLabel);
		
		JLabel NGOprofile = new JLabel(); //initialization of JLabel 
		NGOprofile.setBounds(36, 164, 320, 414);
		panelSumWithUs.add(NGOprofile);
		path = "SumWithUs.jpg"; //path to the image 
		ImageIcon MyImage = new ImageIcon(getClass().getResource(path)); //set the path to the MyImage
		Image img = MyImage.getImage(); //converting ImageIcon into Image
		Image newImg = img.getScaledInstance(NGOprofile.getWidth(), NGOprofile.getHeight(), Image.SCALE_SMOOTH); //then scaling of this image
		ImageIcon image = new ImageIcon(newImg); //finally set the image to the JLabel.
		panelSumWithUs.add(NGOprofile);
		NGOprofile.setIcon(image);	

		JPanel panelRight = new JPanel();
		panelRight.setBackground(new Color(255,180,162)); //Melon: FFB4A2
		panelRight.setBounds(572, 0, 443, 627);
		contentPane.add(panelRight);
		panelRight.setLayout(null);
		
		JLabel lblWelcome = new JLabel("Welcome to Our NGO Organization");
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setFont(new Font("Sitka Banner", Font.PLAIN, 26));
		lblWelcome.setBounds(40, 67, 376, 66);
		panelRight.add(lblWelcome);
		
		JScrollPane scrollPane = new JScrollPane(txtpnAbout);
		scrollPane.setBounds(40, 156, 376, 341);
		panelRight.add(scrollPane, BorderLayout.CENTER);
		panelRight.add(scrollPane);

		JButton btnViewEvent = new JButton("Click Here to View More Recent Event");
		btnViewEvent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Event e = new Event();	//obj created for class Event() 
			    e.setVisible(true); // Open the Event.java window
				dispose();// Close the SumWithUs.java window
			}
		});
		btnViewEvent.setBackground(SystemColor.controlHighlight);
		btnViewEvent.setForeground(new Color(204, 102, 153));
		btnViewEvent.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnViewEvent.setBounds(40, 532, 376, 49);
		panelRight.add(btnViewEvent);
	}
	
	private void setColor(JPanel pane) {
		pane.setBackground(new Color(181,131,141)); //English Lavender: B5838D
	}

}
