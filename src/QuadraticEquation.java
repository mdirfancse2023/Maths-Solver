import java.awt.EventQueue;
import java.util.*;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QuadraticEquation {

	JFrame frame4;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuadraticEquation window = new QuadraticEquation();
					window.frame4.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public QuadraticEquation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame4 = new JFrame();
		frame4.getContentPane().setBackground(new Color(0, 51, 102));
		frame4.setBounds(100, 100, 821, 498);
		frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame4.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Quadratic Equations");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setForeground(SystemColor.text);
		lblNewLabel.setBounds(250, 30, 317, 44);
		frame4.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Coefficient of x*x");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_1.setForeground(SystemColor.controlHighlight);
		lblNewLabel_1.setBounds(53, 126, 232, 32);
		frame4.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(358, 126, 136, 32);
		frame4.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Coefficient of x");
		lblNewLabel_2.setForeground(SystemColor.controlHighlight);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_2.setBounds(53, 205, 232, 32);
		frame4.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setBounds(358, 205, 136, 32);
		frame4.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Constant Term");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_3.setForeground(SystemColor.controlHighlight);
		lblNewLabel_3.setBounds(53, 284, 202, 32);
		frame4.getContentPane().add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_2.setBounds(358, 284, 136, 32);
		frame4.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("DISCRIMINANT");
		lblNewLabel_4.setForeground(SystemColor.control);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(53, 391, 221, 25);
		frame4.getContentPane().add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_3.setBounds(232, 391, 86, 25);
		frame4.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("ALPHA");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5.setForeground(SystemColor.control);
		lblNewLabel_5.setBounds(343, 391, 85, 25);
		frame4.getContentPane().add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_4.setBounds(438, 391, 86, 25);
		frame4.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("BEETA");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_6.setForeground(SystemColor.control);
		lblNewLabel_6.setBounds(554, 391, 72, 25);
		frame4.getContentPane().add(lblNewLabel_6);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_5.setBounds(656, 391, 86, 25);
		frame4.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton = new JButton("CALCULATE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float value_of_a = Integer.parseInt(textField.getText());
				float value_of_b = Integer.parseInt(textField_1.getText());;
				float value_of_c = Integer.parseInt(textField_2.getText());;
				float b = 0.5f;
				float calculate = (value_of_b*value_of_b)-(4*value_of_a*value_of_c);
				float discriminant = (float)Math.pow(calculate,b);
				float alpha = -(value_of_b + discriminant)/2*value_of_a;
				float beeta = -(value_of_b - discriminant)/2*value_of_a;
				textField_3.setText(Float.toString(calculate));
				textField_4.setText(Float.toString(alpha));
				textField_5.setText(Float.toString(beeta));
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(572, 177, 155, 92);
		frame4.getContentPane().add(btnNewButton);
	}
}
