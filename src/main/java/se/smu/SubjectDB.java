/**
 * title : SubjectDB.java
 * author : 김한동 (aggsae@gmail.com)
 * version : 2.1.0.
 * since : 2018 - 05 - 07
 * brief : SubjectDB 클래스
 * -----------------------------------
 * history
 *   author  version     date                           brief
 *   김한동       0.0.0.   2018-05-18                       초안 작성
 *   김한동       1.0.0.   2018-05-22             DBConn USE UserDB String 값 대체
 *   김한동       1.0.1.   2018-05-23      DB 직접 접속 후 Table로 접근, 불필요한 스캐너 import 삭제
 *   김한동       2.0.0.   2018-05-25               Table 접근 시 발생하는 문제 해결
 *   김한동       2.1.0.   2018-05-26		         과목 년도 등 변수형 수정(int -> String)
 * -----------------------------------
 */

package se.smu;

import se.smu.*;
import java.sql.*;

public class SubjectDB {
	void SubjectData(String Subject, String Professor, String subjectYear, String subjectSem, String subjectDate, String subjectStart, String subjectEnd, String room) {
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
				if(dataBase.equals("subjectdb"))
					checkNull = 1;
			}
			
			if(checkNull == 0) {
				sQl = "CREATE DATABASE subjectDB";
				st.execute(sQl);
				sQl = "USE SubjectDB";
				st.execute(sQl);
				sQl = "CREATE TABLE SubjectData(Subject char(20) NOT NULL PRIMARY KEY, Professor char(10) NOT NULL, "
						+ "subjectYear char(5) NOT NULL, subjectSem char(5) NOT NULL, subjectDate char(5) NOT NULL, "
						+ "subjectStart char(5) NOT NULL, subjectEnd char(5) NOT NULL, room char(10) NOT NULL)";
				st.execute(sQl);
			}
			
			else {
				sQl = "USE SubjectDB";
				st.execute(sQl);
				
				sQl = "INSERT INTO SubjectData(Subject, Professor, subjectYear, subjectSem, subjectDate, subjectStart, subjectEnd, room) "
						+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
				pst = cOnn.prepareStatement(sQl);
				
				pst.setString(1, Subject);
				pst.setString(2, Professor);
				pst.setString(3, subjectYear);
				pst.setString(4, subjectSem);
				pst.setString(5, subjectDate);
				pst.setString(6, subjectStart);
				pst.setString(7, subjectEnd);
				pst.setString(8, room);
				pst.executeUpdate();
				
				rs = pst.executeQuery("SELECT * FROM SubjectData");
			}
			
			rs.close();
			pst.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new SubjectDB();
	}
}