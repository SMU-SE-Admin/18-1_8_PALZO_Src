import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IdError extends JFrame {

	private JPanel contentPane;
	private JTextPane txtpnAsd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IdError frame = new IdError();
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
	public IdError() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("\uB2EB\uAE30");
		btnNewButton.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(300, 180, 100, 40);
		contentPane.add(btnNewButton);
		
		txtpnAsd = new JTextPane();
		txtpnAsd.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		txtpnAsd.setText("\uC798\uBABB\uB41C \uD68C\uC6D0 \uC815\uBCF4\uC785\uB2C8\uB2E4.");
		txtpnAsd.setBounds(147, 82, 214, 61);
		contentPane.add(txtpnAsd);
	}
}
