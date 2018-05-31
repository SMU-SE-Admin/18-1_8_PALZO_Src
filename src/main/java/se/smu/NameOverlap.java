/**
 * title : NameOverlap.java
 * author : 김한동 (aggsae@gmail.com)
 * version : 2.0.0.
 * since : 2018 - 05 - 07
 * brief : 과목 이름 중복 에러 메세지 UI
 * -----------------------------------
 * history
 *   author  version     date                          brief
 *   안동주       0.0.0.   2018-05-22                      초안 작성
 *   김한동       1.0.0.   2018-05-25                  패키지 추가, 주석 작성
 *   김한동       2.0.0.   2018-05-31                   버튼 기능 활성화
 * -----------------------------------
 */

package se.smu;

import se.smu.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;

public class NameOverlap extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NameOverlap frame = new NameOverlap();
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
	public NameOverlap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel ContentLabel = new JLabel("\uC774\uB984\uC774 \uC911\uBCF5\uB418\uB294 \uACFC\uBAA9\uC774 \uC874\uC7AC\uD569\uB2C8\uB2E4.");
		ContentLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		ContentLabel.setBounds(60, 86, 309, 47);
		contentPane.add(ContentLabel);
		
		JButton CancelBtn = new JButton("\uB2EB\uAE30");
		CancelBtn.setBackground(Color.DARK_GRAY);
		CancelBtn.setForeground(Color.WHITE);
		CancelBtn.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		CancelBtn.setBounds(300, 180, 100, 30);
		contentPane.add(CancelBtn);
		CancelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegiSubjectUI backToRegiSub = new RegiSubjectUI();
				backToRegiSub.setVisible(true);
				dispose();
			}
		});
	}
}
