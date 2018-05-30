/**
 * title : ReEnterRequest.java
 * author : 김한동 (aggsae@gmail.com)
 * version : 2.1.0.
 * since : 2018 - 05 - 07
 * brief : 빈 칸 에러 메세지 출력 UI
 * -----------------------------------
 * history
 *   author  version     date                          brief
 *   안동주       0.0.0.   2018-05-22                      초안 작성
 *   김한동       1.0.0.   2018-05-25                  패키지 추가, 주석 작성
 *   김한동       2.0.0.   2018-05-25                    닫기버튼 활성화
 *   김한동       2.1.0.   2018-05-26             Textpane 부분 JLabel로 변경
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
import javax.swing.JButton;
import javax.swing.JLabel;


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
		
		JLabel textPane = new JLabel();
		textPane.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		textPane.setText("\uC591\uC2DD\uC744 \uBAA8\uB450 \uC785\uB825\uD574\uC8FC\uC2ED\uC2DC\uC624");
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
