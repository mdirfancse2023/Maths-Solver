import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class prime_and_factorial {

	JFrame frame11;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prime_and_factorial window = new prime_and_factorial();
					window.frame11.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public prime_and_factorial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame11 = new JFrame();
		frame11.getContentPane().setBackground(new Color(0, 51, 102));
		frame11.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Prime And Factorial");
		lblNewLabel.setForeground(SystemColor.textHighlightText);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(261, 32, 314, 37);
		frame11.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Number");
		lblNewLabel_1.setForeground(SystemColor.controlHighlight);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(96, 122, 133, 37);
		frame11.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(300, 122, 162, 37);
		frame11.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("CALCULATE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float number = Integer.parseInt(textField.getText());
				
//				this is for prime
				boolean ans = true;
				if(number==0||number==1) {
					textField_1.setText("Not Prime");
				}
				else{
					for(int i = 2 ; i*i < number ; i++) {
						if(number%i==0) {
							textField_1.setText("Not Prime");
							ans = false;
							break;
						}
					}
				}
				if(ans==true) {
					textField_1.setText("Prime");
				}
				
//				this is for factorial
				float val = 1;
				for(int i = 2 ; i <= number ; i++) {
					val = val*i;
				}
				textField_2.setText(Float.toString(val));
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(518, 122, 185, 37);
		frame11.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("PRIME_OR_NOT");
		lblNewLabel_2.setForeground(SystemColor.controlHighlight);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_2.setBounds(153, 252, 225, 31);
		frame11.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setBounds(433, 252, 185, 31);
		frame11.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("FACTORIAL");
		lblNewLabel_3.setForeground(SystemColor.controlHighlight);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_3.setBounds(153, 331, 192, 26);
		frame11.getContentPane().add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_2.setBounds(433, 326, 185, 31);
		frame11.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		frame11.setBounds(100, 100, 839, 492);
		frame11.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
