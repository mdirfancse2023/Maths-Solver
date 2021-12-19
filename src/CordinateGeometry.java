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

public class CordinateGeometry {

	JFrame frame7;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CordinateGeometry window = new CordinateGeometry();
					window.frame7.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CordinateGeometry() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame7 = new JFrame();
		frame7.getContentPane().setBackground(new Color(0, 51, 102));
		frame7.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cordinate Geometry");
		lblNewLabel.setForeground(SystemColor.textHighlightText);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(232, 30, 321, 44);
		frame7.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("X1");
		lblNewLabel_1.setForeground(SystemColor.controlHighlight);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_1.setBounds(64, 144, 46, 32);
		frame7.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("X2");
		lblNewLabel_2.setForeground(SystemColor.controlHighlight);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_2.setBounds(64, 209, 46, 32);
		frame7.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Y1");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_3.setForeground(SystemColor.controlHighlight);
		lblNewLabel_3.setBounds(333, 147, 46, 26);
		frame7.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Y2");
		lblNewLabel_4.setForeground(SystemColor.controlHighlight);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_4.setBounds(333, 209, 46, 29);
		frame7.getContentPane().add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(146, 144, 123, 32);
		frame7.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setBounds(146, 209, 121, 32);
		frame7.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setBounds(412, 144, 143, 32);
		frame7.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_3.setBounds(412, 209, 142, 32);
		frame7.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("DISTANCE");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_5.setForeground(SystemColor.control);
		lblNewLabel_5.setBounds(64, 310, 149, 32);
		frame7.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("SECTION");
		lblNewLabel_6.setForeground(SystemColor.controlHighlight);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_6.setBounds(64, 379, 136, 26);
		frame7.getContentPane().add(lblNewLabel_6);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_4.setBounds(260, 310, 243, 33);
		frame7.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_5.setBounds(260, 372, 112, 33);
		frame7.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_6.setBounds(382, 372, 121, 33);
		frame7.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton = new JButton("CALCULATE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float x1 = Integer.parseInt(textField.getText());
				float x2 = Integer.parseInt(textField_1.getText());
				float y1 = Integer.parseInt(textField_2.getText());
				float y2 = Integer.parseInt(textField_3.getText());
				float m = Integer.parseInt(textField_7.getText());
				float n = Integer.parseInt(textField_8.getText());
				float a = (float)Math.pow((x2-x1),2);
				float b = (float)Math.pow((y2-y1),2);
				float c = 0.5f;
				float distance = (float)Math.pow((a+b),c);
				float new_x = (m*x2+n*x1)/(m+n);
				float new_y = (m*y2+n*y1)/(m+n);
				textField_4.setText(Float.toString(distance));
				textField_5.setText(Float.toString(new_x));
				textField_6.setText(Float.toString(new_y));
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(571, 320, 169, 69);
		frame7.getContentPane().add(btnNewButton);
		
		lblNewLabel_7 = new JLabel("M");
		lblNewLabel_7.setForeground(SystemColor.controlHighlight);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_7.setBounds(602, 150, 34, 20);
		frame7.getContentPane().add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("N");
		lblNewLabel_8.setForeground(SystemColor.controlHighlight);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_8.setBounds(602, 209, 46, 32);
		frame7.getContentPane().add(lblNewLabel_8);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_7.setBounds(666, 144, 74, 32);
		frame7.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_8.setBounds(666, 209, 74, 32);
		frame7.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		frame7.setBounds(100, 100, 844, 496);
		frame7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
