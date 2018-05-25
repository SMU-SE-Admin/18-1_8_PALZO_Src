/**
 * title : FindUserUI.java
 * author : ���ѵ� (aggsae@gmail.com)
 * version : 1.1.0.
 * since : 2018 - 05 - 07
 * brief : ID, PW ã�� UI �� �޼ҵ� Ŭ����
 * -----------------------------------
 * history
 *   author  version     date                              brief
 *   �ȵ���        0.0.0.   2018-05-22                          �ʾ� �ۼ�
 *   ���ѵ�        1.0.0.   2018-05-24            Email ǥ�û��ڰ� �ؽ�Ʈ�ʵ�� �Ǿ��ִ� �� ���� 
 *   ���ѵ�        1.1.0.   2018-05-24                     Ȯ��, �ݱ� ��ư Ȱ��ȭ
 *   ���ѵ�        2.0.0.   2018-05-25         ID, ��й�ȣ ã�� �Ϸ� �� �α��� UI�� ���ƿ��� ��� �߰�
 * -----------------------------------
 */

package se.smu;

import se.smu.*;
import java.sql.*;
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
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
//import javax.mail.*;
//import javax.mail.internet.*;

public class FindUserUI extends JFrame {
	
	String sQl;
	String mail_sQl = null;
	Connection cOnn = null;
	Statement st = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	
	static String ID;
	static String Password;
	static String Email;
	static String InputEmail;

	private JPanel contentPane;
	private JTextField textField;

	public FindUserUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lbEmail = new JLabel();
		lbEmail.setFont(new Font("���� ���", Font.PLAIN, 18));
		lbEmail.setText("Email");
		lbEmail.setBounds(85, 100, 60, 30);
		contentPane.add(lbEmail);
		
		textField = new JTextField();
		textField.setFont(new Font("���� ���", Font.PLAIN, 15));
		textField.setBounds(150, 100, 200, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton findButton = new JButton("\uD655\uC778");
		findButton.setForeground(Color.WHITE);
		findButton.setBackground(Color.DARK_GRAY);
		findButton.setFont(new Font("���� ���", Font.PLAIN, 18));
		findButton.setBounds(90, 180, 100, 30);
		contentPane.add(findButton);
		
		JButton backToLogin = new JButton("\uB2EB\uAE30");
		backToLogin.setBackground(Color.DARK_GRAY);
		backToLogin.setForeground(Color.WHITE);
		backToLogin.setFont(new Font("���� ���", Font.PLAIN, 18));
		backToLogin.setBounds(250, 180, 100, 30);
		contentPane.add(backToLogin);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 500, 50);
		contentPane.add(panel);
		
		JLabel lblIdpw = new JLabel("ID/PW \uCC3E\uAE30");
		lblIdpw.setForeground(Color.WHITE);
		lblIdpw.setFont(new Font("���� ���", Font.PLAIN, 20));
		panel.add(lblIdpw);
		
		findButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InputEmail = textField.getText();
				new FindMail(InputEmail);
				//"������ �߼۵Ǿ����ϴ�." UI �߰��� ��� �߰�
				LoginUI endFind = new LoginUI();
				endFind.setVisible(true);
				dispose();
			}
		});
		
		backToLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
					FindUserUI frame = new FindUserUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

