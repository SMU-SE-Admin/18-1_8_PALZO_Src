/**
 * title : UserDB.java
 * author : 김한동 (aggsae@gmail.com)
 * version : 0.0.1.
 * since : 2018 - 05 - 07
 * brief : UserDB 클래스
 * -----------------------------------
 * history
 *   author  version     date        brief
 *   김한동       0.0.0.   2018-05-18    초안 작성
 *   김한동       0.0.1.   2018-05-18    오타 수정
 * -----------------------------------
 */

package se.smu;

import se.smu.*;
import java.sql.*;
import java.util.Scanner;

public class UserDB {
	void UserTable(String id, String pw, String email) {
		try {
				// 기본 변수 선언
				int nUllcheck = 0;
				String dAtabase;
				Scanner iN = new Scanner(System.in);
				Connection cOnn = null;
				String sQl;
				Statement st = null;
				PreparedStatement pst = null;
				ResultSet rs = null;
		
				// DB 연결
				Class.forName(DBConn.forName);
				cOnn = DriverManager.getConnection(DBConn.URL, DBConn.ID, DBConn.PW);
				
				st = cOnn.createStatement();
				rs = st.executeQuery("SHOW DATABASES");
				
				// DB에 UserDB가 존재하는지 확인
				while(rs.next()) {
					dAtabase = rs.getString("USERDB");
					if(dAtabase.equals("UserDB"))
						nUllcheck = 1;
				}
				
				// DB가 존재하지 않을 경우 DB 생성
				if(nUllcheck == 0) {
					sQl = "CREATE DATABASE UserDB";
					st.execute(sQl);
					sQl = "USE UserDB";
					st.execute(sQl);
					sQl = "CREATE TABLE UserData (id char(20), pw char(30), email char(35))";
					st.execute(sQl);
				}
				
				// DB가 존재할 경우 DB에 입력
				else {
					sQl = "USE UserDB";
					sQl = "INSERT INTO UserData (id char(20), pw char(30), email char(35))";
					pst = cOnn.prepareStatement(sQl);
					rs = pst.executeQuery("SELECT * FROM UserData");
				}
				
				pst.setString(1, id);
				pst.setString(2, pw);
				pst.setString(3, email);
				pst.executeUpdate();
				
				rs.close();
				pst.close();
		} catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new UserDB();
	}
}