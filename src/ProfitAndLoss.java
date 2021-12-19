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

public class ProfitAndLoss {

	JFrame frame5;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	protected Object frame6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProfitAndLoss window = new ProfitAndLoss();
					window.frame5.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ProfitAndLoss() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame5 = new JFrame();
		frame5.getContentPane().setBackground(new Color(0, 51, 102));
		frame5.setBounds(100, 100, 817, 497);
		frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame5.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Profit and Loss");
		lblNewLabel.setForeground(SystemColor.control);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(287, 28, 224, 32);
		frame5.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cost Price");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_1.setForeground(SystemColor.controlHighlight);
		lblNewLabel_1.setBounds(77, 133, 145, 32);
		frame5.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Selling Price");
		lblNewLabel_2.setForeground(SystemColor.controlHighlight);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_2.setBounds(395, 133, 179, 32);
		frame5.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(245, 133, 107, 32);
		frame5.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setBounds(611, 133, 99, 32);
		frame5.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("PROFIT");
		lblNewLabel_3.setForeground(SystemColor.control);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_3.setBounds(77, 213, 116, 32);
		frame5.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("LOSS");
		lblNewLabel_4.setForeground(SystemColor.control);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_4.setBounds(77, 269, 116, 32);
		frame5.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("PROFIT PERCENT");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_5.setForeground(SystemColor.control);
		lblNewLabel_5.setBounds(77, 321, 251, 32);
		frame5.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("LOSS PERCENT");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_6.setForeground(new Color(240, 240, 240));
		lblNewLabel_6.setBounds(77, 379, 204, 24);
		frame5.getContentPane().add(lblNewLabel_6);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setBounds(377, 213, 116, 32);
		frame5.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_3.setBounds(377, 269, 116, 32);
		frame5.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_4.setBounds(377, 321, 116, 32);
		frame5.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_5.setBounds(377, 370, 116, 33);
		frame5.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton = new JButton("CALCULATE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float cost_price = Integer.parseInt(textField.getText());
				float selling_price = Integer.parseInt(textField_1.getText());;
				float profit = selling_price - cost_price;
				float loss = cost_price - selling_price;
				float profit_percent = (profit/cost_price)*100;
				float loss_percent = (loss/cost_price)*100;
				textField_2.setText(Float.toString(profit));
				textField_3.setText(Float.toString(loss));
				textField_4.setText(Float.toString(profit_percent));
				textField_5.setText(Float.toString(loss_percent));
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(570, 269, 152, 84);
		frame5.getContentPane().add(btnNewButton);
	}

}
