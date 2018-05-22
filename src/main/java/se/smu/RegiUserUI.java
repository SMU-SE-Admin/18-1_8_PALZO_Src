import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;

public class RegiUserUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegiUserUI frame = new RegiUserUI();
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
	public RegiUserUI() {
		
		JTextPane textPane = new JTextPane();
		getContentPane().add(textPane, BorderLayout.NORTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500,300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JTextPane txtpnEail = new JTextPane();
		txtpnEail.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		txtpnEail.setText("Email");
		txtpnEail.setBounds(56, 171, 46, 33);
		contentPane.add(txtpnEail);
		
		JTextPane txtpnPw = new JTextPane();
		txtpnPw.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		txtpnPw.setText("  PW");
		txtpnPw.setBounds(56, 136, 46, 23);
		contentPane.add(txtpnPw);
		
		JTextPane txtpnId = new JTextPane();
		txtpnId.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		txtpnId.setText("ID");
		txtpnId.setBounds(73, 103, 46, 33);
		contentPane.add(txtpnId);
		
		textField = new JTextField();
		textField.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		textField.setBounds(133, 103, 186, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(133, 135, 186, 24);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(133, 173, 186, 24);
		contentPane.add(textField_2);
		
		JButton btnNewButton = new JButton("\uC911\uBCF5\uD655\uC778");
		btnNewButton.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setBounds(333, 103, 105, 27);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("\uC911\uBCF5\uD655\uC778");
		button.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		button.setForeground(Color.WHITE);
		button.setBackground(Color.DARK_GRAY);
		button.setBounds(333, 171, 105, 27);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\uD68C\uC6D0\uAC00\uC785");
		button_1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		button_1.setForeground(Color.WHITE);
		button_1.setBackground(Color.DARK_GRAY);
		button_1.setBounds(104, 209, 105, 27);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("\uCDE8\uC18C");
		button_2.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		button_2.setForeground(Color.WHITE);
		button_2.setBackground(Color.DARK_GRAY);
		button_2.setBounds(250, 209, 105, 27);
		contentPane.add(button_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 500, 50);
		contentPane.add(panel);
		
		JLabel label = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		panel.add(label);
	}

}
