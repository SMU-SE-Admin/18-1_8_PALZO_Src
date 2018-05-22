import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JButton;

public class EmailAddressOverlap extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmailAddressOverlap frame = new EmailAddressOverlap();
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
	public EmailAddressOverlap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JTextPane txtpnEmailaddress = new JTextPane();
		txtpnEmailaddress.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		txtpnEmailaddress.setText("EmailAddress\uAC00 \uC911\uBCF5\uB429\uB2C8\uB2E4.");
		txtpnEmailaddress.setBounds(121, 76, 271, 73);
		contentPane.add(txtpnEmailaddress);
		
		JButton btnNewButton = new JButton("\uB2EB\uAE30");
		btnNewButton.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(300, 180, 100, 40);
		contentPane.add(btnNewButton);
	}
}
