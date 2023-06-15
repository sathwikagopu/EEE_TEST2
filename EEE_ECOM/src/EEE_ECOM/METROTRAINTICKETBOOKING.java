package EEE_ECOM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class METROTRAINTICKETBOOKING {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					METROTRAINTICKETBOOKING window = new METROTRAINTICKETBOOKING();
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
	public METROTRAINTICKETBOOKING() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 807, 472);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("METRO TICKET BOOKING");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 34));
		lblNewLabel.setBounds(177, 29, 410, 38);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(147, 121, 101, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("FROM");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(147, 180, 120, 38);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("TO");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(147, 235, 133, 38);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("TICKETS");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(147, 295, 157, 38);
		frame.getContentPane().add(lblNewLabel_4);
		
		tb1 = new JTextField();
		tb1.setBounds(335, 121, 211, 30);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		JComboBox c1 = new JComboBox();
		c1.setFont(new Font("Tahoma", Font.BOLD, 20));
		c1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "MIYAPUR", "JNTU", "KBHP", "KUTKATPALLY", "MOSAPET", "BHARATNAGAR", "SRNAGAR", "AMPEERPET", "PAJAGUTTA", "LBNAGAR"}));
		c1.setBounds(335, 192, 211, 26);
		frame.getContentPane().add(c1);
		
		JComboBox c2 = new JComboBox();
		c2.setFont(new Font("Tahoma", Font.BOLD, 20));
		c2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "JNTU", "KBHP", "KUTKATPALLY", "MOSAPET", "BHARATNAGAR", "SRNAGAR", "AMEERPET", "PAJAGUTTA", "LBNAGAR"}));
		c2.setBounds(335, 247, 211, 26);
		frame.getContentPane().add(c2);
		
		JComboBox c3 = new JComboBox();
		c3.setFont(new Font("Tahoma", Font.BOLD, 20));
		c3.setModel(new DefaultComboBoxModel(new String[] {"select", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		c3.setBounds(335, 295, 211, 38);
		frame.getContentPane().add(c3);
		JButton btnNewButton = new JButton("BOOK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 String pn=tb1.getText();
			 String fr=(String) c1.getSelectedItem();
			 String to=(String) c2.getSelectedItem();
			 String tickets=(String) c3.getSelectedItem();
			 int t=Integer.parseInt(tickets);
			 int bill=t*40;
			 JOptionPane.showMessageDialog(btnNewButton,"Hello "+pn+"\n From :"+fr+"\n To:"+to+"\n Tickets:"+t+"\n Bill:"+bill);
			 
			 }
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(287, 378, 138, 23);
		frame.getContentPane().add(btnNewButton);
		
		
	}
}
