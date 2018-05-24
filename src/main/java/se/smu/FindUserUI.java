/**
 * title : FindUserUI.java
 * author : ±Ë«—µø (aggsae@gmail.com)
 * version : 1.0.0.
 * since : 2018 - 05 - 07
 * brief : SubjectDB ≈¨∑°Ω∫
 * -----------------------------------
 * history
 *   author  version     date                              brief
 *   æ»µø¡÷        0.0.0.   2018-05-22                         √ æ» ¿€º∫
 *   ±Ë«—µø        1.0.0.   2018-05-24            Email «•Ω√ªÛ¿⁄∞° ≈ÿΩ∫∆Æ« µÂ∑Œ µ«æÓ¿÷¥¬ ∞Õ ºˆ¡§ 
 * -----------------------------------
 */

package se.smu;

import se.smu.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class FindUserUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	public FindUserUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lbEmail = new JLabel();
		lbEmail.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 18));
		lbEmail.setText("Email");
		lbEmail.setBounds(85, 100, 60, 30);
		contentPane.add(lbEmail);
		
		textField = new JTextField();
		textField.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		textField.setBounds(150, 100, 200, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\uD655\uC778");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 18));
		btnNewButton.setBounds(90, 180, 100, 30);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("\uB2EB\uAE30");
		button.setBackground(Color.DARK_GRAY);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 18));
		button.setBounds(250, 180, 100, 30);
		contentPane.add(button);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 500, 50);
		contentPane.add(panel);
		
		JLabel lblIdpw = new JLabel("ID/PW \uCC3E\uAE30");
		lblIdpw.setForeground(Color.WHITE);
		lblIdpw.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 20));
		panel.add(lblIdpw);
	}
	
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
}

