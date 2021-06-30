package GenderDiscrimination;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import java.awt.Toolkit;

public class Advertisement extends JFrame {

	private JPanel contentPane;
	private JTextField txtFees;
	private JTextField txtTaxReduction;
	
	// Set the default event 1 details
	protected static String fees1 = "2.50";
	protected static String tr1 = "10";
	protected static String event1 = "Event Name: Path to equal: New Indices on Gender Equality and Women's Empowerment"
			+ "\r\n\r\nDate: 15 July 2021"
			+ "\r\n\r\nTime: 8:00 p.m." 
			+ "\r\n\r\nLocation: Online, Zoom"
			+ "\r\n\r\nFees: RM2.50"
			+ "\r\n\r\nMax Participant: 250 participants"
			+ "\r\n\r\nPrize: You will get voucher worth RM150!"
			+ "\r\n\r\nEvent Website: https://www.unwomen.org/en/news/events/2021/07/event-path-to-equal-new-indices-on-gender-equality-and-womens-empowerment"
			+ "\r\n\r\nIf you donate more than RM1000.00, you will get a tax reduction of 10%"
			+ "\r\n\r\nEvent Description: "
			+ "\r\nUN Women is organizing a VNR lab titled “Path to equal: New Measurement Framework on Gender Equality and Women’s Empowerment” on 15 July 2021, 8–9 am EDT."
			+ "This lab will highlight some of the findings from this work and its relevance for the preparation of VNRs, "
			+ "particularly in their assessment of the different forms of discrimination that women and girls face and their impact on society, "
			+ "and on accelerating progress in achieving the SDGs."
			+ "The findings will also put a spotlight on intersectionality through a comparison of outcomes for women and girls from different wealth/income quintiles for more than 100 countries."
			+ "It will also feature speakers from Member States, including from national statistical offices.";
	
	// Set the default event 2 detail
	protected static String fees2 = "3.50";
	protected static String tr2 = "5";
	protected static String event2 = "Event Name: Youth Activism for Gender Equality in Nationality Laws"
			+ "\r\n\r\nDate: 1 June 2021"
			+ "\r\n\r\nTime: 5:00 p.m." 
			+ "\r\n\r\nLocation: Online"
			+ "\r\n\r\nFees: RM3.50"
			+ "\r\n\r\nMax Participant: 250 participants"
			+ "\r\n\r\nPrize: You will get voucher worth RM50!"
			+ "\r\n\r\nEvent Website: https://www.unwomen.org/en/news/events/2021/06/event-youth-activism-for-gender-equality-in-nationality-laws"
			+ "\r\n\r\nIf you donate more than RM1000.00, you will get a tax reduction of 5%"
			+ "\r\n\r\nEvent Description: "
			+ "\r\nTo expedite progress on ending gender discrimination in nationality laws, "
			+ "youth across affected countries must be engaged to play a key role in advocacy and mobilized to expand and strengthen coalitions for reform. "
			+ "Taking place in the month prior to the Generation Equality Forum: Paris, "
			+ "this event will draw important links between the Forum’s goals and Action Coalitions and call on the audience to elevate calls for gender-equal nationality laws during the Forum and beyond.";		
	
	// Set the default event 3 detail
	protected static String fees3 =  "4.00";
	protected static String tr3 = "7";
	protected static String event3 = "Event Name: Generation Equality Forum: Pari"
			+ "\r\n\r\nDate: 30 June 2021 - 2 July 2021"
			+ "\r\n\r\nTime: 9:00 p.m." 
			+ "\r\n\r\nLocation: Online"
			+ "\r\n\r\nFees: RM4.00"
			+ "\r\n\r\nMax Participant: 500 participants"
			+ "\r\n\r\nPrize: There is no prize for this event!"
			+ "\r\n\r\nEvent Website: https://forum.generationequality.org/home"
			+ "\r\n\r\nIf you donate more than RM1000.00, you will get a tax reduction of 7%"
			+ "\r\n\r\nEvent Description: "
			+ "\r\nThe Generation Equality Forum is a major global inflection point for gender equality. "
			+ "This landmark effort is bringing together governments, "
			+ "corporations and change makers from around the world to define and announce ambitious investments and policies. "
			+ "The result will be a permanent acceleration in equality, leadership and opportunity for women and girls worldwide.";	
	
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Advertisement frame = new Advertisement();
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
	public Advertisement() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Advertisement.class.getResource("gender equality.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 949, 606);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 255, 204));
		panel.setBorder(new LineBorder(new Color(102, 102, 255), 5));
		panel.setBounds(0, 0, 935, 569);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(102, 102, 255), 5));
		panel_1.setBackground(new Color(153, 255, 204));
		panel_1.setBounds(10, 10, 915, 82);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("ADVERTISEMENT");
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 50));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 895, 62);
		panel_1.add(lblNewLabel);

		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(102, 102, 255), 5));
		panel_3.setBackground(new Color(153, 255, 204));
		panel_3.setBounds(10, 161, 915, 311);
		panel.add(panel_3);
		
		JLabel lblFees = new JLabel("Fees (RM)");
		lblFees.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblFees.setBounds(10, 271, 109, 30);
		panel_3.add(lblFees);
		
		txtFees = new JTextField();
		txtFees.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtFees.setColumns(10);
		txtFees.setBounds(129, 271, 288, 30);
		panel_3.add(txtFees);
		
		JLabel lblDate_1_1_1 = new JLabel("Event Detail");
		lblDate_1_1_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblDate_1_1_1.setBounds(10, 10, 109, 51);
		panel_3.add(lblDate_1_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(129, 10, 776, 251);
		panel_3.add(scrollPane);
		
		JTextPane textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
		
		JLabel lblTaxReduction = new JLabel("Tax Reduction");
		lblTaxReduction.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblTaxReduction.setBounds(469, 271, 132, 30);
		panel_3.add(lblTaxReduction);
		
		txtTaxReduction = new JTextField();
		txtTaxReduction.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtTaxReduction.setColumns(10);
		txtTaxReduction.setBounds(611, 271, 294, 30);
		panel_3.add(txtTaxReduction);
		
		// Show the detail of event 1 when this button is pressed
		JRadioButton rdbtnEvent1 = new JRadioButton("Event 1");
		buttonGroup.add(rdbtnEvent1);
		rdbtnEvent1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane.setText(event1);
				txtFees.setText(fees1);
				txtTaxReduction.setText(tr1);
			}
		});
		rdbtnEvent1.setBackground(new Color(204, 255, 255));
		rdbtnEvent1.setFont(new Font("Snap ITC", Font.PLAIN, 25));
		rdbtnEvent1.setBounds(62, 98, 176, 57);
		panel.add(rdbtnEvent1);
		
		// Show the detail of event 2 when this button is pressed
		JRadioButton rdbtnEvent2 = new JRadioButton("Event 2");
		buttonGroup.add(rdbtnEvent2);
		rdbtnEvent2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane.setText(event2);
				txtFees.setText(fees2);
				txtTaxReduction.setText(tr2);
			}
		});
		rdbtnEvent2.setFont(new Font("Snap ITC", Font.PLAIN, 25));
		rdbtnEvent2.setBackground(new Color(204, 255, 255));
		rdbtnEvent2.setBounds(377, 98, 176, 57);
		panel.add(rdbtnEvent2);
		
		// Show the detail of event 3 when this button is pressed
		JRadioButton rdbtnEvent3 = new JRadioButton("Event 3");	
		buttonGroup.add(rdbtnEvent3);
		rdbtnEvent3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane.setText(event3);
				txtFees.setText(fees3);
				txtTaxReduction.setText(tr3);
			}
		});
		rdbtnEvent3.setFont(new Font("Snap ITC", Font.PLAIN, 25));
		rdbtnEvent3.setBackground(new Color(204, 255, 255));
		rdbtnEvent3.setBounds(695, 98, 176, 57);
		panel.add(rdbtnEvent3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(102, 102, 255), 5));
		panel_2.setBackground(new Color(153, 255, 204));
		panel_2.setBounds(10, 482, 915, 77);
		panel.add(panel_2);
		
		// Save the edited detail of selected event by pressing this button
		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnEvent1.isSelected()) {
					event1 = textPane.getText();	
					fees1 = txtFees.getText();
					tr1 = txtTaxReduction.getText();
				}
				else if(rdbtnEvent2.isSelected()) {
					event2 = textPane.getText();	
					fees2 = txtFees.getText();
					tr2 = txtTaxReduction.getText();
				}
				else if(rdbtnEvent3.isSelected()) {
					event3 = textPane.getText();	
					fees3 = txtFees.getText();
					tr3 = txtTaxReduction.getText();
				}
			}
		});
		btnNewButton.setFont(new Font("Snap ITC", Font.PLAIN, 25));
		btnNewButton.setBackground(new Color(204, 255, 255));
		btnNewButton.setBounds(10, 10, 168, 55);
		panel_2.add(btnNewButton);
		
		// Clear all the detail of the selected event
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTaxReduction.setText("");
				txtFees.setText("");
				textPane.setText("");
			}
		});
		btnClear.setFont(new Font("Snap ITC", Font.PLAIN, 25));
		btnClear.setBackground(new Color(204, 255, 255));
		btnClear.setBounds(251, 10, 168, 55);
		panel_2.add(btnClear);
		
		// Back to admin page frame
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminPage ap = new AdminPage();
				ap.setModalExclusionType(null);
				ap.setVisible(true);
			}
		});
		btnBack.setFont(new Font("Snap ITC", Font.PLAIN, 25));
		btnBack.setBackground(new Color(204, 255, 255));
		btnBack.setBounds(501, 10, 168, 55);
		panel_2.add(btnBack);
		
		// Exit the application
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Advertisement", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Snap ITC", Font.PLAIN, 25));
		btnExit.setBackground(new Color(204, 255, 255));
		btnExit.setBounds(737, 10, 168, 55);
		panel_2.add(btnExit);
	}
}
