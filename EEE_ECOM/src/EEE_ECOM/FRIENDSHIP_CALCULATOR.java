package EEE_ECOM;

import java.awt.EventQueue;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FRIENDSHIP_CALCULATOR {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FRIENDSHIP_CALCULATOR window = new FRIENDSHIP_CALCULATOR();
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
	public FRIENDSHIP_CALCULATOR() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 30));
		frame.getContentPane().setBackground(new Color(255, 255, 51));
		frame.setBounds(100, 100, 375, 474);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lb1 = new JLabel("FRIENDSHIP_CALCULATOR");
		lb1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lb1.setBounds(81, 23, 228, 32);
		frame.getContentPane().add(lb1);
		
		JLabel lb2 = new JLabel("NAME");
		lb2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lb2.setBounds(38, 74, 46, 14);
		frame.getContentPane().add(lb2);
		
		JLabel lb3 = new JLabel("FRIEND'S NAME");
		lb3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lb3.setBounds(10, 124, 135, 41);
		frame.getContentPane().add(lb3);
		
		tb1 = new JTextField();
		tb1.setBounds(26, 99, 135, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setBounds(20, 157, 124, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(81, 246, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1.setBounds(38, 200, 75, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
				
		JLabel lb5 = new JLabel("");
		lb5.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lb5.setBackground(new Color(204, 204, 255));
		lb5.setBounds(199, 157, 124, 44);
		frame.getContentPane().add(lb5);
		
		
		JButton btnNewButton = new JButton("check");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random r=new Random();
				int n=r.nextInt(1,100);
				lb5.setText(n+"%");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton.setBounds(97, 212, 124, 48);
		frame.getContentPane().add(btnNewButton);
		
		
		
		
	}
}
