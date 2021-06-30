package GenderDiscrimination;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;

public class AdminPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPage frame = new AdminPage();
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
	public AdminPage() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AdminPage.class.getResource("gender equality.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 922, 624);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 153, 255));
		panel.setBorder(new LineBorder(new Color(51, 51, 255), 5));
		panel.setBounds(0, 0, 908, 587);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(51, 51, 255), 5));
		panel_1.setBackground(new Color(51, 204, 255));
		panel_1.setBounds(10, 10, 888, 114);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("ADMINISTRATION");
		lblNewLabel.setFont(new Font("Showcard Gothic", Font.PLAIN, 60));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 868, 94);
		panel_1.add(lblNewLabel);
		
		// Go to advertisement frame
		JButton btnAdvertisement = new JButton("ADVERTISEMENT");
		btnAdvertisement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Advertisement ads = new Advertisement();
				ads.setModalExclusionType(null);
				ads.setVisible(true);
			}
		});
		btnAdvertisement.setFont(new Font("Modern No. 20", Font.PLAIN, 40));
		btnAdvertisement.setBounds(239, 217, 427, 90);
		panel.add(btnAdvertisement);
		
		// Go to sales frame
		JButton btnSales = new JButton("SALES");
		btnSales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sales s = new Sales();
				s.setModalExclusionType(null);
				s.setVisible(true);
			}
		});
		btnSales.setFont(new Font("Modern No. 20", Font.PLAIN, 40));
		btnSales.setBounds(239, 390, 427, 90);
		panel.add(btnSales);
		
		// Back to UN Women frame
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UNWomen un = new UNWomen();
				un.setModalExclusionType(null);
				un.setVisible(true);
			}
		});
		btnBack.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		btnBack.setBounds(762, 539, 136, 38);
		panel.add(btnBack);
	}
}
