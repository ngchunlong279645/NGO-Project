package SoupKitchenPage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomeAdmin extends JFrame {

	private JPanel contentPane;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeAdmin frame = new HomeAdmin();
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
	public HomeAdmin() {
		setTitle("Admin Home");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(216, 191, 216));
		contentPane.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 102, 153)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ADMIN");
		lblNewLabel.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 30));
		lblNewLabel.setBounds(198, 46, 101, 52);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Organisation Background");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminOrganisationBackground a = new AdminOrganisationBackground();
				a.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(153, 102, 153));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(48, 120, 188, 64);
		contentPane.add(btnNewButton);
		
		JButton btnMenuSetPrice = new JButton("Menu Set Price");
		btnMenuSetPrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminMenuSetPrice a = new AdminMenuSetPrice();
				a.setVisible(true);
				dispose();
			}
		});
		btnMenuSetPrice.setForeground(Color.WHITE);
		btnMenuSetPrice.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnMenuSetPrice.setBackground(new Color(153, 102, 153));
		btnMenuSetPrice.setBounds(48, 231, 188, 64);
		contentPane.add(btnMenuSetPrice);
		
		JButton btnProgramDescription = new JButton("Program Description");
		btnProgramDescription.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminProgramDescription a = new AdminProgramDescription();
				a.setVisible(true);
				dispose();
			}
		});
		btnProgramDescription.setForeground(Color.WHITE);
		btnProgramDescription.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnProgramDescription.setBackground(new Color(153, 102, 153));
		btnProgramDescription.setBounds(256, 120, 188, 64);
		contentPane.add(btnProgramDescription);
		
		JButton btnFinance = new JButton("Finance");
		btnFinance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FinanceAdmin a = new FinanceAdmin();
				a.setVisible(true);
				dispose();
			}
		});
		btnFinance.setForeground(Color.WHITE);
		btnFinance.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnFinance.setBackground(new Color(153, 102, 153));
		btnFinance.setBounds(256, 231, 188, 64);
		contentPane.add(btnFinance);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();		//Action for button Exit
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Admin Menu", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setForeground(Color.WHITE);
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnExit.setBackground(new Color(153, 102, 153));
		btnExit.setBounds(154, 346, 188, 64);
		contentPane.add(btnExit);
	}
}