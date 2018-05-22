import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;

public class CheckAlarmUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckAlarmUI frame = new CheckAlarmUI();
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
	public CheckAlarmUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("'\uD074\uB798\uC2A4 \uC124\uACC4\uC11C \uC791\uC131'\uC758 \uC2E4\uC81C \uB9C8\uAC10\uAE30\uD55C\uC774");
		lblNewLabel.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		lblNewLabel.setBounds(75, 88, 274, 50);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\uB2EB\uAE30");
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		btnNewButton.setBounds(300, 180, 100, 30);
		contentPane.add(btnNewButton);
		
		JLabel label = new JLabel("1\uC77C \uB0A8\uC558\uC2B5\uB2C8\uB2E4.");
		label.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		label.setBounds(150, 117, 126, 41);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("<\uC18C\uD504\uD2B8\uC6E8\uC5B4\uACF5\uD559>");
		label_1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		label_1.setBounds(139, 66, 137, 41);
		contentPane.add(label_1);
	}
}
