/**
 * title : CheckAlarmUI.java
 * author : ±Ë«—µø (aggsae@gmail.com)
 * version : 3.0.0.
 * since : 2018 - 05 - 07
 * brief : ∏∂∞®±‚«— æ»≥ª UI
 * -----------------------------------
 * history
 *   author  version     date                          brief
 *   æ»µø¡÷       0.0.0.   2018-05-22                      √ æ» ¿€º∫
 *   ±Ë«—µø       1.0.0.   2018-05-25                  ∆–≈∞¡ˆ √ﬂ∞°, ¡÷ºÆ ¿€º∫
 *   ±Ë«—µø       2.0.0.   2018-06-01                    ¥›±‚ πˆ∆∞ »∞º∫»≠
 *   ±Ë«—µø       3.0.0.   2018-06-01                      √÷¡æ∫ª ¿€º∫
 * -----------------------------------
 */

package se.smu;

import se.smu.*;
import java.sql.*;
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

public class CheckAlarmUI extends JFrame {

	private JPanel contentPane;
	static String inDate = new java.text.SimpleDateFormat("yyyyMMdd").format(new java.util.Date());
	static String totalDate;
	static String subject;
	static String todoName;

	public CheckAlarmUI() {
				try {
					
					String deadLineYear;
					String deadLineMonth;
					String deadLineDay;
					
					String sQl;
					Connection cOnn = null;
					Statement st = null;
					ResultSet rs = null;
				
					Class.forName(DBConn.forName);
					cOnn = DriverManager.getConnection(DBConn.URL, DBConn.ID, DBConn.PW);
				
					st = cOnn.createStatement();
					sQl = "USE TodoDB";
					st.executeQuery(sQl);
					rs = st.executeQuery("SELECT * FROM TodoData");
				
					while(rs.next()) {
						deadLineYear = rs.getString("DeadLineYear");
						deadLineMonth = rs.getString("DeadLineMonth");
						deadLineDay = rs.getString("DeadLineDay");
						totalDate = deadLineYear + "0" + deadLineMonth + "0" + deadLineDay;
					
						if(totalDate.equals(inDate)) {
							subject = rs.getString("Subject");
							todoName = rs.getString("TodoName");
						}
					}
		
			rs.close();
			st.close();
		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\'" + todoName + "\'" + "\uC758 \uC2E4\uC81C \uB9C8\uAC10\uAE30\uD55C\uC774");
		lblNewLabel.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		lblNewLabel.setBounds(75, 88, 274, 50);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\uB2EB\uAE30");
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		btnNewButton.setBounds(300, 180, 100, 30);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		JLabel label = new JLabel("1\uC77C \uB0A8\uC558\uC2B5\uB2C8\uB2E4.");
		label.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		label.setBounds(150, 117, 126, 41);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("<" + subject + ">");
		label_1.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		label_1.setBounds(139, 66, 137, 41);
		contentPane.add(label_1);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckAlarmUI frame = new CheckAlarmUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
