package EEE_ECOM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.TextArea;
import java.awt.Font;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registration_Page {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration_Page window = new Registration_Page();
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
	public Registration_Page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(51, 255, 204));
		frame.setBounds(100, 100, 723, 401);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		TextArea textArea = new TextArea();
		textArea.setFont(new Font("Dialog", Font.BOLD, 14));
		textArea.setText("REGISTRATION");
		textArea.setBounds(198, 69, 155, 41);
		frame.getContentPane().add(textArea);
		
		TextArea textArea_1 = new TextArea();
		textArea_1.setFont(new Font("Dialog", Font.BOLD, 12));
		textArea_1.setText("NAME");
		textArea_1.setBounds(32, 128, 212, 41);
		frame.getContentPane().add(textArea_1);
		
		TextArea textArea_2 = new TextArea();
		textArea_2.setFont(new Font("Dialog", Font.BOLD, 12));
		textArea_2.setText("EMAIL");
		textArea_2.setBounds(39, 186, 127, 67);
		frame.getContentPane().add(textArea_2);
		
		TextArea textArea_3 = new TextArea();
		textArea_3.setFont(new Font("Dialog", Font.BOLD, 12));
		textArea_3.setText("PHONE NO");
		textArea_3.setBounds(32, 272, 133, 47);
		frame.getContentPane().add(textArea_3);
		
		TextField textField = new TextField();
		textField.setBounds(327, 128, 179, 41);
		frame.getContentPane().add(textField);
		
		TextField textField_1 = new TextField();
		textField_1.setBounds(327, 200, 179, 31);
		frame.getContentPane().add(textField_1);
		
		TextField textField_2 = new TextField();
		textField_2.setBounds(327, 272, 179, 31);
		frame.getContentPane().add(textField_2);
		
		Button button = new Button("SUBMIT");
		button.setFont(new Font("Dialog", Font.BOLD, 12));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LOGIN L= new LOGIN();
				L.setvisible(true);
				frame.setVisible(false);
			}
		});
		button.setBounds(198, 330, 89, 22);
		frame.getContentPane().add(button);
	}
}
