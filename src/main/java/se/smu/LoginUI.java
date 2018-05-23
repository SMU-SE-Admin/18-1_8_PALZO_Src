/**
 * title : LoginUI.java
 * author : 김한동 (aggsae@gmail.com)
 * version : 1.0.0.
 * since : 2018 - 05 - 07
 * brief : DB 연동 String
 * -----------------------------------
 * history
 *   author  version     date                                                    brief
 *   안동주       0.0.0.   2018-05-22                                                초안 작성
 *   김한동       0.1.0.   2018-05-23     ID, PW 필드 바뀐 것 수정, ActionListener 작성, 추후 작성될 TodoList, IdError 항목 주석처리, DB 연결 문제 해결 진행 중
 *   김한동       1.0.0.   2018-05-23                                         DB 접근자 수정, import문 정렬
 *   
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
	//DB 접속 변수 선언
	Connection cOnn = null;
	Statement st = null;
	PreparedStatement pst = null;
	ResultSet rs = null;

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
		
		JButton btnNewButton = new JButton("ID/PW \uCC3E\uAE30");
		btnNewButton.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(253, 170, 131, 27);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("\uD68C\uC6D0\uAC00\uC785");
		button.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
	    button.setBackground(Color.DARK_GRAY);
		button.setForeground(Color.WHITE);
		button.setBounds(100, 170, 131, 27);
		contentPane.add(button);
		
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
						InputID = idField.getText();
						InputPassword = new String(passwordField.getPassword());
					
						Class.forName(DBConn.forName);
						cOnn = DriverManager.getConnection(DBConn.URL, DBConn.ID, DBConn.PW);
					
						st = cOnn.createStatement();
						rs = st.executeQuery("SELECT ID, PW FROM UserDB WHERE ID = '" + InputID + "'");
					
						while(rs.next()) {
							ID = rs.getString("ID");
							Password = rs.getString("PW");
				}
					
				if(InputID.equals(ID) && (InputPassword.equals(Password))) {
					pass = true;
					MainUI frame = new MainUI();
					frame.setVisible(true);
					dispose();
				}
				else {
					pass = false;
					IdError frame = new IdError();
					frame.setVisible(true);
					dispose();
				}
					
				System.out.println("Login" + pass);
					
				rs.close();
				st.close();
			} catch (ClassNotFoundException | SQLException e1) {
				e1.printStackTrace();
			}
		}
	});
		
		// 회원가입 버튼
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RegiUserUI showRegiUI = new RegiUserUI();
				showRegiUI.setVisible(true);
				dispose();
			}
		});
		
		// ID, PW 찾기 버튼
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
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
