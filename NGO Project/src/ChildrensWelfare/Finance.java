package ChildrensWelfare;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Finance extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldEventSales;
	private JTextField textFieldUtility;
	private JTextField textFieldAds;
	private JTextField textFieldEventExpenses;
	private JTextField textFieldTotalIncome;
	private JTextField textFieldTotalExpenses;
	private JTextField textFieldNetIncome;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finance frame = new Finance();
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
	public Finance() {
		setTitle("Finance");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 930, 621);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 916, 584);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(102, 204, 255));
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 204)));
		panel_1.setBounds(0, 0, 916, 584);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(153, 204, 255));
		panel_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 51, 255)));
		panel_2.setBounds(146, 33, 629, 65);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Finance");
		lblNewLabel.setFont(new Font("Rockwell Extra Bold", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel.setBounds(230, 10, 150, 47);
		panel_2.add(lblNewLabel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 102));
		panel_3.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		panel_3.setBounds(66, 196, 320, 65);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblEventSales = new JLabel("Event Sales");
		lblEventSales.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblEventSales.setBounds(10, 20, 144, 34);
		panel_3.add(lblEventSales);
		
		textFieldEventSales = new JTextField();
		textFieldEventSales.setText(Double.toString(ParticipantRegistration.getTotal())); //get the total event
		textFieldEventSales.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		textFieldEventSales.setBounds(164, 20, 133, 34);
		panel_3.add(textFieldEventSales);
		textFieldEventSales.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 0, 0));
		panel_4.setBounds(66, 147, 320, 50);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblTotalIncome = new JLabel("Total Income");
		lblTotalIncome.setFont(new Font("Comic Sans MS", Font.BOLD, 22));
		lblTotalIncome.setForeground(new Color(255, 255, 255));
		lblTotalIncome.setBounds(83, 10, 168, 30);
		panel_4.add(lblTotalIncome);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setLayout(null);
		panel_4_1.setBackground(Color.BLACK);
		panel_4_1.setBounds(66, 260, 320, 50);
		panel_1.add(panel_4_1);
		
		JLabel lblTotalExpenses = new JLabel("Total Expenses");
		lblTotalExpenses.setForeground(Color.WHITE);
		lblTotalExpenses.setFont(new Font("Comic Sans MS", Font.BOLD, 22));
		lblTotalExpenses.setBounds(73, 10, 168, 30);
		panel_4_1.add(lblTotalExpenses);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		panel_3_1.setBackground(new Color(255, 255, 102));
		panel_3_1.setBounds(66, 307, 320, 160);
		panel_1.add(panel_3_1);
		
		JLabel lblUtility = new JLabel("Utility");
		lblUtility.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblUtility.setBounds(10, 20, 143, 34);
		panel_3_1.add(lblUtility);
		
		textFieldUtility = new JTextField();
		textFieldUtility.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		textFieldUtility.setColumns(10);
		textFieldUtility.setBounds(163, 20, 133, 34);
		panel_3_1.add(textFieldUtility);
		
		JLabel lblAdvertisement = new JLabel("Advertisement");
		lblAdvertisement.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblAdvertisement.setBounds(10, 64, 151, 34);
		panel_3_1.add(lblAdvertisement);
		
		JLabel lblEventExpenses = new JLabel("Event Expenses");
		lblEventExpenses.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblEventExpenses.setBounds(10, 108, 151, 34);
		panel_3_1.add(lblEventExpenses);
		
		textFieldAds = new JTextField();
		textFieldAds.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		textFieldAds.setColumns(10);
		textFieldAds.setBounds(163, 64, 133, 34);
		panel_3_1.add(textFieldAds);
		
		textFieldEventExpenses = new JTextField();
		textFieldEventExpenses.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		textFieldEventExpenses.setColumns(10);
		textFieldEventExpenses.setBounds(163, 108, 133, 34);
		panel_3_1.add(textFieldEventExpenses);
		
		JPanel panel_4_2 = new JPanel();
		panel_4_2.setLayout(null);
		panel_4_2.setBackground(Color.BLACK);
		panel_4_2.setBounds(521, 147, 320, 50);
		panel_1.add(panel_4_2);
		
		JLabel lblFinanceStatement = new JLabel("Finance Statement");
		lblFinanceStatement.setForeground(Color.WHITE);
		lblFinanceStatement.setFont(new Font("Comic Sans MS", Font.BOLD, 22));
		lblFinanceStatement.setBounds(57, 10, 213, 30);
		panel_4_2.add(lblFinanceStatement);
		
		JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setLayout(null);
		panel_3_1_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		panel_3_1_1.setBackground(new Color(255, 255, 102));
		panel_3_1_1.setBounds(521, 196, 320, 271);
		panel_1.add(panel_3_1_1);
		
		JLabel lblTotalIncome_1 = new JLabel("Total Income");
		lblTotalIncome_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblTotalIncome_1.setBounds(10, 20, 143, 34);
		panel_3_1_1.add(lblTotalIncome_1);
		
		textFieldTotalIncome = new JTextField();
		textFieldTotalIncome.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		textFieldTotalIncome.setColumns(10);
		textFieldTotalIncome.setBounds(163, 20, 133, 34);
		panel_3_1_1.add(textFieldTotalIncome);
		
		JLabel lblTotalExpenses_1 = new JLabel("Total Expenses");
		lblTotalExpenses_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblTotalExpenses_1.setBounds(10, 64, 151, 34);
		panel_3_1_1.add(lblTotalExpenses_1);
		
		JLabel lblNetIncome = new JLabel("Net Income");
		lblNetIncome.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblNetIncome.setBounds(10, 164, 151, 34);
		panel_3_1_1.add(lblNetIncome);
		
		textFieldTotalExpenses = new JTextField();
		textFieldTotalExpenses.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		textFieldTotalExpenses.setColumns(10);
		textFieldTotalExpenses.setBounds(163, 64, 133, 34);
		panel_3_1_1.add(textFieldTotalExpenses);
		
		textFieldNetIncome = new JTextField();
		textFieldNetIncome.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		textFieldNetIncome.setColumns(10);
		textFieldNetIncome.setBounds(163, 164, 133, 34);
		panel_3_1_1.add(textFieldNetIncome);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 0));
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(10, 136, 300, 7);
		panel_3_1_1.add(separator);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldUtility.setText("");
				textFieldAds.setText("");
				textFieldEventExpenses.setText("");
				textFieldTotalIncome.setText("");
				textFieldTotalExpenses.setText("");
				textFieldNetIncome.setText("");
			}
		});
		btnReset.setBackground(new Color(204, 204, 255));
		btnReset.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
		btnReset.setBounds(25, 222, 128, 39);
		panel_3_1_1.add(btnReset);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ttlES = Double.parseDouble(textFieldEventSales.getText());     //total event sales
				double ttlU  = Double.parseDouble(textFieldUtility.getText());        //total utility
				double ttlA  = Double.parseDouble(textFieldAds.getText());            //total advertisement
				double ttlEX = Double.parseDouble(textFieldEventExpenses.getText());  //total event expenses
				
				double ttlI  = ttlES;                                                 //total income
				double ttlE  = ttlU + ttlA + ttlEX;                                   //total expenses
				double Net   = ttlI - ttlE;                                           //total net income
				
				textFieldTotalIncome.setText(Double.toString(ttlI));
				textFieldTotalExpenses.setText(Double.toString(ttlE));
				textFieldNetIncome.setText(Double.toString(Net));
			}
		});
		btnSubmit.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
		btnSubmit.setBackground(new Color(204, 204, 255));
		btnSubmit.setBounds(168, 222, 128, 39);
		panel_3_1_1.add(btnSubmit);
		
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
		btnBack.setBounds(753, 513, 128, 39);
		panel_1.add(btnBack);
	}
}
