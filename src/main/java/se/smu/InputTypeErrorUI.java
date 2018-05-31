/**
 * title : InputTypeErrorUI.java
 * author : 김한동 (aggsae@gmail.com)
 * version : 1.0.0.
 * since : 2018 - 05 - 07
 * brief : 유효하지 않은 정보 입력 메세지 출력
 * -----------------------------------
 * history
 *   author  version      date                            brief
 *   김한동       0.0.0.    2018-05-26                        초안 작성
 *   김한동       1.0.0.    2018-05-30          유효하지 않은 정보 입력에 대한 공통 메세지로 수정
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

public class InputTypeErrorUI extends JFrame{
	private JPanel contentPane;

	public InputTypeErrorUI() {
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
		txtpnAsd.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		txtpnAsd.setText("유효하지 않은 정보가 입력되었습니다.");
		txtpnAsd.setBounds(147, 82, 214, 61);
		contentPane.add(txtpnAsd);
		
		backToLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InputTypeErrorUI frame = new InputTypeErrorUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
