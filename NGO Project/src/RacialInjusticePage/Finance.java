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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;

public class Finance extends JFrame {
	private JTable table;
	private JFrame frame;
	private JPanel contentPane;
	private JTextField adExpenses; // add this line to set it global
	private JTextField extraExpenses; // add this line to set it global
	private JTextField totalSponsor; // add this line to set it global
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finance frame = new Finance();//create new object
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
	private JTextField totalEventFeeText;
	private JTextField totalDonation;
	private JTextField totalExpensesText;
	private JTextField netProfitText;
	private JTextField eventFees;
	private JTextField totalNumParticipant;
	
	public void admin_update(String adFeesTxt, String extraFeesTxt, String sponsorTxt) { //method admin_update to retrieve adFeesTxt,extraFeesTxt,sponsorTxt (constructor with 3 arguments)
		adExpenses.setText(adFeesTxt);
		extraExpenses.setText(extraFeesTxt);
		totalSponsor.setText(sponsorTxt);
	}
	
	public Finance() { //constructor with no argument
		setTitle("Finance");  
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,  1029, 664);
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
				Participant p = new Participant();
				p.setVisible(true); //Open the Participant.java window 
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
		lblSettings.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				setColor(panel5);
				panel5.setOpaque(true);
				Admin a = new Admin(); //obj created for Admin()
				a.setVisible(true); //Open the Admin.java window (Editable All description and Settings)
				dispose(); //Close the Finance.java window
			}
		});
		lblSettings.setHorizontalAlignment(SwingConstants.CENTER);
		lblSettings.setForeground(Color.BLACK);
		lblSettings.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblSettings.setBounds(29, 10, 115, 31);
		panel5.add(lblSettings);
		
		JPanel panelHighlight5 = new JPanel();
		panelHighlight5.setOpaque(false);
		panelHighlight5.setBounds(0, 303, 10, 52);
		panelMainMenu.add(panelHighlight5);
		
		JPanel panelFinancial = new JPanel();
		panelFinancial.setBackground(new Color(255,180,162)); //Melon: FFB4A2
		panelFinancial.setBounds(180, 0, 835, 627);
		contentPane.add(panelFinancial);
		panelFinancial.setLayout(null);
		
		JPanel panelFinance = new JPanel();
		panelFinance.setBounds(165, 20, 513, 68);
		panelFinance.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(204, 102, 153)));
		panelFinance.setLayout(null);
		panelFinance.setBackground(new Color(255,180,162)); 
		panelFinancial.add(panelFinance);
		
		JLabel lblSumWithUs = new JLabel("FINANCE");
		lblSumWithUs.setForeground(new Color(204, 102, 153));
		lblSumWithUs.setHorizontalAlignment(SwingConstants.CENTER);
		lblSumWithUs.setFont(new Font("Algerian", Font.BOLD, 50));
		lblSumWithUs.setBounds(99, 10, 320, 62);
		panelFinance.add(lblSumWithUs);
		
		JPanel panelFinance_1 = new JPanel();
		panelFinance_1.setLayout(null);
		panelFinance_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(204, 102, 153)));
		panelFinance_1.setBackground(new Color(255, 180, 162));
		panelFinance_1.setBounds(10, 113, 452, 376);
		panelFinancial.add(panelFinance_1);
		
		JLabel lblAdvertisementExpenses = new JLabel("Advertisement Expenses  : RM");
		lblAdvertisementExpenses.setHorizontalAlignment(SwingConstants.LEFT);
		lblAdvertisementExpenses.setForeground(new Color(204, 102, 153));
		lblAdvertisementExpenses.setFont(new Font("Sitka Banner", Font.BOLD, 25));
		lblAdvertisementExpenses.setBounds(10, 199, 310, 46);
		panelFinance_1.add(lblAdvertisementExpenses);
		
		JLabel lblExtraExpenses = new JLabel("Extra Expenses  : RM");
		lblExtraExpenses.setHorizontalAlignment(SwingConstants.LEFT);
		lblExtraExpenses.setForeground(new Color(204, 102, 153));
		lblExtraExpenses.setFont(new Font("Sitka Banner", Font.BOLD, 25));
		lblExtraExpenses.setBounds(10, 255, 310, 46);
		panelFinance_1.add(lblExtraExpenses);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 102, 153));
		panel_1.setBounds(22, 146, 418, 10);
		panelFinance_1.add(panel_1);
		
		JLabel lblEventFees = new JLabel("Event Fees          : RM");
		lblEventFees.setHorizontalAlignment(SwingConstants.LEFT);
		lblEventFees.setForeground(new Color(204, 102, 153));
		lblEventFees.setFont(new Font("Sitka Banner", Font.BOLD, 25));
		lblEventFees.setBounds(10, 21, 310, 46);
		panelFinance_1.add(lblEventFees);
		
		JLabel lblTotalNumParticipant = new JLabel("Total Num Participant: ");
		lblTotalNumParticipant.setHorizontalAlignment(SwingConstants.LEFT);
		lblTotalNumParticipant.setForeground(new Color(204, 102, 153));
		lblTotalNumParticipant.setFont(new Font("Sitka Banner", Font.BOLD, 25));
		lblTotalNumParticipant.setBounds(10, 77, 310, 46);
		panelFinance_1.add(lblTotalNumParticipant);
		
		adExpenses = new JTextField();
		adExpenses.setEditable(false);
		adExpenses.setFont(new Font("Sitka Banner", Font.PLAIN, 20));
		adExpenses.setColumns(10);
		adExpenses.setBounds(330, 201, 110, 32);
		panelFinance_1.add(adExpenses);
		
		extraExpenses = new JTextField();
		extraExpenses.setEditable(false);
		extraExpenses.setFont(new Font("Sitka Banner", Font.PLAIN, 20));
		extraExpenses.setColumns(10);
		extraExpenses.setBounds(330, 262, 110, 32);
		panelFinance_1.add(extraExpenses);
		
		eventFees = new JTextField();
		eventFees.setFont(new Font("Sitka Banner", Font.PLAIN, 20));
		eventFees.setColumns(10);
		eventFees.setBounds(330, 28, 110, 32);
		panelFinance_1.add(eventFees);
		
		totalNumParticipant = new JTextField();
		totalNumParticipant.setFont(new Font("Sitka Banner", Font.PLAIN, 20));
		totalNumParticipant.setColumns(10);
		totalNumParticipant.setBounds(330, 84, 110, 32);
		panelFinance_1.add(totalNumParticipant);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setIcon(new ImageIcon(getClass().getResource("")));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adExpenses.setText("");
				extraExpenses.setText("");
				eventFees.setText("");
				totalNumParticipant.setText("");
				totalSponsor.setText("");
				totalEventFeeText.setText("");
				totalDonation.setText("");
				totalExpensesText.setText("");
				netProfitText.setText("");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnReset.setBounds(55, 509, 153, 80);
		panelFinancial.add(btnReset);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.setIcon(new ImageIcon(getClass().getResource("")));
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
		btnPrint.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnPrint.setBounds(261, 509, 153, 80);
		panelFinancial.add(btnPrint);
		
		JPanel panelFinance_2 = new JPanel();
		panelFinance_2.setLayout(null);
		panelFinance_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(204, 102, 153)));
		panelFinance_2.setBackground(new Color(255, 180, 162));
		panelFinance_2.setBounds(474, 113, 351, 376);
		panelFinancial.add(panelFinance_2);
		
		JLabel lblFinanceStatement = new JLabel("Finance Statement");
		lblFinanceStatement.setHorizontalAlignment(SwingConstants.CENTER);
		lblFinanceStatement.setForeground(new Color(204, 102, 153));
		lblFinanceStatement.setFont(new Font("Sitka Banner", Font.BOLD, 25));
		lblFinanceStatement.setBounds(74, 10, 208, 46);
		panelFinance_2.add(lblFinanceStatement);
		
		JLabel lblTotalSponsor = new JLabel("Total Sponsor  : RM");
		lblTotalSponsor.setHorizontalAlignment(SwingConstants.LEFT);
		lblTotalSponsor.setForeground(new Color(204, 102, 153));
		lblTotalSponsor.setBounds(10, 53, 208, 46);
		panelFinance_2.add(lblTotalSponsor);
		lblTotalSponsor.setFont(new Font("Sitka Banner", Font.BOLD, 25));
		
		JLabel lblTotalDonation = new JLabel("Total Donation: RM");
		lblTotalDonation.setHorizontalAlignment(SwingConstants.LEFT);
		lblTotalDonation.setForeground(new Color(204, 102, 153));
		lblTotalDonation.setFont(new Font("Sitka Banner", Font.BOLD, 25));
		lblTotalDonation.setBounds(10, 155, 208, 62);
		panelFinance_2.add(lblTotalDonation);
		
		totalSponsor = new JTextField();
		totalSponsor.setEditable(false);
		totalSponsor.setFont(new Font("Sitka Banner", Font.PLAIN, 20));
		totalSponsor.setBounds(228, 60, 110, 32);
		panelFinance_2.add(totalSponsor);
		totalSponsor.setColumns(10);
		
		totalEventFeeText = new JTextField();
		totalEventFeeText.setEditable(false);
		totalEventFeeText.setFont(new Font("Sitka Banner", Font.PLAIN, 20));
		totalEventFeeText.setColumns(10);
		totalEventFeeText.setBounds(228, 113, 110, 32);
		panelFinance_2.add(totalEventFeeText);
		
		JButton btnTotalEventfees = new JButton("Total EventFees");
		btnTotalEventfees.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getPayment();
			}
		});
		btnTotalEventfees.setHorizontalAlignment(SwingConstants.LEFT);
		btnTotalEventfees.setForeground(new Color(204, 102, 153));
		btnTotalEventfees.setFont(new Font("Sitka Banner", Font.BOLD, 25));
		btnTotalEventfees.setBounds(10, 109, 208, 46);
		panelFinance_2.add(btnTotalEventfees);
		
		totalDonation = new JTextField();
		totalDonation.setFont(new Font("Sitka Banner", Font.PLAIN, 20));
		totalDonation.setColumns(10);
		totalDonation.setBounds(228, 170, 110, 32);
		panelFinance_2.add(totalDonation);
		
		totalExpensesText = new JTextField();
		totalExpensesText.setEditable(false);
		totalExpensesText.setFont(new Font("Sitka Banner", Font.PLAIN, 20));
		totalExpensesText.setColumns(10);
		totalExpensesText.setBounds(228, 219, 110, 32);
		panelFinance_2.add(totalExpensesText);
		
		JButton btnTotalExpenses = new JButton("Total Expenses");
		btnTotalExpenses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double totalExpenses = Double.parseDouble(adExpenses.getText()) + Double.parseDouble(extraExpenses.getText()); //convert String to double
			    String totalExpensesTxt = Double.toString(totalExpenses);
			    totalExpensesText.setText(totalExpensesTxt);
			}
		});
		btnTotalExpenses.setHorizontalAlignment(SwingConstants.LEFT);
		btnTotalExpenses.setForeground(new Color(204, 102, 153));
		btnTotalExpenses.setFont(new Font("Sitka Banner", Font.BOLD, 25));
		btnTotalExpenses.setBounds(10, 212, 208, 46);
		panelFinance_2.add(btnTotalExpenses);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 102, 153));
		panel.setBounds(10, 268, 328, 10);
		panelFinance_2.add(panel);
		
		JButton btnCalculateNetProfit = new JButton("Net Profit");
		btnCalculateNetProfit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double totalNetProfit = Double.parseDouble(totalDonation.getText()) + Double.parseDouble(totalSponsor.getText()) + Double.parseDouble(totalEventFeeText.getText()) - Double.parseDouble(totalExpensesText.getText()); // + getPayment() = eventFees * this.totalNumParticipant;
			    String totalNetProfitTxt = Double.toString(totalNetProfit);
			    netProfitText.setText(totalNetProfitTxt);
			}
		});
		btnCalculateNetProfit.setIcon(new ImageIcon(""));
		btnCalculateNetProfit.setForeground(new Color(204,102,153));
		btnCalculateNetProfit.setFont(new Font("Sitka Banner", Font.BOLD, 25));
		btnCalculateNetProfit.setBounds(10, 295, 171, 46);
		panelFinance_2.add(btnCalculateNetProfit);
		
		netProfitText = new JTextField();
		netProfitText.setEditable(false);
		netProfitText.setFont(new Font("Sitka Banner", Font.PLAIN, 20));
		netProfitText.setColumns(10);
		netProfitText.setBounds(228, 302, 110, 32);
		panelFinance_2.add(netProfitText);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Sum With Us System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0); //Exit the program
			}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnExit.setBounds(573, 509, 153, 80);
		panelFinancial.add(btnExit);
	}
	
	public void getPayment() {  //2.5 Interface-calTotalEventFeesCollected
		double totalEventFees = Double.parseDouble(eventFees.getText()) * Double.parseDouble(totalNumParticipant.getText()); //convert String to double
	    String totalEventFeesTxt = Double.toString(totalEventFees);
		totalEventFeeText.setText(totalEventFeesTxt);
  	}
	
	private void setColor(JPanel pane) {
		pane.setBackground(new Color(181,131,141)); //English Lavender: B5838D
	}
}
