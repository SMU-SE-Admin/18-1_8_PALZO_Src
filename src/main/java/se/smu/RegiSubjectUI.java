/**
 * title : RegiSubjectUI.java
 * author : ±Ë«—µø (aggsae@gmail.com)
 * version : 1.0.0.
 * since : 2018 - 05 - 07
 * brief : ∞˙∏Ò «◊∏Ò µÓ∑œ UI
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
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class RegiSubjectUI extends JFrame {

	private JPanel contentPane;
	private JTextField SubField;
	private JTextField TeacherField;
	private JTextField YearField;
	private JTextField SemeterField;
	private JTextField LecTime1;
	private JTextField Lectime2;
	private JTextField LabField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegiSubjectUI frame = new RegiSubjectUI();
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
	public RegiSubjectUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 403);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton RegiButton = new JButton("\uB4F1\uB85D");//µÓ∑œπˆ∆∞
		RegiButton.setBackground(Color.DARK_GRAY);
		RegiButton.setForeground(Color.WHITE);
		RegiButton.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		RegiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		RegiButton.setBounds(430, 210, 100, 30);
		contentPane.add(RegiButton);
		
		JButton CancelBtn = new JButton("\uCDE8\uC18C");//√Îº“πˆ∆∞
		CancelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		CancelBtn.setForeground(Color.WHITE);
		CancelBtn.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		CancelBtn.setBackground(Color.DARK_GRAY);
		CancelBtn.setBounds(430, 280, 100, 30);
		contentPane.add(CancelBtn);
		
		JTextPane SubName = new JTextPane();
		SubName.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		SubName.setText("\uACFC\uBAA9\uBA85");
		SubName.setBounds(50, 90, 80, 30);
		contentPane.add(SubName);
		
		JTextPane ProfessorBtn = new JTextPane();
		ProfessorBtn.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		ProfessorBtn.setText("\uB2F4\uB2F9\uAD50\uC218");
		ProfessorBtn.setBounds(50, 130, 87, 27);
		contentPane.add(ProfessorBtn);
		
		JTextPane Semester = new JTextPane();
		Semester.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		Semester.setText("\uAC15\uC758\uD559\uAE30");
		Semester.setBounds(50, 170, 87, 27);
		contentPane.add(Semester);
		
		JTextPane Time = new JTextPane();
		Time.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		Time.setText("\uAC15\uC758\uC2DC\uAC04");
		Time.setBounds(50, 210, 87, 27);
		contentPane.add(Time);
		
		JTextPane Lab = new JTextPane();
		Lab.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		Lab.setText("\uAC15\uC758\uC2E4");
		Lab.setBounds(50, 250, 87, 27);
		contentPane.add(Lab);
		
		SubField = new JTextField();
		SubField.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		SubField.setBounds(150, 90, 184, 24);
		contentPane.add(SubField);
		SubField.setColumns(10);
		
		TeacherField = new JTextField();
		TeacherField.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		TeacherField.setColumns(10);
		TeacherField.setBounds(150, 130, 184, 24);
		contentPane.add(TeacherField);
		
		YearField = new JTextField();
		YearField.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		YearField.setColumns(10);
		YearField.setBounds(150, 170, 56, 24);
		contentPane.add(YearField);
		
		JTextPane textPane_5 = new JTextPane();
		textPane_5.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		textPane_5.setText("\uB144\uB3C4");
		textPane_5.setBounds(211, 170, 45, 24);
		contentPane.add(textPane_5);
		
		SemeterField = new JTextField();
		SemeterField.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		SemeterField.setColumns(10);
		SemeterField.setBounds(260, 170, 35, 24);
		contentPane.add(SemeterField);
		
		JTextPane textPane_6 = new JTextPane();
		textPane_6.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		textPane_6.setText("\uD559\uAE30");
		textPane_6.setBounds(300, 170, 45, 24);
		contentPane.add(textPane_6);
		
		LecTime1 = new JTextField();
		LecTime1.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		LecTime1.setColumns(10);
		LecTime1.setBounds(232, 210, 35, 30);
		contentPane.add(LecTime1);
		
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
		
		Lectime2 = new JTextField();
		Lectime2.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		Lectime2.setColumns(10);
		Lectime2.setBounds(314, 210, 35, 30);
		contentPane.add(Lectime2);
		
		JTextPane textPane_9 = new JTextPane();
		textPane_9.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		textPane_9.setText("~");
		textPane_9.setBounds(291, 210, 26, 24);
		contentPane.add(textPane_9);
		
		LabField = new JTextField();
		LabField.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		LabField.setColumns(10);
		LabField.setBounds(150, 250, 56, 24);
		contentPane.add(LabField);
		
		JComboBox Day = new JComboBox();
		Day.setModel(new DefaultComboBoxModel(new String[] {"\uC6D4\uC694\uC77C", "\uD654\uC694\uC77C", "\uC218\uC694\uC77C", "\uBAA9\uC694\uC77C", "\uAE08\uC694\uC77C", "\uD1A0\uC694\uC77C", "\uC77C\uC694\uC77C"}));
		Day.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		Day.setBounds(150, 210, 80, 30);
		contentPane.add(Day);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 600, 70);
		contentPane.add(panel);
		
		JLabel label = new JLabel("\uACFC\uBAA9\uB4F1\uB85D");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 35));
		panel.add(label);
		
	}
}


