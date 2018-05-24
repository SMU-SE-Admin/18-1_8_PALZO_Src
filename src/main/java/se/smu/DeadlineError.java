/**
 * title : DeadlineError.java
 * author : 김한동 (aggsae@gmail.com)
 * version : 1.0.0.
 * since : 2018 - 05 - 07
 * brief : 마감기한 에러 메세지 UI
 * -----------------------------------
 * history
 *   author  version     date                          brief
 *   안동주       0.0.0.   2018-05-22                      초안 작성
 *   김한동       1.0.0.   2018-05-25                  패키지 추가, 주석 작성
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
import javax.swing.JButton;
import javax.swing.JTextPane;

public class DeadlineError extends JFrame {

	private JPanel contentPane;

	public DeadlineError() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("\uB2EB\uAE30\r\n");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		btnNewButton.setBounds(300, 180, 100, 30);
		contentPane.add(btnNewButton);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		textPane.setText("\uB9C8\uAC10 \uAE30\uD55C\uBCF4\uB2E4 \uC2E4\uC81C \uB9C8\uAC10\uC77C\uC774 \uBE60\uB985\uB2C8\uB2E4.\r\n           \uB2E4\uC2DC \uC785\uB825\uC8FC\uC2ED\uC2DC\uC624.");
		textPane.setBounds(90, 79, 331, 90);
		contentPane.add(textPane);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeadlineError frame = new DeadlineError();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
