package GenderDiscrimination;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Toolkit;

public class Sales extends JFrame {

	private JPanel contentPane;
	private final JPanel panel = new JPanel();
	private JTextField txtTotalParticipant;
	private JTextField txtEventExpenses;
	private JTextField txtTotalFees;
	private JTextField txtTotalDonation;
	private JTextField txtIncome;
	private JTextField txtOtherExpenses;
	private JTextField txtTotalExpenses;
	protected static double totalFees1, totalFees2, totalFees3;
	protected static double income1, income2, income3;
	protected static double totalExpenses1, totalExpenses2, totalExpenses3;
	protected static double otherExpenses, eventExpenses;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sales frame = new Sales();
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
	public Sales() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sales.class.getResource("gender equality.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 608);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		panel.setBackground(new Color(176, 224, 230));
		panel.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(65, 105, 225)));
		panel.setBounds(0, 0, 936, 571);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(65, 105, 225)));
		panel_1.setBackground(new Color(175, 238, 238));
		panel_1.setBounds(10, 10, 916, 85);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("EVENT SALES REPORT");
		lblNewLabel.setFont(new Font("Viner Hand ITC", Font.PLAIN, 50));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 896, 65);
		panel_1.add(lblNewLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(65, 105, 225)));
		panel_1_1.setBackground(new Color(176, 224, 230));
		panel_1_1.setBounds(10, 105, 383, 390);
		panel.add(panel_1_1);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(65, 105, 225)));
		panel_1_1_2.setBackground(new Color(175, 238, 238));
		panel_1_1_2.setBounds(10, 10, 363, 59);
		panel_1_1.add(panel_1_1_2);
		
		JLabel lblNewLabel_1 = new JLabel("EVENT");
		lblNewLabel_1.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 10, 343, 39);
		panel_1_1_2.add(lblNewLabel_1);
		
		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setLayout(null);
		panel_1_1_1_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(65, 105, 225)));
		panel_1_1_1_1.setBackground(new Color(176, 224, 230));
		panel_1_1_1_1.setBounds(10, 88, 363, 51);
		panel_1_1.add(panel_1_1_1_1);
		
		JRadioButton rdbtnEvent1 = new JRadioButton("EVENT 1");
		buttonGroup_1.add(rdbtnEvent1);
		rdbtnEvent1.setBounds(6, 6, 353, 39);
		panel_1_1_1_1.add(rdbtnEvent1);
		rdbtnEvent1.setBackground(new Color(153, 255, 255));
		rdbtnEvent1.setFont(new Font("STLiti", Font.PLAIN, 20));
		// calculate total fees and income for event 3
		totalFees1 = Registration.totalParticipant1 * Double.parseDouble(Advertisement.fees1) ;
		income1 = totalFees1 +  Registration.totalDonation1;
		rdbtnEvent1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTotalParticipant.setText(Integer.toString(Registration.totalParticipant1) + " participants");
				txtTotalFees.setText(String.format("%.2f", totalFees1));
				txtTotalDonation.setText(String.format("%.2f", Registration.totalDonation1));	
				txtIncome.setText(String.format("%.2f", income1));
			}
		});
		
		JPanel panel_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(65, 105, 225)));
		panel_1_1_1_1_1.setBackground(new Color(176, 224, 230));
		panel_1_1_1_1_1.setBounds(10, 160, 363, 51);
		panel_1_1.add(panel_1_1_1_1_1);
		
		JRadioButton rdbtnEvent2 = new JRadioButton("EVENT 2");
		buttonGroup_1.add(rdbtnEvent2);
		rdbtnEvent2.setFont(new Font("STLiti", Font.PLAIN, 20));
		rdbtnEvent2.setBounds(6, 6, 353, 39);
		panel_1_1_1_1_1.add(rdbtnEvent2);
		rdbtnEvent2.setBackground(new Color(153, 255, 255));
		// calculate total fees and income for event 2
		totalFees2 = Registration.totalParticipant2 * Double.parseDouble(Advertisement.fees2);
		income2 = totalFees2 +  Registration.totalDonation2;
		rdbtnEvent2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTotalParticipant.setText(Integer.toString(Registration.totalParticipant2) + " participants");
				txtTotalFees.setText(String.format("%.2f", totalFees2));
				txtTotalDonation.setText(String.format("%.2f", Registration.totalDonation2));
				txtIncome.setText(String.format("%.2f", income2));
			}
		});
		
		JPanel panel_1_1_1_1_2 = new JPanel();
		panel_1_1_1_1_2.setLayout(null);
		panel_1_1_1_1_2.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(65, 105, 225)));
		panel_1_1_1_1_2.setBackground(new Color(176, 224, 230));
		panel_1_1_1_1_2.setBounds(10, 238, 363, 51);
		panel_1_1.add(panel_1_1_1_1_2);
		
		JRadioButton rdbtnEvent3 = new JRadioButton("EVENT 3");
		buttonGroup_1.add(rdbtnEvent3);
		rdbtnEvent3.setFont(new Font("STLiti", Font.PLAIN, 20));
		rdbtnEvent3.setBounds(6, 6, 353, 39);
		panel_1_1_1_1_2.add(rdbtnEvent3);
		// calculate total fees and income for event 3
		totalFees3 = Registration.totalParticipant3 * Double.parseDouble(Advertisement.fees3);
		income3 = totalFees3 +  Registration.totalDonation3;
		rdbtnEvent3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTotalParticipant.setText(Integer.toString(Registration.totalParticipant3) + " participants");
				txtTotalFees.setText(String.format("%.2f", totalFees3));
				txtTotalDonation.setText(String.format("%.2f", Registration.totalDonation3));	
				txtIncome.setText(String.format("%.2f", income3));
			}
		});
		rdbtnEvent3.setBackground(new Color(153, 255, 255));
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(65, 105, 225)));
		panel_1_1_1.setBackground(new Color(176, 224, 230));
		panel_1_1_1.setBounds(403, 105, 523, 390);
		panel.add(panel_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("TOTAL PARTICIPANT");
		lblNewLabel_2.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(10, 10, 212, 44);
		panel_1_1_1.add(lblNewLabel_2);
		
		txtTotalParticipant = new JTextField();
		txtTotalParticipant.setEditable(false);
		txtTotalParticipant.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtTotalParticipant.setBounds(232, 10, 281, 44);
		panel_1_1_1.add(txtTotalParticipant);
		txtTotalParticipant.setColumns(10);
		
		txtEventExpenses = new JTextField();
		txtEventExpenses.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtEventExpenses.setColumns(10);
		txtEventExpenses.setBounds(232, 228, 281, 44);
		panel_1_1_1.add(txtEventExpenses);
		
		JLabel lblNewLabel_2_1 = new JLabel("EVENT EXPENSES (RM)");
		lblNewLabel_2_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(10, 228, 212, 44);
		panel_1_1_1.add(lblNewLabel_2_1);
		
		txtTotalFees = new JTextField();
		txtTotalFees.setEditable(false);
		txtTotalFees.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtTotalFees.setColumns(10);
		txtTotalFees.setBounds(232, 64, 281, 44);
		panel_1_1_1.add(txtTotalFees);
		
		JLabel lblNewLabel_2_2 = new JLabel("TOTAL FEES (RM)");
		lblNewLabel_2_2.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblNewLabel_2_2.setBounds(10, 64, 212, 44);
		panel_1_1_1.add(lblNewLabel_2_2);
		
		txtTotalDonation = new JTextField();
		txtTotalDonation.setEditable(false);
		txtTotalDonation.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtTotalDonation.setColumns(10);
		txtTotalDonation.setBounds(232, 118, 281, 44);
		panel_1_1_1.add(txtTotalDonation);
		
		JLabel lblNewLabel_2_3 = new JLabel("TOTAL DONATION (RM)");
		lblNewLabel_2_3.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblNewLabel_2_3.setBounds(10, 118, 212, 44);
		panel_1_1_1.add(lblNewLabel_2_3);
		
		txtIncome = new JTextField();
		txtIncome.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtIncome.setColumns(10);
		txtIncome.setBounds(232, 174, 281, 44);
		panel_1_1_1.add(txtIncome);
		
		txtTotalExpenses = new JTextField();
		txtTotalExpenses.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtTotalExpenses.setColumns(10);
		txtTotalExpenses.setBounds(232, 336, 281, 44);
		panel_1_1_1.add(txtTotalExpenses);
		
		txtOtherExpenses = new JTextField();
		txtOtherExpenses.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtOtherExpenses.setColumns(10);
		txtOtherExpenses.setBounds(232, 282, 281, 44);
		panel_1_1_1.add(txtOtherExpenses);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("OTHER EXPENSES (RM)");
		lblNewLabel_2_1_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblNewLabel_2_1_1.setBounds(10, 282, 212, 44);
		panel_1_1_1.add(lblNewLabel_2_1_1);
		
		// insert and calculate the total expenses
		JButton btnTotalExpense = new JButton("TOTAL EXPENSE (RM)");
		btnTotalExpense.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					otherExpenses = Double.parseDouble(txtOtherExpenses.getText());
					eventExpenses = Double.parseDouble(txtEventExpenses.getText());
					
					if(rdbtnEvent1.isSelected()) {
						totalExpenses1 = otherExpenses + eventExpenses;
						txtTotalExpenses.setText(String.format("%.2f", totalExpenses1));
					}
					else if(rdbtnEvent2.isSelected()) {
						totalExpenses3 = otherExpenses + eventExpenses;
						txtTotalExpenses.setText(String.format("%.2f", totalExpenses3));
					}
					else if(rdbtnEvent2.isSelected()) {
						totalExpenses3 = otherExpenses + eventExpenses;
						txtTotalExpenses.setText(String.format("%.2f", totalExpenses3));
					}
				}catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter expenses!");
				}
			}
		});
		btnTotalExpense.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 13));
		btnTotalExpense.setBounds(10, 336, 212, 44);
		panel_1_1_1.add(btnTotalExpense);
		
		JLabel lblIncome = new JLabel("INCOME (RM)");
		lblIncome.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblIncome.setBounds(10, 174, 212, 44);
		panel_1_1_1.add(lblIncome);
		
		// Back to Admin page frame
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminPage ap = new AdminPage();
				ap.setModalExclusionType(null);
				ap.setVisible(true);
			}
		});
		btnBack.setFont(new Font("Showcard Gothic", Font.PLAIN, 30));
		btnBack.setBackground(new Color(153, 255, 255));
		btnBack.setBounds(59, 505, 240, 56);
		panel.add(btnBack);
		
		//Exit the application
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Event Sales Report", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Showcard Gothic", Font.PLAIN, 30));
		btnExit.setBackground(new Color(153, 255, 255));
		btnExit.setBounds(642, 505, 240, 56);
		panel.add(btnExit);
		
		// Go to Finance frame
		JButton btnFinance = new JButton("FINANCE");
		btnFinance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Finance f = new Finance();
				f.setModalExclusionType(null);
				f.setVisible(true);
			}
		});
		btnFinance.setFont(new Font("Showcard Gothic", Font.PLAIN, 30));
		btnFinance.setBackground(new Color(153, 255, 255));
		btnFinance.setBounds(347, 505, 240, 56);
		panel.add(btnFinance);
	
	}
}
