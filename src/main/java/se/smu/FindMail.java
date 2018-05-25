/**
 * title : FindMail.java
 * author : 김한동 (aggsae@gmail.com)
 * version : 1.0.0.
 * since : 2018 - 05 - 07
 * brief : ID, PW 이메일 전송 클래스
 * -----------------------------------
 * history
 *   author  version     date                              brief
 *   김한동       0.0.0.   2018-05-24                          초안 작성
 *   김한동       1.0.0.   2018-05-25            smtp.gmail.com 포트넘버 수정, 이메일 메세지 수정
 * -----------------------------------
 */

package se.smu;

import se.smu.*;
import java.sql.*;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class FindMail {
	static String InputEmail;
	
	public FindMail(String InputEmail) {
		this.InputEmail = InputEmail;
		
		String ID = null;
		String Password = null;
		
		try {
			Connection cOnn = null;
			String sQl;
			String mail_Check;
			Statement st = null;
			ResultSet rs = null;
			
			Class.forName(DBConn.forName);
			cOnn = DriverManager.getConnection(DBConn.URL, DBConn.ID, DBConn.PW);
			
			st = cOnn.createStatement();
			sQl = "USE UserDB";
			st.execute(sQl);
			mail_Check = ("SELECT ID, Password FROM UserData WHERE Email = '" + this.InputEmail + "'");
			rs = st.executeQuery(mail_Check);
			
			while(rs.next()) {
				ID = rs.getString("ID");
				Password = rs.getString("Password");
			}
			
			rs.close();
			st.close();			
		} catch(ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
		
		final String adminEmail = "handongswe@gmail.com";
		final String adminPW = "Gksehd03021";
		
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mailsmtp.port", "465");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.ssl.enable", "true");
		props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		//props.put("mail.smtp.starttls.enalbe", "true");
		
		Session session = Session.getDefaultInstance(props,
				new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(adminEmail, adminPW);
					}
		});
		
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress("Palzo"));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress/*.parse*/(this.InputEmail));
			message.setSubject("[Palzo] Todolist ID / PW 찾기 안내");
			message.setText("안녕하세요! " + ID + "님\n" + "요청하신 ID/PW 찾기 결과입니다.\n"
							+ "ID : " + ID + "\nPW : " + Password);
			
			Transport.send(message);
			
			//System.out.println("Mail Sending Success");
		} catch(MessagingException e) {
			throw new RuntimeException(e);
		}
	}
	
	public static void main(String[] args) {
		new FindMail(InputEmail);
	}

}
