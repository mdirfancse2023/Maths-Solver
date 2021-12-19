import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulas {

	JFrame frame13;
	private JTable table;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblNewLabel_6;
	private JTextField textField_5;
	private JLabel lblNewLabel_7;
	private JTextField textField_6;
	private JLabel lblNewLabel_8;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulas window = new Formulas();
					window.frame13.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Formulas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame13 = new JFrame();
		frame13.getContentPane().setBackground(new Color(0, 51, 102));
		frame13.setBounds(100, 100, 838, 499);
		frame13.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame13.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Basic Formulas");
		lblNewLabel.setForeground(SystemColor.textHighlightText);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(277, 31, 243, 43);
		frame13.getContentPane().add(lblNewLabel);
		
		table = new JTable();
		table.setBounds(125, 216, 56, -34);
		frame13.getContentPane().add(table);
		
		lblNewLabel_1 = new JLabel("(a+b)^2");
		lblNewLabel_1.setForeground(SystemColor.controlHighlight);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_1.setBounds(405, 230, 131, 45);
		frame13.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("(a-b)^2");
		lblNewLabel_2.setForeground(SystemColor.controlHighlight);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_2.setBounds(40, 231, 124, 43);
		frame13.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Num1");
		lblNewLabel_3.setForeground(SystemColor.control);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_3.setBounds(40, 120, 93, 32);
		frame13.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Num2");
		lblNewLabel_4.setForeground(SystemColor.control);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_4.setBounds(289, 120, 84, 32);
		frame13.getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Num3");
		lblNewLabel_5.setForeground(SystemColor.control);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_5.setBounds(544, 120, 93, 32);
		frame13.getContentPane().add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(143, 120, 117, 32);
		frame13.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setBounds(397, 120, 123, 32);
		frame13.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_2.setBounds(655, 120, 117, 32);
		frame13.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_3.setBounds(189, 238, 157, 41);
		frame13.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_4.setBounds(572, 236, 164, 45);
		frame13.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		lblNewLabel_6 = new JLabel("(a+b)^3");
		lblNewLabel_6.setForeground(SystemColor.controlHighlight);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_6.setBounds(40, 305, 131, 43);
		frame13.getContentPane().add(lblNewLabel_6);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_5.setBounds(189, 305, 157, 43);
		frame13.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		lblNewLabel_7 = new JLabel("(a-b)^3");
		lblNewLabel_7.setForeground(SystemColor.controlHighlight);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_7.setBounds(405, 305, 131, 43);
		frame13.getContentPane().add(lblNewLabel_7);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_6.setBounds(572, 305, 164, 43);
		frame13.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		lblNewLabel_8 = new JLabel("(a+b+c)^2");
		lblNewLabel_8.setForeground(SystemColor.controlHighlight);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_8.setBounds(182, 393, 164, 44);
		frame13.getContentPane().add(lblNewLabel_8);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_7.setBounds(355, 393, 243, 44);
		frame13.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnNewButton = new JButton("CALCULATE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float num1 = Integer.parseInt(textField.getText());
				float num2 = Integer.parseInt(textField_1.getText());
				float num3 = Integer.parseInt(textField_2.getText());
				float ans1 = num1*num1 + num2*num2 + 2*num1*num2;
				float ans2 = num1*num1 + num2*num2 - 2*num1*num2;
				float ans3 = num1*num1*num1 + num2*num2*num2 + 3*num1*num1*num2 + 3*num1*num2*num2;
				float ans4 = num1*num1*num1 - num2*num2*num2 - 3*num1*num1*num2 + 3*num1*num2*num2;
				float ans5 = num1*num1 + num2*num2 + num3*num3 + 2*(num1*num2 + num2*num3 + num3*num1);
				textField_4.setText(Float.toString(ans1));
				textField_3.setText(Float.toString(ans2));
				textField_5.setText(Float.toString(ans3));
				textField_6.setText(Float.toString(ans4));
				textField_7.setText(Float.toString(ans5));
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(313, 175, 157, 44);
		frame13.getContentPane().add(btnNewButton);
	}
}
