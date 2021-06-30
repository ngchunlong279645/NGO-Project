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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Toolkit;

public class EventDescription extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	/**
	 * Create the frame.
	 */
	public EventDescription(String e1, String e2, String e3) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(EventDescription.class.getResource("gender equality.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 666);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 206, 250));
		panel.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(102, 0, 204)));
		panel.setBounds(0, 0, 986, 629);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(102, 0, 204)));
		panel_1.setBackground(new Color(175, 238, 238));
		panel_1.setBounds(10, 10, 966, 80);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("EVENT DESCRIPTION");
		lblNewLabel.setFont(new Font("Castellar", Font.PLAIN, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 946, 60);
		panel_1.add(lblNewLabel);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(102, 0, 204)));
		panel_1_1_1.setBackground(new Color(135, 206, 235));
		panel_1_1_1.setBounds(393, 100, 583, 519);
		panel.add(panel_1_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 563, 499);
		panel_1_1_1.add(scrollPane);
		
		// clear all event detail if no event selected
		JTextPane textpane = new JTextPane();
		scrollPane.setViewportView(textpane);
		textpane.setEditable(false);
		textpane.setBackground(new Color(175, 238, 238));
		textpane.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 17));
		textpane.setText("Event Name: "
				+ "\r\n\r\nDate: "
				+ "\r\n\r\nTime: "
				+ "\r\n\r\nLocation: "
				+ "\r\n\r\nFees: RM"
				+ "\r\n\r\nMax Participant: "
				+ "\r\n\r\nPrize: "
				+ "\r\n\r\nEvent Website: "
				+ "\r\n\r\nIf you donate more than RM1000.00, you will get a tax reduction of %"
				+ "\r\n\r\nEvent Description:");
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(102, 0, 204)));
		panel_1_1.setBackground(new Color(135, 206, 250));
		panel_1_1.setBounds(10, 100, 373, 297);
		panel.add(panel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("EVENT");
		lblNewLabel_1.setBackground(new Color(135, 206, 235));
		lblNewLabel_1.setFont(new Font("Modern No. 20", Font.ITALIC, 30));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 10, 353, 51);
		panel_1_1.add(lblNewLabel_1);
		
		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setLayout(null);
		panel_1_1_1_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(102, 0, 204)));
		panel_1_1_1_1.setBackground(new Color(175, 238, 238));
		panel_1_1_1_1.setBounds(10, 10, 353, 51);
		panel_1_1.add(panel_1_1_1_1);
		
		// If event 1 selected, show the detail of event 1
		JRadioButton rdbtnEvent1 = new JRadioButton("Event 1");
		buttonGroup.add(rdbtnEvent1);
		rdbtnEvent1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textpane.setText(e1);
			}
		});
		rdbtnEvent1.setBackground(new Color(175, 238, 238));
		rdbtnEvent1.setFont(new Font("Lucida Handwriting", Font.PLAIN, 20));
		rdbtnEvent1.setBounds(10, 90, 357, 39);
		panel_1_1.add(rdbtnEvent1);
		
		// If event 1 selected, show the detail of event 2
		JRadioButton rdbtnEvent2 = new JRadioButton("Event 2");
		buttonGroup.add(rdbtnEvent2);
		rdbtnEvent2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				textpane.setText(e2);
			}
		});
		rdbtnEvent2.setFont(new Font("Lucida Handwriting", Font.PLAIN, 20));
		rdbtnEvent2.setBackground(new Color(175, 238, 238));
		rdbtnEvent2.setBounds(6, 158, 357, 39);
		panel_1_1.add(rdbtnEvent2);
		
		// If event 1 selected, show the detail of event 3
		JRadioButton rdbtnEvent3 = new JRadioButton("Event 3");
		buttonGroup.add(rdbtnEvent3);
		rdbtnEvent3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textpane.setText(e3);
			}
		});
		rdbtnEvent3.setFont(new Font("Lucida Handwriting", Font.PLAIN, 20));
		rdbtnEvent3.setBackground(new Color(175, 238, 238));
		rdbtnEvent3.setBounds(6, 229, 357, 39);
		panel_1_1.add(rdbtnEvent3);
		
		// Go to registration frame
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registration p = new Registration();
				p.setModalExclusionType(null);
				p.setVisible(true);
			}
		});
		btnRegister.setBackground(new Color(175, 238, 238));
		btnRegister.setBounds(20, 421, 353, 51);
		panel.add(btnRegister);
		btnRegister.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		
		// Exit the application
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Event Description", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setBackground(new Color(175, 238, 238));
		btnExit.setBounds(20, 546, 353, 51);
		panel.add(btnExit);
		btnExit.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		
		// Back to UN Women frame
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UNWomen un = new UNWomen();
				un.setModalExclusionType(null);
				un.setVisible(true);
			}
		});
		btnBack.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		btnBack.setBackground(new Color(175, 238, 238));
		btnBack.setBounds(20, 485, 353, 51);
		panel.add(btnBack);
	}
}
