/**
 * title : FindUserUI.java
 * author : 김한동 (aggsae@gmail.com)
 * version : 3.1.0.
 * since : 2018 - 05 - 07
 * brief : ID, PW 찾기 UI 및 메소드 클래스
 * -----------------------------------
 * history
 *   author  version     date                              brief
 *   안동주        0.0.0.   2018-05-22                          초안 작성
 *   김한동        1.0.0.   2018-05-24            Email 표시상자가 텍스트필드로 되어있는 것 수정 
 *   김한동        1.1.0.   2018-05-24                     확인, 닫기 버튼 활성화
 *   김한동        2.0.0.   2018-05-25         ID, 비밀번호 찾기 완료 후 로그인 UI로 돌아오는 기능 추가
 *   김한동        2.1.0.   2018-05-25					의미없는 DB 연결 변수 삭제
 *   김한동        3.0.0.   2018-05-25                   NULL 입력에 대한 예외처리
 *   김한동        3.1.0.   2018-05-26		이메일 발송 완료 UI 추가, 이메일이 없을 경우 에러 메세지 UI 추가
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
		lbEmail.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		lbEmail.setText("Email");
		lbEmail.setBounds(85, 100, 60, 30);
		contentPane.add(lbEmail);
		
		textField = new JTextField();
		textField.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		textField.setBounds(150, 100, 200, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton findButton = new JButton("\uD655\uC778");
		findButton.setForeground(Color.WHITE);
		findButton.setBackground(Color.DARK_GRAY);
		findButton.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		findButton.setBounds(90, 180, 100, 30);
		contentPane.add(findButton);
		
		JButton backToLogin = new JButton("\uB2EB\uAE30");
		backToLogin.setBackground(Color.DARK_GRAY);
		backToLogin.setForeground(Color.WHITE);
		backToLogin.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		backToLogin.setBounds(250, 180, 100, 30);
		contentPane.add(backToLogin);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 500, 50);
		contentPane.add(panel);
		
		JLabel lblIdpw = new JLabel("ID/PW \uCC3E\uAE30");
		lblIdpw.setForeground(Color.WHITE);
		lblIdpw.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		panel.add(lblIdpw);
		
		findButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InputEmail = textField.getText();
				if(InputEmail.length() == 0) {
					ReEnterRequest noNull = new ReEnterRequest();
					noNull.setVisible(true);
				}
				
				else {
					try {
						String sQl;
						Connection cOnn = null;
						Statement st = null;
						ResultSet rs = null;
						
						Class.forName(DBConn.forName);
						cOnn = DriverManager.getConnection(DBConn.URL, DBConn.ID, DBConn.PW);
						
						st = cOnn.createStatement();
						sQl = "USE UserDB";
						st.executeQuery(sQl);
						rs = st.executeQuery("SELECT Email FROM UserData WHERE Email = '" + InputEmail + "'");
						
						while(rs.next())
							Email = rs.getString("Email");
					
						if(InputEmail.equals(Email)) {
							new FindMail(InputEmail);
							MailSendingFin sendingFin = new MailSendingFin();
							sendingFin.setVisible(true);
							dispose();
						}
						else {
							EmailInconsistency noEmail = new EmailInconsistency();
							noEmail.setVisible(true);
							dispose();
						}
						
						rs.close();
						st.close();
					} catch(ClassNotFoundException | SQLException e1) {
						e1.printStackTrace();
					}
				}
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

