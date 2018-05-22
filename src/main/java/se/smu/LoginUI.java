
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JToggleButton;
import javax.swing.JSeparator;
import java.awt.ScrollPane;
import java.awt.Panel;
import java.awt.Button;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class LoginUI extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUI frame = new LoginUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public LoginUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		passwordField.setBounds(100, 120, 164, 24);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("login");
		btnLogin.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogin.setForeground(Color.WHITE);
		
		btnLogin.setBackground(Color.DARK_GRAY);
		btnLogin.setBounds(279, 119, 105, 27);
		contentPane.add(btnLogin);
		
		JButton btnNewButton = new JButton("ID/PW \uCC3E\uAE30");
		btnNewButton.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(253, 170, 131, 27);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("\uD68C\uC6D0\uAC00\uC785");
		button.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
	    button.setBackground(Color.DARK_GRAY);
		button.setForeground(Color.WHITE);
		button.setBounds(100, 170, 131, 27);
		contentPane.add(button);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(58, 70, 23, 24);
		contentPane.add(lblId);
		
		JLabel lblPw = new JLabel("PW");
		lblPw.setBounds(58, 120, 32, 24);
		contentPane.add(lblPw);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		passwordField_1.setBounds(100, 70, 164, 24);
		contentPane.add(passwordField_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 500, 50);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("TO-DO LIST");
		lblNewLabel.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		lblNewLabel.setForeground(Color.WHITE);
		panel.add(lblNewLabel);
	}
}
