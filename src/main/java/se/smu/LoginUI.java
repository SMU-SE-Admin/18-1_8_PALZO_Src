/**
 * title : LoginUI.java
 * author : 김한동 (aggsae@gmail.com)
 * version : 3.0.0.
 * since : 2018 - 05 - 07
 * brief : Login UI 및 메소드 클래스
 * -----------------------------------
 * history
 *   author  version     date                                                    brief
 *   안동주       0.0.0.   2018-05-22                                                초안 작성
 *   김한동       0.1.0.   2018-05-23     ID, PW 필드 바뀐 것 수정, ActionListener 작성, 추후 작성될 TodoList, IdError 항목 주석처리, DB 연결 문제 해결 진행 중
 *   김한동       1.0.0.   2018-05-23               DB 접근자 수정, import문 정렬, 버튼 이름 수정, 버튼들에 대한 동작 구현, 주석문 수정, 액션플레너 변수 수정
 *   김한동       1.0.1.   2018-05-23                                             미사용 DB 변수 삭제
 *   김한동       2.0.0.   2018-05-24                                          DB 및 연결자 변경에 따른 수정
 *   김한동       2.1.0.   2018-05-25                                      DB 연결자를 전역변수에서 지역변수로 변경
 *   김한동       2.2.0.   2018-05-30                                          NULL 입력에 대한 예외처리
 *   김한동       3.0.0.   2018-05-31                                            로그인 기능 오류 해결
 * -----------------------------------
 */

package se.smu;

import se.smu.*;
import java.sql.*;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Color;
import java.awt.ScrollPane;
import java.awt.Panel;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class LoginUI extends JFrame {
	
	static String ID;
	static String Password;
	static String InputID;
	static String InputPassword;
	static Boolean pass = false;
	
	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField idField;

	public LoginUI() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		passwordField.setBounds(100, 120, 164, 24);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("login");
		btnLogin.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		btnLogin.setForeground(Color.WHITE);
		
		btnLogin.setBackground(Color.DARK_GRAY);
		btnLogin.setBounds(279, 119, 105, 27);
		contentPane.add(btnLogin);
		
		JButton findIDPWButton = new JButton("ID/PW \uCC3E\uAE30");
		findIDPWButton.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		findIDPWButton.setBackground(Color.DARK_GRAY);
		findIDPWButton.setForeground(Color.WHITE);
		findIDPWButton.setBounds(253, 170, 131, 27);
		contentPane.add(findIDPWButton);
		
		JButton joinButton = new JButton("\uD68C\uC6D0\uAC00\uC785");
		joinButton.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		joinButton.setBackground(Color.DARK_GRAY);
		joinButton.setForeground(Color.WHITE);
		joinButton.setBounds(100, 170, 131, 27);
		contentPane.add(joinButton);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(58, 70, 23, 24);
		contentPane.add(lblId);
		
		JLabel lblPw = new JLabel("PW");
		lblPw.setBounds(58, 120, 32, 24);
		contentPane.add(lblPw);
		
		idField = new JTextField();
		idField.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		idField.setBounds(100, 70, 164, 24);
		contentPane.add(idField);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 500, 50);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("TO-DO LIST");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		lblNewLabel.setForeground(Color.WHITE);
		panel.add(lblNewLabel);
		
		// 로그인 버튼 기능
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
						String sQl;
						Connection cOnn = null;
						Statement st = null;
						ResultSet rs = null;
					
						InputID = idField.getText();
						InputPassword = new String(passwordField.getPassword());
					
						Class.forName(DBConn.forName);
						cOnn = DriverManager.getConnection(DBConn.URL, DBConn.ID, DBConn.PW);
					
						st = cOnn.createStatement();
						sQl = "USE UserDB";
						st.executeQuery(sQl);
						rs = st.executeQuery("SELECT ID, Password FROM UserData WHERE ID = '" + InputID + "'");
					
						while(rs.next()) {
							ID = rs.getString("ID");
							Password = rs.getString("Password");
				}
					
				if(InputID.length() == 0 || InputPassword.length() == 0) {
					//pass = true;
					ReEnterRequest frame = new ReEnterRequest();
					frame.setVisible(true);
					dispose();
				}
				else {
					//pass = false;
					MainUI frame = new MainUI();
					frame.setVisible(true);
					dispose();
				}
					
				rs.close();
				st.close();
			} catch (ClassNotFoundException | SQLException e1) {
				e1.printStackTrace();
			}
		}
	});
		
		// 회원가입 버튼
		joinButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegiUserUI showRegiUI = new RegiUserUI();
				showRegiUI.setVisible(true);
				dispose();
			}
		});
		
		// ID, PW 찾기 버튼
		findIDPWButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FindUserUI showFindUserUI = new FindUserUI();
				showFindUserUI.setVisible(true);
				dispose();
			}
		});
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUI frame = new LoginUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
