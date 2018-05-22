import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
import java.awt.Scrollbar;
import java.awt.Checkbox;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;
import javax.swing.JTextField;

public class MainUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainUI frame = new MainUI();
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
	public MainUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("\uB85C\uADF8\uC544\uC6C3");
		btnNewButton.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		btnNewButton.setBounds(490, 380, 100, 30);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		btnNewButton_1.setBounds(605, 380, 45, 30);
		contentPane.add(btnNewButton_1);
		
		Checkbox checkbox = new Checkbox("\uC644\uB8CC\uB41C \uD56D\uBAA9\uB3C4 \uD45C\uC2DC");
		checkbox.setFont(new Font("Dialog", Font.PLAIN, 18));
		checkbox.setBounds(120, 380, 180, 30);
		contentPane.add(checkbox);
		
		JButton button = new JButton("+");
		button.setBounds(30, 380, 41, 27);
		contentPane.add(button);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"black", "red", "green", "blue"}));
		comboBox.setBounds(400, 380, 70, 30);
		contentPane.add(comboBox);
		
		JTextPane txtpnX = new JTextPane();
		txtpnX.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		txtpnX.setText("\uD14C\uB9C8\uC0C9 \uC120\uD0DD");
		txtpnX.setBounds(310, 380, 90, 30);
		contentPane.add(txtpnX);
		
		textField = new JTextField();
		textField.setBackground(Color.DARK_GRAY);
		textField.setText("    \uC804\uCCB4 \uD560 \uC77C");
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 25));
		textField.setBounds(0, 0, 682, 64);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"\uC815\uB82C\uBC29\uC2DD \uC120\uD0DD"}));
		comboBox_1.setForeground(Color.BLACK);
		comboBox_1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		comboBox_1.setBounds(435, 63, 180, 30);
		contentPane.add(comboBox_1);
	
	}
}
