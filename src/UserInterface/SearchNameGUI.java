package UserInterface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class SearchNameGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchNameGUI frame = new SearchNameGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SearchNameGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(22, 38, 46, 14);
		contentPane.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(102, 35, 268, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblWorkerId = new JLabel("Worker ID");
		lblWorkerId.setBounds(22, 89, 92, 14);
		contentPane.add(lblWorkerId);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setColumns(10);
		textField_1.setBounds(102, 80, 53, 20);
		contentPane.add(textField_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(22, 114, 402, 136);
		contentPane.add(textArea);
		
		JButton SearchBtn = new JButton("Search");
		SearchBtn.setBounds(283, 80, 89, 23);
		contentPane.add(SearchBtn);
	}
}
