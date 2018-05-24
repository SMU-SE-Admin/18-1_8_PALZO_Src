/**
 * title : ModSubjectUI.java
 * author : ±Ë«—µø (aggsae@gmail.com)
 * version : 1.0.0.
 * since : 2018 - 05 - 07
 * brief : ∞˙∏Ò «◊∏Ò ºˆ¡§ UI
 * -----------------------------------
 * history
 *   author  version     date                          brief
 *   æ»µø¡÷       0.0.0.   2018-05-22                      √ æ» ¿€º∫
 *   ±Ë«—µø       1.0.0.   2018-05-25                  ∆–≈∞¡ˆ √ﬂ∞°, ¡÷ºÆ ¿€º∫
 * -----------------------------------
 */

package se.smu;

import se.smu.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;

public class ModSubjectUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	public ModSubjectUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 403);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("\uBCC0\uACBD");
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(430, 210, 100, 30);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("\uCDE8\uC18C");
		button.setForeground(Color.WHITE);
		button.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		button.setBackground(Color.DARK_GRAY);
		button.setBounds(430, 280, 100, 30);
		contentPane.add(button);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		textPane.setText("\uACFC\uBAA9\uBA85");
		textPane.setBounds(50, 90, 80, 30);
		contentPane.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		textPane_1.setText("\uB2F4\uB2F9\uAD50\uC218");
		textPane_1.setBounds(50, 130, 87, 27);
		contentPane.add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		textPane_2.setText("\uAC15\uC758\uC2DC\uAC04");
		textPane_2.setBounds(50, 170, 87, 27);
		contentPane.add(textPane_2);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		textPane_3.setText("\uAC15\uC758\uC2DC\uAC04");
		textPane_3.setBounds(50, 210, 87, 27);
		contentPane.add(textPane_3);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		textPane_4.setText("\uAC15\uC758\uC2E4");
		textPane_4.setBounds(50, 250, 87, 27);
		contentPane.add(textPane_4);
		
		textField = new JTextField();
		textField.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		textField.setBounds(150, 90, 184, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(150, 130, 184, 24);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(150, 170, 56, 24);
		contentPane.add(textField_2);
		
		JTextPane textPane_5 = new JTextPane();
		textPane_5.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		textPane_5.setText("\uB144\uB3C4");
		textPane_5.setBounds(211, 170, 45, 24);
		contentPane.add(textPane_5);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(260, 170, 35, 24);
		contentPane.add(textField_3);
		
		JTextPane textPane_6 = new JTextPane();
		textPane_6.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		textPane_6.setText("\uD559\uAE30");
		textPane_6.setBounds(300, 170, 45, 24);
		contentPane.add(textPane_6);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		textField_4.setColumns(10);
		textField_4.setBounds(232, 210, 35, 30);
		contentPane.add(textField_4);
		
		JTextPane textPane_7 = new JTextPane();
		textPane_7.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		textPane_7.setText("\uC2DC");
		textPane_7.setBounds(269, 210, 24, 24);
		contentPane.add(textPane_7);
		
		JTextPane textPane_8 = new JTextPane();
		textPane_8.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		textPane_8.setText("\uC2DC");
		textPane_8.setBounds(349, 210, 34, 24);
		contentPane.add(textPane_8);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		textField_5.setColumns(10);
		textField_5.setBounds(314, 210, 35, 30);
		contentPane.add(textField_5);
		
		JTextPane textPane_9 = new JTextPane();
		textPane_9.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		textPane_9.setText("~");
		textPane_9.setBounds(291, 210, 26, 24);
		contentPane.add(textPane_9);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		textField_6.setColumns(10);
		textField_6.setBounds(150, 250, 56, 24);
		contentPane.add(textField_6);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\uC6D4\uC694\uC77C", "\uD654\uC694\uC77C", "\uC218\uC694\uC77C", "\uBAA9\uC694\uC77C", "\uAE08\uC694\uC77C", "\uD1A0\uC694\uC77C", "\uC77C\uC694\uC77C"}));
		comboBox.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		comboBox.setBounds(150, 210, 80, 30);
		contentPane.add(comboBox);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 600, 70);
		contentPane.add(panel);
		
		JLabel label = new JLabel("\uACFC\uBAA9\uBCC0\uACBD");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 35));
		panel.add(label);
		
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModSubjectUI frame = new ModSubjectUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
