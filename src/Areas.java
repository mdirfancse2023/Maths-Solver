import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;

public class Areas {

	JFrame frame14;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Areas window = new Areas();
					window.frame14.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Areas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame14 = new JFrame();
		frame14.getContentPane().setBackground(new Color(0, 51, 102));
		frame14.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("About Software");
		lblNewLabel.setForeground(SystemColor.textHighlightText);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(275, 28, 271, 56);
		frame14.getContentPane().add(lblNewLabel);
		
		JTree tree = new JTree();
		tree.setToolTipText("10");
		tree.setVisibleRowCount(40);
		tree.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tree.setBackground(new Color(0, 51, 102));
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("About") {
				{
					DefaultMutableTreeNode node_1;
					node_1 = new DefaultMutableTreeNode("Function");
						node_1.add(new DefaultMutableTreeNode("Scientific Calculator"));
						node_1.add(new DefaultMutableTreeNode("Area Calculation"));
						node_1.add(new DefaultMutableTreeNode("Mathematical Calculations"));
						node_1.add(new DefaultMutableTreeNode("Basic Formulas"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("Designer");
						node_1.add(new DefaultMutableTreeNode("Md Irfan"));
						node_1.add(new DefaultMutableTreeNode("Computer Science Engineer"));
						node_1.add(new DefaultMutableTreeNode("Full Stack Developer"));
						node_1.add(new DefaultMutableTreeNode("@2021"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("Usefulness");
						node_1.add(new DefaultMutableTreeNode("Students"));
						node_1.add(new DefaultMutableTreeNode("Shops"));
						node_1.add(new DefaultMutableTreeNode("Teachers"));
						node_1.add(new DefaultMutableTreeNode("Companies"));
					add(node_1);
				}
			}
		));
		tree.setBounds(59, 84, 649, 361);
		frame14.getContentPane().add(tree);
		frame14.setBounds(100, 100, 841, 495);
		frame14.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
