/**
 * title : UserDB.java
 * author : 김한동 (aggsae@gmail.com)
 * version : 3.0.0.
 * since : 2018 - 05 - 07
 * brief : UserDB 클래스
 * -----------------------------------
 * history
 *   author  version     date                           brief
 *   김한동       0.0.0.   2018-05-18                       초안 작성
 *   김한동       0.0.1.   2018-05-18                       오타 수정
 *   김한동       1.0.0.   2018-05-22             DBConn USE UserDB String 값 대체
 *   김한동       1.0.1.   2018-05-23      DB 직접 접속 후 Table로 접근, 불필요한 스캐너 import 삭제
 *   김한동       2.0.0.   2018-05-24          Table 접근 시 발생하는 문제 해결_원본으로 복구
 *   김한동       3.0.0.   2018-06-01                       최종본 작성
 * -----------------------------------
 */

package se.smu;

import se.smu.*;
import java.sql.*;

public class UserDB {
	void UserData(String ID, String Password, String Email) {
		try {
			int checkNull = 0;
			String dataBase;
			String sQl;
			Connection cOnn = null;
			Statement st = null;
			PreparedStatement pst = null;
			ResultSet rs = null;
			
			Class.forName(DBConn.forName);
			cOnn = DriverManager.getConnection(DBConn.URL, DBConn.ID, DBConn.PW);
			
			st = cOnn.createStatement();
			rs = st.executeQuery("SHOW DATABASES");
			
			while(rs.next()) {
				dataBase = rs.getString("Database");
				if(dataBase.equals("userdb"))
					checkNull = 1;
			}
			
			if(checkNull == 0) {
				sQl = "CREATE DATABASE UserDB";
				st.execute(sQl);
				sQl = "USE UserDB";
				st.execute(sQl);
				sQl = "CREATE TABLE UserData(ID char(20) NOT NULL PRIMARY KEY, Password char(30) NOT NULL, Email char(30) NOT NULL)";
				st.execute(sQl);
			}
			
			else {
				sQl = "USE UserDB";
				st.execute(sQl);
				
				sQl = "INSERT INTO UserData(ID, Password, Email) VALUES(?, ?, ?)";
				pst = cOnn.prepareStatement(sQl);
				
				pst.setString(1, ID);
				pst.setString(2, Password);
				pst.setString(3, Email);
				pst.executeUpdate();
				
				rs = pst.executeQuery("SELECT * FROM UserData");
			}
			
			rs.close();
			pst.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new UserDB();
	}
}