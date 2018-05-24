/**
 * title : EditListUI.java
 * author : ±Ë«—µø (aggsae@gmail.com)
 * version : 1.0.0.
 * since : 2018 - 05 - 07
 * brief : ≈ıµŒ «◊∏Ò ºˆ¡§ UI
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
import java.awt.ScrollPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;


public class EditListUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	public EditListUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700,500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 682, 80);
		contentPane.add(panel);
		
		JLabel lblTodo = new JLabel("TO-DO \uBCC0\uACBD");
		lblTodo.setForeground(Color.WHITE);
		lblTodo.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 45));
		panel.add(lblTodo);
		
		textField = new JTextField();
		textField.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		textField.setBounds(250, 120, 210, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JTextArea txtrTt = new JTextArea();
		txtrTt.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		txtrTt.setText("To-do \uBA85");
		txtrTt.setBounds(100, 120, 109, 24);
		contentPane.add(txtrTt);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		textArea_1.setText("\uACFC\uBAA9\uC120\uD0DD");
		textArea_1.setBounds(100, 160, 109, 24);
		contentPane.add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		textArea_2.setText("\uB9C8\uAC10\uAE30\uD55C");
		textArea_2.setBounds(100, 200, 109, 24);
		contentPane.add(textArea_2);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		textArea_3.setText("\uC2E4\uC81C\uB9C8\uAC10\uC77C");
		textArea_3.setBounds(100, 240, 109, 24);
		contentPane.add(textArea_3);
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		textArea_4.setText("\uC911\uC694\uB3C4");
		textArea_4.setBounds(100, 280, 109, 24);
		contentPane.add(textArea_4);
		
		JTextArea textArea_5 = new JTextArea();
		textArea_5.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		textArea_5.setText("\uC644\uB8CC\uB3C4");
		textArea_5.setBounds(100, 320, 109, 24);
		contentPane.add(textArea_5);
		
		JTextArea textArea_6 = new JTextArea();
		textArea_6.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		textArea_6.setText("\uC54C\uB9BC\uC124\uC815");
		textArea_6.setBounds(100, 360, 109, 24);
		contentPane.add(textArea_6);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u2606\u2606\u2606\u2606\u2606", "\u2605\u2606\u2606\u2606\u2606", "\u2605\u2605\u2606\u2606\u2606", "\u2605\u2605\u2605\u2606\u2606", "\u2605\u2605\u2605\u2605\u2606", "\u2605\u2605\u2605\u2605\u2605"}));
		comboBox.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(250, 280, 135, 24);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"\u2606\u2606\u2606\u2606\u2606", "\u2605\u2606\u2606\u2606\u2606", "\u2605\u2605\u2606\u2606\u2606", "\u2605\u2605\u2605\u2606\u2606", "\u2605\u2605\u2605\u2605\u2606", "\u2605\u2605\u2605\u2605\u2605"}));
		comboBox_1.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setBounds(250, 320, 135, 24);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"\uC788\uC74C", "\uC5C6\uC74C"}));
		comboBox_2.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		comboBox_2.setBackground(Color.WHITE);
		comboBox_2.setBounds(250, 360, 60, 24);
		contentPane.add(comboBox_2);
		
		JButton btnNewButton = new JButton("\uBCC0\uACBD");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 18));
		btnNewButton.setBounds(500, 320, 100, 30);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("\uCDE8\uC18C");
		button.setForeground(Color.WHITE);
		button.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 18));
		button.setBackground(Color.DARK_GRAY);
		button.setBounds(500, 360, 100, 30);
		contentPane.add(button);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"2018", "2019", "2020", "2021", "2022"}));
		comboBox_3.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		comboBox_3.setBackground(Color.WHITE);
		comboBox_3.setBounds(250, 200, 60, 30);
		contentPane.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox_4.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		comboBox_4.setBackground(Color.WHITE);
		comboBox_4.setBounds(340, 200, 45, 30);
		contentPane.add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_5.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		comboBox_5.setBackground(Color.WHITE);
		comboBox_5.setBounds(415, 200, 45, 30);
		contentPane.add(comboBox_5);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 18));
		textArea.setText("\uB144");
		textArea.setBounds(310, 200, 30, 30);
		contentPane.add(textArea);
		
		JTextArea textArea_7 = new JTextArea();
		textArea_7.setText("\uC6D4");
		textArea_7.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 18));
		textArea_7.setBounds(385, 200, 30, 30);
		contentPane.add(textArea_7);
		
		JTextArea textArea_8 = new JTextArea();
		textArea_8.setText("\uC77C");
		textArea_8.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 18));
		textArea_8.setBounds(470, 200, 30, 30);
		contentPane.add(textArea_8);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"2018", "2019", "2020", "2021", "2022"}));
		comboBox_6.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		comboBox_6.setBackground(Color.WHITE);
		comboBox_6.setBounds(250, 240, 60, 30);
		contentPane.add(comboBox_6);
		
		JTextArea textArea_9 = new JTextArea();
		textArea_9.setText("\uB144");
		textArea_9.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 18));
		textArea_9.setBounds(310, 240, 30, 30);
		contentPane.add(textArea_9);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox_7.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		comboBox_7.setBackground(Color.WHITE);
		comboBox_7.setBounds(340, 240, 45, 30);
		contentPane.add(comboBox_7);
		
		JTextArea textArea_10 = new JTextArea();
		textArea_10.setText("\uC6D4");
		textArea_10.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 18));
		textArea_10.setBounds(385, 240, 30, 30);
		contentPane.add(textArea_10);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_8.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		comboBox_8.setBackground(Color.WHITE);
		comboBox_8.setBounds(415, 240, 45, 30);
		contentPane.add(comboBox_8);
		
		JTextArea textArea_11 = new JTextArea();
		textArea_11.setText("\uC77C");
		textArea_11.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 18));
		textArea_11.setBounds(470, 240, 30, 30);
		contentPane.add(textArea_11);
		
		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		comboBox_9.setBackground(Color.WHITE);
		comboBox_9.setBounds(250, 160, 210, 30);
		contentPane.add(comboBox_9);
		
		JButton button_1 = new JButton("\uC0AD\uC81C");
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 18));
		button_1.setBackground(Color.DARK_GRAY);
		button_1.setBounds(500, 280, 100, 30);
		contentPane.add(button_1);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditListUI frame = new EditListUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
