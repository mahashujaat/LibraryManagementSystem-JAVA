package lmsproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Adminfunctions {

	public JFrame frame;
	public JFrame getFrame() {
		return frame;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Adminfunctions window = new Adminfunctions();
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
	public Adminfunctions() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 376, 240);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Users");
		btnNewButton.setBounds(220, 72, 111, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnIssueBook = new JButton("Issue Book");
		btnIssueBook.setBounds(220, 126, 111, 23);
		frame.getContentPane().add(btnIssueBook);
		
		JButton btnViewBooks = new JButton("Books");
		btnViewBooks.setBounds(62, 72, 111, 23);
		frame.getContentPane().add(btnViewBooks);
		
		JButton btnReturnBook = new JButton("Return Book");
		btnReturnBook.setBounds(62, 126, 111, 23);
		frame.getContentPane().add(btnReturnBook);
		
		JButton Back = new JButton("<");
		Back.setBounds(10, 11, 41, 23);
		frame.getContentPane().add(Back);
		
		JLabel lblNewLabel = new JLabel("Admin");
		lblNewLabel.setBounds(161, 15, 46, 14);
		frame.getContentPane().add(lblNewLabel);
	}

}
