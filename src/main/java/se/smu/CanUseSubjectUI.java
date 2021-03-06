/**
 * title : CanUseSubjectUI.java
 * author : 김한동 (aggsae@gmail.com)
 * version : 0.0.0.
 * since : 2018 - 05 - 07
 * brief : 과목 중복확인 메세지 출력
 * -----------------------------------
 * history
 *   author  version      date                            brief
 *   김한동       0.0.0.    2018-05-26                        초안 작성
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
import javax.swing.JLabel;


public class CanUseSubjectUI extends JFrame{
	private JPanel contentPane;

	public CanUseSubjectUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton backToLogin = new JButton("\uB2EB\uAE30"); //'돌아가기'("\uB3CC\uC544\uAC00\uAE30")
		backToLogin.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		backToLogin.setBackground(Color.DARK_GRAY);
		backToLogin.setForeground(Color.WHITE);
		backToLogin.setBounds(300, 180, 100, 40);
		contentPane.add(backToLogin);
		
		JLabel txtpnAsd = new JLabel();
		txtpnAsd.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		txtpnAsd.setText("등록 가능한 과목입니다.");
		txtpnAsd.setBounds(147, 82, 214, 61);
		contentPane.add(txtpnAsd);
		
		backToLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegiSubjectUI backToRegiSubject = new RegiSubjectUI();
				backToRegiSubject.setVisible(true);
				dispose();
			}
		});
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CanUseSubjectUI frame = new CanUseSubjectUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
