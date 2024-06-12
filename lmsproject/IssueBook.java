package lmsproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;

public class IssueBook {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IssueBook window = new IssueBook();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public IssueBook() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Issue Book");
		lblNewLabel.setBounds(67, 21, 99, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Book ID");
		lblNewLabel_1.setBounds(10, 55, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("User ID");
		lblNewLabel_3.setBounds(10, 80, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Date of Issue");
		lblNewLabel_4.setBounds(10, 105, 99, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(92, 52, 89, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(92, 77, 89, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(92, 102, 89, 20);
		frame.getContentPane().add(textField_2);
		
		JButton Back = new JButton("<");
		Back.setBounds(10, 17, 47, 23);
		frame.getContentPane().add(Back);
		
		JButton btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.setBounds(92, 172, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("Date Of Return");
		lblNewLabel_2.setBounds(10, 133, 99, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(92, 130, 89, 20);
		frame.getContentPane().add(textField_3);
		
		table = new JTable();
		table.setBounds(212, 21, 212, 229);
		frame.getContentPane().add(table);
		
		JLabel lblIssueDetails = new JLabel("Issue Details");
		lblIssueDetails.setBounds(281, 0, 99, 14);
		frame.getContentPane().add(lblIssueDetails);
	}
}
