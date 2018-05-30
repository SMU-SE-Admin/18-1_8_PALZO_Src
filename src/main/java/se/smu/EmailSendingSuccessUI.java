/**
 * title : EmailSendingSuccessUI.java
 * author : 김한동 (aggsae@gmail.com)
 * version : 0.0.0.
 * since : 2018 - 05 - 07
 * brief : 메일 전송 확인 메세지 출력
 * -----------------------------------
 * history
 *   author  version      date                            brief
 *   김한동       0.0.0.    2018-05-26                        초안 작성
 * -----------------------------------
 */

package se.smu;

import se.smu.*;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;

public class EmailSendingSuccessUI extends JFrame {

	private JPanel contentPane;

	public EmailSendingSuccessUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel textPane = new JLabel();
		textPane.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		textPane.setText("Email로 계정정보를 전송하였습니다.");
		textPane.setBounds(114, 85, 268, 54);
		contentPane.add(textPane);
		
		JButton closeWindowButton = new JButton("\uB2EB\uAE30");
		closeWindowButton.setForeground(Color.WHITE);
		closeWindowButton.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		closeWindowButton.setBackground(Color.DARK_GRAY);
		closeWindowButton.setBounds(300, 180, 100, 40);
		contentPane.add(closeWindowButton);
		
		closeWindowButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LoginUI backToLogin = new LoginUI();
				backToLogin.setVisible(true);
				dispose();
			}
		});
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				EmailSendingSuccessUI frame = new EmailSendingSuccessUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
