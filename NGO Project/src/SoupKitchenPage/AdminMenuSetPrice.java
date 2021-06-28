package SoupKitchenPage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminMenuSetPrice extends JFrame {

	private JPanel contentPane;
	private JTextField breakfast;
	private JTextField lunch;
	private JTextField dinner;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminMenuSetPrice frame = new AdminMenuSetPrice();
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
	public AdminMenuSetPrice() {
		setTitle("Set Menu Price");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(216, 191, 216));
		contentPane.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(153, 102, 153)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Set Price ");
		lblNewLabel.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 30));
		lblNewLabel.setBounds(177, 47, 115, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Breakfast: RM");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(39, 115, 130, 40);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Lunch: RM");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(39, 208, 130, 40);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Dinner: RM");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(39, 294, 130, 40);
		contentPane.add(lblNewLabel_1_2);
		
		JButton btnNewButton = new JButton("SET");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String br = breakfast.getText();//getter method 
				String lc = lunch.getText();
				String dn = dinner.getText();
				DonatingSet ds = new DonatingSet();//create object ds with class DonatingSet
				ds.updatePrice(br, lc, dn);//passing value
				ds.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(153, 102, 153));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(319, 385, 130, 40);
		contentPane.add(btnNewButton);
		
		breakfast = new JTextField();
		breakfast.setFont(new Font("Tahoma", Font.PLAIN, 17));
		breakfast.setBounds(177, 115, 154, 40);
		contentPane.add(breakfast);
		breakfast.setColumns(10);
		
		lunch = new JTextField();
		lunch.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lunch.setColumns(10);
		lunch.setBounds(177, 210, 154, 40);
		contentPane.add(lunch);
		
		dinner = new JTextField();
		dinner.setFont(new Font("Tahoma", Font.PLAIN, 17));
		dinner.setColumns(10);
		dinner.setBounds(177, 294, 154, 40);
		contentPane.add(dinner);
	}

}