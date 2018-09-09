import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class GUI {

	private JFrame frame;
	private final static String newline = "\n";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	public GUI() {
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
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Question 1");
		rdbtnNewRadioButton.setBounds(29, 36, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnQuestion = new JRadioButton("Question 2");
		rdbtnQuestion.setBounds(29, 62, 109, 23);
		frame.getContentPane().add(rdbtnQuestion);
		
		JRadioButton rdbtnQuestion_1 = new JRadioButton("Question 3");
		rdbtnQuestion_1.setBounds(29, 88, 109, 23);
		frame.getContentPane().add(rdbtnQuestion_1);
		
		JRadioButton rdbtnQuestion_2 = new JRadioButton("Question 4");
		rdbtnQuestion_2.setBounds(29, 114, 109, 23);
		frame.getContentPane().add(rdbtnQuestion_2);
		
		JButton btnRun = new JButton("Run");
		btnRun.setBounds(29, 158, 89, 23);
		frame.getContentPane().add(btnRun);
		
		JLabel lblNewLabel = new JLabel("Searches employee list for a specified employee");
		lblNewLabel.setBounds(163, 40, 261, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Searches employee  by means of Birth date");
		lblNewLabel_1.setBounds(163, 66, 235, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Displays organization structure");
		lblNewLabel_2.setBounds(162, 92, 218, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Highest earning employees per tier");
		lblNewLabel_3.setBounds(163, 118, 217, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		
	}
}
