/**
 * title : WelcomeMessageUI.java
 * author : ���ѵ� (aggsae@gmail.com)
 * version : 0.0.0.
 * since : 2018 - 05 - 07
 * brief : ȸ������ �Ϸ� �޼��� ��� UI
 * -----------------------------------
 * history
 *   author  version     date                          brief
 *   ���ѵ�       0.0.0.   2018-05-30                      �ʾ� �ۼ�
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

public class WelcomeMessageUI extends JFrame{

	private JPanel contentPane;

	public WelcomeMessageUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel textPane = new JLabel();
		textPane.setFont(new Font("���� ���", Font.PLAIN, 18));
		textPane.setText("ȸ�������� �Ϸ�Ǿ����ϴ�.");
		textPane.setBounds(114, 85, 268, 54);
		contentPane.add(textPane);
		
		JButton closeWindowButton = new JButton("\uB2EB\uAE30");
		closeWindowButton.setForeground(Color.WHITE);
		closeWindowButton.setFont(new Font("���� ���", Font.PLAIN, 18));
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
					WelcomeMessageUI frame = new WelcomeMessageUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
