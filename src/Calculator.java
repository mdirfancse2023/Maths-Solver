import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.Window;

import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;

public class Calculator {

	private JFrame frame1;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame1 = new JFrame();
		frame1.getContentPane().setBackground(new Color(102, 205, 170));
		frame1.setBounds(100, 100, 810, 497);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Maths Solver");
		lblNewLabel.setPreferredSize(new Dimension(72, 14));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel.setBackground(Color.GRAY);
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(182, 28, 287, 51);
		frame1.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Choose which operation do you wish to perform with this amazing application");
		lblNewLabel_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(43, 108, 700, 25);
		frame1.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("AP and Sum");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ApAndItsSum window1 = new ApAndItsSum();
				window1.frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				window1.frame2.setVisible(true);
			}
		});
		btnNewButton.setBounds(43, 164, 171, 23);
		frame1.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Quadratic Equations");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QuadraticEquation window3 = new QuadraticEquation();
				window3.frame4.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				window3.frame4.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(43, 233, 171, 23);
		frame1.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Cordinate Geometry");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CordinateGeometry window6 = new CordinateGeometry();
				window6.frame7.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				window6.frame7.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(43, 298, 171, 23);
		frame1.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("About Software");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Areas window13 = new Areas();
				window13.frame14.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				window13.frame14.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(596, 359, 147, 23);
		frame1.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Area of Circle");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AreaOfCircle window2 = new AreaOfCircle();
				window2.frame3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				window2.frame3.setVisible(true);
			}
		});
		btnNewButton_4.setBounds(324, 164, 154, 23);
		frame1.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Profit and Loss");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProfitAndLoss window4 = new ProfitAndLoss();
				window4.frame5.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				window4.frame5.setVisible(true);
			}
		});
		btnNewButton_5.setBounds(324, 233, 154, 23);
		frame1.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("S&C Interest");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SiAndCi window7 = new SiAndCi();
				window7.frame8.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				window7.frame8.setVisible(true);
			}
		});
		btnNewButton_6.setBounds(324, 298, 154, 23);
		frame1.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Prime or Factorial");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prime_and_factorial window10 = new prime_and_factorial();
				window10.frame11.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				window10.frame11.setVisible(true);
			}
		});
		btnNewButton_7.setBounds(324, 359, 154, 23);
		frame1.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Basic Formulas");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Formulas window12 = new Formulas();
				window12.frame13.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				window12.frame13.setVisible(true);
			}
		});
		btnNewButton_8.setBounds(596, 164, 147, 23);
		frame1.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("Square and Cube");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SquareAndCube window5 = new SquareAndCube();
				window5.frame6.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				window5.frame6.setVisible(true);
			}
		});
		btnNewButton_9.setBounds(596, 233, 147, 23);
		frame1.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("Pair of Equations");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PairOfEquation window8 = new PairOfEquation();
				window8.frame9.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				window8.frame9.setVisible(true);
			}
		});
		btnNewButton_10.setBounds(596, 298, 147, 23);
		frame1.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("Scientific Calculator");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Scientific window11 = new Scientific();
				window11.frame12.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				window11.frame12.setVisible(true);
			}
		});
		btnNewButton_11.setBounds(43, 359, 171, 23);
		frame1.getContentPane().add(btnNewButton_11);
		
		JLabel lblNewLabel_2 = new JLabel("By Md Irfan");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setBounds(440, 45, 113, 26);
		frame1.getContentPane().add(lblNewLabel_2);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
