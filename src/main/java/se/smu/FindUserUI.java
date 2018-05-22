import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class FindUserUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FindUserUI frame = new FindUserUI();
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
	public FindUserUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JTextPane txtpnEmail = new JTextPane();
		txtpnEmail.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		txtpnEmail.setText("Email");
		txtpnEmail.setBounds(85, 100, 60, 30);
		contentPane.add(txtpnEmail);
		
		textField = new JTextField();
		textField.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		textField.setBounds(150, 100, 200, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\uD655\uC778");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		btnNewButton.setBounds(90, 180, 100, 30);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("\uB2EB\uAE30");
		button.setBackground(Color.DARK_GRAY);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		button.setBounds(250, 180, 100, 30);
		contentPane.add(button);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 500, 50);
		contentPane.add(panel);
		
		JLabel lblIdpw = new JLabel("ID/PW \uCC3E\uAE30");
		lblIdpw.setForeground(Color.WHITE);
		lblIdpw.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		panel.add(lblIdpw);
	}
}

