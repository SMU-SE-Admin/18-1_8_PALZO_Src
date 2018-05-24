/**
 * title : EmailInconsistency.java
 * author : 김한동 (aggsae@gmail.com)
 * version : 1.0.0.
 * since : 2018 - 05 - 07
 * brief : 회원가입 UI 및 메소드 클래스
 * -----------------------------------
 * history
 *   author  version     date                          brief
 *   안동주       0.0.0.   2018-05-22                      초안 작성
 *   김한동       1.0.0.   2018-05-24                 주석 작성, 닫기 버튼 활성화
 * -----------------------------------
 */

package se.smu;

import se.smu.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextPane;

public class EmailInconsistency extends JFrame {

	private JPanel contentPane;

	public EmailInconsistency() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);

		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton backToFindUser = new JButton("\uB2EB\uAE30");
		backToFindUser.setBackground(Color.DARK_GRAY);
		backToFindUser.setForeground(Color.WHITE);
		backToFindUser.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		backToFindUser.setBounds(300, 180, 100, 40);
		contentPane.add(backToFindUser);
		
		JTextPane txtpnEmailaddress = new JTextPane();
		txtpnEmailaddress.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		txtpnEmailaddress.setText("\uC77C\uCE58\uD558\uB294 Email\uC774 \uC5C6\uC2B5\uB2C8\uB2E4. \uB2E4\uC2DC \uC785\uB825\uD574 \uC8FC\uC2ED\uC2DC\uC624");
		txtpnEmailaddress.setBounds(110, 70, 240, 80);
		contentPane.add(txtpnEmailaddress);
		
		backToFindUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FindUserUI backToFindUser = new FindUserUI();
				backToFindUser.setVisible(true);
				dispose();
			}
		});
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmailInconsistency frame = new EmailInconsistency();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
