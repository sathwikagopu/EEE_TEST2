package EEE_ECOM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;

public class ecom {

	private JFrame frame;
	int i=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ecom window = new ecom();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ecom() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 752, 342);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AMAZON");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(279, 11, 97, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\online lab\\Downloads\\1.PNG"));
		lblNewLabel_1.setBounds(10, 32, 147, 163);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\online lab\\Downloads\\3.PNG"));
		lblNewLabel_2.setBounds(145, 32, 127, 159);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\online lab\\Downloads\\Screensh3.png"));
		lblNewLabel_3.setBounds(289, 36, 97, 163);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("RS:255");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setForeground(new Color(204, 0, 102));
		lblNewLabel_4.setBounds(48, 206, 64, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("RS:234");
		lblNewLabel_5.setForeground(new Color(153, 0, 153));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(210, 202, 56, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("RS:654");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setForeground(new Color(51, 0, 204));
		lblNewLabel_6.setBounds(319, 210, 67, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JComboBox SELECT = new JComboBox();
		SELECT.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "KINDEX", "GRAMS", "SPF"}));
		SELECT.setBounds(37, 231, 75, 22);
		frame.getContentPane().add(SELECT);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "KINDEX", "SPF"}));
		comboBox_1.setBounds(210, 227, 75, 22);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "SPF", "GRAMS"}));
		comboBox_2.setBounds(329, 235, 89, 22);
		frame.getContentPane().add(comboBox_2);
		
		JLabel lb = new JLabel("CART:0");
		lb.setFont(new Font("Tahoma", Font.BOLD, 30));
		lb.setBounds(527, 32, 157, 28);
		frame.getContentPane().add(lb);
		
		JButton btnNewButton = new JButton("ADD TO CART");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("CART:"+i);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(37, 264, 120, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ADD TO CART");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	        i++;
	lb.setText("CART:"+i);
			}
		});
		btnNewButton_1.setBounds(167, 264, 131, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("ADD TO CART");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			i++;
			lb.setText("CART:"+i);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.setBounds(319, 268, 120, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(562, 106, 56, -16);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel_7 = new JLabel("BILL:0");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_7.setBounds(547, 85, 104, 28);
		frame.getContentPane().add(lblNewLabel_7);
	}
}
