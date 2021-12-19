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

public class PairOfEquation {

	JFrame frame9;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PairOfEquation window = new PairOfEquation();
					window.frame9.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PairOfEquation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame9 = new JFrame();
		frame9.getContentPane().setBackground(new Color(0, 51, 102));
		frame9.setBounds(100, 100, 844, 490);
		frame9.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame9.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pair Of Linear Equations");
		lblNewLabel.setForeground(SystemColor.textHighlightText);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(221, 28, 403, 29);
		frame9.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("A1");
		lblNewLabel_1.setForeground(SystemColor.controlHighlight);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_1.setBounds(68, 143, 46, 40);
		frame9.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("A2");
		lblNewLabel_2.setForeground(SystemColor.controlHighlight);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_2.setBounds(68, 214, 46, 40);
		frame9.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("B1");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_3.setForeground(SystemColor.controlHighlight);
		lblNewLabel_3.setBounds(298, 143, 46, 29);
		frame9.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("B2");
		lblNewLabel_4.setForeground(SystemColor.controlHighlight);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_4.setBounds(298, 214, 46, 29);
		frame9.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("C1");
		lblNewLabel_5.setForeground(SystemColor.controlHighlight);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_5.setBounds(530, 143, 46, 29);
		frame9.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("C2");
		lblNewLabel_6.setForeground(SystemColor.controlHighlight);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_6.setBounds(530, 208, 46, 40);
		frame9.getContentPane().add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(141, 153, 86, 29);
		frame9.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setBounds(141, 214, 86, 29);
		frame9.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_2.setBounds(391, 143, 86, 29);
		frame9.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_3.setBounds(391, 214, 86, 29);
		frame9.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_4.setBounds(635, 143, 86, 29);
		frame9.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_5.setBounds(635, 214, 86, 29);
		frame9.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("VALUE_OF_X");
		lblNewLabel_7.setForeground(SystemColor.control);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_7.setBounds(68, 369, 189, 29);
		frame9.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("VALUE_OF_Y");
		lblNewLabel_8.setForeground(SystemColor.control);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_8.setBounds(401, 369, 200, 29);
		frame9.getContentPane().add(lblNewLabel_8);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_6.setBounds(258, 369, 114, 29);
		frame9.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_7.setBounds(601, 369, 120, 29);
		frame9.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnNewButton = new JButton("CALCULATE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float a1 = Integer.parseInt(textField.getText());
				float a2 = Integer.parseInt(textField_1.getText());
				float b1 = Integer.parseInt(textField_2.getText());
				float b2 = Integer.parseInt(textField_3.getText());
				float c1 = Integer.parseInt(textField_4.getText());
				float c2 = Integer.parseInt(textField_5.getText());
				float temp_a1 = a2*a1;
				float temp_b1 = a2*b1;
				float temp_c1 = a2*c1;
				float temp_a2 = a1*a2;
				float temp_b2 = a1*b2;
				float temp_c2 = a1*c2;
				float y = (temp_c2-temp_c1)/(temp_b1-temp_b2);
				float x = (-c1-b1*y)/a1;
				textField_7.setText(Float.toString(y));
				textField_6.setText(Float.toString(x));
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnNewButton.setBounds(262, 277, 269, 54);
		frame9.getContentPane().add(btnNewButton);
	}

}
