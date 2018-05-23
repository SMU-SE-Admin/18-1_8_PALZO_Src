/**
 * title : LoginUI.java
 * author : ±Ë«—µø (aggsae@gmail.com)
 * version : 0.1.0.
 * since : 2018 - 05 - 07
 * brief : DB ø¨µø String
 * -----------------------------------
 * history
 *   author  version     date                                                    brief
 *   æ»µø¡÷       0.0.0.   2018-05-22                                                √ æ» ¿€º∫
 *   ±Ë«—µø       0.1.0.   2018-05-23     ID, PW « µÂ πŸ≤Ô ∞Õ ºˆ¡§, ActionListener ¿€º∫, √ﬂ»ƒ ¿€º∫µ… TodoList, IdError «◊∏Ò ¡÷ºÆ√≥∏Æ, DB ø¨∞· πÆ¡¶ «ÿ∞· ¡¯«‡ ¡ﬂ
 *   
 *   
 * -----------------------------------
 */

package se.smu;

import se.smu.*;
import java.sql.*;
import java.util.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JToggleButton;
import javax.swing.JSeparator;
import java.awt.ScrollPane;
import java.awt.Panel;
import java.awt.Button;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class LoginUI extends JFrame {

	Connection cOnn = null;
	String sQl;
	Statement st = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	
	Scanner in = new Scanner(System.in);
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
		passwordField.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		passwordField.setBounds(100, 120, 164, 24);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("login");
		btnLogin.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		btnLogin.setForeground(Color.WHITE);
		
		btnLogin.setBackground(Color.DARK_GRAY);
		btnLogin.setBounds(279, 119, 105, 27);
		contentPane.add(btnLogin);
		
		JButton btnNewButton = new JButton("ID/PW \uCC3E\uAE30");
		btnNewButton.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(253, 170, 131, 27);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("\uD68C\uC6D0\uAC00\uC785");
		button.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
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
		idField.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		idField.setBounds(100, 70, 164, 24);
		contentPane.add(idField);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 500, 50);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("TO-DO LIST");
		lblNewLabel.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 20));
		lblNewLabel.setForeground(Color.WHITE);
		panel.add(lblNewLabel);
		
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					InputID = idField.getText();
					InputPassword = new String(passwordField.getPassword());
					
					Class.forName(DBConn.forName);
					cOnn = DriverManager.getConnection(DBConn.URL, DBConn.ID, DBConn.PW);
					
					st = cOnn.createStatement();
					sQl = "USERDB";
					st.executeQuery(sQl);
					rs = st.executeQuery("SELECT ID, PW FROM UserData WHERE ID = '" + InputID + "'");
					
					while(rs.next()) {
						ID = rs.getString("ID");
						Password = rs.getString("PW");
					}
					
					if(InputID.equals(ID) && (InputPassword.equals(Password))) {
						pass = true;
						// new TodoList();
						setVisible(false);
					}
					else {
						pass = false;
						//new IdError();
					}
					
					System.out.println("Login" + pass);
					
					rs.close();
					st.close();
				} catch (ClassNotFoundException | SQLException e1) {
					e1.printStackTrace();
				}
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
