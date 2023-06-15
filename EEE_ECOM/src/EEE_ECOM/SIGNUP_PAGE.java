package EEE_ECOM;

import java.awt.EventQueue;
import javax.swing.ButtonGroup;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SIGNUP_PAGE {

	private JFrame frame;
	private JTextField tb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SIGNUP_PAGE window = new SIGNUP_PAGE();
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
	public SIGNUP_PAGE() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 675, 449);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SIGNUP_PAGE");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(170, 30, 271, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(96, 110, 90, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("GENDER");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(96, 164, 107, 32);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("DEPARTMENT");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(96, 229, 176, 32);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("PROGRAMMING");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(106, 264, 144, 62);
		frame.getContentPane().add(lblNewLabel_4);
		
		tb = new JTextField();
		tb.setBounds(269, 110, 209, 32);
		frame.getContentPane().add(tb);
		tb.setColumns(10);
		
		JRadioButton r1 = new JRadioButton("female");
		r1.setFont(new Font("Tahoma", Font.BOLD, 12));
		r1.setBounds(288, 164, 77, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("male");
		r2.setFont(new Font("Tahoma", Font.BOLD, 12));
		r2.setBounds(456, 164, 67, 23);
		frame.getContentPane().add(r2);
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		JComboBox c1 = new JComboBox();
		c1.setFont(new Font("Tahoma", Font.BOLD, 12));
		c1.setModel(new DefaultComboBoxModel(new String[] {"select", "EEE", "ECE", "CSE", "IT", "MECH", "MINING"}));
		c1.setBounds(313, 229, 128, 22);
		frame.getContentPane().add(c1);
		
		JCheckBox cb1 = new JCheckBox("JAVA");
		cb1.setFont(new Font("Tahoma", Font.BOLD, 12));
		cb1.setBounds(268, 285, 57, 23);
		frame.getContentPane().add(cb1);
		
		JCheckBox cb2 = new JCheckBox("python");
		cb2.setFont(new Font("Tahoma", Font.BOLD, 12));
		cb2.setBounds(352, 285, 77, 23);
		frame.getContentPane().add(cb2);
		
		JCheckBox cb3 = new JCheckBox("cloud");
		cb3.setFont(new Font("Tahoma", Font.BOLD, 12));
		cb3.setBounds(456, 284, 77, 23);
		frame.getContentPane().add(cb3);
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=tb.getText();
				String g;
				if(r1.isSelected()) 
				{
					g="female";
				}
				else if(r2.isSelected())
				{
					g="male";
				}
				else
				{
					g="invalid";
				}
				String b=(String) c1.getSelectedItem();
				String p;
				if(cb1.isSelected())
				{
					p="java";
				}
				else if(cb2.isSelected())
				{
					p="python";
				}
				else
				{
					p="c";
				}
				JOptionPane.showMessageDialog(btnNewButton, 
						"Hello "+n+" \n gender :"+g+"\n Branch"+b+"\n programming"+p);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(287, 343, 128, 41);
		frame.getContentPane().add(btnNewButton);
	}
}
