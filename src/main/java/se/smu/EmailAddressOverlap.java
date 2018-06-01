/**
 * title : EmailAddressOverlap.java
 * author : ���ѵ� (aggsae@gmail.com)
 * version : 2.0.0.
 * since : 2018 - 05 - 07
 * brief : ID �ߺ� Ȯ�� �޼���
 * -----------------------------------
 * history
 *   author  version     date                            brief
 *   �ȵ���       0.0.0.   2018-05-22                        �ʾ� �ۼ�
 *   ���ѵ�       1.0.0.   2018-05-23          ��Ű�� �� �ּ��� �߰� �� ����, ��ư�� ����, ��ư ��� ����
 *   ���ѵ�       2.0.0.   2018-06-01                        ������ �ۼ�
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
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JLabel;

public class EmailAddressOverlap extends JFrame {

	private JPanel contentPane;

	public EmailAddressOverlap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel txtpnEmailaddress = new JLabel();
		txtpnEmailaddress.setFont(new Font("���� ���", Font.PLAIN, 18));
		txtpnEmailaddress.setText("EmailAddress\uAC00 \uC911\uBCF5\uB429\uB2C8\uB2E4.");
		txtpnEmailaddress.setBounds(121, 76, 271, 73);
		contentPane.add(txtpnEmailaddress);
		
		JButton backToRegiUser = new JButton("\uB2EB\uAE30");
		backToRegiUser.setFont(new Font("���� ���", Font.PLAIN, 18));
		backToRegiUser.setBackground(Color.DARK_GRAY);
		backToRegiUser.setForeground(Color.WHITE);
		backToRegiUser.setBounds(300, 180, 100, 40);
		contentPane.add(backToRegiUser);
		
		backToRegiUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegiUserUI backToRegiUser = new RegiUserUI();
				backToRegiUser.setVisible(true);
				dispose();
			}
		});
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmailAddressOverlap frame = new EmailAddressOverlap();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
