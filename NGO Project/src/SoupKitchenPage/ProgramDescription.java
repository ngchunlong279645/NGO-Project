package SoupKitchenPage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProgramDescription extends JFrame {

	private JPanel contentPane;
	private JLabel prog1;
	private JLabel loc1;
	private JLabel day1;
	private JLabel time1;
	private JLabel prog2;
	private JLabel loc2;
	private JLabel day2;
	private JLabel time2;
	private JLabel date2;
	private JLabel fee2;
	
	/**
	 * Launch the application.
	 */
	//get value from other frame
	public void updateProgramDesc(String p1, String l1, String d1, String t1, String p2, String l2, String d2, String t2, String dt, String f2) {
		prog1.setText(p1);
		loc1.setText(l1);	
		day1.setText(d1);
		time1.setText(t2);
		prog2.setText(p2);
		loc2.setText(l2);
		day2.setText(d2);
		time2.setText(t2);
		date2.setText(dt);
		fee2.setText(f2);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProgramDescription frame = new ProgramDescription();
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
	public ProgramDescription() {
		setTitle("Program Description");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1030, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(216, 191, 216));
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 102, 153)));
		panel.setBounds(0, 0, 1016, 593);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_tittle = new JPanel();
		panel_tittle.setLayout(null);
		panel_tittle.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 102, 153)));
		panel_tittle.setBackground(new Color(216, 191, 216));
		panel_tittle.setBounds(309, 36, 347, 47);
		panel.add(panel_tittle);
		
		JLabel TittleLabel = new JLabel("PROGRAM DESCRIPTION");
		TittleLabel.setFont(new Font("Tahoma", Font.BOLD, 23));
		TittleLabel.setBounds(25, 11, 306, 25);
		panel_tittle.add(TittleLabel);
		
		JPanel panel_info = new JPanel();
		panel_info.setLayout(null);
		panel_info.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 102, 153)));
		panel_info.setBackground(new Color(216, 191, 216));
		panel_info.setBounds(34, 120, 553, 256);
		panel.add(panel_info);
		
		JTextArea txtrProgramSoup = new JTextArea();
		txtrProgramSoup.setBounds(10, 136, 535, 109);
		panel_info.add(txtrProgramSoup);
		txtrProgramSoup.setText("M E N U\r\nSession 1 - Breakfast with Bihun goreng\r\nSession 2 - Lunch with Nasi putih + ikan + sayur\r\nSession 3 - Dinner with Nasi goreng kampung");
		txtrProgramSoup.setBackground(new Color(216, 191, 216));
		txtrProgramSoup.setEditable(false);
		txtrProgramSoup.setFont(new Font("Monospaced", Font.BOLD, 18));
		
		JLabel lblNewLabel_1 = new JLabel("Program -");
		lblNewLabel_1.setFont(new Font("Monospaced", Font.BOLD, 18));
		lblNewLabel_1.setBounds(10, 11, 109, 23);
		panel_info.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Location:");
		lblNewLabel_1_1.setFont(new Font("Monospaced", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(10, 43, 109, 23);
		panel_info.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Day:");
		lblNewLabel_1_2.setFont(new Font("Monospaced", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(10, 77, 109, 23);
		panel_info.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Time:");
		lblNewLabel_1_3.setFont(new Font("Monospaced", Font.BOLD, 18));
		lblNewLabel_1_3.setBounds(10, 106, 109, 23);
		panel_info.add(lblNewLabel_1_3);
		
		prog1 = new JLabel("");
		prog1.setFont(new Font("Monospaced", Font.BOLD, 18));
		prog1.setBounds(129, 11, 109, 23);
		panel_info.add(prog1);
		
		loc1 = new JLabel("");
		loc1.setFont(new Font("Monospaced", Font.BOLD, 18));
		loc1.setBounds(129, 43, 109, 23);
		panel_info.add(loc1);
		
		day1 = new JLabel("");
		day1.setFont(new Font("Monospaced", Font.BOLD, 18));
		day1.setBounds(129, 77, 109, 23);
		panel_info.add(day1);
		
		time1 = new JLabel("");
		time1.setFont(new Font("Monospaced", Font.BOLD, 18));
		time1.setBounds(129, 106, 109, 23);
		panel_info.add(time1);
		
		JLabel VirtualRunLogo = new JLabel("");
		VirtualRunLogo.setIcon(new ImageIcon(""));
		VirtualRunLogo.setBounds(660, 120, 257, 256);
		panel.add(VirtualRunLogo);
		VirtualRunLogo.setLabelFor(this);
		
		JLabel BreakfastLogo = new JLabel("");
		BreakfastLogo.setIcon(new ImageIcon(""));
		BreakfastLogo.setBounds(81, 431, 105, 129);
		panel.add(BreakfastLogo);
		
		JLabel LunchLogo = new JLabel("");
		LunchLogo.setIcon(new ImageIcon(""));
		LunchLogo.setBounds(259, 416, 105, 129);
		panel.add(LunchLogo);
		
		JLabel DinnerLogo = new JLabel("");
		DinnerLogo.setIcon(new ImageIcon(""));
		DinnerLogo.setBounds(424, 431, 105, 129);
		panel.add(DinnerLogo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 102, 153)));
		panel_1.setBackground(new Color(216, 191, 216));
		panel_1.setBounds(599, 388, 385, 172);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_4 = new JLabel("Program -");
		lblNewLabel_1_4.setFont(new Font("Monospaced", Font.BOLD, 18));
		lblNewLabel_1_4.setBounds(10, 11, 109, 23);
		panel_1.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Location:");
		lblNewLabel_1_5.setFont(new Font("Monospaced", Font.BOLD, 18));
		lblNewLabel_1_5.setBounds(10, 38, 109, 23);
		panel_1.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Day:");
		lblNewLabel_1_6.setFont(new Font("Monospaced", Font.BOLD, 18));
		lblNewLabel_1_6.setBounds(10, 62, 109, 23);
		panel_1.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("Time:");
		lblNewLabel_1_7.setFont(new Font("Monospaced", Font.BOLD, 18));
		lblNewLabel_1_7.setBounds(10, 91, 109, 23);
		panel_1.add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_8 = new JLabel("Date:");
		lblNewLabel_1_8.setFont(new Font("Monospaced", Font.BOLD, 18));
		lblNewLabel_1_8.setBounds(10, 115, 109, 23);
		panel_1.add(lblNewLabel_1_8);
		
		JLabel lblNewLabel_1_9 = new JLabel("Fee:");
		lblNewLabel_1_9.setFont(new Font("Monospaced", Font.BOLD, 18));
		lblNewLabel_1_9.setBounds(10, 138, 109, 23);
		panel_1.add(lblNewLabel_1_9);
		
		prog2 = new JLabel("");
		prog2.setFont(new Font("Monospaced", Font.BOLD, 18));
		prog2.setBounds(129, 11, 109, 23);
		panel_1.add(prog2);
		
		loc2 = new JLabel("");
		loc2.setFont(new Font("Monospaced", Font.BOLD, 18));
		loc2.setBounds(129, 38, 109, 23);
		panel_1.add(loc2);
		
		day2 = new JLabel("");
		day2.setFont(new Font("Monospaced", Font.BOLD, 18));
		day2.setBounds(129, 62, 109, 23);
		panel_1.add(day2);
		
		time2 = new JLabel("");
		time2.setFont(new Font("Monospaced", Font.BOLD, 18));
		time2.setBounds(129, 91, 109, 23);
		panel_1.add(time2);
		
		fee2 = new JLabel("");
		fee2.setFont(new Font("Monospaced", Font.BOLD, 18));
		fee2.setBounds(129, 138, 109, 23);
		panel_1.add(fee2);
		
		date2 = new JLabel("");
		date2.setFont(new Font("Monospaced", Font.BOLD, 18));
		date2.setBounds(129, 115, 109, 23);
		panel_1.add(date2);
		
		JLabel lblNewLabel = new JLabel("Bihun Goreng");
		lblNewLabel.setFont(new Font("Calibri Light", Font.BOLD, 17));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(81, 416, 105, 21);
		panel.add(lblNewLabel);
		
		JLabel lblNasiGoreng = new JLabel("Nasi Goreng");
		lblNasiGoreng.setForeground(Color.BLACK);
		lblNasiGoreng.setFont(new Font("Calibri Light", Font.BOLD, 17));
		lblNasiGoreng.setBounds(434, 416, 105, 21);
		panel.add(lblNasiGoreng);
		
		JLabel lblMEN = new JLabel("M E N U");
		lblMEN.setForeground(Color.BLACK);
		lblMEN.setFont(new Font("Calibri Light", Font.BOLD, 21));
		lblMEN.setBounds(269, 399, 85, 21);
		panel.add(lblMEN);
		
		JLabel lblNasiLauk = new JLabel("Nasi + Ikan + Sayur");
		lblNasiLauk.setForeground(Color.BLACK);
		lblNasiLauk.setFont(new Font("Calibri Light", Font.BOLD, 17));
		lblNasiLauk.setBounds(239, 549, 145, 21);
		panel.add(lblNasiLauk);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminProgramDescription frame = new AdminProgramDescription ();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(153, 102, 153));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(10, 11, 116, 39);
		panel.add(btnNewButton);
	}
}