import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SquareAndCube {

	JFrame frame6;
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
					SquareAndCube window = new SquareAndCube();
					window.frame6.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SquareAndCube() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame6 = new JFrame();
		frame6.getContentPane().setBackground(new Color(0, 51, 102));
		frame6.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Square And Cube");
		lblNewLabel.setForeground(UIManager.getColor("CheckBox.background"));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(258, 38, 286, 37);
		frame6.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Number");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_1.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel_1.setBounds(84, 129, 116, 37);
		frame6.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(299, 129, 139, 37);
		frame6.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("CALCULATE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float number = Integer.parseInt(textField.getText());
				float square = number*number;
				float cube = square*number;
				float a = 0.5f;
				float b = 0.33f;
				float square_root = (float)Math.pow(number, a);
				float cube_root = (float)Math.pow(number, b);
				textField_1.setText(Float.toString(square));
				textField_2.setText(Float.toString(cube));
				textField_3.setText(Float.toString(square_root));
				textField_4.setText(Float.toString(cube_root));
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(563, 129, 151, 37);
		frame6.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("SQUARE");
		lblNewLabel_2.setForeground(UIManager.getColor("CheckBox.background"));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_2.setBounds(84, 247, 122, 37);
		frame6.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("CUBE");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_3.setForeground(UIManager.getColor("CheckBox.background"));
		lblNewLabel_3.setBounds(84, 343, 104, 21);
		frame6.getContentPane().add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setBounds(258, 247, 116, 37);
		frame6.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setBounds(258, 327, 116, 37);
		frame6.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("SQUARE ROOT");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_4.setForeground(UIManager.getColor("CheckBox.background"));
		lblNewLabel_4.setBounds(408, 247, 202, 37);
		frame6.getContentPane().add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_3.setBounds(640, 247, 104, 37);
		frame6.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("CUBE ROOT");
		lblNewLabel_5.setForeground(UIManager.getColor("CheckBox.background"));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_5.setBounds(408, 336, 177, 28);
		frame6.getContentPane().add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_4.setBounds(640, 327, 104, 37);
		frame6.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		frame6.setBounds(100, 100, 821, 497);
		frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
