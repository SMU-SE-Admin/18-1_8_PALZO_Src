/**
 * title : RegiUserUI.java
 * author : 김한동 (aggsae@gmail.com)
 * version : 1.0.0.
 * since : 2018 - 05 - 07
 * brief : 회원가입 UI 및 메소드 클래스
 * -----------------------------------
 * history
 *   author  version     date                                                            brief
 *   안동주       0.0.0.   2018-05-22                                                        초안 작성
 *   김한동       1.0.0.   2018-05-23          패키지 및 주석문 추가 및 정렬, 버튼명 수정, 버튼들에 대한 기능 구현, Label로 해야하는 것을 TextField로 구현한 것 수정
 *   김한동       2.0.0.   2018-05-24                                     Join 기능이 되지 않는 것 수정, UI 없는 부분 주석으로 표시
 *   김한동       2.1.0.   2018-05-24                                            checkid, checkemail 버튼 활성화
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
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;


public class RegiUserUI extends JFrame {

	Connection cOnn = null;
	String sQl;
	Statement st = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	
	static String ID;
	static String Password;
	static String Email;
	static String InputID;
	static String InputPassword;
	static String InputEmail;
	static Boolean idRepeat = false;
	static Boolean emailRepeat = false;
	
	private JPanel contentPane;
	private JTextField idTextField;
	private JPasswordField pwTextField;
	private JTextField emailTextField;

	public RegiUserUI() {
		
		JTextPane textPane = new JTextPane();
		getContentPane().add(textPane, BorderLayout.NORTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500,300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lbEail = new JLabel();
		lbEail.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		lbEail.setText("Email");
		lbEail.setBounds(56, 171, 46, 33);
		contentPane.add(lbEail);
		
		JLabel lbPw = new JLabel();
		lbPw.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		lbPw.setText("  PW");
		lbPw.setBounds(56, 136, 46, 23);
		contentPane.add(lbPw);
		
		JLabel lbId = new JLabel();
		lbId.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		lbId.setText("ID");
		lbId.setBounds(73, 103, 46, 33);
		contentPane.add(lbId);
		
		idTextField = new JTextField();
		idTextField.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		idTextField.setBounds(133, 103, 186, 24);
		contentPane.add(idTextField);
		idTextField.setColumns(10);
		
		pwTextField = new JPasswordField();
		pwTextField.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		pwTextField.setColumns(10);
		pwTextField.setBounds(133, 135, 186, 24);
		contentPane.add(pwTextField);
		
		emailTextField = new JTextField();
		emailTextField.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		emailTextField.setColumns(10);
		emailTextField.setBounds(133, 173, 186, 24);
		contentPane.add(emailTextField);
		
		JButton checkIdButton = new JButton("\uC911\uBCF5\uD655\uC778");
		checkIdButton.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		checkIdButton.setForeground(Color.WHITE);
		checkIdButton.setBackground(Color.DARK_GRAY);
		checkIdButton.setBounds(333, 103, 105, 27);
		contentPane.add(checkIdButton);
		
		JButton checkEmailButton = new JButton("\uC911\uBCF5\uD655\uC778");
		checkEmailButton.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		checkEmailButton.setForeground(Color.WHITE);
		checkEmailButton.setBackground(Color.DARK_GRAY);
		checkEmailButton.setBounds(333, 171, 105, 27);
		contentPane.add(checkEmailButton);
		
		JButton joinButton = new JButton("\uD68C\uC6D0\uAC00\uC785");
		joinButton.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		joinButton.setForeground(Color.WHITE);
		joinButton.setBackground(Color.DARK_GRAY);
		joinButton.setBounds(104, 209, 105, 27);
		contentPane.add(joinButton);
		
		JButton backToLogin = new JButton("\uCDE8\uC18C");
		backToLogin.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		backToLogin.setForeground(Color.WHITE);
		backToLogin.setBackground(Color.DARK_GRAY);
		backToLogin.setBounds(250, 209, 105, 27);
		contentPane.add(backToLogin);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 500, 50);
		contentPane.add(panel);
		
		JLabel label = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		panel.add(label);
		
		checkIdButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				try {
					InputID = idTextField.getText();
					
					Class.forName(DBConn.forName);
					cOnn = DriverManager.getConnection(DBConn.URL, DBConn.ID, DBConn.PW);
					st = cOnn.createStatement();
					sQl = "USE UserDB";
					st.executeQuery(sQl);
					rs = st.executeQuery("SELECT ID FROM UserData WHERE ID = '" + InputID + "'");
					
					while(rs.next()) {
						ID = rs.getString("ID");
					}
					
					if(InputID.equals(ID)) {
						idRepeat = true;
						IdOverlap idOverLap = new IdOverlap();
						idOverLap.setVisible(true);
						dispose();
					}
					else {
						idRepeat = false;
						System.out.println("중복되지 않은 아이디입니다.");
						//메세지 UI 구축 후 추가
					}
				} catch (ClassNotFoundException | SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		checkEmailButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					InputEmail = emailTextField.getText();
					
					Class.forName(DBConn.forName);
					cOnn = DriverManager.getConnection(DBConn.URL, DBConn.ID, DBConn.PW);
					st = cOnn.createStatement();
					sQl = "USE UserDB";
					st.executeQuery(sQl);
					rs = st.executeQuery("SELECT Email FROM UserData WHERE Email = '" + InputEmail + "'");
					
					while(rs.next()) {
						Email = rs.getString("Email");
					}
					
					if(InputEmail.equals(Email)) {
						emailRepeat = true;
						EmailAddressOverlap emailOverLap = new EmailAddressOverlap();
						emailOverLap.setVisible(true);
						dispose();
					}
					else {
						emailRepeat = false;
						System.out.println("중복되지 않은 이메일입니다.");
						//메세지 UI 구축 후 추가
					}
				} catch (ClassNotFoundException | SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		joinButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/* 중복확인을 누르지 않을 경우 에러 메세지 출력
				if(idRepeat == false) {
					IdOverlap idOverLap = new IdOverlap();
					idOverLap.setVisible(true);
					dispose();
				}
				
				else { */
					InputID = idTextField.getText();
					InputPassword = new String(pwTextField.getPassword());
					InputEmail = emailTextField.getText();
				//ID필드, PW필드, Email필드 어느 한 군데가 공백이면 기능하지 않도록 구현
					UserDB userDB = new UserDB();
					userDB.UserData(InputID, InputPassword, InputEmail);
					//회원가입 성공 테스트
					//System.out.println("Join Success");
				
					LoginUI backToLogin = new LoginUI();
					backToLogin.setVisible(true);
					dispose();
				//}
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
					RegiUserUI frame = new RegiUserUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
