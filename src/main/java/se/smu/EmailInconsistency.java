import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Font;

public class EmailInconsistency extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmailInconsistency frame = new EmailInconsistency();
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
	public EmailInconsistency() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);

		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("\uB2EB\uAE30");
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		btnNewButton.setBounds(300, 180, 100, 40);
		contentPane.add(btnNewButton);
		
		JTextPane txtpnEmailaddress = new JTextPane();
		txtpnEmailaddress.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		txtpnEmailaddress.setText("\uC77C\uCE58\uD558\uB294 Email\uC774 \uC5C6\uC2B5\uB2C8\uB2E4. \uB2E4\uC2DC \uC785\uB825\uD574 \uC8FC\uC2ED\uC2DC\uC624");
		txtpnEmailaddress.setBounds(110, 70, 240, 80);
		contentPane.add(txtpnEmailaddress);
	}

}
