import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AreaOfCircle {

	JFrame frame3;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AreaOfCircle window = new AreaOfCircle();
					window.frame3.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AreaOfCircle() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame3 = new JFrame();
		frame3.getContentPane().setBackground(new Color(0, 51, 102));
		frame3.setBackground(new Color(0, 51, 153));
		frame3.setBounds(100, 100, 814, 501);
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame3.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Area Of Circle");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setForeground(SystemColor.text);
		lblNewLabel.setBounds(280, 33, 218, 37);
		frame3.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Radius");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_1.setForeground(SystemColor.scrollbar);
		lblNewLabel_1.setBounds(78, 149, 142, 32);
		frame3.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Angle");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_2.setForeground(SystemColor.scrollbar);
		lblNewLabel_2.setBounds(78, 203, 106, 32);
		frame3.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("AREA");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_3.setForeground(SystemColor.menu);
		lblNewLabel_3.setBounds(78, 305, 142, 37);
		frame3.getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(257, 149, 106, 32);
		frame3.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setBounds(257, 203, 106, 32);
		frame3.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("CALCULATE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float radius = Integer.parseInt(textField.getText());
				float angle = Integer.parseInt(textField_1.getText());;
				float area = (float)3.14*radius*radius;
				float circumference = (float)3.14*2*radius;
				float area_of_sector = (area*angle)/360;
				textField_2.setText(Float.toString(area));
				textField_3.setText(Float.toString(circumference));
				textField_4.setText(Float.toString(area_of_sector));
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnNewButton.setBounds(461, 159, 235, 59);
		frame3.getContentPane().add(btnNewButton);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setBounds(408, 305, 175, 37);
		frame3.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("CIRCUMFERENCE");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_4.setForeground(SystemColor.menu);
		lblNewLabel_4.setBounds(78, 353, 257, 32);
		frame3.getContentPane().add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_3.setBounds(408, 353, 175, 32);
		frame3.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("AREA OF SETOR");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_5.setForeground(SystemColor.menu);
		lblNewLabel_5.setBounds(78, 396, 225, 37);
		frame3.getContentPane().add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_4.setBounds(408, 396, 175, 37);
		frame3.getContentPane().add(textField_4);
		textField_4.setColumns(10);
	}
}
