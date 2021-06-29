package RacialInjusticePage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.event.InputMethodListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.awt.event.InputMethodEvent;
import javax.swing.DropMode;

public class Advertisement extends JFrame {

	private JPanel contentPane;
	private JTextPane txtpnHowToJoinLuckyDraw;
	/**
	 * Launch the application.
	 */
	public static void TextFromFile(JTextPane txtpnHowToJoinLuckyDraw) {
		try {
			String path = ""; //D:\\LeeJieHui279096\\STIA1123_Programming_A202(I)\\Assignment3\\GUI_NGO Racial Injusctice\\TextFileAss3\\Admin_UpdateDescription\\AdvertisementDescription.txt
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
	
	public Advertisement() { //constructor with no argument
		Font font = new Font("",Font.BOLD,20);
		
		setTitle("Advertisement");  
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("")));//Icon/SumWithUsicon.png
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1029, 664);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelAd = new JPanel();
		panelAd.setBackground(new Color(255,180,162)); //Melon: FFB4A2
		panelAd.setBounds(0, 0, 1015, 627);
		contentPane.add(panelAd);
		panelAd.setLayout(null);
		
		JPanel panelAdvertise = new JPanel();
		panelAdvertise.setBounds(256, 21, 513, 68);
		panelAdvertise.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(204, 102, 153)));
		panelAdvertise.setLayout(null);
		panelAdvertise.setBackground(new Color(255,180,162)); 
		panelAd.add(panelAdvertise);
		
		JLabel lblAd = new JLabel("ADVERTISEMENT");
		lblAd.setForeground(new Color(204, 102, 153));
		lblAd.setHorizontalAlignment(SwingConstants.CENTER);
		lblAd.setFont(new Font("Algerian", Font.BOLD, 50));
		lblAd.setBounds(45, 10, 436, 62);
		panelAdvertise.add(lblAd);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(525, 137, 480, 271);
		panelAd.add(scrollPane, BorderLayout.CENTER);
		panelAd.add(scrollPane);
		JTextPane txtpnHowToJoinLuckyDraw_1= new JTextPane();
		scrollPane.setViewportView(txtpnHowToJoinLuckyDraw_1);
		txtpnHowToJoinLuckyDraw_1.setEditable(false);
		TextFromFile(txtpnHowToJoinLuckyDraw_1);
		txtpnHowToJoinLuckyDraw_1.setFont(font);
		txtpnHowToJoinLuckyDraw_1.setForeground(Color.black);
		
		JLabel lblBlogger = new JLabel();
		lblBlogger.setBounds(780, 447, 98, 85);
		lblBlogger.setIcon(new ImageIcon(getClass().getResource(""))); //Icon/icons8-blogger-96.png
		lblBlogger.setToolTipText("Official Website: https://www.sumwithus.org/en");
		panelAd.add(lblBlogger);
		
		JLabel lblInsta = new JLabel();
		lblInsta.setBounds(650, 447, 98, 85);
		lblInsta.setIcon(new ImageIcon(getClass().getResource(""))); //Icon/icons8-instagram-96.png
		lblInsta.setToolTipText("https://www.instagram.com/sumwithus_NgoRacialOrganization");
		panelAd.add(lblInsta);
		
		JLabel lblFB = new JLabel();
		lblFB.setBounds(525, 447, 98, 85);
		lblFB.setIcon(new ImageIcon(getClass().getResource(""))); //Icon/icons8-facebook-96 (1).png
		lblFB.setToolTipText("https://www.facebook.com/sumwithus_NgoRacialOrganization");
		panelAd.add(lblFB);
		
		JLabel lblLuckyDrawWheel = new JLabel("");
		lblLuckyDrawWheel.setBounds(0, 99, 504, 485);
		lblLuckyDrawWheel.setHorizontalAlignment(SwingConstants.LEFT);
		lblLuckyDrawWheel.setIcon(new ImageIcon(getClass().getResource("")));//Icon/LuckyDraw.png
		panelAd.add(lblLuckyDrawWheel);
		
		JLabel lblNewLabel = new JLabel("There are many prizes waiting for you. Don't wait and quickly join our event to join the lucky draw.");
		lblNewLabel.setBounds(10, 594, 668, 23);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panelAd.add(lblNewLabel);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(702, 549, 224, 48);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login l = new Login();//obj created for class Login() 
				l.setVisible(true); // Open the Login.java window
				dispose();// Close the Login.java window
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		panelAd.add(btnExit);
		
		
	}
}
