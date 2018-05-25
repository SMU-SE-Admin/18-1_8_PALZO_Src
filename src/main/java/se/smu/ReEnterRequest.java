/**
 * title : ReEnterRequest.java
 * author : ±Ë«—µø (aggsae@gmail.com)
 * version : 2.0.0.
 * since : 2018 - 05 - 07
 * brief : ∫Û ƒ≠ ø°∑Ø ∏ﬁºº¡ˆ √‚∑¬ UI
 * -----------------------------------
 * history
 *   author  version     date                          brief
 *   æ»µø¡÷       0.0.0.   2018-05-22                      √ æ» ¿€º∫
 *   ±Ë«—µø       1.0.0.   2018-05-25                  ∆–≈∞¡ˆ √ﬂ∞°, ¡÷ºÆ ¿€º∫
 *   ±Ë«—µø       2.0.0.   2018-05-25                    ¥›±‚πˆ∆∞ »∞º∫»≠
 * -----------------------------------
 */

package se.smu;

import se.smu.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JButton;


public class ReEnterRequest extends JFrame {

	private JPanel contentPane;

	public ReEnterRequest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 18));
		textPane.setText("\uC591\uC2DD\uC744 \uBAA8\uB450 \uC785\uB825\uD574\uC8FC\uC2ED\uC2DC\uC624");
		textPane.setBounds(114, 85, 268, 54);
		contentPane.add(textPane);
		
		JButton closeWindowButton = new JButton("\uB2EB\uAE30");
		closeWindowButton.setForeground(Color.WHITE);
		closeWindowButton.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 18));
		closeWindowButton.setBackground(Color.DARK_GRAY);
		closeWindowButton.setBounds(300, 180, 100, 40);
		contentPane.add(closeWindowButton);
		
		closeWindowButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReEnterRequest frame = new ReEnterRequest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
